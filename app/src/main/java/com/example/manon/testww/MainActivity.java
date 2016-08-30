package com.example.manon.testww;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View.OnClickListener;
import android.view.View.*;
import android.graphics.BitmapFactory;

import android.os.Bundle;

import android.app.Activity;

import android.view.View;

import android.view.Window;
import android.widget.Button;

import android.widget.ImageView;

import java.io.IOException;

public class MainActivity extends Activity implements OnClickListener {

    // initialisation saisie

    // initialisation clavier
    private android.widget.Button button1 = null;
    private android.widget.Button button2 = null;
    private android.widget.Button button3 = null;
    private android.widget.Button button4 = null;
    private android.widget.Button button5 = null;
    private android.widget.Button button6 = null;
    private android.widget.Button button7 = null;
    private android.widget.Button button8 = null;
    private android.widget.Button button9 = null;
    private android.widget.Button button10 = null;
    private android.widget.Button button11 = null;
    private android.widget.Button button12 = null;
    private android.widget.Button button13 = null;
    private android.widget.Button button14 = null;
    private android.widget.Button button15 = null;
    private android.widget.Button button16 = null;
    private android.widget.Button button17 = null;
    private android.widget.Button button18 = null;

    // variables isButtonPressed (clavier)
    private boolean isButton1Pressed = false;
    private boolean isButton2Pressed = false;
    private boolean isButton3Pressed = false;
    private boolean isButton4Pressed = false;
    private boolean isButton5Pressed = false;
    private boolean isButton6Pressed = false;
    private boolean isButton7Pressed = false;
    private boolean isButton8Pressed = false;
    private boolean isButton9Pressed = false;
    private boolean isButton10Pressed = false;
    private boolean isButton11Pressed = false;
    private boolean isButton12Pressed = false;
    private boolean isButton13Pressed = false;
    private boolean isButton14Pressed = false;
    private boolean isButton15Pressed = false;
    private boolean isButton16Pressed = false;
    private boolean isButton17Pressed = false;
    private boolean isButton18Pressed = false;

    // initialisation zone de saisie
    private android.widget.Button saisie1;
    private android.widget.Button saisie2;
    private android.widget.Button saisie3;
    private android.widget.Button saisie4;
    private android.widget.Button saisie5;

