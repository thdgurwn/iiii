package com.view;

import com.common.SearchCondition;
import com.member.controller.MemberController;
import com.member.dto.MemberDTO;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MemberMenu {
    public void displayMenu() {
        Scanner sc = new Scanner(System.in);
        MemberController memberController = new MemberController();
        do{
            System.out.println("======== Member Info 관리 ========");
            System.out.println("회원 정보 관리 화면입니다.");
            System.out.println("===================================");
            System.out.println("1. 전체 회원 정보 조회");
            System.out.println("2. 조건부 회원 정보 조회");
            System.out.println("3. 신규 회원 정보 등록");
            System.out.println("4. 기존 회원정보 수정");
            System.out.println("5. 회원 삭제");
            System.out.println("9. 이전 메뉴로 이동");
            System.out.println("===================================");
            System.out.println("원하는 관리 메뉴의 번호를 입력해 주세요 : ");
            int selectMenu = sc.nextInt();

            switch (selectMenu){
                case 1 : memberController.selectAllMeberList(); break;
                case 2 : memberController.selectMemberByCondition(inputSearchCondition()); break;
                case 3 : memberController.registNewMember(inputNewMemberInfo()); break;
                case 4 : memberController.modifyMemberInfo(inputModifyMemberInfo()); break;
                case 5 : memberController.deleteMember(inputMemberCode()); break;
                case 9 : System.out.println("========상위 메뉴로 이동합니다.========"); return;
                default : System.out.println("잘못된 번호입니다. 확인 후 다시 입력해 주세요."); break;
            }
        } while (true);
    }
    private static SearchCondition inputSearchCondition() {

        Scanner sc = new Scanner(System.in);
        String searchOption = "";
        String searchValue = "";

        System.out.println("===================================");
        System.out.println("조회하고 싶은 조건을 선택하세요. ");
        System.out.println("===================================");
        System.out.println("1. 회원명으로 조회");
        System.out.println("2. 회원 번호로 조회");
        System.out.println("3. 성별 조회");
        System.out.println("4. 회원나이 조회");
        System.out.println("===================================");
        System.out.println("원하는 조건의 번호를 입력해 주세요 : ");
        int selectMenu = sc.nextInt();

        switch (selectMenu) {
            case 1 :
                sc.nextLine();
                searchOption = "memberName";
                System.out.println("조회할 회원명을 입력해 주세요 : ");
                searchValue = sc.nextLine();
                break;
            case 2 :
                sc.nextLine();
                searchOption = "memberCode";
                System.out.println("조회할 회원번호를 입력해주세요 : ");
                searchValue = sc.nextLine();
                break;
            case 3 :
                searchOption = "memberSex";
                System.out.println("조회할 성별을 입력해주세요 : ");
                searchValue = sc.nextLine();
                break;
            case 4 :
                searchOption = "memberAge";
                System.out.println("조회할 나이를 입력해주세요 : ");
                searchValue = sc.nextLine();
                break;
            case 9 : System.out.println("========상위 메뉴로 이동합니다.========"); return null;
            default : System.out.println("잘못된 번호입니다. 확인 후 다시 입력해 주세요."); break;
        }

        SearchCondition searchCondition = new SearchCondition();
        searchCondition.setOption(searchOption);
        searchCondition.setValue(searchValue);
        // 주석을 지우고 searchCondition 검색조건과 검색어를 searchCondition 객체에 setting 하세요.

        return searchCondition;
    }
    private static MemberDTO inputNewMemberInfo() {
        Scanner sc = new Scanner(System.in);

        System.out.println("===================================");
        System.out.println("등록할 새로운 회원 정보를 입력하세요. ");
        System.out.println("===================================");
       MemberDTO memberDTO = new MemberDTO();
        getMemberInfo(memberDTO);
        System.out.println("===================================");

        return memberDTO;
    }
    private static MemberDTO inputModifyMemberInfo() {
        Scanner sc = new Scanner(System.in);

        System.out.println("===================================");
        System.out.println("수정할 회원 정보를 입력하세요. ");
        System.out.println("수정을 원하지 않는 정보는 SKIP을 입력하세요.");
        System.out.println("===================================");
        System.out.println("수정 대상 회원코드를 입력해 주세요 : ");
//       String memberCode = sc.nextLine();
     int memberCode = sc.nextInt();
        sc.nextLine();


       MemberDTO memberDTO = new MemberDTO();
//      memberDTO.setMemberCode(Integer.getInteger(memberCode));
     memberDTO.setMemberCode(memberCode);
        // 주석을 지우고 받아온 제품 코드를 productDTO 객체에 setting 하세요.

//        getMemberInfo(memberDTO);

        System.out.println("회원의 수정할 전화번호를 입력해주세요 : ");
        String memberPhone  = sc.nextLine();
        System.out.println("회원의 수정할 이름을 입력해주세요 : ");
        String memberName = sc.nextLine();
        System.out.println("회원의 수정할 성별을 입력해주세요 : ");
        String memberSex = sc.nextLine();
        System.out.println("회원의 수정할 나이를 입력해주세요 : ");
        String memberAge = sc.nextLine();
        System.out.println("회원의 수정할 가입날짜를 입력해주세요(0000-00-00 : ");
        String memberJoinDate = sc.nextLine();
        System.out.println("회원의 수정할 GYM 번호를 입력해주세요 : ");
        String gymCode = sc.nextLine();

        // 주석을 지우고 받아온 활동 상태를 productDTO 객체에 setting 하세요.



        memberDTO.setMemberName(memberName);
        memberDTO.setMemberPhone(memberPhone);
        memberDTO.setMemberJoinDate(memberJoinDate);
        memberDTO.setMemberSex(memberSex);
        memberDTO.setMemberAge(memberAge);
        memberDTO.setGymCode(Integer.parseInt(gymCode));

        System.out.println("===================================");

        return memberDTO;
    }
    private static MemberDTO getMemberInfo(MemberDTO memberDTO) {
        Scanner sc = new Scanner(System.in);

        System.out.println(" 회원의 전화번호를 입력해 주세요 : ");
        String memberPhone = sc.nextLine();
        System.out.println("회원의 이름을 입력해 주세요 : ");
        String memberName = sc.nextLine();
        System.out.println("회원의 성별을 입력해 주세요 : ");
        String memberSex = sc.nextLine();
        System.out.println("회원의 나이를 입력해 주세요 : ");
        String memberAge  = sc.nextLine();
        System.out.println("회원의 가입일울 입력해 주세요(2000-01-01 형식) : ");
        String memberJoinDate  = sc.nextLine();
        System.out.println("회원의 다니는 헬스클럽 코드를 입력해주세요. : ");
        String gymCode  = sc.nextLine();

        // 주석을 지우고 받아온 정보들을 productDTO 객체에 setting 하세요.
        memberDTO.setMemberName(memberName);
        memberDTO.setMemberPhone(memberPhone);
        memberDTO.setMemberJoinDate(memberJoinDate);
        memberDTO.setMemberSex(memberSex);
        memberDTO.setMemberAge(memberAge);
        memberDTO.setGymCode(Integer.parseInt(gymCode));

        return memberDTO;
    }

    private static Map<String, String > inputMemberCode (){
        Scanner sc = new Scanner(System.in);

        System.out.println("===================================");
        System.out.println("삭제할 제품의 코드를 입력해 주세요 : ");
        String productCode = sc.nextLine();
        System.out.println("===================================");

        Map<String, String> parameter = new HashMap<>();
        parameter.put("productCode", productCode);

        return parameter;
    }

}
