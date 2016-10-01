package com.abc.my.app160924.member;

import android.util.Log;

/**
 * Created by 1027 on 2016-10-01.
 */

public class MemberDAO {

    //DB계열..

    //비지니스로직..

    //로그인의 로직 R
    public MemberDTO select(MemberDTO param){
        Log.i("====DAO 에서 받은 ID: ",param.getId());
        Log.i("====DAO 에서 받은 PW: ",param.getPw());
        MemberDTO member = new MemberDTO();

        member.setId("hong");
        member.setPw("1");
        member.setName("홍길동");
        return member;
    };
    //조인의 로직  C
    public MemberDTO insert(MemberDTO param){
        MemberDTO member = new MemberDTO();
        return member;
    };

    // U
    public MemberDTO update(MemberDTO param){
        MemberDTO member = new MemberDTO();
        return member;
    };

    // D
    public MemberDTO delete(MemberDTO param){
        MemberDTO member = new MemberDTO();
        return member;
    };
}
