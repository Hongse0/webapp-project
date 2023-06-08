package com.mvc.company.controller;

import com.mvc.company.model.dto.MemberDTO;
import com.mvc.company.model.service.MemberService;


import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;


@WebServlet("/member/insert")
public class insertMember extends HttpServlet {
    private MemberService memberService;

    public insertMember() {
        memberService = new MemberService();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        MemberDTO memberDTO = new MemberDTO();
        memberDTO.setMemberName(request.getParameter("memberName"));
        memberDTO.setBirthDate(request.getParameter("birthDate"));
        memberDTO.setDetailTeamCode(request.getParameter("detailTeamCode"));
        memberDTO.setDetailInfo(request.getParameter("detailInfo"));
        memberDTO.setContact(request.getParameter("contact"));
        memberDTO.setTeamCode(request.getParameter("teamCode"));
        memberDTO.setActiveStatus(request.getParameter("activeStatus"));

        boolean success = memberService.insertMember(memberDTO);

        String path ="";
        if(success) {
            path = "/WEB-INF/view/insertMember.jsp";
            request.setAttribute("member", memberDTO);

        }else {
            path = "/WEB-INF/view/common/errorPage.jsp";
            request.setAttribute("errorMessage","직원 추가에 실패하였습니다");

        }



        RequestDispatcher dispatcher = request.getRequestDispatcher(path);
        dispatcher.forward(request, response);
    }
}
