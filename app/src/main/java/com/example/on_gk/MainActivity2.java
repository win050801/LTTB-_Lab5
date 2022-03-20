package com.example.on_gk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.action_layout);
        ImageView imageView = findViewById(R.id.imageView2);

        TextView textView = findViewById(R.id.tenaction);
        TextView txtGia = findViewById(R.id.txtGia);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        String ten = bundle.getString("red","");
        int hinh = bundle.getInt("hinh",0);
        String gia = bundle.getString("gia","");

        imageView.setImageResource(hinh);

        textView.setText(ten);
        txtGia.setText(gia);


    }
}