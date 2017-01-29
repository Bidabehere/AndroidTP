package com.bidabehere.DS.finaltp10;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;


public class Estudiante extends AppCompatActivity implements View.OnClickListener {
    Button boton;
    Button boton_registro;
    Button botonnoti;
    Button busqueda;

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_estudiante);


        Button boton = (Button) findViewById(R.id.boton);
        boton.setOnClickListener(this);

        Button boton2 = (Button) findViewById(R.id.boton_registro);
        boton2.setOnClickListener(this);

        Button boton3 = (Button) findViewById(R.id.botonnoti);
        boton3.setOnClickListener(this);

        Button boton4 = (Button) findViewById(R.id.busqueda);
        boton4.setOnClickListener(this);



    //    Button boton3 = (Button) findViewById(R.id.button3);
    //    boton3.setOnClickListener(this);



      /*  FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/
        boton = (Button) findViewById(R.id.boton);
        boton.setOnClickListener(this);

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_estudiante, menu);
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
    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.boton:

                Uri uri = Uri.parse("http://www.sigloxxi.com.ar/");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);

                // Toast.makeText(getApplicationContext(), "Hola esto es un toast",Toast.LENGTH_SHORT).show();
                break;
          case R.id.boton_registro:


              setContentView(R.layout.activity_registro);



          //Toast.makeText(getApplicationContext(), "Hola esto es un toast",Toast.LENGTH_SHORT).show();
            break;
            case R.id.botonnoti:


                //setContentView(R.layout.activity_noticias);
                setContentView(R.layout.activity_noticias);


                //Toast.makeText(getApplicationContext(), "Hola esto es un toast",Toast.LENGTH_SHORT).show();
                break;
            case R.id.busqueda:

                Uri uri1 = Uri.parse("http://www.google.com.ar/");
                Intent intent1 = new Intent(Intent.ACTION_VIEW, uri1);
                startActivity(intent1);


            default:
                break;

        }

    }

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    public Action getIndexApiAction() {
        Thing object = new Thing.Builder()
                .setName("Estudiante Page") // TODO: Define a title for the content shown.
                // TODO: Make sure this auto-generated URL is correct.
                .setUrl(Uri.parse("http://[ENTER-YOUR-URL-HERE]"))
                .build();
        return new Action.Builder(Action.TYPE_VIEW)
                .setObject(object)
                .setActionStatus(Action.STATUS_TYPE_COMPLETED)
                .build();
    }

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        AppIndex.AppIndexApi.start(client, getIndexApiAction());
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        AppIndex.AppIndexApi.end(client, getIndexApiAction());
        client.disconnect();
    }
}

