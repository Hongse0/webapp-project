<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>SY IT COMPANY</title>
</head>
<body>
<jsp:include page="common/header.jsp"/>
<h1>직원 정보 관리</h1>

<h2>전체 직원 검색</h2>
<a href="/member/list">직원정보 전체 조회하기</a>

<hr>

<form action="SearchMembersServlet" method="POST">
    <h2>부서에 속한 직원 검색</h2>
    <label>조회할 부서 코드 : </label>
    <input type="text" name="teamCode" id="teamCode">
    <button type="submit">조회하기</button>
</form>

<hr>

<form action="AddMemberServlet" method="POST">
    <h2>직원 추가</h2>
    직원명 : <input type="text" name="memberName"><br>
    생년월일 : <input type="text" name="birthDate"><br>
    소속팀코드 :
    <select name="detailTeamCode">
        <option value="1">1</option>
        <option value="2">2</option>
        <option value="3">3</option>
        <option value="4">4</option>
        <option value="5">5</option>
        <option value="6">6</option>
        <option value="7">7</option>
        <option value="8">8</option>
        <option value="9">9</option>
        <option value="10">10</option>
        <option value="11">11</option>
        <option value="12">12</option>
    </select>
    <br>
    거주지 : <input type="text" name="detailInfo"><br>
    연락처 :
    <input type="tel" name="contact"><br>
    부서 코드 :
    <select name="teamCode">
        <option value="1">플랫폼개발팀</option>
        <option value="2">웹개발팀</option>
        <option value="3">모바일 앱 개발팀</option>
        <option value="4">데이터 분석 및 인공지능(AI) 개발팀</option>
        <option value="5">보안 및 인프라 개발팀</option>
        <option value="6">서비스 기획 및 UX/UI 개발팀</option>
    </select>
    <br>
    근무 여부 :
    <select name="activeStatus">
        <option value="Y">Y</option>
        <option value="N">N</option>
    </select>
   <br>
    <button type="submit">직원 등록하기</button>
</form>

<hr>


<form action="UpdateMemberServlet" method="POST">
    <h2>직원 수정</h2>
    <label for="memberCode">직원 코드:</label>
    <input type="text" id="memberCode" name="memberCode" required><br>

    <!-- 수정할 정보 입력 필드 추가 -->

    <input type="submit" value="수정">
</form>

<hr>
<form action="/member/delete" method="POST">
    <h2>직원 해고</h2>
    <label for="memberCode2">직원 코드:</label>
    <input type="text" id="memberCode2" name="memberCode2" required><br>
    <button type="submit">직원 해고</button>
</form>
<hr>
</body>
</html>
