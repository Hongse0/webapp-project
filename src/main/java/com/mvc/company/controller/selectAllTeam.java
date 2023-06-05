package com.mvc.company.controller;

import com.mvc.company.model.dto.TeamDTO;
import com.mvc.company.model.service.TeamService;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.List;

@WebServlet("/team/list")
public class selectAllTeam extends HttpServlet {

    private TeamService teamService;

    public selectAllTeam(){
        teamService = new TeamService();
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            List<TeamDTO> teamList = teamService.selectAllTeam();
            request.setAttribute("teamList",teamList);
            request.getRequestDispatcher("/WEB-INF/view/teamList.jsp").forward(request,response);
        }catch (Exception e){
            e.printStackTrace();
        }



    }


}
