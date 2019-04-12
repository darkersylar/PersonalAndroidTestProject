package com.leier.personalandroidtest.personalandroidtestproject.NetConnectionFrame.OkHttp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.leier.personalandroidtest.personalandroidtestproject.R;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class SampleTestOkHttpActivity extends Activity {
    private ImageView iv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sample_test_ok_http);
    }

    public void get(View view) {
        String url = "";
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().get().url(url).build();
        Call call = client.newCall(request);
        call.enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                System.out.print("onFailure");
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                System.out.println("onResponse:" + response.body().toString());
            }
        });
    }

    public void post(View view) {

    }

}
