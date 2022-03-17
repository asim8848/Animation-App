package com.example.animation;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button blink, rotate, fadein, moveup, slide, zoomin, zoomout, fadeout, movedown;
    TextView animatedtxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);
        blink =(Button) findViewById(R.id.blinkbtn);
        rotate =(Button) findViewById(R.id.rotatebtn);
        fadein =(Button) findViewById(R.id.fadebtn);
        moveup =(Button) findViewById(R.id.moveupbtn);
        slide =(Button) findViewById(R.id.slidebtn);
        zoomin =(Button) findViewById(R.id.zoominbtn);
        zoomout =(Button) findViewById(R.id.zoomoutbtn);
        fadeout =(Button) findViewById(R.id.fadeoutbtn);
        movedown =(Button) findViewById(R.id.movedownbtn);
        animatedtxt =(TextView) findViewById(R.id.Animatedtxt);
    }

    public void demo1(View view) {
        @SuppressLint("ResourceType") Animation anim = AnimationUtils.loadAnimation(getApplicationContext(), R.animator.blink);
        animatedtxt.setVisibility(View.VISIBLE);
        animatedtxt.startAnimation(anim);
    }

    public void demo2(View view) {
        @SuppressLint("ResourceType") Animation anim = AnimationUtils.loadAnimation(getApplicationContext(), R.animator.rotate);
        animatedtxt.setVisibility(View.VISIBLE);
        animatedtxt.startAnimation(anim);
    }

    public void demo3(View view) {
        @SuppressLint("ResourceType") Animation anim = AnimationUtils.loadAnimation(getApplicationContext(), R.animator.fade);
        animatedtxt.setVisibility(View.VISIBLE);
        animatedtxt.startAnimation(anim);
    }
    public void demo4(View view) {
        @SuppressLint("ResourceType") Animation anim = AnimationUtils.loadAnimation(getApplicationContext(), R.animator.moveup);
        animatedtxt.setVisibility(View.VISIBLE);
        animatedtxt.startAnimation(anim);
    }

    public void demo5(View view) {
        @SuppressLint("ResourceType") Animation anim = AnimationUtils.loadAnimation(getApplicationContext(), R.animator.slide);
        animatedtxt.setVisibility(View.VISIBLE);
        animatedtxt.startAnimation(anim);
    }

    public void demo6(View view) {
        @SuppressLint("ResourceType") Animation anim = AnimationUtils.loadAnimation(getApplicationContext(), R.animator.zoomin);
        animatedtxt.setVisibility(View.VISIBLE);
        animatedtxt.startAnimation(anim);
    }

    public void demo7(View view) {
        @SuppressLint("ResourceType") Animation anim = AnimationUtils.loadAnimation(getApplicationContext(), R.animator.zoomout);
        animatedtxt.setVisibility(View.VISIBLE);
        animatedtxt.startAnimation(anim);
    }

    public void demo8(View view) {
        @SuppressLint("ResourceType") Animation anim = AnimationUtils.loadAnimation(getApplicationContext(), R.animator.fadeout);
        animatedtxt.setVisibility(View.VISIBLE);
        animatedtxt.startAnimation(anim);
    }

    public void demo9(View view) {
        @SuppressLint("ResourceType") Animation anim = AnimationUtils.loadAnimation(getApplicationContext(), R.animator.movedown);
        animatedtxt.setVisibility(View.VISIBLE);
        animatedtxt.startAnimation(anim);
    }
}