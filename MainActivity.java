package name.karunya.akshay.emsfire;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    EditText editTextsms;
    Button buttonsms;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextsms=(EditText)findViewById(R.id.editTextsms);
        buttonsms=(Button) findViewById(R.id.buttonsms);

        buttonsms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendsms();
            }
        });

    }

    private void sendsms() {
        String number = editTextsms.getText().toString();
        String message = "Help. I am in a fire and need immediate assistance. Please contact respective athaurities.";

        SmsManager manager = SmsManager.getDefault();
        manager.sendTextMessage(number,null,message,null,null);
        Toast.makeText(getApplicationContext(),"sms sent",Toast.LENGTH_SHORT).show();
    }
}
