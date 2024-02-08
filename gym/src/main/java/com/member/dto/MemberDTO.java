package com.member.dto;

public class MemberDTO {

    private int memberCode;
    private String memberPhone;
    private String memberName;
    private String memberSex;
    private String memberAge;
    private String memberJoinDate;
    private int gymCode;

    public MemberDTO() {
    }

    public MemberDTO(int memberCode, String memberPhone, String memberName, String memberSex, String memberAge, String memberJoinDate, int gymCode) {
        this.memberCode = memberCode;
        this.memberPhone = memberPhone;
        this.memberName = memberName;
        this.memberSex = memberSex;
        this.memberAge = memberAge;
        this.memberJoinDate = memberJoinDate;
        this.gymCode = gymCode;
    }

    public int getMemberCode() {
        return memberCode;
    }

    public void setMemberCode(int memberCode) {
        this.memberCode = memberCode;
    }

    public String getMemberPhone() {
        return memberPhone;
    }

    public void setMemberPhone(String memberPhone) {
        this.memberPhone = memberPhone;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getMemberSex() {
        return memberSex;
    }

    public void setMemberSex(String memberSex) {
        this.memberSex = memberSex;
    }

    public String getMemberAge() {
        return memberAge;
    }

    public void setMemberAge(String memberAge) {
        this.memberAge = memberAge;
    }

    public String getMemberJoinDate() {
        return memberJoinDate;
    }

    public void setMemberJoinDate(String memberJoinDate) {
        this.memberJoinDate = memberJoinDate;
    }

    public int getGymCode() {
        return gymCode;
    }

    public void setGymCode(int gymCode) {
        this.gymCode = gymCode;
    }

    @Override
    public String toString() {
        return "MemberDTO{" +
                "memberCode=" + memberCode +
                ", memberPhone='" + memberPhone + '\'' +
                ", memberName='" + memberName + '\'' +
                ", memberSex='" + memberSex + '\'' +
                ", memberAge='" + memberAge + '\'' +
                ", memberJoinDate='" + memberJoinDate + '\'' +
                ", gymCode=" + gymCode +
                '}';
    }
}
