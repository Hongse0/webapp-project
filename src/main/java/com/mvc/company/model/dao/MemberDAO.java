package com.mvc.company.model.dao;

import com.mvc.company.model.dto.MemberDTO;

import java.sql.Connection;
import java.util.List;

public interface MemberDAO {

    List<MemberDTO> selectAllMemberList();

    int deleteMember(String memberCode);
}
