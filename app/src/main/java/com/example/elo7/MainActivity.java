package com.example.elo7;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SearchView;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Toolbar toolbar;
    private SearchView mysearchView;
    private TextView text;
    private RequestQueue res;
    Button bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9 ;
    int[] state={0,0,0,0,0,0,0,0,0};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = (Toolbar)findViewById(R.id.mytoolbar);
        mysearchView = (SearchView)findViewById(R.id.bar_search);
        mysearchView.setQuery("quadros decorativos",true);// defino a frase inicial na bar
        setSupportActionBar(toolbar);

        Drawable upArrow = getResources().getDrawable(R.drawable.abc_ic_ab_back_material);
        upArrow.setColorFilter(Color.parseColor("#FFFFFF"), PorterDuff.Mode.SRC_ATOP);
        getSupportActionBar().setHomeAsUpIndicator(upArrow);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);//coloco a seta de voltar na barra
        getSupportActionBar().setTitle("");

        text=findViewById(R.id.textView);
        res= Volley.newRequestQueue(this);
        String url="https://5dc05c0f95f4b90014ddc651.mockapi.io/elo7/api/1/products";
        json(url); // chamo a leitura do json
        bt1= findViewById(R.id.button);
        bt2 = findViewById(R.id.button2);
        bt3 = findViewById(R.id.button3);
        bt4 = findViewById(R.id.button4);
        bt5 = findViewById(R.id.button5);
        bt6 = findViewById(R.id.button6);
        bt7 = findViewById(R.id.button7);
        bt8 = findViewById(R.id.button8);
        bt9 = findViewById(R.id.button9);
        bt1.setOnClickListener(this);
        bt2.setOnClickListener(this);
        bt3.setOnClickListener(this);
        bt4.setOnClickListener(this);
        bt5.setOnClickListener(this);
        bt6.setOnClickListener(this);
        bt7.setOnClickListener(this);
        bt8.setOnClickListener(this);
        bt9.setOnClickListener(this);
    }


    private void json( String url){
        JsonArrayRequest request= new JsonArrayRequest(Request.Method.GET, url,null,
                response -> {
                    try {
                        JSONObject jarray=response.getJSONObject(0);
                        //String aaa=jarray.getString("title");
                        JSONObject aaa=jarray.getJSONObject("price");
                        String aa=aaa.getString("installment");
                        text.append(aa);

                    } catch (JSONException e) {
                        e.printStackTrace();
                    }

                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                error.printStackTrace();
            }
        });
       res.add(request);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button:{
                if(state[0]==0) {
                    bt1.setBackgroundResource(R.drawable.button_click);
                    state[0]++;
                }else{
                    bt1.setBackgroundResource(R.drawable.custom_button);
                    state[0]--;
                }break;
            }

            case R.id.button2:{
                if(state[1]==0) {
                    bt2.setBackgroundResource(R.drawable.button_click);
                    state[1]++;
                }else{
                    bt2.setBackgroundResource(R.drawable.custom_button);
                    state[1]--;
                }break;
            }

            case R.id.button3:{
                if(state[2]==0) {
                    bt3.setBackgroundResource(R.drawable.button_click);
                    state[2]++;
                }else{
                    bt3.setBackgroundResource(R.drawable.custom_button);
                    state[2]--;
                }break;
            }

            case R.id.button4:{
                if(state[3]==0) {
                    bt4.setBackgroundResource(R.drawable.button_click);
                    state[3]++;
                }else{
                    bt4.setBackgroundResource(R.drawable.custom_button);
                    state[3]--;
                }break;
            }

            case R.id.button5:{
                if(state[4]==0) {
                    bt5.setBackgroundResource(R.drawable.button_click);
                    state[4]++;
                }else{
                    bt5.setBackgroundResource(R.drawable.custom_button);
                    state[4]--;
                }break;
            }

            case R.id.button6:{
                if(state[5]==0) {
                    bt6.setBackgroundResource(R.drawable.button_click);
                    state[5]++;
                }else{
                    bt6.setBackgroundResource(R.drawable.custom_button);
                    state[5]--;
                }break;
            }

            case R.id.button7:{
                if(state[6]==0) {
                    bt7.setBackgroundResource(R.drawable.button_click);
                    state[6]++;
                }else{
                    bt7.setBackgroundResource(R.drawable.custom_button);
                    state[6]--;
                }break;
            }

            case R.id.button8:{
                if(state[7]==0) {
                    bt8.setBackgroundResource(R.drawable.button_click);
                    state[7]++;
                }else{
                    bt8.setBackgroundResource(R.drawable.custom_button);
                    state[7]--;
                }break;
            }

            case R.id.button9:{
                if(state[8]==0) {
                    bt9.setBackgroundResource(R.drawable.button_click);
                    state[8]++;
                }else{
                    bt9.setBackgroundResource(R.drawable.custom_button);
                    state[8]--;
                }break;
            }
        }
    }
}