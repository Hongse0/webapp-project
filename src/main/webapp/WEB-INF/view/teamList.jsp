<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>SY company 팀 정보</title>
</head>
<body>
<h1>전체 부서 목록</h1>

<table>
  <thead>
  <tr>
    <th>부서 코드</th>
    <th>부서 이름</th>
    <th>부서 업무</th>
    <th>부서 운영 여부</th>
  </tr>
  </thead>
  <tbody>
  <c:forEach items="${teamList}" var="team">
    <tr>
      <td>${team.teamCode}</td>
      <td>${team.teamName}</td>
      <td>${team.teamDetail}</td>
      <td>${team.useYN}</td>
    </tr>
  </c:forEach>
  </tbody>
</table>
<hr>
<a href="/">메인 페이지로 이동</a>
</body>
</html>
