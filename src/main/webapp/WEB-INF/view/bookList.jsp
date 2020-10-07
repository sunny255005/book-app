<%@ page language="java" contentType="text/html; charset=windows-1256"
 pageEncoding="windows-1256"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<link rel="stylesheet" type="text/css" href="webjars/bootstrap/4.3.1/css/bootstrap.min.css" />
		<c:url value="/css/main.css" var="jstlCss" />
		<link href="${jstlCss}" rel="stylesheet" />
		<script type="text/javascript" src="webjars/bootstrap/4.3.1/js/bootstrap.min.js"></script>
		<meta charset="windows-1256">
		<meta http-equiv="Content-Type" content="text/html; charset=windows-1256">
		<title>Book List</title>
	</head>
	<body>
		<div class="container">
			<div class="card">
			 	<div class="card-header">
				 	Book List
			 	</div>
			 	<div class="card-body">
				 	<table class="table table-striped">
				 		<tr>
							<th>ID</th>
						 	<th>Title</th>
						 	<th>Author</th>
						 	<th>Pages</th>
						 	<th>Date</th>
						 	<th>Delete</th>
						 	<th>Edit</th>
				 		</tr>
				 		<c:forEach items="${books}" var="book">
				 		<tr>
							 <td>${book.id }</td>
							 <td>${book.title }</td>
							 <td>${book.author }</td>
							 <td>${book.pages }</td>
							 <td>
							 	<fmt:formatDate pattern="dd/MM/yyyy" value="${book.dateCreation}" />
						 	</td>
		 					 <td>
		 						<a onclick="return confirm('Are your sure ?')"href="deleteBook?id=${book.id}">Delete</a>
							 </td>
			 				 <td>
			 				 	<a href="modifyBook?id=${book.id}">Edit</a></td>
		 				 	 </td>
				 		</tr>
				 		</c:forEach>
				 	</table>
			 	</div>
			</div>
		</div>
	</body>
</html>