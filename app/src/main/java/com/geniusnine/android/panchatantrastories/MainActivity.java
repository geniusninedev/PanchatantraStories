package com.geniusnine.android.panchatantrastories;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.view.KeyEvent;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity
         {
    ListView PanchatantraListview;
    ArrayAdapter<String> adapter;
    String Panchatantralist[] = {"The Loss Of Friends", "The Monkey and The Wedge", "The Jackal and The Drum", "The Fall and Rise of A Merchant", "The Foolish Sage and The Jackal",
            "The Crafty Crane and The Craftier Crab", "The Cunning Hare and The Witless Lion", "The Bug and The Poor Flea", "The Story of The Blue Jackal",
            "The Camel, The Jackal and The Crow", "The Bird Pair and The Sea", "Tale of The Three Fish", "The Elephant and The Sparrow", "The Lion and The Jackal",
            "Suchimukha and The Monkey", "How a Sparrow Came to Grief", "The Foolish Crane and The Mongoose", "The King and The Foolish Monkey", "Gaining Friends", "The Crow-Rat Discourse",
            " Meeting a New Friend", "The Hermit and The Mouse", "Shandili and Sesame Seeds", "Story of The Merchant’s Son", "The Unlucky Weaver", "The Rescue of a Deer",
            "Of Crows and Owls", "Elephants and Hares", "The Cunning Mediator", "The Brahmin and The Crooks", " The Brahmin and The Cobra", "The Old Man, His Young Wife and The Thief",
            "The Tale of Two Snakes", "The Wedding of The Mouse", "Tale of The Golden Droppings", "Frogs That Rode a Snake", "The Croc and The Monkey",
            "The Greedy Cobra and The King of Frogs", "The Lion and The Foolish Donkey", "The Story of The Potter", "A Three-in-One Story",
            "The Carpenter's Wife", "The Price of Indiscretion", "The Jackal's Strategy", "Imprudence", "The Brahmani and The Mongoose", "The Lion That Sprang to Life",
            "The Tale of Two Fish and a Frog", "The Story of The Weaver", "The Miserly Father", "Tale of The Bird With Two Heads"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        PanchatantraListview = (ListView) findViewById(R.id.list);
        adapter = new ArrayAdapter<String>(getApplicationContext(), R.layout.content_main, R.id.textView2, Panchatantralist);
        PanchatantraListview.setAdapter(adapter);
        PanchatantraListview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent MemRef = new Intent(MainActivity.this, PanchatantraWeb.class);
                MemRef.putExtra("key", position);
                startActivity(MemRef);

            }
        });
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }
             @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        switch (keyCode) {
            case KeyEvent.KEYCODE_BACK:
                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
                alertDialogBuilder.setMessage("Are you sure you want to close App?");
                alertDialogBuilder.setPositiveButton("Yes",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface arg0, int arg1) {

                                finish();

                            }
                        });

                alertDialogBuilder.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface arg0, int arg1) {


                    }
                });

                //Showing the alert dialog
                AlertDialog alertDialog = alertDialogBuilder.create();
                alertDialog.show();
                return true;
        }
        return super.onKeyDown(keyCode, event);
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        /*if (id == R.id.action_settings) {
            return true;
        }*/
        if (id == R.id.nav_share1) {
            Intent i = new Intent(Intent.ACTION_SEND);
            i.setType("text/plain");
            i.putExtra(Intent.EXTRA_TEXT, "message to share");
            startActivity(Intent.createChooser(i, "Share via"));
            return true;
        }


        return super.onOptionsItemSelected(item);
    }




}
