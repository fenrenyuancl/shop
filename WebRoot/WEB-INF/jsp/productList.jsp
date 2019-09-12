<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<!-- saved from url=(0048)http://localhost:8080/mango/product/list/1.jhtml -->
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>网上商城</title>
<link href="${pageContext.request.contextPath}/css/common.css"
	rel="stylesheet" type="text/css" />
<link href="${pageContext.request.contextPath}/css/product.css"
	rel="stylesheet" type="text/css" />

</head>
<body>
	<div class="container header">
		<div class="span5">
			<div class="logo">
				<a href="${pageContext.request.contextPath}/index.action"> <img
					src="${pageContext.request.contextPath}/images/GeneralPurpose/网上商城.gif"
					alt="网上商城" />
				</a>
			</div>
		</div>
		<div class="span9">
			<div class="headerAd">
				<img src="${pageContext.request.contextPath}/image/header.jpg"
					width="320" height="50" alt="正品保障" title="正品保障">
			</div>
		</div>
		<%@ include file="mean.jsp"%>

	</div>
	<div class="container productList">
		<div class="span18 last">
		<div id="result" class="result table clearfix">
				<ul>
					<li>
<%-- 						<a href="${ pageContext.request.contextPath }/product_findByPid.action?pid=<s:property value="#p.pid"/>"> --%>
							<img src="${pageContext.request.contextPath}/images/pet/bird1.gif" width="170" height="170"  style="display: inline-block;">
								<span style='color:green'>
								 会唱歌的鸟
									</span>
									<span class="price">商城价： ￥150</span>
						</a>
					</li>
						<li>
<%-- 						<a href="${ pageContext.request.contextPath }/product_findByPid.action?pid=<s:property value="#p.pid"/>"> --%>
							<img src="${pageContext.request.contextPath}/images/pet/bird2.gif" width="170" height="170"  style="display: inline-block;">
								<span style='color:green'>
								 会唱歌的鸟
									</span>
									<span class="price">商城价： ￥180</span>
						</a>
					</li>
						<li>
						
							<img src="${pageContext.request.contextPath}/images/pet/bird3.gif" width="170" height="170"  style="display: inline-block;">
								<span style='color:green'>
								 会唱歌的鸟
									</span>
									<span class="price">商城价： ￥200</span>
						</a>
					</li>
				</ul>
			</div>
			<div class="pagination">
				<span class="firstPage">&nbsp;</span> <span class="previousPage">&nbsp;</span>
				<span class="currentPage">1</span> <a
					href="javascript: $.pageSkip(2);">2</a> <a class="nextPage"
					href="javascript: $.pageSkip(2);">&nbsp;</a> <a class="lastPage"
					href="javascript: $.pageSkip(2);">&nbsp;</a>
			</div>

		</div>
	</div>
	<div class="container footer">
		<div class="span24">
			<div class="footerAd">
				<img
					src="${pageContext.request.contextPath}/images/GeneralPurpose/footer.jpg"
					width="950" height="52" alt="我们的优势" title="我们的优势">
			</div>
		</div>
		<div class="span24">
			<ul class="bottomNav">
				<li><a>关于我们</a> |</li>
				<li><a>联系我们</a> |</li>
				<li><a>法律声明</a> |</li>
				<li><a>友情链接</a> |</li>
				<li><a target="_blank">支付方式</a> |</li>
				<li><a target="_blank">配送方式</a> |</li>

			</ul>
		</div>
		<div class="span24">
			<div class="copyright">Copyright©2019-2019 网上商城 版权所有</div>
		</div>
	</div>
</body>
</html>