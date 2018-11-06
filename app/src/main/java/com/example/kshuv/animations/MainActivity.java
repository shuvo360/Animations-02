package com.example.kshuv.animations;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

import java.security.PrivateKey;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener {

    private Button btnZoomIn,btnZoomOut,btnBlink,
    btnFadeIn,btnFadeOut,btnCrossFade,
    btnRotate,btnMove,btnBounce,btnSlideUp,btnSlideDown,
    btnSequential;

    private Animation animZoomIn,animZoomOut,animBlink,
            animFadeIn,animFadeOut,animCrossFadeIn,animCrossFadeOut,
            animRotate,animMove,animBounce,animSlideUp,animSlideDown,
            animSequential;

    private TextView maintext;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnZoomIn=findViewById(R.id.btn_zoom_in);
        btnZoomOut=findViewById(R.id.btn_zoom_out);
        btnBlink=findViewById(R.id.btn_blink);
        btnFadeIn=findViewById(R.id.btn_fade_in);
        btnFadeOut=findViewById(R.id.btn_fade_out);
        btnCrossFade=findViewById(R.id.btn_cross_fade);
        btnRotate=findViewById(R.id.btn_rotate);
        btnMove=findViewById(R.id.btn_move);
        btnBounce=findViewById(R.id.btn_bounce);
        btnSlideUp=findViewById(R.id.btn_Slide_up);
        btnSlideDown=findViewById(R.id.btn_slide_down);
        btnSequential=findViewById(R.id.btn_sequential);
        maintext=findViewById(R.id.mainText);

        btnZoomIn.setOnClickListener(this);
        btnZoomOut.setOnClickListener(this);
        btnBlink.setOnClickListener(this);
        btnFadeIn.setOnClickListener(this);
        btnFadeOut.setOnClickListener(this);
        btnCrossFade.setOnClickListener(this);
        btnRotate.setOnClickListener(this);
        btnMove.setOnClickListener(this);
        btnBounce.setOnClickListener(this);
        btnSlideUp.setOnClickListener(this);
        btnSlideDown.setOnClickListener(this);
        btnSequential.setOnClickListener(this);


        animFadeIn=AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in);
        animFadeOut=AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_out);
        animCrossFadeIn=AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in);
        animCrossFadeOut=AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_out);
        animZoomIn=AnimationUtils.loadAnimation(getApplicationContext(),R.anim.zoom_in);
        animZoomOut=AnimationUtils.loadAnimation(getApplicationContext(),R.anim.zoom_out);
        animBlink=AnimationUtils.loadAnimation(getApplicationContext(),R.anim.blinking);
        animRotate=AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotation);
        animMove=AnimationUtils.loadAnimation(getApplicationContext(),R.anim.move);
        animBounce=AnimationUtils.loadAnimation(getApplicationContext(),R.anim.bouncing);
        animSlideUp=AnimationUtils.loadAnimation(getApplicationContext(),R.anim.slide_up);
        animSlideDown=AnimationUtils.loadAnimation(getApplicationContext(),R.anim.slide_down);
        animSequential=AnimationUtils.loadAnimation(getApplicationContext(),R.anim.sequential);



    }
    public void onClick(View v){

        switch (v.getId()){
            case R.id.btn_zoom_in:
                maintext.setVisibility(View.VISIBLE);
                maintext.startAnimation(animZoomIn);
                break;
            case R.id.btn_zoom_out:
                maintext.setVisibility(View.VISIBLE);
                maintext.startAnimation(animZoomOut);
                break;

            case R.id.btn_blink:
                maintext.setVisibility(View.VISIBLE);
                maintext.startAnimation(animBlink);
                break;
            case R.id.btn_fade_in:
                maintext.setVisibility(View.VISIBLE);
                maintext.startAnimation(animFadeIn);
                break;

            case R.id.btn_fade_out:
                maintext.setVisibility(View.VISIBLE);
                maintext.startAnimation(animFadeOut);
                break;
            case R.id.btn_cross_fade:
                maintext.setVisibility(View.VISIBLE);
                maintext.startAnimation(animCrossFadeIn);
                maintext.startAnimation(animCrossFadeOut);
                break;

            case R.id.btn_rotate:
                maintext.startAnimation(animRotate);
                break;
            case R.id.btn_move:
                maintext.startAnimation(animMove);
                break;
            case R.id.btn_bounce:
                maintext.startAnimation(animBounce);
                break;
            case R.id.btn_Slide_up:
                maintext.startAnimation(animSlideUp);
                break;
            case R.id.btn_slide_down:
                maintext.startAnimation(animSlideDown);
                break;
            case R.id.btn_sequential:
                maintext.startAnimation(animSequential);
                break;
        }


    }
}
