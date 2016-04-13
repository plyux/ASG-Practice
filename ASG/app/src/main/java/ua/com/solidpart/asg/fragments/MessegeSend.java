package ua.com.solidpart.asg.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import ua.com.solidpart.asg.R;

/**
 * Created by lenin on 13.04.2016.
 */
public class MessegeSend extends Fragment{

    private String mail;

    public MessegeSend() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView  = inflater.inflate(R.layout.messege_send_fragment, container, false);
        return rootView;
    }
}
