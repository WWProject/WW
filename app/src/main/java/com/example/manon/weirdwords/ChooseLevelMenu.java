package com.example.manon.weirdwords;

import android.app.Activity;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;

public class ChooseLevelMenu extends Activity implements View.OnClickListener{

    private ImageButton undo_button = null;
    private ImageButton clue_button = null;
    private ImageButton param_button = null;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_level_menu);

        // Init boutons toolbar
        undo_button = (ImageButton)findViewById(R.id.undo_button);
        clue_button = (ImageButton)findViewById(R.id.indice_button);
        param_button = (ImageButton)findViewById(R.id.param_button);
        // Activation bouton retour
        undo_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });




    }

    @Override
    public void onClick(View v) {

    }
}
