package com.abc.my.app160924.member;

/**
 * Created by 1027 on 2016-10-01.
 */

public interface MemberService {
    //activity 1개당 1개씩 추상메소드를 만든다.
    public MemberDTO login(MemberDTO member);
    public MemberDTO join(MemberDTO member);

}
