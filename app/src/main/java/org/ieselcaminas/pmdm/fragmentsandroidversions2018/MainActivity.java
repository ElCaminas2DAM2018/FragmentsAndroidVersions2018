package org.ieselcaminas.pmdm.fragmentsandroidversions2018;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity
        implements ListFragmentVersions.AndroidVersionReceiver {

    private String osText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void setAndroidVersion(AndroidVersion av) {
        DetailFragment detailfragment = (DetailFragment) getSupportFragmentManager()
                .findFragmentById(R.id.fragmentDetail);
        if (detailfragment != null && detailfragment.isInLayout()) {
            detailfragment.setAndroidVersion(av);
        } else {
            Intent intent = new Intent(getApplicationContext(),
                    DetailActivity.class);
            //Bundle extras = new Bundle();
            //extras.putSerializable("android_version",av);
            //intent.putExtras(extras);
            intent.putExtra("android_version",av);
            startActivity(intent);
        }
    }

}
