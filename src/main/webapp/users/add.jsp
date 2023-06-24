<%@ page isELIgnored="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="header.jsp"%>
<head>
    <title>Dodaj użytkownika</title>
</head>
<body>
<div class="card shadow mb-4">
    <div class="card-header py-3">
        <h6 class="m-0 font-weight-bold text-primary">Lista użytkowników</h6>
    </div>
</div>
<div class="card-body">
    <div class="table">
    <form method="post">
        <label>
            <div>Nazwa użytkownika</div>
           <input type="text" name="username"/>
            <div>Email</div>
            <div>
            <input type="email" name="email"/>
            </div>
            <div>Hasło</div>
            <div>
            <input type="password" name="password"/>
                </div>
        </label>
        <div>
        <button type="submit">Zapisz</button>
        </div>
    </form>
    </div>
</div>
</body>
<%@include file="footer.jsp"%>
