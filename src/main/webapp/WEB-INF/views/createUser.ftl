<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Create user page</title>
</head>
<body>
<h1>Add new User</h1>
<form action="/addUser" method="post">
    <p>Name</p>
    <input type="text" name="name" placeholder="Your name">
    <p>Email</p>
    <input type="email" name="email" placeholder="Your email">
    <p>Age</p>
    <input type="number" name="age" placeholder="Your age">
    <input type="submit" value="Submit">
</form>
</body>
</html>