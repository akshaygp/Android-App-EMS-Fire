package name.karunya.akshay.emsfire;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.firebase.client.Firebase;
import com.google.android.gms.common.api.GoogleApiClient;

public class First extends AppCompatActivity implements View.OnClickListener {


    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;
    public Firebase mRef;
String Value;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        Button b2 = (Button) findViewById(R.id.b2);
        Button b3 = (Button) findViewById(R.id.b3);
        Button b1 = (Button) findViewById(R.id.b1);
        Button b4 = (Button) findViewById(R.id.b4);

        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b1.setOnClickListener(this);
        b4.setOnClickListener(this);
    }





    public void onClick(View v) {
        switch(v.getId()) {
            case R.id.b1:
                Intent t0 = new Intent(First.this, MainActivity.class);
                startActivity(t0);
                break;
            case R.id.b2:
                Intent t1 = new Intent(First.this, contacts.class);
                startActivity(t1);
                break;
            case R.id.b3:
                Intent t2 = new Intent(First.this, emergency.class);
                startActivity(t2);
                break;
            case R.id.b4:
                Intent t3 = new Intent(First.this, MapsActivity1.class);
                startActivity(t3);
                break;

        }


    }

}

