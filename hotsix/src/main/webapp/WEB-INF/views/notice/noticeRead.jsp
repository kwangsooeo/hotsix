<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
   <h1>Notice</h1>
   <ol class="breadcrumb">
      <li><a href="#"><i class="fa fa-dashboard"></i> Home</a></li>
      <li class="subPage active">notice</li>
   </ol>
   </section>
   
   <div class="row">
      <div class="col-xs-12">
         <div class="box">
            <div class="box-header">
               <h3 class="box-title">NoticeRead</h3>
            </div>
            <!-- /.box-header -->
            <div class="box-body">
               <table id="example2" class="table table-bordered table-hover">
                  <thead>
                  
                  
		<div class="form-group">
		<label class="col-sm-2 col-sm-2 control-label">번호</label>
		<div class="col-sm-10">
			<input class="form-control" name="noticeNo" type="text" value="${noticeVO.noticeNo }"readonly>
		</div>
	</div>
	
	<div class="form-group">
		<label class="col-sm-2 col-sm-2 control-label">제목</label>
		<div class="col-sm-10">
			<input class="form-control" name="title" type="text" value="${noticeVO.title }"readonly>
		</div>
	</div>
	
	<div class="form-group">
		<label class="col-sm-2 col-sm-2 control-label">내용</label>
		<div class="col-sm-10">
			<textarea class="form-control" readonly="readonly" name="contents" rows="5">${noticeVO.contents }</textarea>
		</div>
	</div>
	
	<div class="form-group">
		<label class="col-sm-2 col-sm-2 control-label">날짜</label>
		<div class="col-sm-10">
			<input class="form-control" name="regdate" type="text" value="${noticeVO.regdate }"readonly>
		</div>
	</div>
	
	<div class="form-group">
		<label class="col-sm-2 col-sm-2 control-label">첨부파일</label>
		<div class="col-sm-10">
			<input class="form-control" name="filename" type="text" value="${noticeVO.filename }"readonly>
		</div>
	</div>
	
	
	<div class="col-sm-3 col-sm-3 pull-right">
		<button type="button" id='listBtn' class="btn btn-theme">List</button>
		<button type="button" id='modBtn' class="btn btn-theme">Modify</button>
		<button type="button" id='delBtn' class="btn btn-theme">Delete</button>
	</div>
	
	
		</thead>
               </table>
            </div>
            <!-- /.box-body -->
               </div>
            </div>
         </div>
         <!-- /.box -->
      </div>
	<!-- /.content-wrapper -->
	<form id = 'noticeForm'>
		<input type="hidden" name="noticeNo" value="${noticeVO.noticeNo }">
		<input type="hidden" name="page" value="${cri.page }">	
		<input type="hidden" name="perPageNum" value="${cri.perPageNum }">
		<input type="hidden" name="displayPageNum" value="${cri.displayPageNum }">
		
	</form>

<script src="/resources/plugins/jQuery/jQuery-2.1.4.min.js"></script>
	<script>
	$(document).ready(function(){
		
		var noticeForm = $("#noticeForm");
		
		$("#delBtn").click(function(){
			
			noticeForm.attr("action", "/notice/del");
			noticeForm.attr("method","post");
			noticeForm.submit();
		});
		
		$("#modBtn").click(function(){
			noticeForm.attr("action","/notice/noticeUpdate");
			noticeForm.attr("method","get");
			noticeForm.submit();
		});
		$("#listBtn").click(function(){
			
			noticeForm.attr("action","/notice/list");
			noticeForm.attr("method","get");
			noticeForm.submit();
		});
		
	});
	
	</script>
<%@include file="../include/footer.jsp"%>
</html>