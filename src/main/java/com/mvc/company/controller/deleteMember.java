package com.mvc.company.controller;

import com.mvc.company.model.service.MemberService;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/member/delete")
public class deleteMember extends HttpServlet {
    private MemberService memberService;

    public deleteMember() {
        memberService = new MemberService();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        String memberCode = request.getParameter("memberCode2");

        int deleteMem = memberService.deleteMember(memberCode);

        String path = "";
        if (deleteMem >0) {
            path = "/WEB-INF/view/common/successPage.jsp";
            request.setAttribute("successMessage", "직원 정보가 삭제되었습니다.");
        } else {
            path = "/WEB-INF/view/common/errorPage.jsp";
            request.setAttribute("errorMessage", "직원 정보 삭제에 실패하였습니다.");
        }

        RequestDispatcher dispatcher = request.getRequestDispatcher(path);
        dispatcher.forward(request, response);
    }
}
