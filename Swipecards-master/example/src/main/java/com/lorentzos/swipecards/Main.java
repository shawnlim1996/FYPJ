package com.lorentzos.swipecards;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.RatingBar;
import android.widget.TextView;

public class Main extends Activity implements RatingBar.OnRatingBarChangeListener {
    TextView rt;
    RatingBar rtb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        rt=(TextView)findViewById(R.id.rating);
        rtb=(RatingBar)findViewById(R.id.ratingBar);

        rtb.setOnRatingBarChangeListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {

        rt.setText("Rating: " +rating+"\n");
        if(fromUser)
            rt.setText(rt.getText().toString()+"Changed by user");
        else
            rt.setText(rt.getText().toString()+"Changed by function");


    }

    public void changeRating(View v){

        rtb.setRating(5.0f);
    }
}
