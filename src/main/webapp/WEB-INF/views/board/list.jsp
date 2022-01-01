<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
<style type="text/css">
.table{
table-layout: fixed; 
width: 800px;
margin: auto;
}
</style>
</head>
<body>
<jsp:include page="../header.jsp" />

	<h4>게시글 목록</h4>
	<table class="table table-hover table-condensed">
		<thead>
			<tr>
				<th width="5%">글번호</th>
				<th width="15%">제목</th>
				<th width="15%">작성자</th>
				<th width="15%">작성일</th>
				<th width="5%">조회수</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${pt.list}" var="vo">
				<tr>
					<td>${vo.bno}</td>
					<td><a href="/board/read/${vo.bno}/${pt.curPage}">${vo.title}</a></td>
					<td>${vo.id}</td>
					<td>${vo.updatedate}</td>
					<td>${vo.viewcnt}</td>
				</tr>
			</c:forEach>
		
		
		
		</tbody>
	</table>

<jsp:include page="page.jsp"/>

<jsp:include page="../footer.jsp" />
</body>
</html>