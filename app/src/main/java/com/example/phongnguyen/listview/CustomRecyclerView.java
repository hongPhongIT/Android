package com.example.phongnguyen.listview;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class CustomRecyclerView extends AppCompatActivity{

    RecyclerView recyclerView;
    CustomRecyclerAdapter customRecyclerAdapter;
    ArrayList<Frust> arr_frusts = new ArrayList<>();;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        RecyclerView.LayoutManager layoutManager =new LinearLayoutManager(CustomRecyclerView.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setHasFixedSize(false);

        arr_frusts.add(new Frust("Apple", "", "Lorem ipsum is."));
        arr_frusts.add(new Frust("Banana", "", "Lorem ipsum is placeholder text commonly used in the graphic, print, and publishing industries for previewing layouts and visual mockups."));
        arr_frusts.add(new Frust("Pine apple", "", "Lorem ipsum is placeholder text commonly used in the graphic, print, and publishing industries for previewing layouts and visual mockups."));
        arr_frusts.add(new Frust("Coconut", "", "Lorem ipsum is placeholder text commonly used in the graphic, print, and publishing industries for previewing layouts and visual mockups."));
        arr_frusts.add(new Frust("Apple", "", "Lorem ipsum is placeholder text commonly used in the graphic, print, and publishing industries for previewing layouts and visual mockups."));
        arr_frusts.add(new Frust("Apple", "", "Lorem ipsum is placeholder text commonly used in the graphic, print, and publishing industries for previewing layouts and visual mockups."));
        arr_frusts.add(new Frust("Apple", "", "Lorem ipsum is placeholder text commonly used in the graphic, print, and publishing industries for previewing layouts and visual mockups."));
        arr_frusts.add(new Frust("Apple", "", "Lorem ipsum is placeholder text commonly used in the graphic, print, and publishing industries for previewing layouts and visual mockups."));
        arr_frusts.add(new Frust("Apple", "", "Lorem ipsum is placeholder text commonly used in the graphic, print, and publishing industries for previewing layouts and visual mockups."));
        arr_frusts.add(new Frust("Apple", "", "Lorem ipsum is placeholder text commonly used in the graphic, print, and publishing industries for previewing layouts and visual mockups."));

        customRecyclerAdapter = new CustomRecyclerAdapter(arr_frusts, this);
        recyclerView.setAdapter(customRecyclerAdapter);
    }
}
