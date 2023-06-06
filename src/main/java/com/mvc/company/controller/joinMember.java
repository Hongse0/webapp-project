package com.mvc.company.controller;

import com.mvc.company.model.dto.MemberDTO;
import com.mvc.company.model.service.MemberService;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.List;

@WebServlet("/member/join")
public class joinMember extends HttpServlet {

    private MemberService memberService;

    public joinMember(){
        memberService = new MemberService();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        MemberDTO memberDTO = new MemberDTO();
        memberDTO.setTeamCode(request.getParameter("teamCode3"));

        List<MemberDTO> joinList = memberService.joinMember(memberDTO);
        request.setAttribute("joinList",joinList);
        String path = "";
        if(joinList != null && joinList.size()>0){
            path = "/WEB-INF/view/joinPage.jsp";
        }else {
            path ="/WEB-INF/view/common/errorPage.jsp";
            request.setAttribute("errorMessage","해당 직원들 조회에 실패하였습니다");
        }

        RequestDispatcher dispatcher =request.getRequestDispatcher(path);
        dispatcher.forward(request,response);

    }
}
