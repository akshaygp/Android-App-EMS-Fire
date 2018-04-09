package name.karunya.akshay.emsfire;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class Discovery extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_discovery);
        Button backbut3 = (Button)findViewById(R.id.backbut3);

        backbut3.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()) {
            case R.id.backbut3:
                Intent t = new Intent(Discovery.this, emergency.class);
                startActivity(t);
                break;
        }
    }
}
