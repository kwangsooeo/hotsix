<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form id="hidForm" action="/qna/list4" method="get">
		<input type="hidden" name="bno" value="${cri.qnaNo}">
		<input type="hidden" name="page" value=${cri.page }>
		<input type="hidden" name="perPageNum" value=${cri.perPageNum }>
		<input type="hidden" name="displayPage" value=${cri.displayPage }>
</form>
<script src="//code.jquery.com/jquery-1.11.3.min.js"></script>
	<script type="text/javascript">
alert("정상적으로 처리되었습니다\n리스트로 이동합니다");
$("#hidForm").submit();
</script>
</body>
</html>