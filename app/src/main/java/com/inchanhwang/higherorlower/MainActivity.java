package com.inchanhwang.higherorlower;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import java.util.Random;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Integer randomNum;

    public void makeToast(String string){
        Toast.makeText(MainActivity.this, string ,Toast.LENGTH_SHORT).show();
    }

    public void buttonClick(View view){
        EditText textData = (EditText) findViewById(R.id.editText);

        Integer myNumber = Integer.parseInt(textData.getText().toString());

        if(randomNum == myNumber){
            makeToast("Your guess is right!");
            Random rand = new Random();
            randomNum = rand.nextInt(20) + 1;
        } else if (randomNum < myNumber){
            makeToast("Lower");
        } else if (randomNum > myNumber){
            makeToast("Higher");
        } else {
            makeToast("Your guess is wrong");
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Random randomGenerator = new Random();
        randomNum = randomGenerator.nextInt(20) + 1;

    }
}
