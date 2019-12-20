<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>User Info</title>
</head>
<body>
    <h1>User ${user.name}</h1>
    <form action="/updateUser" method="post">
        <p>Name</p>
        <input type="text" name="name" placeholder="Your name" value="${user.name}">
        <input type="hidden" name="id" value="${user.id}">
        <p>Email</p>
        <input type="email" name="email" placeholder="Your email" value="${user.email}">
        <p>Age</p>
        <input type="number" name="age" placeholder="Your age" value="${user.age?c}"><br>
        <input type="submit" value="Save">
    </form>
    <a href="/users">Back</a>
</body>
</html>