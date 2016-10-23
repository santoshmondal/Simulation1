package com.affixus.simulation.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.affixus.simulation.pojo.response.NewsPojo;
import com.affixus.simulation.pojo.response.ResponsePojo;
import com.affixus.simulation.restful.RestApi;
import com.affixus.simulation.util.JsonUtil;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG = MainActivity.class.getName();
    private Button button;
    private Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);
        button2 = (Button) findViewById(R.id.button2);

        button.setOnClickListener(this);
        button2.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.button) {

            Button b = (Button) v;

            Log.i(TAG, (String) b.getText());
            Toast.makeText(this, b.getText(), Toast.LENGTH_SHORT).show();

            apiHomeNews();
        } else if(v.getId() == R.id.button2) {

            Button b = (Button) v;

            Log.i(TAG, (String) b.getText());
            Toast.makeText(this, b.getText(), Toast.LENGTH_SHORT).show();

            apiHomeNews();
        }
    }

    public void apiHomeNews() {
        Call<ResponsePojo> news = RestApi.firstApi.getNews();

        news.enqueue(new Callback<ResponsePojo>() {
            @Override
            public void onResponse(Call<ResponsePojo> call, Response<ResponsePojo> response) {
                try{
                    Object data = response.body().getData();
                    String json = JsonUtil.objectToJson(data);

                    List<NewsPojo> newsList = (List<NewsPojo>) JsonUtil.jsonArrayToListObject(json, NewsPojo.class);
                    Log.i(TAG, newsList.toString());
                } catch(Exception e){
                    Log.e(TAG, e.getMessage());
                }
            }

            @Override
            public void onFailure(Call<ResponsePojo> call, Throwable t) {
                Log.i(TAG, t.getMessage());
            }
        });
    }
}
