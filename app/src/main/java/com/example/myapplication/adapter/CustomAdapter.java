package com.example.myapplication.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.cardview.widget.CardView;

import com.example.myapplication.R;
import com.example.myapplication.activities.FullView;
import com.example.myapplication.model.Constant;

import java.util.List;

public class CustomAdapter extends BaseAdapter {

    int condition;
    Context context;
    List<Constant>constantList;

    public CustomAdapter(Context context,List<Constant> constantList,int condition){
        this.context = context;
        this.constantList = constantList;
        this.condition=condition;
    }


    @Override
    public int getCount() {
        return constantList.size();
    }

    @Override
    public Object getItem(int i) {
        return i;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view= LayoutInflater.from(context).inflate(R.layout.item_list,viewGroup,false);


        final String title = constantList.get(i).getTitle();
        final String ejza = constantList.get(i).getEjza();
        final String targeeb = constantList.get(i).getTarqeeb();
        final int image =constantList.get(i).getImage();
        final  String url = constantList.get(i).getUrl();
        final  String u = constantList.get(i).getU();



        ImageView imageView=(ImageView)view.findViewById(R.id.thumbnail);
        TextView textView = (TextView)view.findViewById(R.id.title);
        CardView cardView =  (CardView)view.findViewById(R.id.cardView);

        imageView.setImageResource(image);
        textView.setText(title);



        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context , FullView.class);
                intent.putExtra("image",image);
                intent.putExtra("title",title);
                intent.putExtra("ejza",ejza);
                intent.putExtra("tarqeeb",targeeb);
                intent.putExtra("condition",condition);
                intent.putExtra("url",url);
                intent.putExtra("u",u);



                context.startActivity(intent);

            }
        });





        return view;
    }
}
