package org.ieselcaminas.pmdm.fragmentsandroidversions2018;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class DetailFragment extends Fragment {


    public DetailFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.detail_fragment, container, false);
    }

    // we call this method when button from listfragment is clicked
    public void setAndroidVersion(AndroidVersion androidVersion) {
        TextView detailName = (TextView) getView().findViewById(R.id.detailName);
        detailName.setText(androidVersion.getVersionName());
        TextView detailNumber = (TextView) getView().findViewById(R.id.detailNumber);
        detailNumber.setText(androidVersion.getVersionNumber());
        TextView detailText = (TextView) getView().findViewById(R.id.detailText);
        detailText.setText(androidVersion.getText());
        ImageView im = (ImageView) getView().findViewById(R.id.detailImageView);
        im.setImageDrawable(getResources().getDrawable(androidVersion.getImage()));
    }

}
