<%--
  Created by IntelliJ IDEA.
  User: bot
  Date: 23.02.17
  Time: 11:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>

</head>

<body><H1>REGISTRATION</H1>
<form action="/registration" method="post">
    <style>
        table {
            width: 300px; /* Ширина таблицы */
            /*border: 5px solid green; /* Рамка вокруг таблицы */
            margin: auto; /* Выравниваем таблицу по центру окна  */
        }
        td {
            text-align: center;
        }
    </style>
   <table>
       <tr>
       <tr>
           <td for="login">Логин:</td>
           <td><input type="text" name="login" id="login" value="" placeholder="Input"></td>
       </tr>
       <tr>
           <td for="password">Пароль:</td>
           <td><input type="password" name="password" id="password" value="" placeholder="Input"></td>
       </tr>
       <tr>
           <td for="lastName">Фамилия:</td>
           <td><input type="text" name="lastName" id="lastName" value="" placeholder="Input"></td>
       </tr>
       <tr>
           <td for="firstName">Имя:</td>
           <td><input type="text" name="firstName" id="firstName" value="" placeholder="Input"></td>
       </tr>
       </tr>
       <tr>
           <td for="email">Почта:</td>
           <td><input type="text" name="email" id="email" value="" placeholder="Input"></td>
       </tr>
       </tr>
       <tr>
           <td for="phone">Телефон:</td>
           <td><input type="text" name="phone" id="phone" value="" placeholder="Input"></td>
       </tr>
       <td>
       <td>
       <td>
           <input type="submit" value="Зарегистрироваться" formmethod="post">
       </td>
       </tr>
   </table>
</form>
</body>
</html>
