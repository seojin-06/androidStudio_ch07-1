
package com.cookandroid.project7_1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("제주도 풍경");
        editText = (EditText) findViewById(R.id.editText);
        imageView = (ImageView) findViewById(R.id.imgView);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        MenuInflater mInflater = getMenuInflater();
        mInflater.inflate(R.menu.menu1, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int itemId = item.getItemId();
        if (itemId == R.id.item1) {
            imageView.setImageResource(R.drawable.jeju1);
            return true;
        } else if (itemId == R.id.item2) {
            imageView.setImageResource(R.drawable.jeju2);
            return true;
        } else if (itemId == R.id.item3) {
            imageView.setImageResource(R.drawable.jeju3);
            return true;
        } else if (itemId == R.id.subRotate) {
            imageView.setRotation(Integer.parseInt(editText.getText().toString()));
            return true;
        }
        return true;
    }
}