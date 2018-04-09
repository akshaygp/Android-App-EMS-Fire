package name.karunya.akshay.emsfire;

import android.app.Application;

import com.firebase.client.Firebase;


/**
 * Created by akshay on 27-03-2017.
 */

public class EMSFire extends Application {
    @Override
    public void onCreate() {
        super.onCreate();



        Firebase.setAndroidContext(this);





    }
}
