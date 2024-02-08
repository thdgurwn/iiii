package com.member.service;

import com.common.SearchCondition;
import com.member.dao.MemberDAO;
import com.member.dto.MemberDTO;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

import static com.common.Template.getSqlSession;

public class MemberService {

    private MemberDAO memberDAO;
    public List<MemberDTO> selectAllMemberList() {

        SqlSession sqlSession = getSqlSession();
        memberDAO = sqlSession.getMapper(MemberDAO.class);

        List<MemberDTO> allMemberList = memberDAO.selectAllMemberList();

        sqlSession.close();

        return allMemberList;
    }

    public List<MemberDTO> selectMemberByCondition(SearchCondition searchCondition) {
        SqlSession sqlSession = getSqlSession();
        memberDAO = sqlSession.getMapper(MemberDAO.class);

        List<MemberDTO> memberList = memberDAO. selectMemberByCondition(searchCondition);

        sqlSession.close();

        return memberList;
    }

    public boolean registNewMember(MemberDTO member) {

        SqlSession sqlSession = getSqlSession();
        memberDAO = sqlSession.getMapper(MemberDAO.class);

        int result = memberDAO.insertMember(member);
        if (result>0){
            sqlSession.commit();
        }else {
            sqlSession.rollback();
        }
        sqlSession.close();
        return result > 0;
    }

    public boolean modifyMemberInfo(MemberDTO member) {
        SqlSession sqlSession = getSqlSession();
        memberDAO = sqlSession.getMapper(MemberDAO.class);

        int result = memberDAO.updateMember(member);
        if (result>0){
            sqlSession.commit();
        }else {
            sqlSession.rollback();
        }
        sqlSession.close();
        return result > 0;
    }
}
