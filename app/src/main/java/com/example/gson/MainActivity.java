package com.example.gson;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.gson.Gson;
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;

import cz.msebera.android.httpclient.Header;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    Response responseObj;
    CustomAdapter adapter;
    String origin = "valby st";
    String destination= "Dyssegård st";

    String mode="transit";
    String departure_time= String.valueOf(System.currentTimeMillis()+1000000);
    //Test
    // &arrival_time=1462479888
    String test= "https://maps.googleapis.com/maps/api/directions/json?origin=valby&destination=dysseg%C3%A5rd&arrival_time=1462479888&mode=transit&key=AIzaSyDPx6zlmEEAbqUdX8Gr7tlxNips9Ld5cI4";
    String url = "https://maps.googleapis.com/maps/api/directions/json?origin=valby&destination=dysseg%C3%A5rd&mode=transit&key=AIzaSyDPx6zlmEEAbqUdX8Gr7tlxNips9Ld5cI4";
    Gson gson;
    AsyncHttpClient client;
    private GoogleApiClient client2;
    String startAdress;
    private String endDestination;
    String arrival_time;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Log.i( "departure_time ",departure_time);
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Main2Activity.class);

                // lad være med at ændre på det der står inde i "", det skal være det samme i modtager activitien. ("startAdress",startAdress)

                intent.putExtra("startAdress",startAdress);
                intent.putExtra("arrival_time",arrival_time);
                intent.putExtra("endDestination",endDestination);

                // shtart the new activity
                startActivity(intent);

                /*Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();*/
            }
        });

        listView = (ListView) findViewById(R.id.moovielist);
        // instatiate client.
        client = new AsyncHttpClient();

        // when you fill out this one, it auto maticly creates the to inner overidden methods.
        client.get(MainActivity.this, url, new AsyncHttpResponseHandler() {
            @Override
            public void onSuccess(int statusCode, Header[] headers, byte[] responseBody) {
                String responestr = new String(responseBody);

                // instatiate gson object.
                gson = new Gson();
                responseObj = gson.fromJson(responestr,Response.class);
                //Main2Activity obj = new Main2Activity(responseObj);
                // the actual api calls
                startAdress =responseObj.getRoutes().get(0).getLegs().get(0).getStart_address();
                endDestination =responseObj.getRoutes().get(0).getLegs().get(0).getEnd_address();
                // husk man kan få arrival time i unix eller i am/pm
                arrival_time = String.valueOf(responseObj.getRoutes().get(0).getLegs().get(0).getArrival_time().getValue());

                Log.i("startAdress", startAdress);
                //adapter = new CustomAdapter(MainActivity.this, responseObj.getRoutes());
                //listView.setAdapter(adapter);
            }

            @Override
            public void onFailure(int statusCode, Header[] headers, byte[] responseBody, Throwable error) {

            }
        });
        client2 = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();


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
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client2.connect();
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Main Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app URL is correct.
                Uri.parse("android-app://com.example.gson/http/host/path")
        );
        AppIndex.AppIndexApi.start(client2, viewAction);
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Main Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app URL is correct.
                Uri.parse("android-app://com.example.gson/http/host/path")
        );
        AppIndex.AppIndexApi.end(client2, viewAction);
        client2.disconnect();
    }
}
