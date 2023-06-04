<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>SY IT COMPANY - 전체 직원 목록</title>
</head>
<body>
<h1>전체 직원 목록</h1>

<table>
    <thead>
    <tr>
        <th>직원 코드</th>
        <th>직원 이름</th>
        <th>생년월일</th>
        <th>소속 팀 코드</th>
        <th>상세 정보</th>
        <th>연락처</th>
        <th>부서 코드</th>
        <th>활동 상태</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${memberList}" var="member">
        <tr>
            <td>${member.memberCode}</td>
            <td>${member.memberName}</td>
            <td>${member.birthDate}</td>
            <td>${member.detailTeamCode}</td>
            <td>${member.detailInfo}</td>
            <td>${member.contact}</td>
            <td>${member.teamCode}</td>
            <td>${member.activeStatus}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
<hr>
<a href="/">메인 페이지로 이동</a>
</body>
</html>
