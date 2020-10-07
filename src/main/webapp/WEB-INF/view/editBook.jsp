<%@ page language="java" contentType="text/html; charset=windows-1256"
 pageEncoding="windows-1256"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
	<head>
		<link rel="stylesheet" type="text/css" href="webjars/bootstrap/4.3.1/css/bootstrap.min.css" />
		<c:url value="/css/main.css" var="jstlCss" />
		<link href="${jstlCss}" rel="stylesheet" />
		<script type="text/javascript" src="webjars/bootstrap/4.3.1/js/bootstrap.min.js"></script>
		<meta charset="windows-1256">
		<title>Edit Book</title>
	</head>
	<body>
		<div class="container">
			<div class="card-body">
				<form action="updateBook" method="post">
					 <div class="form-group">
					 	<label class="control-label">ID:</label>
					 	<input type="text" name="id" value="${book.id}" readonly class="form-control"/>
					 </div>
					 <div class="form-group">
					 	<label class="control-label">Title:</label>
					 	<input type="text" name="title" value="${book.title}" class="form-control"/>
					 </div>
					 <div class="form-group">
					 	<label class="control-label">Author:</label>
					 	<input type="text" name="author" value="${book.author}" class="form-control"/>
					 </div>
					 <div class="form-group">
					 	<label class="control-label">Pages:</label>
					 	<input type="number" name="pages" value="${book.pages}" class="form-control"/>
					 </div>
					 <div class="form-group">
					 	<label class="control-label">Date:</label>
					 	<fmt:formatDate pattern="yyyy-MM-dd" value="${book.dateCreation}" var="formatDate" />
					 	<input type="date" name="date" value="${formatDate}" class="formcontrol"/>
					 </div>
					 <div>
					 	<button type="submit" class="btn btn-primary">Update</button>
					</div>
				</form>
			</div>
			<br/>
			<br/>
			<a href="bookList">Book List</a>
		</div>
	</body>
</html>