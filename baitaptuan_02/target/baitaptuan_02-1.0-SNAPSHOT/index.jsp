<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="vi">
<head>
  <meta charset="UTF-8">
  <title>Đăng nhập</title>
  <style>
    * {
      box-sizing: border-box;
      font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
    }

    body {
      margin: 0;
      padding: 0;
      background: linear-gradient(135deg, #74ebd5, #ACB6E5);
      display: flex;
      justify-content: center;
      align-items: center;
      height: 100vh;
      animation: fadeIn 1s ease-in;
    }

    @keyframes fadeIn {
      from { opacity: 0; transform: translateY(-20px); }
      to { opacity: 1; transform: translateY(0); }
    }

    .login-container {
      background-color: #ffffff;
      padding: 40px;
      border-radius: 12px;
      box-shadow: 0 8px 20px rgba(0, 0, 0, 0.2);
      width: 100%;
      max-width: 400px;
      transition: transform 0.3s ease;
    }

    .login-container:hover {
      transform: translateY(-5px);
    }

    h1 {
      text-align: center;
      margin-bottom: 24px;
      color: #333;
    }

    label {
      display: block;
      margin-bottom: 8px;
      font-weight: bold;
      color: #555;
    }

    input[type="text"],
    input[type="password"] {
      width: 100%;
      padding: 12px;
      margin-bottom: 20px;
      border: 1px solid #ccc;
      border-radius: 8px;
      transition: border-color 0.3s ease, box-shadow 0.3s ease;
    }

    input[type="text"]:focus,
    input[type="password"]:focus {
      border-color: #5cb5ff;
      box-shadow: 0 0 8px rgba(92, 181, 255, 0.3);
      outline: none;
    }

    input[type="submit"] {
      width: 100%;
      padding: 12px;
      background: #5cb5ff;
      border: none;
      color: white;
      font-weight: bold;
      border-radius: 8px;
      cursor: pointer;
      transition: background 0.3s ease, transform 0.2s;
    }

    input[type="submit"]:hover {
      background: #4aa0e0;
      transform: scale(1.03);
    }

    input[type="submit"]:active {
      transform: scale(0.98);
    }
  </style>
</head>
<body>
<div class="login-container">
  <h1>Đăng nhập</h1>
  <form action="login" method="post">
    <label for="username">Tên đăng nhập:</label>
    <input type="text" id="username" name="username" required>

    <label for="password">Mật khẩu:</label>
    <input type="password" id="password" name="password" required>

    <input type="submit" value="Đăng nhập">
  </form>
</div>
</body>
</html>
