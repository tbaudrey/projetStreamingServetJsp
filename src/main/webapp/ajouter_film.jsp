<%-- 
    Document   : ajouter_film
    Created on : 9 mars 2016, 10:35:30
    Author     : admin
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ajouter_film</title>
    </head>
    <body>
        <form action="Ajouter" method="post">
            <label>Titre du film</label>
            <input type="text" name="titre"/>
            <br>
            <input type="submit"/>
        <br>
        </form>
    </body>
</html>
