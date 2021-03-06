package name.karunya.akshay.emsfire;

import android.content.pm.PackageManager;
import android.location.Address;
import android.location.Geocoder;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import java.io.IOException;
import java.util.List;

public class MapsActivity1 extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps1);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

public void onSearch(View view){
    EditText location_TF = (EditText)findViewById(R.id.TFaddress);
    String location = location_TF.getText().toString();
    List<Address> addressList = null;
    if (location!= null || !location.equals(""))
    {
        Geocoder geocoder = new Geocoder(this);
        try{
            addressList = geocoder.getFromLocationName(location , 1);

        } catch (IOException e){
            e.printStackTrace();
        }
        android.location.Address address = addressList.get(0);
        LatLng latLng = new LatLng(address.getLatitude(), address.getLongitude());
        mMap.addMarker(new MarkerOptions().position(latLng).title("Here it is:"));
        mMap.animateCamera(CameraUpdateFactory.newLatLng(latLng));
    }
}
    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng sydney = new LatLng(10.793065, 76.731001);
        mMap.addMarker(new MarkerOptions().position(sydney).title("Kanjikode Fire Station"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
        LatLng sydney1 = new LatLng(11.023355, 77.008632);
        mMap.addMarker(new MarkerOptions().position(sydney1).title("Peelameedu Fire station"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney1));
        LatLng sydney2 = new LatLng(11.176064, 77.269103);
        mMap.addMarker(new MarkerOptions().position(sydney2).title("TN Fire and Rescue"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney2));
        LatLng sydney3 = new LatLng(11.303770, 76.982082);
        mMap.addMarker(new MarkerOptions().position(sydney3).title("Mettupalayam Fire Station"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney3));

        if (ActivityCompat.checkSelfPermission(this, android.Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, android.Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {

            return;
        }
        mMap.setMyLocationEnabled(true);
    }
}
