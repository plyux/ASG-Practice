package ua.com.solidpart.asg.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import ua.com.solidpart.asg.R;

/**
 * Created by lenin on 12.04.2016.
 */
public class ForgotFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView  = inflater.inflate(R.layout.forgot_fragment, container, false);

        return rootView;
    }
}
