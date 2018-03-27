package com.example.han.screentranslator;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private ImageButton optionsButton;
    private TextView translationView;
    private ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_ui);
        wireWidgets();
        optionsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),OptionsActivity.class);
                startActivity(i);
                setContentView(R.layout.options);
            }
        });
    }
    public void wireWidgets(){
        optionsButton=findViewById(R.id.options_button);
        translationView=findViewById(R.id.textView);
        imageView=findViewById(R.id.imageView);
    }
}
