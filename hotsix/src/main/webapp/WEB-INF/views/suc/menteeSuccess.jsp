<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form id="jobForm" action="/board/list" method="get">
		
		<input type = "hidden" name="page" value='${cri.page }'>
		<input type = "hidden" name="perpageNum" value='${cri.perPageNum }'>
		<input type = "hidden" name="displayPage" value='${cri.disPlayPage }'>
		<input type = "hidden" name="keyword" value='${cri.keyword }'>
		<input type = "hidden" name="searchType" value='${cri.searchType }'>
	</form>

<script type="text/javascript">

alert("저장 완료");

$('#jobForm').submit();

</script>

</body>
</html>