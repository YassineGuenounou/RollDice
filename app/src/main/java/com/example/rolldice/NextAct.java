package com.example.rolldice;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.security.SecureRandom;

public class NextAct extends AppCompatActivity implements View.OnClickListener{
    private Button btn;
    private TextView txt;
    private TextView res;
    int max;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.next_act);
        btn=findViewById(R.id.button3);
        txt=findViewById(R.id.textView);

        res=findViewById(R.id.textView2);
        max=getIntent().getIntExtra("max", 0);
        txt.setText(max+" Sided Dice");
        btn.setOnClickListener( this);



    }

    @Override
    public void onClick(View v) {
        SecureRandom alia=new SecureRandom();
        int rest = alia.nextInt(max)+1;
        res.setText(String.valueOf(rest));


    }
}
