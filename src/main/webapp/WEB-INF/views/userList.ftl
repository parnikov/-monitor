<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Users</title>
</head>
<body>
    <h1>User list</h1>
    <a href="/addUser">Create new user</a>
    <table>
        <tr>
            <th>id</th>
            <th>name</th>
            <th>email</th>
            <th>age</th>
            <th>actions</th>
        </tr>
        <#list users as user>
            <tr>
                <td><a href="/user/${user.id}">${user.id}</a></td>
                <td>${user.name}</td>
                <td>${user.email}</td>
                <td>${user.age}</td>
                <td>
                    <a href="/delete/${user.id}">delete</a>
                    <a href="/update/${user.id}">update</a>
                </td>
            </tr>
        </#list>
    </table>
</body>
</html>