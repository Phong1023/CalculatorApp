package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button button1,button2,button3,button4,button5,button6,button7,button8,button9,button10,button11,
    button12,button13,button14,button15,button16,button17,button18,button19;
    TextView view1;
    Double var1, var2, ans ;
    Boolean cong =false, tru= false, nhan=false, chia= false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        view1 = findViewById(R.id.view1);


        button1 = findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //enable các button toán tử
                button19.setEnabled(true);
                button16.setEnabled(true);
                button12.setEnabled(true);
                button8.setEnabled(true);
                button4.setEnabled(true);
                //xóa màn hinh
                view1.setText("");

            }
        });

        button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view1.setText("");

            }
        });

        button3 = findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view1.setText("");

            }
        });

        button4 = findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                setVar1();
                buttonFasle();
                cong = false;
                tru = false;
                nhan = false;
                chia = true;


            }
        });

        button5 = findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view1.setText(view1.getText()+"1");

            }
        });

        button6 = findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view1.setText(view1.getText()+"2");

            }
        });

        button7 = findViewById(R.id.button7);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view1.setText(view1.getText()+"3");

            }
        });

        button8 = findViewById(R.id.button8);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                setVar1();
                buttonFasle();
                cong = false;
                tru = false;
                nhan = true;
                chia = false;


            }
        });


        button9 = findViewById(R.id.button9);
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view1.setText(view1.getText()+"4");

            }
        });

        button10 = findViewById(R.id.button10);
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view1.setText(view1.getText()+"5");

            }
        });

        button11 = findViewById(R.id.button11);
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view1.setText(view1.getText()+"6");

            }
        });

        button12 = findViewById(R.id.button12);
        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                setVar1();
                buttonFasle();
                cong = false;
                tru = true;
                nhan = false;
                chia = false;


            }
        });

        button13 = findViewById(R.id.button13);
        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view1.setText(view1.getText()+"7");

            }
        });

        button14 = findViewById(R.id.button14);
        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view1.setText(view1.getText()+"8");

            }
        });

        button15 = findViewById(R.id.button15);
        button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view1.setText(view1.getText()+"9");

            }
        });

        button16 = findViewById(R.id.button16);
        button16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                
                setVar1();
                buttonFasle();
                cong = true;
                tru = false;
                nhan = false;
                chia = false;


            }
        });

        button17 = findViewById(R.id.button17);
        button17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view1.setText(view1.getText()+"0");

            }
        });

        button18 = findViewById(R.id.button18);
        button18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view1.setText(view1.getText()+".");

            }
        });

        button19 = findViewById(R.id.button19);
        button19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                var2 = Double.parseDouble(view1.getText().toString());

                if(cong){
                    ans = var1 + var2;
                }else if(tru){
                    ans = var1 - var2;
                }else if(nhan){
                    ans = var1 * var2;
                }else if(chia){
                    ans = var1 / var2;
                }else {
                    ans = ans + 0;
                }
                view1.setText(ans.toString());
                button19.setEnabled(false);


            }
        });






    }
    public void setVar1(){
        var1 = Double.parseDouble(view1.getText().toString());
    }
    public void buttonFasle(){
        button4.setEnabled(false);
        button8.setEnabled(false);
        button12.setEnabled(false);
        button16.setEnabled(false);
        view1.setText("");

    }

}