package com.mvc.company.model.service;

import com.mvc.company.model.dao.TeamDAO;
import com.mvc.company.model.dto.TeamDTO;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

import static com.mvc.common.Template.getSqlSession;

public class TeamService {

    private TeamDAO teamDAO;
    public List<TeamDTO> selectAllTeam() {
        SqlSession sqlSession = getSqlSession();
        teamDAO = sqlSession.getMapper(TeamDAO.class);

        List<TeamDTO> allTeamList = teamDAO.selectAllTeamList();
        sqlSession.close();
        return allTeamList;
    }
}
