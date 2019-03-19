package com.blazingapps.asus.sanskriti19;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;

public class DevActivity extends AppCompatActivity {
    LinearLayout nav,arv,don,rah;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dev);
        nav=findViewById(R.id.nav);
        arv=findViewById(R.id.arv);
        don=findViewById(R.id.don);
        rah=findViewById(R.id.rah);

        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.moveleft);
        nav.startAnimation(animation);


        Animation animation2 = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.moveright);
        arv.startAnimation(animation2);


        Animation animation3 = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.moveup);
        don.startAnimation(animation3);

        Animation animation4 = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.movedown);
        rah.startAnimation(animation4);

        nav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("com.instagram.android.https://www.instagram.com/navaneethkz/"));
                    startActivity(intent);
                } catch(Exception e) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/navaneethkz/")));
                }
            }
        });
        arv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("com.instagram.android.https://www.instagram.com/aravi_nd_balan/"));
                    startActivity(intent);
                } catch(Exception e) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/aravi_nd_balan/")));
                }
            }
        });
        don.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("com.instagram.android.https://www.instagram.com/donattomookken/"));
                    startActivity(intent);
                } catch(Exception e) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/donattomookken/")));
                }
            }
        });
    }
}
