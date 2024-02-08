package com.member.dao;

import com.common.SearchCondition;
import com.member.dto.MemberDTO;

import java.util.List;

public interface MemberDAO {

    List<MemberDTO> selectAllMemberList();

    List<MemberDTO> selectMemberByCondition(SearchCondition searchCondition);

    int insertMember(MemberDTO member);

    int updateMember(MemberDTO member);
}
