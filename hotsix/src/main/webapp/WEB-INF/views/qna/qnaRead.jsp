<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@include file="../include/header.jsp"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<!-- 합쳐지고 최소화된 최신 CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">

<!-- 부가적인 테마 -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">

<!-- 합쳐지고 최소화된 최신 자바스크립트 -->
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>
<style type="text/css">
	.hideDiv{display: none;}
</style>

</head>
<body>
<div class="content-wrapper">
	<section class="content"> 
		<div class= "formDiv">
		<div class="form-group">			
			<label class="col-sm-2 control-label">QnANo</label>
			<div class="col-sm-10">
				<input type="text" class="form-control" name="qnaNo" value="${qnAVO.qnaNo}">
			</div>
			
		</div>
		<div class="form-group">			
			<label class="col-sm-2 control-label">Parents</label>
			<div class="col-sm-10">
				<input type="text" class="form-control" name="parents" value="${qnAVO.parents}">
			</div>
			
		</div>
		
		<div class="form-group">
			<label class="col-sm-2 control-label">Title</label>
			<div class="col-sm-10">
				<input type="text" class="form-control" name="title" value="[${qnAVO.qna_type }] ${qnAVO.title}">
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label">Content</label>
			<div class="col-sm-10">
			<textarea class="form-control" rows="5" name="content">${qnAVO.contents}</textarea>
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label">writer</label>
			<div class="col-sm-10">
			<input type="text" class="form-control" name="writer" value="${qnAVO.memberNo}"> 
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label">Date</label>
			<div class="col-sm-10">
				<input type="text" class="form-control" name="regdate" value="${qnAVO.regdate}">
			</div>
		</div>
		<div class="button">
    	<div class="col-sm-offset-2 col-sm-10" align="right">
  			<button type="button" class="btn btn-primary" id="reply">Reply</button>
			<button type="button" class="btn btn-success" id="list">List</button>
			<button type="button" class="btn btn-danger" id="del">Del</button>
			
			</div>
      	</div>
   <div class="commentList hideDiv">		

		
      	
  		
      </div>
	<form id="hidForm">
		<input type="hidden" name="qnaNo" value="${cri.qnaNo}">
		<input type="hidden" name="page" value="${cri.page }">
		<input type="hidden" name="parent" value="${cri.parent}">
		<input type="hidden" name="perPageNum" value='${cri.perPageNum }'>
		<input type="hidden" name="displayPageNum" value='${cri.displayPageNum}'>
	</form>		
		</div>
	</section>
</div>
	<!-- /.content-wrapper -->
	<script src="//code.jquery.com/jquery-1.11.3.min.js"></script>
	<script type="text/javascript">
	$(document).ready(function(){
		var target=$("#hidForm");
		$("#list").click(function(){
			target.attr("action","/qna/list").attr("method","get");
			target.submit();
		});
		$("#del").on("click", function(){
			target.attr("action","/qna/delete").attr("method","post");
			target.submit();
		});
		$("#reply").on("click", function(){
			$(".commentList").toggleClass("hideDiv");
			commentShow();
		});
		
		var commentShow = function(){
			var readData = $('#hidForm').serialize();

			$.get("/qna/reply",readData,function(data){
				var str = "";
					$(data).each(function(){
						console.log(this.memberNo);
					str+= "<div class='form-group col-sm-10'>";
					str+= 	"<form><h5><span class='label label-default'>";
					str+= 			"답변</span>("+this.regdate+")</h5>";
					str+=			"<button id='reMod' value='"+this.qnaNo+"'class='btn btn-default btn-xs'>"
					str+=				"<span class='glyphicon glyphicon-erase'></span></button>";
					str+=			"<button id='reDel' value='"+this.qnaNo+"' class='btn btn-default btn-xs'>";
					str+=				"<span class='glyphicon glyphicon-remove'></span></button>";
					str+= 		"<div class='col-sm-10'><h6>"+this.contents+"</h6></div>";
					str+= "</form></div>";
					});
					str+= "<form>";
			      	str+= "<textarea class='form-control' rows='5' cols='10' name='comment'></textarea>";
			      	str+=	"<button id='regist' class='btn btn-default btn-xs'><span class='fa fa-check'></span></button>";
					str+= 	"<button id='cancel' class='btn btn-default btn-xs'><span class='fa fa-close'></span></button>";
					str+= 	"<p></p></form>";
					
				$('.commentList').html(str);
			});
		};

	});
	</script>
</body>
<%@include file="../include/footer.jsp"%>
</html>