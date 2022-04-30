<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>ToDo list</h2>
	
	<table>
		<tr>
			<td>Priority</td>
			<td>Description</td>
			<td>Date</td>
		</tr>
		
		<#list tasks as task>
			<tr>
				<td>${task.priority}</td>
				<td>${task.description}</td>
				<td>${task.date}</td>
			</tr>
		</#list>
		
	</table>
</body>
</html>