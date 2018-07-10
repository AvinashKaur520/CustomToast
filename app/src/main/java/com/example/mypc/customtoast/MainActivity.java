package com.example.mypc.customtoast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import static android.widget.Toast.makeText;

public class MainActivity extends AppCompatActivity {

    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = (Button) findViewById(R.id.button);

        b1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Toast ref= makeText(MainActivity.this,"",Toast.LENGTH_SHORT);

                LayoutInflater inflater = getLayoutInflater();
                View view = inflater.inflate(R.layout.jadu,null);

                ref.setView(view);

                ref.show();
            }
        });
    }
}
