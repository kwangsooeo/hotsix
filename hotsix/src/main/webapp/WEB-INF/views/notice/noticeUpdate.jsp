<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
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
               <h3 class="box-title">NoticeUpdate</h3>
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
			<input class="form-control" name="title" type="text" value="${noticeVO.title }">
		</div>
	</div>
	<div class="form-group">
		<label class="col-sm-2 col-sm-2 control-label">내용</label>
		<div class="col-sm-10">
			<textarea class="form-control"  name="contents" rows="5">${noticeVO.contents }</textarea>
		</div>
	</div>
	
	<div class="form-group">
		<label class="col-sm-2 col-sm-2 control-label">날짜</label>
		<div class="col-sm-10">
			<fmt:formatDate value="${noticeVO.regdate }" var="dateString" pattern="yyyy/MM/dd hh:mm"/>
			<!-- 날짜를 수정하지 않고 출력 -->
			<input class="form-control" name="regdate" type="text" value="${dateString }" readonly>
		</div>
	</div>
	<div class="form-group">
		<label class="col-sm-2 col-sm-2 control-label">첨부파일</label>
		<div class="col-sm-10">
			<input class="form-control" name="filename" type="text" value="${noticeVO.filename }"readonly>
		</div>
	</div>
	
	<div class="showback">
		<button class="btn btn-theme" id="back" type="submit">저장</button>
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

	<form class="updatPOST" id="updatForm" >
	<input type="hidden" name="page" value="${cri.page }">
	<input type="hidden" name="pageNum" value="${cri.pageNum }">
	<input type="hidden" name="displayNum" value="${cri.displayNum }">
	</form>
<script src="/resources/plugins/jQuery/jQuery-2.1.4.min.js"></script>
	<script type="text/javascript">
		
		$(document).ready(function(){
			
			var updatForm = $("#updatForm");
			
		$("#back").click(function(){
						
			updatForm.attr("action","/notice/noticeUpdate");
			updatForm.attr("method","post");
			updatForm.submit();
			
			
		});
		
		});
	
	</script>
<%@include file="../include/footer.jsp"%>
</html>