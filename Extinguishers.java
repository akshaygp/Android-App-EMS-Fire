package name.karunya.akshay.emsfire;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class Extinguishers extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_extinguishers);
        Button backbut5 = (Button)findViewById(R.id.backbut5);

        backbut5.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()) {
            case R.id.backbut5:
                Intent t = new Intent(Extinguishers.this, emergency.class);
                startActivity(t);
                break;
        }
    }
}
