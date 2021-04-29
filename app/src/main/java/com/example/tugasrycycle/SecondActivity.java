package com.example.tugasrycycle;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    ImageView iv_imageAnimal;
    TextView tv_animal;
    TextView tv_animalDetails;
    Button b_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        iv_imageAnimal = findViewById(R.id.iv_animalPhoto);
        tv_animal = findViewById(R.id.tv_animalName);
        tv_animalDetails = findViewById(R.id.tv_animalDetail);
        b_back = findViewById(R.id.b_back);

        Bundle bundle = getIntent().getExtras();
        tv_animal.setText(bundle.getString("name"));
        tv_animalDetails.setText(bundle.getString("details"));
        iv_imageAnimal.setImageResource(bundle.getInt("photos"));

        b_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent a = new Intent(SecondActivity.this, MainActivity.class);
//                startActivity(a);
                finish();
            }
        });
    }
}