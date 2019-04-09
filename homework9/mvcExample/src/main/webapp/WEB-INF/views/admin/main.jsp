<%--
  Created by IntelliJ IDEA.
  User: Vitaliy
  Date: 09.04.2019
  Time: 12:27
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib prefix="sql_rt" uri="http://java.sun.com/jstl/sql_rt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Insert title here</title>
</head>
<body>
${mainText}<br/>
<c:if test="${studentsList ne null}">
    <c:forEach items="${studentsList}" var="student" varStatus="index">
        ${index.index+1}.) <a href="/springmvc_war/home/${student.studentId}">${student.pib}</a><br/>
    </c:forEach>
</c:if>
<form action="http://localhost:8080/springmvc_war/home" method="post" style="margin-top: 30px">
    <input type="text" name="pib" placeholder="PIB">
    <input type="number" name="course" placeholder="Course">
    <input type="submit" value="submit">
</form>
</body>
</html>