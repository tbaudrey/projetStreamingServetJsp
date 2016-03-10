<%-- 
    Document   : lister_films
    Created on : 8 mars 2016, 15:14:00
    Author     : admin
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <c:import url="_CSS.jsp"/>
        <c:import url="_TITRE.jsp"/>
        <title>Page Lister_Films.jsp</title>
    </head>
    <body>
        <c:import url="_MENU.jsp"/>
        <br>
        <div class="contenu">
            <br>
            <c:forEach items="${mesFilms}" var="monFilmActuel">
                       FilmActuel : ${monFilmActuel.titre}
                       <a href="Supprimer?id=${monFilmActuel.id}">SUPPRIMER CE FILM</a>
                       <br>
            </c:forEach>
            <br>
            <br>
            <br>
            <br>
            <a href="ajouter_film.jsp">AJOUTER UN FILM</a>
            <br>
        </div>
        <br>    
        <c:import url="_PIED.jsp"/>
    </body>
</html>
