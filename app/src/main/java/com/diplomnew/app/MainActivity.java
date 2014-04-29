package com.diplomnew.app;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.view.View;

public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnWords = (Button) findViewById(R.id.btnWords);
        Button btnTwentyFiveFrame = (Button) findViewById(R.id.btnTwentyFiveFrame);
        Button btnBilateralCards = (Button) findViewById(R.id.btnBilateralCards);
        Button btnAssociatedCards = (Button) findViewById(R.id.btnAssociatedCards);
        Button btnStatistics = (Button) findViewById(R.id.btnStatistics);

        btnWords.setOnClickListener(
                new View.OnClickListener()
                {
                    public void onClick(View aView)
                    {
                        Intent intent = new Intent(MainActivity.this, MenuWords.class);
                        startActivity(intent);
                    }
                }
        );

        btnTwentyFiveFrame.setOnClickListener(
                new View.OnClickListener()
                {
                    public void onClick(View aView)
                    {
                        Intent intent = new Intent(MainActivity.this, MenuTwFiveFrame.class);
                        startActivity(intent);
                    }
                }
        );

        btnBilateralCards.setOnClickListener(
                new View.OnClickListener()
                {
                    public void onClick(View aView)
                    {
                        Intent intent = new Intent(MainActivity.this, MenuBilateralCards.class);
                        startActivity(intent);
                    }
                }
        );

        btnAssociatedCards.setOnClickListener(
                new View.OnClickListener()
                {
                    public void onClick(View aView)
                    {
                        Intent intent = new Intent(MainActivity.this, MenuAssociatedCards.class);
                        startActivity(intent);
                    }
                }
        );

        btnStatistics.setOnClickListener(
                new View.OnClickListener()
                {
                    public void onClick(View aView)
                    {
                        Intent intent = new Intent(MainActivity.this, MenuStatistics.class);
                        startActivity(intent);
                    }
                }
        );
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
