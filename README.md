#Project 0 for Udacity Nanodegree Android Developer
###Created by Adam Jian Yin
###Email: yin1025@gmail.com

##My Note 1: How to setup Button onClick event to display a text.


###(1) Add a button in "activity_mail.xml". Set "clickable" to "true", and set onClick to call "showBtn1" method.

    
<Button
        
android:layout_width="wrap_content"
        
android:layout_height="wrap_content"
        
android:text="SPOTIFY STREAMER"
        
android:id="@+id/button1"
        
android:textSize="20dp"
        
android:textColor="#fff"
        
android:background="#f18a0b"
       
android:minWidth="200dp"
        
android:layout_above="@+id/button2"
        
android:layout_alignStart="@+id/textView"
        
android:layout_marginBottom="27dp"
        
android:clickable="true"
        
android:onClick="showBtn1"/>



###(2) Add a TextView beneath the button, set its text to blank.

    
<TextView
        
android:layout_width="wrap_content"
        
android:layout_height="wrap_content"
        
android:id="@+id/textDetail"
        
android:layout_alignParentBottom="true"
       
android:layout_centerHorizontal="true"
        
android:text="             "
         />



###(3) In MainActivity class, Add variable "txtView" and method "showBtn1".



package com.adamyin.mynanodegreeapps;


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

  
}
  
 

###(4) Run the application, in emulator, click the Button, it will show the text "This is my first app".
