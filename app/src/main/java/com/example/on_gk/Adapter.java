package com.example.on_gk;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.constraintlayout.widget.ConstraintLayout;

import java.util.ArrayList;

public class Adapter extends BaseAdapter {
    Context context;
    private int idLayout;
    private ArrayList<emtity> arrayList ;

    public Adapter(Context context, int idLayout, ArrayList<emtity> arrayList) {
        this.context = context;
        this.idLayout = idLayout;
        this.arrayList = arrayList;
    }

    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = LayoutInflater.from(context).inflate(idLayout,viewGroup,false);
        TextView ten =view.findViewById(R.id.ten);
        TextView cuahang =view.findViewById(R.id.cuahang);
        TextView gia =view.findViewById(R.id.gia);
//        ImageView btn1 = view.findViewById((R.id.btn1));
//        ImageView btn2 = view.findViewById((R.id.btn2));
//        ImageView btn3 = view.findViewById((R.id.btn3));
        ImageView image = view.findViewById((R.id.imageView));
        ConstraintLayout constraintLayout = view.findViewById(R.id.itemview);

        ten.setText(arrayList.get(i).getTen());
        cuahang.setText(arrayList.get(i).getCuahang());
        gia.setText(arrayList.get(i).getGia());
        image.setImageResource(arrayList.get(i).getImage());

//        view.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Toast.makeText(context,"Bạn đã click",Toast.LENGTH_SHORT).show();
//
//            }
//        });




        return view;
    }

}
