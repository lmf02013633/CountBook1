

package com.example.minfeng1_countbook;
/**
 * Created by Minfeng Liu on 2017/10/2.
 */
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
/**
 * MainActivity
 * used to add counter to list and give out the number

 */
public class MainActivity extends AppCompatActivity {
    int count = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * onClick
     * @param view
     */
    public void onClick(View view){
        count++;
            TextView text=(TextView)findViewById(R.id.textView);
            text.setText("Number of counters: "+ count);
    }
}
/*
Actuallt I also wrote some other classes to try to implement each counter but it doesn't work,
and when I keep them, the APP keep having error and cannot run, so at last I decided to delete them.

 */