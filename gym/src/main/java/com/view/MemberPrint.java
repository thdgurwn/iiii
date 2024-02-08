package com.view;

import com.common.SearchCondition;
import com.member.dto.MemberDTO;

import java.util.List;

public class MemberPrint {
    public void printAllMemberList(List<MemberDTO> allMemberList) {
        System.out.println("=========전체 회원 정보 목록==========");
        for(MemberDTO member : allMemberList) {
            System.out.println(member);
        }
        System.out.println("===================================");

    }

    public void printErrorMessage(String errorCode) {
        String errorMessage = "";

        switch (errorCode) {
            case "selectAllmemberList" : errorMessage = "조회 결과가 없습니다. (about 전체 회원 정보 목록 조회)"; break;
            case "selectmemberList" : errorMessage = "조회 결과가 없습니다. (about 선택 회원 정보 조회)"; break;
            case "registmember" : errorMessage = "신규 회원 등록을 실패하였습니다. 다시 시도해 주세요."; break;
            case "modifymember" : errorMessage = "회원 정보 수정을 실패하였습니다. 다시 시도해 주세요."; break;
            case "deletemember" : errorMessage = "회원 정보 삭제를 실패하였습니다. 다시 시도해 주세요."; break;
        }

        System.out.println(errorMessage);
        System.out.println("===================================");

    }


    public void selectMemberByCondition(List<MemberDTO> memberList, SearchCondition searchCondition) {
        String searchOption = "";
        switch (searchCondition.getOption()) {
            case "memberName" : searchOption = "회원명 검색 결과"; break;
            case "memberCode" : searchOption = "회원번호 검색 결과"; break;
            case "memberSex" : searchOption = "성별회원 검색 결과"; break;
            case "memberAge" : searchOption = "회원 나이 검색 결과"; break;
        }

        System.out.println("=========" + searchOption + " 목록==========");
        for(MemberDTO member : memberList) {
            System.out.println(member);
        }
        System.out.println("=====================================");
    }

    public void printSuccessMessage(String successCode) {

        String successMessage = "";

        switch (successCode) {
            case "registMember" : successMessage = "신규 회원을 등록하였습니다. 환영합니다!"; break;
            case "modifyMember" : successMessage = "회원 정보를 수정하였습니다. 감사합니다!"; break;
            case "deleteMember" : successMessage = "회원 정보를 삭제하였습니다. 수고하셨습니다."; break;
        }

        System.out.println(successMessage);
        System.out.println("===================================");
    }
}
