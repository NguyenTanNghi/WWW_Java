<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="vi">
    <head>
        <meta charset="UTF-8">
        <title>Đăng ký thông tin</title>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.0/css/all.min.css">
        <link rel="stylesheet" href="css/register.css">
    </head>
    <body>
        <div id="progressBar"></div>

        <div class="container">
            <h2>Form Đăng Ký</h2>
            <form method="post" action="registration">
                <div class="input-group">
                    <i class="fa fa-user"></i>
                    <input type="text" name="name" placeholder="Họ tên" required>
                </div>
                <div class="input-group">
                    <i class="fa fa-envelope"></i>
                    <input type="email" name="email" placeholder="Email" required>
                </div>
                <div class="input-group">
                    <i class="fa fa-lock"></i>
                    <input type="password" name="password" placeholder="Mật khẩu" required>
                </div>
                <div class="input-group">
                    <i class="fa fa-venus-mars"></i>
                    <select name="gender">
                        <option value="Nam">Nam</option>
                        <option value="Nữ">Nữ</option>
                        <option value="Khác">Khác</option>
                    </select>
                </div>
                <div class="input-group">
                    <i class="fa fa-facebook"></i>
                    <input type="text" name="facebook" placeholder="Facebook">
                </div>
                <div class="input-group">
                    <i class="fa fa-pen"></i>
                    <textarea name="shortBio" rows="4" placeholder="Giới thiệu ngắn"></textarea>
                </div>

                <div class="checkbox-group">
                    <label><b>Sở thích:</b></label>
                    <div class="checkbox-items">
                        <label><input type="checkbox" name="hobbies" value="Đọc sách"> Đọc sách</label>
                        <label><input type="checkbox" name="hobbies" value="Du lịch"> Du lịch</label>
                        <label><input type="checkbox" name="hobbies" value="Nghe nhạc"> Nghe nhạc</label>
                    </div>
                </div>

                <button type="submit"><i class="fa fa-paper-plane"></i> Đăng ký</button>
            </form>
        </div>

        <script src="js/register.js"></script>
    </body>
</html>
