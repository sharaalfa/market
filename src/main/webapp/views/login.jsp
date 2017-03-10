<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
</head>
<body>
<div>
    <a href="/WEB-INF/views/registration.jspgistration.jsp">Регистрация</a>
    <style>
        table {
            width: 300px; /* Ширина таблицы */
            border: 5px solid #5c4980; /* Рамка вокруг таблицы */
            margin: auto; /* Выравниваем таблицу по центру окна  */
        }
        td {
            text-align: center;
        }
    </style>
    <table class="table">
${msg}
        <tr>
            <td for="/login">Логин:</td>
            <td><input class="form-control" type="text" name="login" id="login" value="" placeholder="Input"><td/>
            <td for="password">Пароль:</td>
            <td><input class="form-control" type="password" name="password" id="password" value="" placeholder="Input"></td>

            <td><input class="btn btn-default" type="submit" value="Войти" formmethod="post"></td>

        </tr>


    </table>
    <form action="/login" method="post">


    </form>
</div>

</body>
</html>