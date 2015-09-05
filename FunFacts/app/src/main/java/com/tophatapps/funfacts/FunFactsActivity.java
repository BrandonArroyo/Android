package com.tophatapps.funfacts;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;


public class FunFactsActivity extends Activity {
    public static final String TAG = FunFactsActivity.class.getSimpleName();
    private FactBook nFact = new FactBook();
    private ColorWheel mcolorWheel = new ColorWheel();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);

        //declare are view  variables and assign views
        final TextView factLable = (TextView) findViewById(R.id.factTextView);
        final Button showFactButton = (Button) findViewById(R.id.showFactButton);
        final RelativeLayout BgColor = (RelativeLayout) findViewById(R.id.relativeLayout);
        View.OnClickListener listener = new View.OnClickListener(){
            @Override
            public void onClick(View view){
                //upadate facts
                int color = mcolorWheel.getColor();
                BgColor.setBackgroundColor(color);
                showFactButton.setTextColor(color);
                factLable.setText(nFact.getFact());
            }
        };
        showFactButton.setOnClickListener(listener);

        //Toast welcomeTost = Toast.makeText(this,"AWESOME", Toast.LENGTH_LONG).show();
        Log.d(TAG,"onCreate");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_fun_facts, menu);
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
}
