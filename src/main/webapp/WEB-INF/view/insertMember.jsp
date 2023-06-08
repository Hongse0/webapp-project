<%@ page import="com.mvc.company.model.dto.MemberDTO" %>
<%@ page contentType="text/html;charset=UTF-8" language="java"  %>
<html>
<head>
    <title>SY company 직원정보</title>
</head>
<body>
<h2>입력된 직원 정보</h2>
<%
    MemberDTO member = (MemberDTO) request.getAttribute("member");

%>
<p>직원명: <%= member.getMemberName() %></p>
<p>생년월일: <%= member.getBirthDate() %></p>
<p>소속팀코드: <%= member.getDetailTeamCode() %></p>
<p>거주지: <%= member.getDetailInfo() %></p>
<p>연락처: <%= member.getContact() %></p>
<p>부서 코드: <%= member.getTeamCode() %></p>
<p>근무 여부: <%= member.getActiveStatus() %></p>


<h3>직원이 추가되었습니다.</h3>
<a href="/">메인 화면으로 돌아가기</a>
</body>
</html>
