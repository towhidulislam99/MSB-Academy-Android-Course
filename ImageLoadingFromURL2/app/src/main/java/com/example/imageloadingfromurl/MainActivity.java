package com.example.imageloadingfromurl;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.Image;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.widget.ImageView;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class MainActivity extends AppCompatActivity {


    ImageView imageView;
    String mehjabin ="https://m.media-amazon.com/images/M/MV5BOTU2MjMxZTktMGRkMS00MGIwLThmZWYtMzAxNTE2NzNjMmEwXkEyXkFqcGdeQXVyMTA0MTc5MTU5._V1_FMjpg_UX1000_.jpg";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.imageView);

        Handler mainHandler = new Handler(Looper.getMainLooper());


        new Thread(new Runnable() {
            @Override
            public void run() {


                try {
                    URL url = new URL(mehjabin);
                    HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                    httpURLConnection.connect();
                    InputStream inputStream = httpURLConnection.getInputStream();
                    Bitmap bitmap = BitmapFactory.decodeStream(inputStream);
                    //imageView.setImageBitmap(bitmap);
                    mainHandler.post(new Runnable() {
                        @Override
                        public void run() {

                        imageView.setImageBitmap(bitmap);
                        }
                    });


                } catch (MalformedURLException e) {
                    throw new RuntimeException(e);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }


        }).start();



}
}