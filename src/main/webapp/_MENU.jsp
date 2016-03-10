<%-- 
    Document   : _MENU
    Created on : 8 mars 2016, 14:52:41
    Author     : admin
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<div class="menu">
    <a href="ListerFilms">Liste des films</a>
    <a href="ListerSeries">Liste des Series</a>
    <a href="style_prefere.jsp">CHANGER DE STYLE</a>
    <c:if test="${sessionScope.login==null}">
        <a href="login.jsp">Connexion</a>
    </c:if>
    <c:if test="${sessionScope.login!=null}">
        <a href="DeconnexionServlet">Deconnexion</a>
    </c:if>
    Bonjour ${sessionScope.login}
</div>
