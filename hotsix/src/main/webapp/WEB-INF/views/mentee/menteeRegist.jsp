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
<form method="post">
	<section class="content"> 
		<div>
				<table width="100%">
<tr>
<td>
	<div class="form-group">
		<label class = "col-lg-4 col-lg-4 control-label" >아이디 입력</label>
		<div class="col-lg-10">
			<input class="form-control" type="text" name = "id" >
		</div>	
		</div>
		

		
		<div class = "btn-group">
			
				<button type="submit"  class="btn btn-success">등록</button>
				<input class="btn btn-default" type="button" value="취소" Onclick="window.location='/mentee/list'"> 
				
		</div>
				</td>
		</tr>
		
</table>
</div>
	</section>

				</form>
		
	
	<!-- /.content-wrapper -->
</body>
<%@include file="../include/footer.jsp"%>
</html>