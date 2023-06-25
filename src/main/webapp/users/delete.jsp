<%@ page isELIgnored="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="header.jsp"%>

<head>
    <title>delete</title>
</head>
<body>
<div>Czy na pewno chcesz usunąć użytkownika
    <label>
        <form method="post">
        <button type="submit" name="delete" value="delete">Tak</button>
        <button type="submit">Nie</button>
        </form>
    </label>
</div>
</body>
<%@include file="footer.jsp"%>

