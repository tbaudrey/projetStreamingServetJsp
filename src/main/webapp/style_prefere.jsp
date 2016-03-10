<%-- 
    Document   : style_prefere
    Created on : 9 mars 2016, 14:58:40
    Author     : admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="Style" method="post">
            <label>Style</label>
                <select name="Style">
                    <option value="1">style rouge</option>
                    <option value="2">style vert</option>
                    <option value="3">style magenta</option>
                </select>
                <input type="submit"/>
        </form>
    </body>
</html>
