package com.mvc.company.controller;

import com.mvc.company.model.dao.MemberDAO;
import com.mvc.company.model.dto.MemberDTO;
import com.mvc.company.model.service.MemberService;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.List;

@WebServlet("/member/list")
public class selectAllMember extends HttpServlet {

    private MemberService memberService;

    public selectAllMember() {
        memberService = new MemberService();
    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            List<MemberDTO> memberList = memberService.selectAllMember();
            request.setAttribute("memberList", memberList);
            request.getRequestDispatcher("/WEB-INF/view/memberList.jsp").forward(request, response);
        }catch (Exception e){
            e.printStackTrace();
        }

    }

}
