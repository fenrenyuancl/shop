package com.cl.shop.action;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.cl.shop.model.User;
import com.cl.shop.service.UserService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

/**
 * 用户模块Action的类
 * 
 * @author 疯人愿
 *
 */
public class UserAction extends ActionSupport implements ModelDriven<User> {
	// 模型驱动使用的对象
	private User user = new User();
	// 注入UserService
	private UserService userService;

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public User getModel() {
		return user;
	}

	// 跳转到注册界面
	public String registPage() {
		return "registPage";
	}

	// Ajax执行异步校验用户名的方法
	public String findByName() throws IOException {
		// 调用Service进行查询:
		User existUser = userService.findByUsername(user.getUsername());
		// 获得response对象,项页面输出:
		HttpServletResponse response = ServletActionContext.getResponse();
		response.setContentType("text/html;charset=UTF-8");
		// 判断
		if (existUser != null) {
			// 查询到该用户:用户名已经存在
			response.getWriter().println("<font color='red'>用户名已经存在</font>");
		} else {
			// 没查询到该用户:用户名可以使用
			response.getWriter().println("<font color='green'>用户名可以使用</font>");
		}
		return NONE;
	}

	// 注册方法
	public String regist() {
		userService.save(user);
		return NONE;
	}

	// 跳转到登陆界面
	public String loginPage() {
		return "loginPage";
	}

	// 登陆方法
	public String login() {
		User existUser = userService.login(user);	
		// 判断
			if (existUser == null) {
				// 登录失败
				this.addActionError("登录失败:用户名或密码错误或用户未激活!");
				return LOGIN;
			} else {
				// 登录成功
				// 将用户的信息存入到session中
				ServletActionContext.getRequest().getSession()
						.setAttribute("existUser", existUser);
				// 页面跳转
				return "loginSuccess";	
				}
	}
	//用户退出
	public String quit() {
		//销毁session
		ServletActionContext.getRequest().getSession().invalidate();
		return "quit";
	}
}
	

