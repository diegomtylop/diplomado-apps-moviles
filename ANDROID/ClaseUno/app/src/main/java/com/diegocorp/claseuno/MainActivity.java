

package com.diegocorp.claseuno;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.FragmentTabHost;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TabHost;

public class MainActivity extends AppCompatActivity {
    //private FragmentTabHost tabHost;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        TabHost tabs=(TabHost)findViewById(R.id.contenedor_tabs );
        tabs.setup();
        TabHost.TabSpec spec=tabs.newTabSpec("mitab1");
        spec.setContent(R.id.linearLayout);
        //spec.setContent( R.layout.fragment_viajes_actuales);
        spec.setIndicator("Tab 1");
        tabs.addTab(spec);

        spec=tabs.newTabSpec("mitab2");
        spec.setContent(R.id.linearLayout2);
        spec.setIndicator("TAB2");
        tabs.addTab(spec);

        tabs.setCurrentTab(0);
        /*TabHost tabHost = (TabHost) findViewById( R.id.contenedor_tabs );

        tabHost.setup();

        TabHost.TabSpec tab = tabHost.newTabSpec("TAb 1");
        tab.setIndicator("Indicador 1");
        tab.setContent( R.id.linearLayout);

        TabHost.TabSpec tab1 = tabHost.newTabSpec("TAb 2");
        tab1.setIndicator("Indicador 2");
        tab.setContent(R.id.linearLayout2);

        tabHost.addTab( tab );
        tabHost.addTab( tab1 );*/


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
}
