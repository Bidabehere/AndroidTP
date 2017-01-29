

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import android.net.Uri;
import android.widget.Button;
import android.widget.Toast;

import com.bidabehere.DS.finaltp10.R;
import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;


public class Registro extends AppCompatActivity implements View.OnClickListener {
    Button boton1;
    Button boton2;


    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_registro);

        Button boton11 = (Button) findViewById(R.id.boton1);
        boton11.setOnClickListener(this);

        Button boton12 = (Button) findViewById(R.id.boton2);
        boton12.setOnClickListener(this);




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


        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();

    }




    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.boton1:


                Toast.makeText(getApplicationContext(), "Fue registrado",Toast.LENGTH_SHORT).show();
                break;

            case R.id.boton2:

                 setContentView(R.layout.activity_estudiante);

                //Toast.makeText(getApplicationContext(), "Hola esto es un toast",Toast.LENGTH_SHORT).show();
                break;

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

