package com.mvc.company.controller;

import com.mvc.company.model.service.MemberService;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/member/delete")
public class deleteMember extends HttpServlet {
    private MemberService memberService;

    public deleteMember() {
        memberService = new MemberService();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String memberCode = request.getParameter("message");
        int deletenum = memberService.deleteMember(memberCode);

        if(deletenum >0){
            response.getWriter().write("성공했습니다.");
        }else{
            response.getWriter().write("직원이 존재하지 않습니다.");
        }
    }
}
