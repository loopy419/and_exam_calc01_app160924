package com.abc.my.app160924;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CalcaActivity extends AppCompatActivity implements View.OnClickListener{

    EditText et_num_1;
    EditText et_num_2;
    Button bt_plus,bt_minus,bt_times,bt_divide1,bt_divide2,bt_equal;
    TextView tv_result;
    int result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calca);

        et_num_1 = (EditText) findViewById(R.id.et_num_1);//
        et_num_2 = (EditText) findViewById(R.id.et_num_2);//
        bt_plus = (Button) findViewById(R.id.bt_plus);
        bt_minus = (Button) findViewById(R.id.bt_minus);
        bt_times = (Button) findViewById(R.id.bt_times);
        bt_divide1 = (Button) findViewById(R.id.bt_divide1);
        bt_divide2 = (Button) findViewById(R.id.bt_divide2);
        bt_equal = (Button) findViewById(R.id.bt_equal);
        tv_result = (TextView) findViewById(R.id.tv_result);

        bt_plus.setOnClickListener(this);//this는 field.
        bt_minus.setOnClickListener(this);//this는 field.
        bt_times.setOnClickListener(this);//this는 field.
        bt_divide1.setOnClickListener(this);//this는 field.
        bt_divide2.setOnClickListener(this);//this는 field.
        bt_equal.setOnClickListener(this);//this는 field.

    }


    @Override
    public void onClick(View v) {
        int num1 = Integer.parseInt(et_num_1.getText().toString());
        int num2 = Integer.parseInt(et_num_2.getText().toString());


        switch(v.getId()){
            case R.id.bt_plus:
                result = num1+num2;
                break;
            case R.id.bt_minus: result = num1-num2;break;
            case R.id.bt_times: result = num1*num2;break;
            case R.id.bt_divide1: result = num1/num2;break;
            case R.id.bt_divide2: result = num1%num2;break;
            case R.id.bt_equal: tv_result.setText("result="+result);
        }
    }
}
