package com.example.githubsearch;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.bumptech.glide.Glide;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.Arrays;

public class profile extends AppCompatActivity {

    ImageView profile;
    TextView mfollower,mfollowing,mbio;
    String user;
    String url="https://api.github.com/users/";
    RecyclerView mRecyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        user=getIntent().getStringExtra("Username");
        url=url+user;
//        Log.d("Username",user);
        profile=(ImageView)findViewById(R.id.profileimage);
        mfollower=(TextView)findViewById(R.id.followers);
        mfollowing=(TextView)findViewById(R.id.following);
        mbio=(TextView)findViewById(R.id.bio);
        mRecyclerView=(RecyclerView)findViewById(R.id.recyclerview);
        loadata(url);
        loadrepository(url);

    }
    public void loadata(String url){
        // Instantiate the RequestQueue.
//        RequestQueue queue = Volley.newRequestQueue(this);

        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest
                (Request.Method.GET, url, null, new Response.Listener<JSONObject>() {

                    @Override
                    public void onResponse(JSONObject response) {
                        try {
                            String imageurl=response.getString("avatar_url");
                            String followerc=response.getString("followers");
                            String followingc=response.getString("following");
                            String bioc=response.getString("bio");
                            Glide.with(profile.this).load(imageurl).into(profile);
                            mfollower.setText("FOLLOWERS : "+followerc);
                            mfollowing.setText("FOLLOWING : "+followingc);
                            mbio.setText("BIO : "+bioc);
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                }, new Response.ErrorListener() {

                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Toast.makeText(profile.this, "Unable to fetch the data", Toast.LENGTH_SHORT).show();
                    }
                });
        // Add the request to the RequestQueue.
//        queue.add(jsonObjectRequest);
        MySingleton.getInstance(this).addToRequestQueue(jsonObjectRequest);
    }

    public void loadrepository(String url){
        url=url+"/repos?per_page=100&sort=created";
        // Instantiate the RequestQueue.
//        RequestQueue queue = Volley.newRequestQueue(this);
       // Request a string response from the provided URL.
        StringRequest stringRequest = new StringRequest(Request.Method.GET, url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
//                        Log.d("Response",response);
                        GsonBuilder gsonBuilder=new GsonBuilder();
                        Gson gson=gsonBuilder.create();
                        Repository[] repoarray=gson.fromJson(response,Repository[].class);
//                        Log.d("Response",Arrays.toString(repoarray));
                        RepositoryAdapter repositoryAdapter=new RepositoryAdapter(repoarray,profile.this);
                        mRecyclerView.setLayoutManager(new LinearLayoutManager(profile.this));
                        mRecyclerView.setAdapter(repositoryAdapter);
                        mRecyclerView.setHasFixedSize(true);
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(profile.this, "Unable to fetch the data", Toast.LENGTH_SHORT).show();
            }
        });

        // Add the request to the RequestQueue.
//        queue.add(stringRequest);
        MySingleton.getInstance(this).addToRequestQueue(stringRequest);
    }
}