package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Objects;

public class Game_Activity extends AppCompatActivity {


    Toolbar toolbar;

    TextView GameActivity2ndPlayerScoreTextView;
    TextView GameActivity2ndPlayerMoveStatusTextView;
    TextView GameActivity1stPlayerMoveStatusTextView;
    TextView GameActivity1stPlayerScoreTextView;
    TextView Player1stTv;
    TextView Player2ndTv;



    Button GameActivity1noButton;
    Button GameActivity2noButton;
    Button GameActivity3noButton;
    Button GameActivity4noButton;
    Button GameActivity5noButton;
    Button GameActivity6noButton;
    Button GameActivity7noButton;
    Button GameActivity8noButton;
    Button GameActivity9noButton;
    Button GameActivityRestartButton;

    EditText Player1stName,Player2ndName;


    String button1,button2,button3,button4,button5,button6,button7,button8,button9,Player1stMove,Player2ndMove;
    int Move = 0, Player1stScore = 0, Player2ndScore = 0 , shapeMove = 1;


    @SuppressLint({"ResourceType", "MissingInflatedId"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        /*---------------Hooks--------------->*/

        toolbar = findViewById(R.id.Game_Activity_Toolbar);

        GameActivity2ndPlayerScoreTextView = findViewById(R.id.Game_Activity_2nd_Player_Score_Text_View);
        GameActivity2ndPlayerMoveStatusTextView = findViewById(R.id.Game_Activity_2nd_Player_Move_Status_Text_View);
        GameActivity1stPlayerMoveStatusTextView = findViewById(R.id.Game_Activity_1st_Player_Move_Status_Text_View);
        GameActivity1stPlayerScoreTextView = findViewById(R.id.Game_Activity_1st_Player_Score_Text_View);
        Player1stTv = findViewById(R.id.Player1st_Tv);
        Player2ndTv = findViewById(R.id.Player2nd_Tv);


        GameActivity1noButton = findViewById(R.id.Game_Activity_1no_Button);
        GameActivity2noButton = findViewById(R.id.Game_Activity_2no_Button);
        GameActivity3noButton = findViewById(R.id.Game_Activity_3no_Button);
        GameActivity4noButton = findViewById(R.id.Game_Activity_4no_Button);
        GameActivity5noButton = findViewById(R.id.Game_Activity_5no_Button);
        GameActivity6noButton = findViewById(R.id.Game_Activity_6no_Button);
        GameActivity7noButton = findViewById(R.id.Game_Activity_7no_Button);
        GameActivity8noButton = findViewById(R.id.Game_Activity_8no_Button);
        GameActivity9noButton = findViewById(R.id.Game_Activity_9no_Button);
        GameActivityRestartButton = findViewById(R.id.Game_Activity_Restart_Button);

        Player1stName = findViewById(R.id.Main_Activity_1st_Player_Name_Edit_Text);
        Player2ndName = findViewById(R.id.Main_Activity_2nd_Player_Name_Edit_Text);

        /* --------------Toolbar--------------- */

        setSupportActionBar(toolbar);
        Objects.requireNonNull(getSupportActionBar()).setDisplayShowTitleEnabled(false);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        /*---------------On Click Listener On Start Game Button--------------->*/

        GameActivityRestartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Game_Activity.this, Game_Activity.class));
                finish();
            }
        });

    }


    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

}