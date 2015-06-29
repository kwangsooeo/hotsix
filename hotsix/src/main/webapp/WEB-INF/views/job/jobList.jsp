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
<div class="content-wrapper">
	<!-- Content Header (Page header) -->
	<section class="content-header">
	<h1>Job</h1>
	<ol class="breadcrumb">
		<li><a href="#"><i class="fa fa-dashboard"></i> Home</a></li>
		<li class="subPage active">job</li>
	</ol>
	</section>
	<section class="content">
	<div class="row">
		<div class="col-xs-12">
			<div class="box">
				<div class="box-header">
					<h3 class="box-title">JobList</h3>
				</div>
				<!-- /.box-header -->
				<div class="box-body">
					<table id="example2" class="table table-bordered table-hover">
						<thead>
							<tr>
								<th>JobNo</th>
								<th>JobName</th>
								<th>Parent</th>
								<th>Depth</th>
								<th></th>
							</tr>
						</thead>
						<tbody>
							<c:forEach items="${list}" var="list">
								<tr>
									<td>${list.jobNo }</td>
									<td>${list.jobName }</td>
									<td>${list.parent }</td>
									<td>${list.depth }</td>
									<td  class="col-xs-1"><button class="glyphicon glyphicon-pencil" value="${list.jobNo }" id="upBtn"></button>
									<button class="glyphicon glyphicon-trash" value="${list.jobNo }" id="delBtn"></button>
									</td>
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
						<button type="button" onclick="javascript:location.href='/job/regist'" class="btn btn-default">글쓰기</button>
					</div>
					<div class="col-sm-9">
						<ul class="pager pagenation">
							<li><a href="#">Previous</a></li>
							<c:forEach var="page" begin="${page.first }" end="${page.last }">
								<li class="active"><a href="${page }">${page }</a></li>
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

<form id="pageForm">

</form>

<script src="/resources/plugins/jQuery/jQuery-2.1.4.min.js"></script>
<script type="text/javascript">
$('#example2').on("click","tbody tr td button", function(){
	var targetMode = $(this).attr("id");
	var delValue = $(this).val();
	if(targetMode == "delBtn"){
		$.get("")
	}else if(targetMode == "upBtn"){
		
	}
	console.log(delValue);
});

</script>
<!-- /.content-wrapper -->
<%@include file="../include/footer.jsp"%>
</html>