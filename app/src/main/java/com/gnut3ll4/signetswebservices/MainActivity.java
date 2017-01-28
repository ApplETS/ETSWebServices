package com.gnut3ll4.signetswebservices;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import ca.etsmtl.applets.etswebservices.core.soap.IServiceEvents;
import ca.etsmtl.applets.etswebservices.core.soap.OperationResult;
import ca.etsmtl.applets.etswebservices.signets.soap.SignetsMobileSoap;


public class MainActivity extends AppCompatActivity implements IServiceEvents {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SignetsMobileSoap signetsMobileSoap = new SignetsMobileSoap(this);

        signetsMobileSoap.donneesAuthentificationValidesAsync("test", "test");
    }

    @Override
    public void Starting() {
        Log.i("SignetsWebServices", "START : SOAP request starting");
    }

    @Override
    public void Completed(OperationResult result) {
        Log.e("SignetsWebServices", "COMPLETED : " + result.Result.toString());
    }
}
