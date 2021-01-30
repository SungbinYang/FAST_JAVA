package me.sungbin.ch11.colllection.treemap;

import java.util.Comparator;

public class Member implements Comparator<Member> {

    private int memberId;
    private String memberName;

    public Member() {

    }

    public Member(int memberId, String memberName) {
        this.memberId = memberId;
        this.memberName = memberName;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    @Override
    public String toString() {
        return memberName + "회원님의 아이디는 " + memberId + "입니다.";
    }

    @Override
    public int compare(Member o1, Member o2) {
        return (o1.memberId - o2.memberId);
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Member) {
            Member member = (Member) o;
            return (this.memberId == member.memberId);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return memberId;
    }

    /* @Override
    public int compareTo(Member member) {
        return this.memberName.compareTo(member.getMemberName());
    } */
}
