package com.example.chiragpatel.recyclerwithcursordemo;

import android.graphics.drawable.ColorDrawable;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, View.OnLongClickListener {

    private TextView txt_Cricket;
    private TextView txt_Football;
    private TextView txt_Chess;
    private TextView txt_Hockey;
    private View view1;
    private View view2;
    private View view3;
    private View view4;
    private Button btn_Submit;
    private boolean isCricket = true;
    private boolean isFootball = true;
    private boolean isChess = true;
    private boolean isHockey = true;

    private boolean isLongCricket = true;
    private boolean isLongFootball = true;
    private boolean isLongChess = true;
    private boolean isLongHockey = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
        clickListener();
        longClickListener();
    }

    private void init() {
        txt_Cricket = (TextView) findViewById(R.id.txt_Cricket);
        txt_Football = (TextView) findViewById(R.id.txt_Football);
        txt_Chess = (TextView) findViewById(R.id.txt_Chess);
        txt_Hockey = (TextView) findViewById(R.id.txt_Hockey);
        btn_Submit = (Button) findViewById(R.id.btn_Submit);

        view1 = (View) findViewById(R.id.view1);
        view2 = (View) findViewById(R.id.view2);
        view3 = (View) findViewById(R.id.view3);
        view4 = (View) findViewById(R.id.view4);
    }

    private void clickListener() {
        txt_Cricket.setOnClickListener(this);
        txt_Football.setOnClickListener(this);
        txt_Chess.setOnClickListener(this);
        txt_Hockey.setOnClickListener(this);
        btn_Submit.setOnClickListener(this);
    }

    private void longClickListener() {
        txt_Cricket.setOnLongClickListener(this);
        txt_Football.setOnLongClickListener(this);
        txt_Chess.setOnLongClickListener(this);
        txt_Hockey.setOnLongClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.txt_Cricket:

                if (isCricket) {
                    view1.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.colorPurple));
                    isCricket = false;
                } else {
                    view1.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.colorLightGrey));
                    isCricket = true;
                }

                break;

            case R.id.txt_Football:

                if (isFootball) {
                    view2.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.colorPurple));
                    isFootball = false;
                } else {
                    view2.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.colorLightGrey));
                    isFootball = true;
                }

                break;

            case R.id.txt_Chess:

                if (isChess) {
                    view3.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.colorPurple));
                    isChess = false;
                } else {
                    view3.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.colorLightGrey));
                    isChess = true;
                }

                break;

            case R.id.txt_Hockey:

                if (isHockey) {
                    view4.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.colorPurple));
                    isHockey = false;
                } else {
                    view4.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.colorLightGrey));
                    isHockey = true;
                }

                break;

            case R.id.btn_Submit:
                if (isLongCricket || isLongFootball || isLongChess || isLongHockey) {
                    Toast.makeText(getApplicationContext(), "Done!", Toast.LENGTH_LONG).show();

                } else if (isCricket || isFootball || isChess || isHockey) {
                    Toast.makeText(getApplicationContext(), "Please, Select any Primary Spot!!", Toast.LENGTH_LONG).show();

                } else {
                    Toast.makeText(getApplicationContext(), "Please, Select any Primary Spot!", Toast.LENGTH_LONG).show();
                }

        }

    }

    @Override
    public boolean onLongClick(View view) {
        switch (view.getId()) {
            case R.id.txt_Cricket:

                Log.e("txt_Cricket", "isLongCricket: "+isLongCricket);
                Log.e("txt_Cricket", "isLongFootball: "+isLongFootball);
                Log.e("txt_Cricket", "isFootball: "+isFootball);
                Log.e("txt_Cricket", "isLongChess: "+isLongChess);
                Log.e("txt_Cricket", "isChess: "+isChess);
                Log.e("txt_Cricket", "isLongHockey: "+isLongHockey);
                Log.e("txt_Cricket", "isHockey: "+isHockey);

                if (isLongCricket) {

                    isLongCricket = false;
                    isLongFootball = true;
                    isLongHockey = true;
                    isLongChess = true;

                    view1.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.colorOrange));

                    if(isLongFootball)
                    {
                        view2.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.colorLightGrey));
                    }

                    if(isFootball)
                    {
                        view2.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.colorLightGrey));
                    }
                    else {
                        view2.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.colorPurple));
                    }

                    if(isLongChess)
                    {
                        view3.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.colorLightGrey));
                    }

                    if(isChess)
                    {
                        view3.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.colorLightGrey));
                    }
                    else {
                        view3.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.colorPurple));
                    }

                    if(isLongHockey)
                    {
                        view4.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.colorLightGrey));
                    }

                    if(isHockey)
                    {
                        view4.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.colorLightGrey));
                    }
                    else {
                        view4.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.colorPurple));
                    }

                } else {
                    view1.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.colorLightGrey));
                    isLongCricket = true;
                }

                break;

            case R.id.txt_Football:

                Log.e("txt_Football", "isLongFootball: "+isLongFootball);
                Log.e("txt_Football", "isLongCricket: "+isLongCricket);
                Log.e("txt_Football", "isCricket: "+isCricket);
                Log.e("txt_Football", "isLongChess: "+isLongChess);
                Log.e("txt_Football", "isChess: "+isChess);
                Log.e("txt_Football", "isLongHockey: "+isLongHockey);
                Log.e("txt_Football", "isHockey: "+isHockey);

                if (isLongFootball) {

                    isLongCricket = true;
                    isLongFootball = false;
                    isLongHockey = true;
                    isLongChess = true;

                    view2.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.colorOrange));

                    if(isLongCricket)
                    {
                        view1.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.colorLightGrey));
                    }

                    if(isCricket)
                    {
                        view1.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.colorLightGrey));
                    }
                    else {
                        view1.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.colorPurple));
                    }

                    if(isLongChess)
                    {
                        view3.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.colorLightGrey));
                    }

                    if(isChess)
                    {
                        view3.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.colorLightGrey));
                    }
                    else {
                        view3.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.colorPurple));
                    }

                    if(isLongHockey)
                    {
                        view4.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.colorLightGrey));
                    }

                    if(isHockey)
                    {
                        view4.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.colorLightGrey));
                    }
                    else {
                        view4.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.colorPurple));
                    }

                } else {
                    view2.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.colorLightGrey));
                    isLongFootball = true;
                }

                break;

            case R.id.txt_Chess:

                Log.e("txt_Football", "isLongFootball: "+isLongFootball);
                Log.e("txt_Football", "isLongCricket: "+isLongCricket);
                Log.e("txt_Football", "isCricket: "+isCricket);
                Log.e("txt_Football", "isLongChess: "+isLongChess);
                Log.e("txt_Football", "isChess: "+isChess);
                Log.e("txt_Football", "isLongHockey: "+isLongHockey);
                Log.e("txt_Football", "isHockey: "+isHockey);

                if (isLongChess) {

                    isLongCricket = true;
                    isLongFootball = true;
                    isLongHockey = true;
                    isLongChess = false;

                    view3.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.colorOrange));

                    if(isLongCricket)
                    {
                        view1.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.colorLightGrey));
                    }

                    if(isCricket)
                    {
                        view1.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.colorLightGrey));
                    }
                    else
                    {
                        view1.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.colorPurple));
                    }

                    if(isLongFootball)
                    {
                        view2.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.colorLightGrey));
                    }

                    if(isFootball)
                    {
                        view2.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.colorLightGrey));
                    }
                    else
                    {
                        view2.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.colorPurple));
                    }

                    if(isLongHockey)
                    {
                        view4.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.colorLightGrey));
                    }

                    if(isHockey)
                    {
                        view4.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.colorLightGrey));
                    }
                    else {
                        view4.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.colorPurple));
                    }

                } else {
                    view3.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.colorLightGrey));
                    isLongChess = true;
                }

                break;

            case R.id.txt_Hockey:

                Log.e("txt_Football", "isLongFootball: "+isLongFootball);
                Log.e("txt_Football", "isLongCricket: "+isLongCricket);
                Log.e("txt_Football", "isCricket: "+isCricket);
                Log.e("txt_Football", "isLongChess: "+isLongChess);
                Log.e("txt_Football", "isChess: "+isChess);
                Log.e("txt_Football", "isLongHockey: "+isLongHockey);
                Log.e("txt_Football", "isHockey: "+isHockey);

                if (isLongHockey) {

                    isLongCricket = true;
                    isLongFootball = true;
                    isLongHockey = false;
                    isLongChess = true;

                    view4.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.colorOrange));

                    if(isLongCricket)
                    {
                        view1.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.colorLightGrey));
                    }

                    if(isCricket)
                    {
                        view1.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.colorLightGrey));
                    }
                    else {
                        view1.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.colorPurple));
                    }

                    if(isLongFootball)
                    {
                        view2.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.colorLightGrey));
                    }

                    if(isFootball)
                    {
                        view2.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.colorLightGrey));
                    }
                    else
                    {
                        view2.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.colorPurple));
                    }

                    if(isLongChess)
                    {
                        view3.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.colorLightGrey));
                    }

                    if(isChess)
                    {
                        view3.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.colorLightGrey));
                    }
                    else {
                        view3.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.colorPurple));
                    }

                } else {
                    view4.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.colorLightGrey));
                    isLongHockey = true;
                }

                break;
        }
        return true;
    }
}
