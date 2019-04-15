
package com.example.hassan.stereo8;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class rap extends AppCompatActivity {
private Button angry_btn1;
    @Override

   protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rap);

        angry_btn1  =(Button)findViewById(R.id.angry_btn1);
        angry_btn1.setOnClickListener(new View.OnClickListener() {
           public void onClick(View v) {
               openUser1();
// Click event trigger here
           }
       });
    }

    public void openUser1(){
       Intent intent= new Intent(this, user1.class);
       startActivity(intent);
    }
}
