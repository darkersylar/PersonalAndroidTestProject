package com.leier.personalandroidtest.personalandroidtestproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import com.leier.personalandroidtest.personalandroidtestproject.ImageShowFrame.Picasso.SampleTestPicassoActivity;

public class MainActivity extends Activity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goPiccaso(View view) {
        Intent intent = new Intent(this,SampleTestPicassoActivity.class);
        startActivity(intent);
    }
}
