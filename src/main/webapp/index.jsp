<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>User Details</title>
</head>
<body >
<h2 style="text-align: center">User Details</h2>
<h3>Fill in the Form</h3>

<form action="info" method="post">
    <table>

        <tr>
            <td>ID:</td>
            <td><input type="text" name="id" /></td>
        </tr>
        <tr>
            <td>First Name:</td>
            <td><input type="text" name="firstname" /></td>
        </tr>

        <tr>
            <td>Last Name:</td>
            <td><input type="text" name="lastname" /></td>
        </tr>


    </table>

    <br> <input type="submit" value="Submit Details"><br>

</form>

</body>
</html>
