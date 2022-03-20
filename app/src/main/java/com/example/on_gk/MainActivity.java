package com.example.on_gk;

import android.content.Intent;
import android.graphics.Color;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity  {
    ListView listView;
    Adapter adapter;
    ArrayList<emtity> arrayList;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView =findViewById(R.id.idListview);
        arrayList = new ArrayList<>();
        arrayList.add(new emtity(R.drawable.donut_yellow,"Tasty Donut","spicy tasty donut family","$10.00"));
        arrayList.add(new emtity(R.drawable.tasty_donut,"Pink Donut","spicy tasty donut family","$20.00"));

        adapter = new Adapter(this,R.layout.item_listview,arrayList);
        listView.setAdapter(adapter);
//        Button button = findViewById(R.id.button);
//        ConstraintLayout constraintLayout = findViewById(R.id.itemview);
//        ListView listView1 = findViewById(R.id.idListview);
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Toast.makeText(MainActivity.this,"Bạn đã click",Toast.LENGTH_SHORT).show();
//            }
//        });
//        ArrayAdapter<String> listView = new ArrayAdapter<>(this,R.layout.item_listview,arrayList);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//                Toast.makeText(MainActivity.this,"Bạn đã clicks",Toast.LENGTH_SHORT).show()

                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                Bundle bundle = new Bundle();
//                View view2 = (View) listView.getAdapter().getItem(i);
                int image = arrayList.get(i).getImage();
                String ten = arrayList.get(i).getTen();
                bundle.putString("red",ten);
                bundle.putInt("hinh",image);
                bundle.putString("gia",arrayList.get(i).getGia());
                intent.putExtras(bundle);
                startActivity(intent);

            }
        });
        Button btnDonut = findViewById(R.id.button);
        Button btnPink = findViewById(R.id.button2);
        Button btnFloat = findViewById(R.id.button3);

        btnDonut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.setBackgroundColor(Color.RED);
                btnPink.setBackgroundColor(Color.BLACK);


            }
        });
        btnPink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.setBackgroundColor(Color.RED);
            }
        });
        btnFloat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.setBackgroundColor(Color.RED);
            }
        });

        EditText editText = findViewById(R.id.edittext);
        editText.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                String ten = editText.getText().toString();
                ArrayList<emtity> ar = new ArrayList<>();
                for (int i = 0 ; i< arrayList.size();i++)
                {
                   if(arrayList.get(i).getTen().equals(ten))
                   {
                        ar.add(arrayList.get(i));
                        adapter = new Adapter(MainActivity.this,R.layout.item_listview,ar);
                        listView.setAdapter(adapter);
                   }
                }

            }
        });

    }


}
