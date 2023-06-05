package com.mvc.company.model.dao;

import com.mvc.company.model.dto.TeamDTO;

import java.util.List;

public interface TeamDAO {
    List<TeamDTO> selectAllTeamList();
}
