package com.articleaggregator.Adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.PopupWindow;
import android.widget.TextView;

import com.articleaggregator.POJO.NewsPOJO;
import com.articleaggregator.R;

import java.util.ArrayList;

public class NewsAdapter extends RecyclerView.Adapter<NewsAdapter.MyHolder>{

    Context context;
    ArrayList<NewsPOJO> arrayList;
    public NewsAdapter(Context context,ArrayList<NewsPOJO> arrayList){
        this.context = context;
        this.arrayList =arrayList;

    }

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.news_holder,null);
        return new MyHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder holder, int position) {
        final NewsPOJO news = arrayList.get(position);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


//                showPopup(news.getText());
            }
        });
        holder.tvHeadline.setText(news.getHeadLine());
        holder.tvDate.setText(news.getDate());
//        holder.tvPara.setText(news.getText());
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }


    public void showPopup(String text) {
//        View popupView = LayoutInflater.from(context).inflate(R.layout.popup_, null);
//        final PopupWindow popupWindow = new PopupWindow(popupView, WindowManager.LayoutParams.MATCH_PARENT, WindowManager.LayoutParams.MATCH_PARENT);
//        Button btnDismiss = (Button) popupView.findViewById(R.id.btn_dismiss);
//        TextView textView = popupView.findViewById(R.id.text);
//        textView.setText(text);
//        btnDismiss.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                popupWindow.dismiss();
//            }
//        });
//
//        popupWindow.showAsDropDown(popupView, 0, 0);
    }



    public class MyHolder extends  RecyclerView.ViewHolder{

        TextView tvHeadline, tvDate, tvPara;

        public MyHolder(View v) {
            super(v);
            tvHeadline = v.findViewById(R.id.tvHeadline);
            tvDate = v.findViewById(R.id.tvDate);
            tvPara = v.findViewById(R.id.tvPara);
        }
    }
}
