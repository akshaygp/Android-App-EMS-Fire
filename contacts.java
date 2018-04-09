package name.karunya.akshay.emsfire;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.firebase.client.ValueEventListener;

public class contacts extends AppCompatActivity {
    public EditText text1;
    public Button submit;
    public TextView text2;


    public Firebase mRootRef ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacts);

        mRootRef = new Firebase("https://emsfire-a806e.firebaseio.com/Users");
        text1 = (EditText)findViewById(R.id.text1);
        submit = (Button)findViewById(R.id.submit);
        text2 = (TextView)findViewById(R.id.text2);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value = text1.getText().toString();
                Firebase childRef = mRootRef.child("Number");
                childRef.setValue(value);
                mRootRef.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        String Value1 =  dataSnapshot.getValue(String.class);
                        text2.setText(Value1);
                    }

                    @Override
                    public void onCancelled(FirebaseError firebaseError) {

                    }
                });
            }
        });


    }
}