    // Parametrage zone de saisie
    private int focusSaisie = 0;
    private char[] saisie = {' ', ' ', ' ', ' ', ' '};
    private String answer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);



        button1 = (android.widget.Button) findViewById(R.id.button1);
        button2 = (android.widget.Button) findViewById(R.id.button2);
        button3 = (android.widget.Button) findViewById(R.id.button3);
        button4 = (android.widget.Button) findViewById(R.id.button4);
        button5 = (android.widget.Button) findViewById(R.id.button5);
        button6 = (android.widget.Button) findViewById(R.id.button6);
        button7 = (android.widget.Button) findViewById(R.id.button7);
        button8 = (android.widget.Button) findViewById(R.id.button8);
        button9 = (android.widget.Button) findViewById(R.id.button9);
        button10 = (android.widget.Button) findViewById(R.id.button10);
        button11 = (android.widget.Button) findViewById(R.id.button11);
        button12 = (android.widget.Button) findViewById(R.id.button12);
        button13 = (android.widget.Button) findViewById(R.id.button13);
        button14 = (android.widget.Button) findViewById(R.id.button14);
        button15 = (android.widget.Button) findViewById(R.id.button15);
        button16 = (android.widget.Button) findViewById(R.id.button16);
        button17 = (android.widget.Button) findViewById(R.id.button17);
        button18 = (android.widget.Button) findViewById(R.id.button18);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);
        button9.setOnClickListener(this);
        button10.setOnClickListener(this);
        button11.setOnClickListener(this);
        button12.setOnClickListener(this);
        button13.setOnClickListener(this);
        button14.setOnClickListener(this);
        button15.setOnClickListener(this);
        button16.setOnClickListener(this);
        button17.setOnClickListener(this);
        button18.setOnClickListener(this);

        // FIN - Activation des boutons

        // Activation zone de saisie

        saisie1 = (android.widget.Button) findViewById(R.id.blue_button1);
        saisie2 = (android.widget.Button) findViewById(R.id.blue_button2);
        saisie3 = (android.widget.Button) findViewById(R.id.blue_button3);
        saisie4 = (android.widget.Button) findViewById(R.id.blue_button4);
        saisie5 = (android.widget.Button) findViewById(R.id.blue_button5);

        focusSaisie = 0;

    }
    @Override
    public void onClick(android.view.View v){

        char carac;
        switch(v.getId()) {
            case R.id.button1:
                if(isButton1Pressed == false){
                    if(focusSaisie < 5){
                        button1.setBackgroundResource(R.mipmap.small_button_pressed);
                        isButton1Pressed = true;
                        carac = button1.getText().charAt(0);
                        saisie[focusSaisie] = carac;
                        updateSaisie();
                        determineFocusSaisie();
                        isWon();
                    }else{
                        // Rien ne se passe : zone de saisie pleine
                    }

                }else{
                    button1.setBackgroundResource(R.mipmap.small_button);
                    isButton1Pressed = false;
                    removeCharacter(button1);
                    updateSaisie();
                    determineFocusSaisie();

                }
                break;

            case R.id.button2:
                if(isButton2Pressed == false){
                    if(focusSaisie < 5){
                        button2.setBackgroundResource(R.mipmap.small_button_pressed);
                        isButton2Pressed = true;
                        carac = button2.getText().charAt(0);
                        saisie[focusSaisie] = carac;
                        updateSaisie();
                        determineFocusSaisie();

                    }else{
                        // Rien ne se passe : zone de saisie pleine
                    }

                }else{
                    button2.setBackgroundResource(R.mipmap.small_button);
                    isButton2Pressed = false;
                    removeCharacter(button2);
                    updateSaisie();
                    determineFocusSaisie();
                }
                break;

            case R.id.button3:
                if(isButton3Pressed == false){
                    if(focusSaisie < 5){
                        button3.setBackgroundResource(R.mipmap.small_button_pressed);
                        isButton3Pressed = true;
                        carac = button3.getText().charAt(0);
                        saisie[focusSaisie] = carac;
                        updateSaisie();
                        determineFocusSaisie();
                    }else{
                        // Rien ne se passe : zone de saisie pleine
                    }

                }else{
                    button3.setBackgroundResource(R.mipmap.small_button);
                    isButton3Pressed = false;
                    removeCharacter(button3);
                    updateSaisie();
                    determineFocusSaisie();
                }
                break;

            case R.id.button4:
                if(isButton4Pressed == false){
                    if(focusSaisie < 5){
                        button4.setBackgroundResource(R.mipmap.small_button_pressed);
                        isButton4Pressed = true;
                        carac = button4.getText().charAt(0);
                        saisie[focusSaisie] = carac;
                        updateSaisie();
                        determineFocusSaisie();
                    }else{
                        // Rien ne se passe : zone de saisie pleine
                    }

                }else{
                    button4.setBackgroundResource(R.mipmap.small_button);
                    isButton4Pressed = false;
                    removeCharacter(button4);
                    updateSaisie();
                    determineFocusSaisie();
                }
                break;

            case R.id.button5:
                if(isButton5Pressed == false){
                    if(focusSaisie < 5){
                        button5.setBackgroundResource(R.mipmap.small_button_pressed);
                        isButton5Pressed = true;
                        carac = button5.getText().charAt(0);
                        saisie[focusSaisie] = carac;
                        updateSaisie();
                        determineFocusSaisie();
                    }else{
                        // Rien ne se passe : zone de saisie pleine
                    }

                }else{
                    button5.setBackgroundResource(R.mipmap.small_button);
                    isButton5Pressed = false;
                    removeCharacter(button5);
                    updateSaisie();
                    determineFocusSaisie();
                }
                break;

            case R.id.button6:
                if(isButton6Pressed == false){
                    if(focusSaisie < 5){
                        button6.setBackgroundResource(R.mipmap.small_button_pressed);
                        isButton6Pressed = true;
                        carac = button6.getText().charAt(0);
                        saisie[focusSaisie] = carac;
                        updateSaisie();
                        determineFocusSaisie();
                    }else{
                        // Rien ne se passe : zone de saisie pleine
                    }

                }else{
                    button6.setBackgroundResource(R.mipmap.small_button);
                    isButton6Pressed = false;
                    removeCharacter(button6);
                    updateSaisie();
                    determineFocusSaisie();
                }
                break;

            case R.id.button7:
                if(isButton7Pressed == false){
                    if(focusSaisie < 5){
                        button7.setBackgroundResource(R.mipmap.small_button_pressed);
                        isButton7Pressed = true;
                        carac = button7.getText().charAt(0);
                        saisie[focusSaisie] = carac;
                        updateSaisie();
                        determineFocusSaisie();
                    }else{
                        // Rien ne se passe : zone de saisie pleine
                    }

                }else{
                    button7.setBackgroundResource(R.mipmap.small_button);
                    isButton7Pressed = false;
                    removeCharacter(button7);
                    updateSaisie();
                    determineFocusSaisie();
                }
                break;

            case R.id.button8:
                if(isButton8Pressed == false){
                    if(focusSaisie < 5){
                        button8.setBackgroundResource(R.mipmap.small_button_pressed);
                        isButton8Pressed = true;
                        carac = button8.getText().charAt(0);
                        saisie[focusSaisie] = carac;
                        updateSaisie();
                        determineFocusSaisie();
                    }else{
                        // Rien ne se passe : zone de saisie pleine
                    }

                }else{
                    button8.setBackgroundResource(R.mipmap.small_button);
                    isButton8Pressed = false;
                    removeCharacter(button8);
                    updateSaisie();
                    determineFocusSaisie();
                }
                break;

            case R.id.button9:
                if(isButton9Pressed == false){
                    if(focusSaisie < 5){
                        button9.setBackgroundResource(R.mipmap.small_button_pressed);
                        isButton9Pressed = true;
                        carac = button9.getText().charAt(0);
                        saisie[focusSaisie] = carac;
                        updateSaisie();
                        determineFocusSaisie();
                    }else{
                        // Rien ne se passe : zone de saisie pleine
                    }

                }else{
                    button9.setBackgroundResource(R.mipmap.small_button);
                    isButton9Pressed = false;
                    removeCharacter(button9);
                    updateSaisie();
                    determineFocusSaisie();
                }
                break;

            case R.id.button10:
                if(isButton10Pressed == false){
                    if(focusSaisie < 5){
                        button10.setBackgroundResource(R.mipmap.small_button_pressed);
                        isButton10Pressed = true;
                        carac = button10.getText().charAt(0);
                        saisie[focusSaisie] = carac;
                        updateSaisie();
                        determineFocusSaisie();
                    }else{
                        // Rien ne se passe : zone de saisie pleine
                    }

                }else{
                    button10.setBackgroundResource(R.mipmap.small_button);
                    isButton10Pressed = false;
                    removeCharacter(button10);
                    updateSaisie();
                    determineFocusSaisie();
                }
                break;

            case R.id.button11:
                if(isButton11Pressed == false){
                    if(focusSaisie < 5){
                        button11.setBackgroundResource(R.mipmap.small_button_pressed);
                        isButton11Pressed = true;
                        carac = button11.getText().charAt(0);
                        saisie[focusSaisie] = carac;
                        updateSaisie();
                        determineFocusSaisie();
                    }else{
                        // Rien ne se passe : zone de saisie pleine
                    }

                }else{
                    button11.setBackgroundResource(R.mipmap.small_button);
                    isButton11Pressed = false;
                    removeCharacter(button11);
                    updateSaisie();
                    determineFocusSaisie();
                }
                break;

            case R.id.button12:
                if(isButton12Pressed == false){
                    if(focusSaisie < 5){
                        button12.setBackgroundResource(R.mipmap.small_button_pressed);
                        isButton12Pressed = true;
                        carac = button12.getText().charAt(0);
                        saisie[focusSaisie] = carac;
                        updateSaisie();
                        determineFocusSaisie();
                    }else{
                        // Rien ne se passe : zone de saisie pleine
                    }

                }else{
                    button12.setBackgroundResource(R.mipmap.small_button);
                    isButton12Pressed = false;
                    removeCharacter(button12);
                    updateSaisie();
                    determineFocusSaisie();
                }
                break;


            case R.id.button13:
                if(isButton13Pressed == false){
                    if(focusSaisie < 5){
                        button13.setBackgroundResource(R.mipmap.small_button_pressed);
                        isButton13Pressed = true;
                        carac = button13.getText().charAt(0);
                        saisie[focusSaisie] = carac;
                        updateSaisie();
                        determineFocusSaisie();
                    }else{
                        // Rien ne se passe : zone de saisie pleine
                    }

                }else{
                    button13.setBackgroundResource(R.mipmap.small_button);
                    isButton13Pressed = false;
                    removeCharacter(button13);
                    updateSaisie();
                    determineFocusSaisie();
                }
                break;


            case R.id.button14:
                if(isButton14Pressed == false){
                    if(focusSaisie < 5){
                        button14.setBackgroundResource(R.mipmap.small_button_pressed);
                        isButton14Pressed = true;
                        carac = button14.getText().charAt(0);
                        saisie[focusSaisie] = carac;
                        updateSaisie();
                        determineFocusSaisie();
                    }else{
                        // Rien ne se passe : zone de saisie pleine
                    }

                }else{
                    button14.setBackgroundResource(R.mipmap.small_button);
                    isButton14Pressed = false;
                    removeCharacter(button14);
                    updateSaisie();
                    determineFocusSaisie();
                }
                break;

            case R.id.button15:
                if(isButton15Pressed == false){
                    if(focusSaisie < 5){
                        button15.setBackgroundResource(R.mipmap.small_button_pressed);
                        isButton15Pressed = true;
                        carac = button15.getText().charAt(0);
                        saisie[focusSaisie] = carac;
                        updateSaisie();
                        determineFocusSaisie();
                    }else{
                        // Rien ne se passe : zone de saisie pleine
                    }

                }else{
                    button15.setBackgroundResource(R.mipmap.small_button);
                    isButton15Pressed = false;
                    removeCharacter(button15);
                    updateSaisie();
                    determineFocusSaisie();
                }
                break;

            case R.id.button16:
                if(isButton16Pressed == false){
                    if(focusSaisie < 5){
                        button16.setBackgroundResource(R.mipmap.small_button_pressed);
                        isButton16Pressed = true;
                        carac = button16.getText().charAt(0);
                        saisie[focusSaisie] = carac;
                        updateSaisie();
                        determineFocusSaisie();
                    }else{
                        // Rien ne se passe : zone de saisie pleine
                    }

                }else{
                    button16.setBackgroundResource(R.mipmap.small_button);
                    isButton16Pressed = false;
                    removeCharacter(button16);
                    updateSaisie();
                    determineFocusSaisie();
                }
                break;

            case R.id.button17:
                if(isButton17Pressed == false){
                    if(focusSaisie < 5){
                        button17.setBackgroundResource(R.mipmap.small_button_pressed);
                        isButton17Pressed = true;
                        carac = button17.getText().charAt(0);
                        saisie[focusSaisie] = carac;
                        updateSaisie();
                        determineFocusSaisie();
                    }else{
                        // Rien ne se passe : zone de saisie pleine
                    }

                }else{
                    button17.setBackgroundResource(R.mipmap.small_button);
                    isButton17Pressed = false;
                    removeCharacter(button17);
                    updateSaisie();
                    determineFocusSaisie();
                }
                break;

            case R.id.button18:
                if(isButton18Pressed == false){
                    if(focusSaisie < 5){
                        button18.setBackgroundResource(R.mipmap.small_button_pressed);
                        isButton18Pressed = true;
                        carac = button18.getText().charAt(0);
                        saisie[focusSaisie] = carac;
                        updateSaisie();
                        determineFocusSaisie();
                    }else{
                        // Rien ne se passe : zone de saisie pleine
                    }


                }else{
                    button18.setBackgroundResource(R.mipmap.small_button);
                    isButton18Pressed = false;
                    removeCharacter(button18);
                    updateSaisie();
                    determineFocusSaisie();
                }
                break;
        }


    }


    public void determineFocusSaisie(){
        int focus = 0;
        if(saisie[0] == ' '){
            focus = 0;
        }else if(saisie[1] == ' '){
            focus = 1;
        }else if(saisie[2] == ' '){
            focus = 2;
        }else if(saisie[3] == ' '){
            focus = 3;
        }else{
            focus = 4;
        }
        focusSaisie = focus;
    }


    public void updateSaisie(){
        String string0 = Character.toString(saisie[0]);
        saisie1.setText(string0);

        String string1 = Character.toString(saisie[1]);
        saisie2.setText(string1);

        String string2 = Character.toString(saisie[2]);
        saisie3.setText(string2);

        String string3 = Character.toString(saisie[3]);
        saisie4.setText(string3);

        String string4 = Character.toString(saisie[4]);
        saisie5.setText(string4);

    }


    public void removeCharacter(android.widget.Button button){

        // Chercher le caractere a supprimer
        int index;
        if(saisie[0] == button.getText().charAt(0)){
            index = 0;
        }else if(saisie[1] == button.getText().charAt(0)){
            index = 1;
        }else if(saisie[2] == button.getText().charAt(0)){
            index = 2;
        }else if(saisie[3] == button.getText().charAt(0)){
            index = 3;
        }else {
            index = 4;
        }
        // Supprmier le caractère
        saisie[index] = ' ';

    }


    public void win(){
        float alpha = 1f;
        while(alpha >= 0f){
            button1.setAlpha(alpha);
            button2.setAlpha(alpha);
            button3.setAlpha(alpha);
            button4.setAlpha(alpha);
            button5.setAlpha(alpha);
            button6.setAlpha(alpha);
            try{
                // Do some work here
                Thread.sleep(50);
            } catch (Exception e) {
            }
        }

    }

    public void isWon(){
        boolean isWon;
        if(saisie[0] == 'M' && saisie[1] == 'A' && saisie[2] == 'T' && saisie[3] == 'I' && saisie[4] == 'N'){
            win();
        }else{

        }
    }





    }

