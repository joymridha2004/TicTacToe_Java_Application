package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main_Activity extends AppCompatActivity {

    Button MainActivityStartGameButton;

    EditText MainActivity1stPlayerNameEditText;
    EditText MainActivity2ndPlayerNameEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*---------------Hooks--------------->*/

        MainActivityStartGameButton = findViewById(R.id.Main_Activity_Start_Game_Button);
        MainActivity1stPlayerNameEditText = findViewById(R.id.Main_Activity_1st_Player_Name_Edit_Text);
        MainActivity2ndPlayerNameEditText = findViewById(R.id.Main_Activity_2nd_Player_Name_Edit_Text);

        /*---------------On Click Listener On Start Game Button--------------->*/

        MainActivityStartGameButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                /*---------------Conditions--------------->*/

                if (!MainActivity1stPlayerNameEditText.getText().toString().isEmpty() && !MainActivity2ndPlayerNameEditText.getText().toString().isEmpty() && !MainActivity1stPlayerNameEditText.getText().toString().equals(MainActivity2ndPlayerNameEditText.getText().toString()))
                {
                    Toast.makeText(getApplicationContext()," Hi   "+MainActivity1stPlayerNameEditText.getText().toString()+"  and   "+ MainActivity2ndPlayerNameEditText.getText().toString(),Toast.LENGTH_SHORT).show();

                    /*---------------Save the name --------------->*/

                    String Player1stName = MainActivity1stPlayerNameEditText.getText().toString();
                    String Player2ndName = MainActivity2ndPlayerNameEditText.getText().toString();

                    /*---------------Pass the Name through The Intent --------------->*/

                    Intent intent = new Intent(Main_Activity.this,Game_Activity.class);

                    intent.putExtra("PlayerName1st",Player1stName);
                    intent.putExtra("PlayerName2nd",Player2ndName);

                    startActivity(intent);

                    /*---------------Back Press Edit Edit Text Reset --------------->*/

                    MainActivity1stPlayerNameEditText.setText(null);
                    MainActivity2ndPlayerNameEditText.setText(null);

                }else if ( MainActivity1stPlayerNameEditText.getText().toString().equals(MainActivity2ndPlayerNameEditText.getText().toString()) && !MainActivity2ndPlayerNameEditText.getText().toString().isEmpty()){
                    Toast.makeText(getApplicationContext(),"Please Enter Two Different Name",Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(getApplicationContext(),"Please Enter Details",Toast.LENGTH_SHORT).show();
                }


            }
        });



    }
}