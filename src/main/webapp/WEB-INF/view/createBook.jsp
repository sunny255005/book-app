<%@ page language="java" contentType="text/html; charset=windows-1256"
 pageEncoding="windows-1256"%>
<!DOCTYPE html>
<html>
	<head>
		<link rel="stylesheet" type="text/css" href="webjars/bootstrap/4.3.1/css/bootstrap.min.css" />
		<c:url value="/css/main.css" var="jstlCss" />
		<link href="${jstlCss}" rel="stylesheet" />
		<script type="text/javascript" src="webjars/bootstrap/4.3.1/js/bootstrap.min.js"></script>
		<meta charset="windows-1256">
		<title>Create Book</title>
	</head>
	<body>
		<div class="container">
			<div class="card-body">
				<form action="saveBook" method="post">
					 <div class="form-group">
					 	<label class="control-label">Title:</label>
					 	<input type="text" name="title" class="form-control"/>
					 </div>
					 <div class="form-group">
					 	<label class="control-label">Author:</label>
					 	<input type="text" name="author" class="form-control"/>
					 </div>
					 <div class="form-group">
					 	<label class="control-label">Pages:</label>
					 	<input type="number" name="pages" class="form-control"/>
					 </div>
					 <div class="form-group">
					 	<label class="control-label">Date:</label>
					 	<input type="date" name="date" class="form-control"/>
					 </div>
					 <div>
					 	<button type="submit" class="btn btn-primary">Ajouter</button>
					</div>
				</form>
			</div>
			${msg}
			<br/>
			<br/>
			<a href="bookList">Book List</a>
		</div>
	</body>
</html>