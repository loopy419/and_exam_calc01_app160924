package com.abc.my.app160924.member;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.abc.my.app160924.R;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener{

    Button bt_login,bt_join;
    EditText et_id,et_pw;

    MemberService service = new MemberServiceImpl();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        bt_login = (Button) findViewById(R.id.bt_login);
        bt_join = (Button) findViewById(R.id.bt_join);
        et_id = (EditText) findViewById(R.id.et_id);
        et_pw = (EditText) findViewById(R.id.et_pw);

        bt_login.setOnClickListener(this);
        bt_join.setOnClickListener(this);
    }



    @Override
    public void onClick(View v) {
        String id="",pw="";

        MemberDTO member = new MemberDTO();

        switch(v.getId()) {
            case R.id.bt_login:
                id=et_id.getText().toString();
                pw=et_pw.getText().toString();

                //Toast.makeText(LoginActivity.this, "ID:"+id + ", PASSWORD:" + pw , Toast.LENGTH_LONG).show();

                member.setId(id);
                member.setPw(pw);
                member = service.login(member);

                if(member.getId()=="NONE")
                {
                    Toast.makeText(LoginActivity.this,
                            "존재하지 않는 ID 입니다."
                            , Toast.LENGTH_LONG).show();
                }
                else if(member.getId()=="NO_MATCH")
                {
                    Toast.makeText(LoginActivity.this, "비밀번호가 일치하지 않습니다." + pw , Toast.LENGTH_LONG).show();
                }
                else
                {
                    Toast.makeText(LoginActivity.this, member.getName().toString()+"님 환영합니다.", Toast.LENGTH_LONG).show();
                }

                break;
            case R.id.bt_join:
                //Toast.makeText(LoginActivity.this, "1111" , Toast.LENGTH_LONG).show();
                Toast.makeText(LoginActivity.this, "To join", Toast.LENGTH_LONG).show();
                this.startActivity(new Intent(LoginActivity.this, JoinActivity.class));
                break;
        }
    }
}
