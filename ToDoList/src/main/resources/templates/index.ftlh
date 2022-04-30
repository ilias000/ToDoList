<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>TODO List</title>
</head>
<body>
    <h2>TODO List</h2>

    <table>
        <tr>
            <td>Priority</td>
            <td>Description</td>
            <td>Date</td>
        </tr>

        <#list tasks as task> <#--Freemarker command that will take a list named tasks and will execute the commands below for every element of the list.-->
            <tr>
                <td>${task.priority}</td>
                <td>${task.description}</td>
                <td>${task.date}</td>
            </tr>
        </#list>
    </table>
</body>
</html>