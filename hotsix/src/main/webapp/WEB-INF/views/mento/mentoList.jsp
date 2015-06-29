<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@include file="../include/header.jsp"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>멘토 관리</title>
<style>
.table th,td{text-align: center;}
</style>
</head>
<div class="content-wrapper">
   <!-- Content Header (Page header) -->
   <section class="content-header">
   <h1>Mento</h1>
   <ol class="breadcrumb">
      <li><a href="#"><i class="fa fa-dashboard"></i> Home</a></li>
      <li class="subPage active">Mento</li>
   </ol>
   </section>
   <section class="content">
   <div class="row">
      <div class="col-xs-12">
         <div class="box">
            <div class="box-header">
               <h3 class="box-title">MentoList</h3>
            </div>
            <!-- /.box-header -->
            <div class="box-body">
            <input type='hidden' name='mentoNo' value="${cri.mentoNo}">
			<input type='hidden' name='page' value="${cri.page}">
			<input type='hidden' name='displayPageNum' value="${cri.displayPageNum}">
			
			
			<div class="pull-left">(총 회원수 : ${pageMaker.totalCount},&nbsp;대기회원 : 1,&nbsp;탈퇴 : 0)
			</div>
			<div class="pull-right">
			<form id= serch>
			<select name="perPageNum">
			<option value="10" <c:out value="${cri.perPageNum ==10? 'selected' : ''}"/>>10개</option>
			<option value="30" <c:out value="${cri.perPageNum ==30? 'selected' : ''}"/>>30개</option>
			<option value="50"<c:out value="${cri.perPageNum ==50? 'selected' :''}"/>>50개</option>
			<option value="100"<c:out value="${cri.perPageNum ==100? 'selected' :''}"/>>100개</option>
			</select>
			<select name ="searchType">
			<option value="i"<c:out value="${cri.searchType eq 'i' ?'selected':''}"/>>아이디</option>
			<option value="n"<c:out value="${cri.searchType eq 'n' ?'selected':''}"/>>이름</option>
			<option value="mi"<c:out value="${cri.searchType eq 'mi' ?'selected':''}"/>>멘티아이디</option>
			<option value="c"<c:out value="${cri.searchType eq 'c' ?'selected':''}"/>>직업</option>
			<option value="s"<c:out value="${cri.searchType eq 's' ?'selected':''}"/>>상태</option>		 
			 </select>
			 <input type="text" name="searchKeyword" value="${cri.keyword}">
			 <button id="searchBtn"> Search </button>
			 </form>
			</div>
               <table id="example2" class="table table-bordered table-hover">
                  <thead>
                     <tr>
                     <th><input type="checkbox"> </th>
                        <th>회원아이디</th>
                        <th>이름</th>
                        <th>닉네임</th>
                        <th>직업</th>
                        <th>멘티아이디</th>
                        <th>가입일</th>
                        <th>최종접속일</th>
                        <th>처리상태</th>
                     </tr>
                  </thead>
                  <tbody>
                     <c:forEach items="${list}" var="list">
                      <tr>
                           <td><input name="mentocheck" type="checkbox" value="${list.mentoNo}"></td>
                           <td>${list.id }</td>
                           <td>${list.name}</td>
                           <td>${list.nickname }</td>
                           <td>${list.career }</td>
                           <td>${list.menteeId }</td>
                           <td>${list.regdate }</td>
                           <td>${list.logdate}</td>
                           <td><c:if test="${list.status == false}">대기중</c:if>
                           	<c:if test="${list.status == true}">멘토등록</c:if></td>
                       </tr>
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
                  <input type="button" onclick="javascript:location.href='/job/regist'" class="btn btn-default" value='선택등록'>
              	 <input type="button" onclick="javascript:location.href='/job/reject'" class="btn btn-default" value='선택거절'>
 				</div>
               <div class="col-sm-9">
                  <ul class="pager pagenation">
                     <c:if test="${pageMaker.prev != 0 }" var="prev">
					<li><a href="${pageMaker.prev}">&laquo;</a></li>
					</c:if>
	
					<c:forEach begin="${pageMaker.first}" end="${pageMaker.last}" var="idx">
						<li <c:out value="${cri.page == idx ? 'class=active' : ''}"/>><a href="${idx}">${idx}</a></li>
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
   </section>
</div>

<script>

</script>
<%@include file="../include/footer.jsp"%>
</html>