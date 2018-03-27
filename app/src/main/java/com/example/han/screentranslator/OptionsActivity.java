package com.example.han.screentranslator;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

/**
 * Created by per6 on 3/27/18.
 */

public class OptionsActivity extends AppCompatActivity {
    private ImageButton mainButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.options);
        wireWidgets();
        mainButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);
                setContentView(R.layout.main_ui);
            }
        });
    }
    public void wireWidgets(){
        mainButton=findViewById(R.id.options_button);

    }
}
