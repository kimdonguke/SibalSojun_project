package com.example.sibalsojun_project.Fragments;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.ConstraintLayout;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.sibalsojun_project.R;

import java.util.ArrayList;

public class MakeRoutine extends Fragment {
    public void onCreate(Bundle savedInstanceState) { super.onCreate(savedInstanceState); }
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Context context=getContext();
        View v= inflater.inflate(R.layout.makeroutine_frag, container, false);


        
        return  v;
    }
}
