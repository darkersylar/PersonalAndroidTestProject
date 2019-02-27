package com.leier.personalandroidtest.personalandroidtestproject.ImageShowFrame.Picasso;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;

import com.leier.personalandroidtest.personalandroidtestproject.R;
import com.squareup.picasso.*;

public class SampleTestPicassoActivity extends Activity {
    private ImageView iv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sample_test_picasso);

        initView();
        testPicasso();
    }

    private void testPicasso(){
        Picasso.with(this)
                .load("http://ww3.sinaimg.cn/large/610dc034jw1fasakfvqe1j20u00mhgn2.jpg")
                .into(iv1);
    }

    private void initView(){
        iv1 = findViewById(R.id.picasso_iv1);
    }
}
