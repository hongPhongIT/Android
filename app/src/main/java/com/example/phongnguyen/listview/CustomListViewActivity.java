package com.example.phongnguyen.listview;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.ListView;

import java.util.ArrayList;

public class CustomListViewActivity extends Activity {

    private ListView listItems;
    private CustomAdapter mAdapter;
    private ArrayList<Frust> mFrusts = new ArrayList<>();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listItems = (ListView)findViewById(R.id.activity_main_listview);
        setData();
        mAdapter = new CustomAdapter(this, mFrusts);

        listItems.setAdapter(mAdapter);

    }

    private void setData(){
        mFrusts.add(new Frust("Apple", "https://apple.com", "Lorem ipsum is placeholder text commonly used in the graphic, print, and publishing industries for previewing layouts and visual mockups."));
        mFrusts.add(new Frust("Banana", "https://apple.com", "Lorem ipsum is placeholder text commonly used in the graphic, print, and publishing industries for previewing layouts and visual mockups."));
        mFrusts.add(new Frust("Pine apple", "https://apple.com", "Lorem ipsum is placeholder text commonly used in the graphic, print, and publishing industries for previewing layouts and visual mockups."));
        mFrusts.add(new Frust("Coconut", "https://apple.com", "Lorem ipsum is placeholder text commonly used in the graphic, print, and publishing industries for previewing layouts and visual mockups."));
        mFrusts.add(new Frust("Apple", "https://apple.com", "Lorem ipsum is placeholder text commonly used in the graphic, print, and publishing industries for previewing layouts and visual mockups."));
        mFrusts.add(new Frust("Apple", "https://apple.com", "Lorem ipsum is placeholder text commonly used in the graphic, print, and publishing industries for previewing layouts and visual mockups."));
        mFrusts.add(new Frust("Apple", "https://apple.com", "Lorem ipsum is placeholder text commonly used in the graphic, print, and publishing industries for previewing layouts and visual mockups."));
        mFrusts.add(new Frust("Apple", "https://apple.com", "Lorem ipsum is placeholder text commonly used in the graphic, print, and publishing industries for previewing layouts and visual mockups."));
        mFrusts.add(new Frust("Apple", "https://apple.com", "Lorem ipsum is placeholder text commonly used in the graphic, print, and publishing industries for previewing layouts and visual mockups."));
        mFrusts.add(new Frust("Apple", "https://apple.com", "Lorem ipsum is placeholder text commonly used in the graphic, print, and publishing industries for previewing layouts and visual mockups."));

    }
}
