<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Tasks</title>
</head>
<body>

    <a href="newTaskForm">Add new task</a> <#-- Redirecting you to the page with the form to create a new task.-->

    <h2>TODO List</h2>

    <a href="getTasksOrderByPriority">Sort by priority</a>

    <table>
        <tr>
            <td>Priority</td>
            <td>Description</td>
            <td>Date</td>
        </tr>

        <#list tasks as task> <#-- Freemarker command that will take a list named tasks and will execute the commands below for every element of the list.-->
            <tr>
                <td>${task.priority}</td>
                <td>${task.description}</td>
                <td>${task.date}</td>
                <td><a href="${'done/' + task.id}">Done</a></td> <#-- When Done is pressed it will make a request to the closeTask of the MainController.-->
            </tr>
        </#list>
    </table>
</body>
</html>