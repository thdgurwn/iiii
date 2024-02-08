package com.member.controller;

import com.common.SearchCondition;
import com.member.dto.MemberDTO;
import com.member.service.MemberService;
import com.view.MemberPrint;

import java.util.List;
import java.util.Map;

public class MemberController {

    private final MemberService memberService;
    private final MemberPrint  memberPrint;

    public MemberController(){
        memberPrint = new MemberPrint();
        memberService = new MemberService();
    }

    public void selectAllMeberList(){
        List<MemberDTO> allMemberList = memberService.selectAllMemberList();
        if (allMemberList != null){
            memberPrint.printAllMemberList(allMemberList);
        }else {
            memberPrint.printErrorMessage("selectAllMemberList");
        }
    }

    public void selectMemberByCondition(SearchCondition searchCondition) {
        List<MemberDTO> memberList = memberService.selectMemberByCondition(searchCondition);
        if (memberList != null){
            memberPrint.selectMemberByCondition(memberList, searchCondition);
        }else {
            memberPrint.printErrorMessage("selectMemberByCondition");
        }
    }


    public void registNewMember(MemberDTO member) {

        member.setMemberJoinDate(member.getMemberJoinDate().replaceAll("-",""));

        if(memberService.registNewMember(member)){
            memberPrint.printSuccessMessage("registMember");
        }else {
            memberPrint.printErrorMessage("registMember");
        }
    }


    public void modifyMemberInfo(MemberDTO member) {
        member.setMemberJoinDate(member.getMemberJoinDate().replaceAll("-",""));

        if(memberService.modifyMemberInfo(member)){
            memberPrint.printSuccessMessage("modifyMember");
        }else {
            memberPrint.printErrorMessage("modifyMember");
        }
    }


    public void deleteMember(Map<String, String> stringStringMap) {
    }
}
