package com.example.anik.anikcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private EditText edittext1n,edittext2n;
    private Button addn,subn,muln,divn;
    private TextView textviewn;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edittext1n=(EditText) findViewById(R.id.edittext1);
        edittext2n=(EditText) findViewById(R.id.edittext2);
        addn=(Button)findViewById(R.id.add);
        subn=(Button)findViewById(R.id.sub);
        muln=(Button)findViewById(R.id.mul);
        divn=(Button)findViewById(R.id.div);
        textviewn=(TextView)findViewById(R.id.textview);

        addn.setOnClickListener(this);
        subn.setOnClickListener(this);
        muln.setOnClickListener(this);
        divn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String number1=edittext1n.getText().toString();
        String number2=edittext2n.getText().toString();

        double num1=Double.parseDouble(number1);
        double num2=Double.parseDouble(number2);

        if(v.getId()==R.id.add)
        {
            double sum=num1+num2;
            textviewn.setText("Result  :"+sum);

        }
        if(v.getId()==R.id.sub)
        {
            double sub=num1-num2;
            textviewn.setText("result  :"+sub);

        }
        if(v.getId()==R.id.mul)
        {
            double mul=num1*num2;
            textviewn.setText("result  :"+mul);

        }
        if(v.getId()==R.id.div)
        {
            double div=num1/num2;
            textviewn.setText("result  :"+div);

        }
    }
}
