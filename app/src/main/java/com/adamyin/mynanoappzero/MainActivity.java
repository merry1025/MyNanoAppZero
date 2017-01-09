package com.adamyin.mynanoappzero;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    TextView txtView;

    public void showBtn1(View v){
        txtView = (TextView)findViewById(R.id.textDetail);
        txtView.setText("This is my first app");
    }

    public void showBtn2(View v){
        txtView = (TextView)findViewById(R.id.textDetail);
        txtView.setText("Hey I am here");
    }


    public void showBtn3(View v){
        txtView = (TextView)findViewById(R.id.textDetail);
        txtView.setText("What's up");
    }

    public void showBtn4(View v){
        txtView = (TextView)findViewById(R.id.textDetail);
        txtView.setText("OK, fine");
    }

    public void showBtn5(View v){
        txtView = (TextView)findViewById(R.id.textDetail);
        txtView.setText("See you");
    }

}
