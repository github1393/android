package com.example.Calculator;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MyActivity extends Activity {

    private float x=0;
    private float y=0;
    private String ch;
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculat);


        final EditText txt = (EditText) findViewById(R.id.editt1);
        Button btn0 = (Button) findViewById(R.id.btn0);
        Button btn1 = (Button) findViewById(R.id.btn1);
        Button btn2 = (Button) findViewById(R.id.btn2);
        Button btn3 = (Button) findViewById(R.id.btn3);
        Button btn4 = (Button) findViewById(R.id.btn4);
        Button btn5 = (Button) findViewById(R.id.btn5);
        Button btn6 = (Button) findViewById(R.id.btn6);
        Button btn7 = (Button) findViewById(R.id.btn7);
        Button btn8 = (Button) findViewById(R.id.btn8);
        Button btn9 = (Button) findViewById(R.id.btn9);
        Button btnsum = (Button) findViewById(R.id.btnsum);
        Button btnsub = (Button) findViewById(R.id.btnsub);
        Button btnz = (Button) findViewById(R.id.btnzarb);
        Button btnt = (Button) findViewById(R.id.btntagh);
        Button btnmo = (Button) findViewById(R.id.btnmo);
        Button btndot = (Button) findViewById(R.id.btndot);
        Button btnclear = (Button) findViewById(R.id.btnclear);

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText(txt.getText() + "0");
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText(txt.getText() + "1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText(txt.getText() + "2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText(txt.getText() + "3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText(txt.getText() + "4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText(txt.getText() + "5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText(txt.getText() + "6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText(txt.getText() + "7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText(txt.getText() + "8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText(txt.getText() + "9");
            }
        });
        btnsum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (x != 0){
                    float w = Float.parseFloat(txt.getText().toString());
                    x = x + w;
                    ch = "+";
                    txt.setText("");
                }
                else {
                    x = Float.parseFloat(txt.getText().toString());
                    ch = "+";
                    txt.setText("");                                          // settext:   ????? ?? ???? ?? ?? ????     gettext: ????? ?? ?? ?? ?????

                }
            }
        });
        btnsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (x != 0){
                    float w = Float.parseFloat(txt.getText().toString());
                    x = x - w;
                    ch = "-";
                    txt.setText("");
                }
                else {
                    x = Float.parseFloat(txt.getText().toString());
                    ch = "-";
                    txt.setText("");
                }
            }
        });
        btnz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (x != 0){
                    float w =Float.parseFloat(txt.getText().toString());
                    x = x * w;
                    ch ="*";
                    txt.setText("");
                }
                else {
                    x = Float.parseFloat(txt.getText().toString());
                    ch = "*";
                    txt.setText("");
                }
            }
        });
        btnt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (x != 0){
                    float w =Float.parseFloat(txt.getText().toString());
                    x = x / w;
                    ch ="/";
                    txt.setText("");
                }
                else {
                    x = Float.parseFloat(txt.getText().toString());
                    ch = "/";
                    txt.setText("");
                }
            }
        });
        btndot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText(txt.getText() + ".");
            }
        });
        btnmo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                y = Float.parseFloat(txt.getText().toString());
                float z;
                switch (ch){
                    case "+":
                        z = x + y;
                        txt.setText(z + "");
                        break;
                    case "-":
                        z = x - y;
                        txt.setText(z + "");
                        ch = "";
                        x = 0;
                        y = 0;
                        break;
                    case "*":
                        z = x * y;
                        txt.setText(z + "");
                        ch = "";
                        x = 0;
                        y = 0;
                        break;
                    case "/":
                        z = x / y;
                        txt.setText(z + "");
                        ch = "";
                        x = 0;
                        y = 0;
                        break;
                    default:
                        Toast.makeText(getApplication(),"amalvand nadarad",Toast.LENGTH_LONG).show(); // activity jari ---matn paygham -
                        break;                                                         // -- tol namayesh paygham
                }
            }
        });
        btnclear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x = 0;
                y = 0;
                ch = "";
                txt.setText("");
            }
        });

    }
}
