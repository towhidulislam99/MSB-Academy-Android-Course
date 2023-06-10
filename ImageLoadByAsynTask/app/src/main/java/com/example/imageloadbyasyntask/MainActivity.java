package com.example.imageloadbyasyntask;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.os.Bundle;
import android.widget.ImageView;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = findViewById(R.id.imageView);

        String mehjabin = " https://m.media-amazon.com/images/M/MV5BZmU4NjhlMTgtOTgzMy00N2E2LWJjM2YtNDQ2NWIzNmNhZDQxXkEyXkFqcGdeQXVyMTA0MTc5MTU5._V1_.jpg";

        new imageLoadingTask().execute(mehjabin);

    }


    public  class imageLoadingTask extends AsyncTask<String,Void,Bitmap>
    {

        @Override
        protected Bitmap doInBackground(String... strings) {
            //Backgroun Thread Run kara

            String mehjabin = strings[0];

            try {
                URL url = new URL(mehjabin);
                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                InputStream inputStream = httpURLConnection.getInputStream();
                //InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
                httpURLConnection.connect();
                Bitmap bitmap = BitmapFactory.decodeStream(inputStream);
                return bitmap;


            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }

        @Override
        protected void onPreExecute() {
            //Main Thered a Run Kara

            super.onPreExecute();
        }

        @Override
        protected void onProgressUpdate(Void... values) {

            //Main Thread A run Hba
            super.onProgressUpdate(values);
        }

        @Override
        protected void onPostExecute(Bitmap bitmap) {

            //Main Thread a Run Kara
            imageView.setImageBitmap(bitmap);

            super.onPostExecute(bitmap);
        }
    }
}