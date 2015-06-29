<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
		<h1>Regist</h1>
		<ol class="breadcrumb">
			<li><a href="#"><i class="fa fa-dashboard"></i> Home</a></li>
			<li class="subPage active">notice</li>
		</ol>
		</section>
		<section class="content">
		<div class="row">
			<div class="col-xs-12">
				<div class="box">
					<div class="box-header">
						<h3 class="box-title">Contents Regist</h3>
					</div>
					<!-- /.box-header -->
					<div class="box-body">
						<table id="example2" class="table table-bordered table-hover">
							<thead>

								<form method="post">
									<div class="form-group">
										<label class="col-sm-2 col-sm-2 control-label">Title</label>
										<div class="clo-sm-10">
											<input class="form-control" name="title" type="text">

										</div>
									</div>

									<div class="form-group">
										<label class="col-sm-2 col-sm-2 control-label">Content URL</label>
										<div class="clo-sm-10">
											<textarea class="form-control" name="link" rows="5"></textarea>

										</div>
									</div>

									<div class="form-group">
										<label class="col-sm-2 col-sm-2 control-label">jobNo</label>
										<div class="clo-sm-10">
											<textarea class="form-control" name="jobNo" rows="5"></textarea>

										</div>
									</div> 

									<div class="showback">
										<button class="btn btn-theme" type="submit">Save</button>
									</div>

								</form>

							</thead>
						</table>
					</div>
					<!-- /.box-body -->
				</div>
			</div>
		</div>
		<!-- /.box -->
	</div>
	</div>
	</section>
	</div>

	<!-- /.content-wrapper -->
</body>
<%@include file="../include/footer.jsp"%>
</html>