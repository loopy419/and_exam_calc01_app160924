package com.abc.my.app160924;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.abc.my.app160924.calc.CalcaActivity;
import com.abc.my.app160924.member.LoginActivity;

//1 extends 상속 implements구현
public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    //2
    Button bt_calc,bt_contacts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //3 xml과 연결
        bt_calc=(Button)findViewById(R.id.bt_calc);
        bt_contacts=(Button)findViewById(R.id.bt_contacts);

        //4
        bt_calc.setOnClickListener(this);
        bt_contacts.setOnClickListener(this);
    }

    //5
    @Override
    public void onClick(View v) {

        switch(v.getId()){
            case R.id.bt_calc:
                //Intent intent = new Intent(this.getApplicationContext(),CalcaActivity.class);//.class는 ram에 있는 (로딩된상태) 존재이다. 가상화된상태. 컴파일후의상태
                //Intent intent = 타입(클래스) 인스턴스
                // this.startActivity(intent);

                this.startActivity(new Intent(MainActivity.this,CalcaActivity.class));//this.getApplicationContext(),CalcaActivity.class));
                //getApplicationContext와 startActivity는 AppCompatActivity에 있는함수이다. (위에서 이미 상속 받았다. 그래서 사용가능함.)
                break;
            case R.id.bt_contacts://Member*

                //Toast.makeText(MainActivity.this, "주소록가기3", Toast.LENGTH_LONG).show();
                this.startActivity(new Intent(MainActivity.this, LoginActivity.class));//this.getApplicationContext(),CalcaActivity.class));
                break;
        }
    }
}
