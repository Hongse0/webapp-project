package com.mvc.company.model.service;

import com.mvc.company.model.dao.MemberDAO;
import com.mvc.company.model.dto.MemberDTO;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

import static com.mvc.common.Template.getSqlSession;

public class MemberService {

    private MemberDAO memberDAO;

    public List<MemberDTO> selectAllMember() {
        SqlSession sqlSession = getSqlSession();
        memberDAO = sqlSession.getMapper(MemberDAO.class);

        List<MemberDTO> allMemberList = memberDAO.selectAllMemberList();
        sqlSession.close();
        return allMemberList;
    }

    public int deleteMember(String memberCode) {
        SqlSession sqlSession = getSqlSession();
        memberDAO = sqlSession.getMapper(MemberDAO.class);

        int result = memberDAO.deleteMember(memberCode);

        if(result > 0){
            sqlSession.commit();
        } else{
            sqlSession.rollback();
        }

        sqlSession.close();

        return result;
    }


    public boolean updateMember(MemberDTO memberDTO) {
        SqlSession sqlSession = getSqlSession();
        memberDAO = sqlSession.getMapper(MemberDAO.class);

        int result = memberDAO.updateMember(memberDTO);

        if (result > 0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }
        sqlSession.close();
        return result>0 ? true:false;
    }

    public boolean insertMember(MemberDTO memberDTO) {
        SqlSession sqlSession = getSqlSession();
        memberDAO = sqlSession.getMapper(MemberDAO.class);

        int result = memberDAO.insertMember(memberDTO);
        if(result>0){
            sqlSession.commit();
        }else{
            sqlSession.rollback();
        }

        sqlSession.close();

        return result>0 ? true:false;
    }


    public List<MemberDTO> joinMember(MemberDTO memberDTO) {
        SqlSession sqlSession = getSqlSession();
        memberDAO = sqlSession.getMapper(MemberDAO.class);

        List<MemberDTO> joinMemberList = memberDAO.joinMember(memberDTO);
        sqlSession.close();
        return joinMemberList;

    }
}
