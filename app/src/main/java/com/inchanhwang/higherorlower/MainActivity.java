package com.inchanhwang.higherorlower;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import java.util.Random;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Random randomGenerator = new Random();
    Integer randomNum = randomGenerator.nextInt(20);

    public void buttonClick(View view){




        EditText textData = (EditText) findViewById(R.id.editText);

        Integer myNumber = Integer.parseInt(textData.getText().toString());

        if(randomNum == myNumber){
            Toast.makeText(MainActivity.this, "Your guess is right!" ,Toast.LENGTH_SHORT).show();
        } else if (randomNum < myNumber){
            Toast.makeText(MainActivity.this, "Lower!" ,Toast.LENGTH_SHORT).show();
        } else if (randomNum > myNumber){
            Toast.makeText(MainActivity.this, "Higher" ,Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(MainActivity.this, "Your guess is wrong!" ,Toast.LENGTH_SHORT).show();
        }




    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
