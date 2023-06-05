package com.mvc.company.model.dao;

import com.mvc.company.model.dto.MemberDTO;

import java.util.List;

public interface MemberDAO {

    List<MemberDTO> selectAllMemberList();

    int deleteMember(String memberCode);

    int updateMember(MemberDTO memberDTO);

    int insertMember(MemberDTO memberDTO);


    List<MemberDTO> joinMember(MemberDTO memberDTO);
}
