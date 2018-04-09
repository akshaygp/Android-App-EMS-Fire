package name.karunya.akshay.emsfire;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class Evacuation extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_evacuation);
        Button backbut4 = (Button)findViewById(R.id.backbut4);

        backbut4.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()) {
            case R.id.backbut4:
                Intent t = new Intent(Evacuation.this, emergency.class);
                startActivity(t);
                break;
        }
    }
}
