<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Form Đăng ký</title>
</head>
<body>
<h2>Form Đăng ký</h2>
<form method="post" action="register" name="registrationForm">
    <label>Họ và tên:</label>
    <input type="text" name="name" required><br><br>

    <label>Email:</label>
    <input type="email" name="email" required><br><br>

    <label>Password:</label>
    <input type="password" name="password" required><br><br>

    <label>Giới tính:</label>
    <select name="gender">
        <option value="Nam">Nam</option>
        <option value="Nữ">Nữ</option>
        <option value="Khác">Khác</option>
    </select><br><br>

    <label>Sở thích:</label><br>
    <input type="checkbox" name="hobby" value="Đọc sách"> Đọc sách<br>
    <input type="checkbox" name="hobby" value="Nghe nhạc"> Nghe nhạc<br>
    <input type="checkbox" name="hobby" value="Du lịch"> Du lịch<br><br>

    <label>Facebook:</label>
    <input type="text" name="facebook"><br><br>

    <label>Giới thiệu bản thân:</label><br>
    <textarea name="shortBio" rows="5" cols="40"></textarea><br><br>

    <input type="submit" value="Đăng ký">
</form>
</body>
</html>

