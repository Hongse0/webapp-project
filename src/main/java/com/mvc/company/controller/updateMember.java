package com.mvc.company.controller;

import com.mvc.company.model.dto.MemberDTO;
import com.mvc.company.model.service.MemberService;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/member/update")
public class updateMember extends HttpServlet {

    private MemberService memberService;

    public updateMember() {
        memberService = new MemberService();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        MemberDTO memberDTO = new MemberDTO();
        memberDTO.setMemberCode(request.getParameter("memberCode"));
        memberDTO.setTeamCode(request.getParameter("teamCode2"));
        memberDTO.setDetailInfo(request.getParameter("detailInfo2"));
        boolean success = memberService.updateMember(memberDTO);

        String path = "";
        if (success) {
            path = "/WEB-INF/view/updateMember.jsp";
        } else {
            path = "/WEB-INF/view/common/errorPage.jsp";
            request.setAttribute("errorMessage", "직원 정보 수정에 실패하였습니다.");
        }

        RequestDispatcher dispatcher = request.getRequestDispatcher(path);
        dispatcher.forward(request, response);
    }
}
