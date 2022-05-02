<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Add new task</title>
</head>
<body>

    <form action="/addTask" method="post">

        <div>
            <label>Description</label>
            <input type="text" name="description"> <#-- The name should be the same as the name of the field in the class.-->
        </div>

        <div>
            <label>Priority</label>
            <input type="number" name="priority"> <#-- The name should be the same as the name of the field in the class.-->
        </div>

        <div>
            <label>Date</label>
            <input type="date" name="date"> <#-- The name should be the same as the name of the field in the class.-->
        </div>

        <input TYPE="submit" value="Add" />

    </form>

</body>
</html>