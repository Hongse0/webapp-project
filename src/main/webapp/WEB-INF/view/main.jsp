<%@ page contentType="text/html; charset=UTF-8"  %>
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

<form action="/member/join" method="POST">
    <h2>부서에 속한 직원 검색</h2>
    <label>조회할 부서 코드 : </label>
    <input type="text" name="teamCode3" id="teamCode3">
    <button type="submit">조회하기</button>
</form>
<a href="/team/list">전체 팀 정보</a>
<hr>

<form action="/member/insert" method="POST">
    <h2>직원 추가</h2>
    직원명 : <input type="text" id="memberName" name="memberName"><br>
    생년월일 : <input type="text" id="birthDate" name="birthDate"><br>
    소속팀코드 :
    <select id="detailTeamCode" name="detailTeamCode">
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
    거주지 : <input type="text" id="detailInfo" name="detailInfo"><br>
    연락처 :
    <input type="tel" id="contact" name="contact"><br>
    부서 코드 :
    <select id="teamCode" name="teamCode">
        <option value="1">플랫폼개발팀</option>
        <option value="2">웹개발팀</option>
        <option value="3">모바일 앱 개발팀</option>
        <option value="4">데이터 분석 및 인공지능(AI) 개발팀</option>
        <option value="5">보안 및 인프라 개발팀</option>
        <option value="6">서비스 기획 및 UX/UI 개발팀</option>
    </select>
    <br>
    근무 여부 :
    <select id="activeStatus" name="activeStatus">
        <option value="Y">Y</option>
        <option value="N">N</option>
    </select>
   <br>
    <button type="submit">직원 등록하기</button>
</form>

<hr>


<form action="/member/update" method="POST">
    <h2>직원 수정</h2>
    <label for="memberCode">직원 코드:</label>
    <input type="text" id="memberCode" name="memberCode" required><br>
    <label for="teamCode2">수정할 부서 코드 :</label>
    <input type="text" id="teamCode2" name="teamCode2" required><br>
    <label for="teamCode2">수정할 거주지 정보 :</label>
    <input type="text" id="detailInfo2" name="detailInfo2" required><br>
    <button type="submit">직원 정보 수정</button>
</form>

<hr>
<form action="/member/delete" method="POST">
    <h2>직원 해고</h2>
    <label for="memberCode2">직원 코드:</label>
    <input type="text" id="memberCode2" name="memberCode2"><br>
    <button type="submit">직원 해고</button>
</form>
<hr>
</body>
</html>
