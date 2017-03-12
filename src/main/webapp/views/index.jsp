<%--
  Created by IntelliJ IDEA.
  User: tatar
  Date: 04.03.17
  Time: 23:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Стартовая страница</title>
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
  </head>
  <div>
    <a href="/registration">Регистрация</a>
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
        <td for="/index">Перейдите к авторизации</td>
        <form action="/index" method="post">
        <div>
          <td><input class="btn btn-default" type="submit" value="Авторизация" formmethod="post"></td>
        </div>
        </form>



      </tr>


    </table>



    </form>
  </div>

  </body>

</html>
