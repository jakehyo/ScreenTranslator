package com.example.han.screentranslator;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.jafregle.Jafregle;
import com.jafregle.Language;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new Translate().execute("Hello World");

    }
    class Translate extends AsyncTask<String, Void, String>{

        @Override
        protected String doInBackground(String... strings) {
            Jafregle j = new Jafregle(Language.ENGLISH, Language.FRENCH);
            try {
                //Log.d("asdfasdfsdfasdfasdf", "onCreate: "+j.translate("Hello World!", Language.ENGLISH, Language.FRENCH));
                return j.translate(strings[0]);
            } catch (IOException e) {
                e.printStackTrace();
            }
            return "ERROR";
        }

        @Override
        protected void onPostExecute(String s) {
            Log.d("Asdf", "onPostExecute: "+s);
        }
    }

}
