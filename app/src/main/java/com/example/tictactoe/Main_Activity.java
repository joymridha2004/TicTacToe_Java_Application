package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main_Activity extends AppCompatActivity {

    Button MainActivityStartGameButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*---------------Hooks--------------->*/

        MainActivityStartGameButton = findViewById(R.id.Main_Activity_Start_Game_Button);

        /*---------------On Click Listener On Start Game Button--------------->*/

        MainActivityStartGameButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Main_Activity.this, Game_Activity.class));
            }
        });
    }
}