package com.abc.my.app160924.member;

import android.util.Log;

/**
 * Created by 1027 on 2016-10-01.
 */

public class MemberServiceImpl implements MemberService{

    MemberDAO dao = new MemberDAO();

    @Override
    public MemberDTO login(MemberDTO param) {
        Log.i("====SERVICE 에서 받은 ID: ",param.getId());
        Log.i("====SERVICE 에서 받은 PW: ",param.getPw());

        MemberDTO member = new MemberDTO();
        member = dao.select(param);

        if(member==null){
            member.setId("NONE");
            //member.setId(param.getId()+"는 존재하지 않는 ID 입니다.");
            return member;
        }else if(member.getPw().equals(param.getPw())){

            return member;
        } else{
            member.setId("NO_MATCH");
            return member;        }

        //return member;
    }

    @Override
    public MemberDTO join(MemberDTO param) {
        MemberDTO member = new MemberDTO();
        return member;
    }
}
