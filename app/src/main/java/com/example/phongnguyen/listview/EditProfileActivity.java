package com.example.phongnguyen.listview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class EditProfileActivity extends AppCompatActivity {

    ImageView image_profile, image_cover;
    TextView edit_image_profile, edit_image_cover;
    Button button_edit_detail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_profile);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);

        image_cover = (ImageView) findViewById(R.id.image_cover);
        image_profile = (ImageView) findViewById(R.id.image_profile);
        edit_image_cover = (TextView) findViewById(R.id.edit_image_cover);
        edit_image_profile = (TextView) findViewById(R.id.edit_image_profile);
        button_edit_detail = (Button) findViewById(R.id.button_edit_detail);

        edit_image_profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
