package name.karunya.akshay.emsfire;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;


public class emergency extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emergency);

        ImageButton imgbtn1 = (ImageButton)findViewById(R.id.imgbtn1);
        ImageButton imgbtn2 = (ImageButton)findViewById(R.id.imgbtn2);
        ImageButton imgbtn3 = (ImageButton)findViewById(R.id.imgbtn3);
        ImageButton imgbtn4 = (ImageButton)findViewById(R.id.imgbtn4);
        ImageButton imgbtn5 = (ImageButton)findViewById(R.id.imgbtn5);
        Button backbut1 = (Button)findViewById(R.id.backbut1);

        backbut1.setOnClickListener(this);
        imgbtn1.setOnClickListener(this);
        imgbtn2.setOnClickListener(this);
        imgbtn3.setOnClickListener(this);
        imgbtn4.setOnClickListener(this);
        imgbtn5.setOnClickListener(this);



    }
    public void onClick(View v){
        switch(v.getId()) {
            case R.id.backbut1:
                Intent t = new Intent(emergency.this, First.class);
                startActivity(t);
                break;
            case R.id.imgbtn1:
                Intent t1 = new Intent(emergency.this, Prepare.class);
                startActivity(t1);
                break;
            case R.id.imgbtn2:
                Intent t2 = new Intent(emergency.this, Discovery.class);
                startActivity(t2);
                break;
            case R.id.imgbtn3:
                Intent t3 = new Intent(emergency.this, Evacuation.class);
                startActivity(t3);
                break;
            case R.id.imgbtn4:
                Intent t4 = new Intent(emergency.this, Extinguishers.class);
                startActivity(t4);
                break;
            case R.id.imgbtn5:
                Intent t5 = new Intent(emergency.this, Clothing.class);
                startActivity(t5);
                break;
        }
    }
}
