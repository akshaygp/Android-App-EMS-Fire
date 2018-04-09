package name.karunya.akshay.emsfire;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class Clothing extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clothing);
        Button backbut6 = (Button)findViewById(R.id.backbut6);

        backbut6.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()) {
            case R.id.backbut6:
                Intent t = new Intent(Clothing.this, emergency.class);
                startActivity(t);
                break;
        }
    }
}
