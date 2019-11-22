package com.example.sibalsojun_project;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class TodaysListAdapter extends RecyclerView.Adapter<TodaysListAdapter.ViewHolder>{
    private ArrayList<Data> mData=null;
    @NonNull
    @Override
    public TodaysListAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        Context context = parent.getContext() ;
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) ;

        View view = inflater.inflate(R.layout.recycleritem, parent, false) ;
        TodaysListAdapter.ViewHolder vh = new TodaysListAdapter.ViewHolder(view) ;

        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull TodaysListAdapter.ViewHolder viewHolder, int i) {
        Data data =mData.get(i);

        //viewHolder.id.setTEst(data.getTitleStr()); <-prototype
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        //변수 선언
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            //findViewById
        }
    }
}
