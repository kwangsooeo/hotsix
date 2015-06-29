<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

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
   <h1>Q & A</h1>
   <ol class="breadcrumb">
      <li><a href="#"><i class="fa fa-dashboard"></i> Home</a></li>
      <li class="subPage active">Q & A</li>
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
                     	<th>QnaNo</th>
                        <th>Parents</th>
                        <th>MemberNo</th>
                        <th>Type</th>
                        <th>Title</th>
                        <th>Regdate</th>
                     </tr>
                  </thead>
                  <tbody>
                     <c:forEach items="${list}" var="list">
                        <tr class="tbl-list" id="${list.qnaNo}">
                           <th class="col-xs-1">${list.qnaNo}</th>
                           <th class="col-xs-1"><span id="${list.parents}">${list.parents}</span></th>
                           <th class="col-xs-1">${list.memberNo }</th>
                           <th class="col-xs-1">${list.qna_type }</th>
                           <th class="col-xs-6">${list.title }</th>
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
               </div>
               <div class="col-sm-9">
                  <ul class="pager pagenation">
                    <c:if test="${pageMaker.prev != 0}">
			      	<li><a href="${pageMaker.prev }">&laquo;</a> </li>
			    	</c:if>
			   		 <c:forEach begin="${pageMaker.first}" end="${pageMaker.last }" var="pageNum">
			    	<li <c:out value="${pageNum==cri.page? 'class=active':''}"/>>
			    	<a href="${pageNum}"> ${pageNum}</a></li>
			    	
			   		 </c:forEach>
				    <c:if test="${pageMaker.next != 0}">
				    <li><a href="${pageMaker.next}">&raquo;</a></li>
				    </c:if>
                  </ul>
               </div>
            </div>
         </div>
         <!-- /.box -->
      </div>
   </div>
   <form id='listForm' >
			<input type="hidden" name="qnaNo">
			<input type="hidden" name="parent" value='${cri.parent}'>
			<input type="hidden" name="page" value='${cri.page }'>
			<input type="hidden" name="perPageNum" value='${cri.perPageNum }'>
			<input type="hidden" name="displayPageNum" value='${cri.displayPageNum }'>
	</form>
   </section>
</div>
<script src="//code.jquery.com/jquery-1.11.3.min.js"></script>
	<script type="text/javascript">
$(document).ready(function(){
	var targetForm = $("#listForm");
	$(".tbl-list").on("click",function(){
		var qnaNo = $(this).attr('id');
		var parents = $(this).find("th span").attr("id")
		
		$("[name='qnaNo']").attr("value",qnaNo);
		$("[name='parents']").attr("value",parents);
		
		targetForm.attr("action","/qna/read").attr("method","get");
		targetForm.submit();
	});
	
	$(".pager").on("click","li a", function(event){
		event.preventDefault();
		var target = $(this).attr("href");
		
		$("[name='qnaNo']").remove();
		$("[name='parents']").remove();
		$("[name='page']").attr("value",target);
		targetForm.attr("action","/qna/list").attr("method","get");
		targetForm.submit();

	
	});
});

	</script>
<%@include file="../include/footer.jsp"%>
</html>