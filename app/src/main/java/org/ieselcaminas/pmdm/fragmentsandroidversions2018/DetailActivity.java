package org.ieselcaminas.pmdm.fragmentsandroidversions2018;

import android.content.Intent;
import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getResources().getConfiguration().orientation ==
                Configuration.ORIENTATION_LANDSCAPE) {
            finish();
            return;
        }

        setContentView(R.layout.detail_layout);

        Intent intent = getIntent();
        AndroidVersion androidVersion = (AndroidVersion) (intent.getExtras().getSerializable("android_version"));
        DetailFragment detailfragment = (DetailFragment) getSupportFragmentManager()
                .findFragmentById(R.id.fragmentDetail);
        if (androidVersion!=null) {
            detailfragment.setAndroidVersion(androidVersion);
        }
    }
}
