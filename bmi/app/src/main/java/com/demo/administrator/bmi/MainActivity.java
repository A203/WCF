package com.demo.administrator.bmi;

import android.content.Intent;
import android.content.pm.LabeledIntent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {
    private Button button1;
    private EditText height=null;
    private EditText weight=null;
    private Button button=null;
    private TextView show=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       button=(Button)findViewById(R.id.BMIbutton);

       button1=(Button)findViewById(R.id.btn);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, a.class);

                startActivity(intent);
            }
        });

        height=(EditText) findViewById(R.id.height);
        weight=(EditText) findViewById(R.id.weight);
        show=(TextView) findViewById(R.id.show);



        button.setOnClickListener(new View.OnClickListener() {
            double bmi = 0;

            public void onClick(View v) {

                double h = new Double(height.getText().toString());
                double w = new Double(weight.getText().toString());
                bmi = w / (h * h);

                double final_resault = exchangeResault(bmi);
                if(bmi <16){
                    show.setText("身高体重指数是:" + final_resault + "" + "极度偏瘦");
                }
                 else if (bmi < 18.5) {
                    show.setText("身高体重指数是:" + final_resault + "" + "偏瘦");}
                    else if ( bmi < 25) {
                        show.setText("身高体重指数是:" + final_resault + "" + "正常");
                    }
                        else if ( bmi < 30) {
                            show.setText("身高体重指数是:" + final_resault + "" + "偏胖");}

                            else if ( bmi < 35) {
                                show.setText("身高体重指数是:" + final_resault + "" + "肥胖");}
                                else if ( bmi < 40) {
                                    show.setText("身高体重指数是:" + final_resault + "" + "重度肥胖");}
                                    else {
                                        show.setText("身高体重指数是:"+final_resault+""+"极度肥胖");
                                    }
                                }
                            });

                        }






            public double exchangeResault(double resault){
                double first=resault*100;
                double second=(int )first;
                double second_first=first-second;

                if(second_first>0.5){
                    second++;



                }

                double jirnuo=(double)second/100;
                return jirnuo;


            }}










