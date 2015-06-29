<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@include file="../include/header.jsp"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div class="content-wrapper">
		<!-- Content Header (Page header) -->
		<section class="content-header">
		<h1>Contents</h1>
		<ol class="breadcrumb">
			<li><a href="#"><i class="fa fa-dashboard"></i> Home</a></li>
			<li class="subPage active">Contents</li>
		</ol>
		</section>
		<section class="content">
		<div class="row">
			<div class="col-xs-12">
				<div class="box">
					<div class="box-header">
						<h3 class="box-title">ContentsList</h3>
					</div>
					<!-- /.box-header -->
					<div class="box-body">
						<table id="example2" class="table table-bordered table-hover">
							<thead>
								<tr>
									<th>JobNo</th>
									<th>ContentsNo</th>
									<th>title</th>
									<th>Registration Date</th>
								</tr>
							</thead>
							<tbody >
								<c:forEach items="${list}" var="list">
									<tr class="task-list">
										<th>${list.jobNo }</th>
										<th>${list.contentsNo}</th>
										<th><span id="${list.jobNo }">${list.title}</span></th>
										<th>${list.regdate }</th>
									<tr>
								</c:forEach>

							</tbody>
							<tfoot>
							</tfoot>
						</table>
					</div>
					<!-- /.box-body -->
					<div class="row box-header">
						<div class="col-sm-3">
							<br>
							<button type="button"
								onclick="javascript:location.href='/contents/contentsRegist'"
								class="btn btn-default">글쓰기</button>
						</div>
						<div class="col-sm-9">
							<ul class="pager pagenation">
								<li><a href="#">Previous</a></li>
								<c:forEach var="page" begin="1" end="10">
									<li><a href="${page }">${page }</a></li>
								</c:forEach>
								<li><a href="#">Next</a></li>
							</ul>
						</div>
					</div>
				</div>
				<!-- /.box -->
			</div>
		</div>
		</section>
	</div>
	<!-- /.content-wrapper -->

	<form id="jobForm" action="/contents/contentsRead" method="get">
		<input type='hidden' name='jobNo'>
	</form>

	<script src="//code.jquery.com/jquery-2.1.4.min.js"></script>

	<script>
		$(".task-list").on("click","span", function(event) {
				var targetId = $(this).attr("id");

				var targetForm = $("#jobForm");

				targetForm.find("input[name='jobNo']").val(targetId);

								targetForm.attr("action",
										"/contents/contentsRead").attr(
										"method", "get");
								targetForm.submit();
							});
			
	</script>
</body>
<%@include file="../include/footer.jsp"%>
</html>