package com.jo.project01.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.jo.project01.R;

/**
 * Created by jo on 2016-01-25.
 */
public class MainFragment extends Fragment {
    private View wholeView = null;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle date){
        wholeView = inflater.inflate(R.layout.fragment_growinfo, null);
        return wholeView;
    }

    @Override
    public void onResume(){
        super.onResume();
        makeView();
    }

    public void onPause(){
        super.onPause();
    }

    private void makeView(){
        ((Button)wholeView.findViewById(R.id.btnMainLogin)).setOnClickListener(click);

    }

    View.OnClickListener click = new View.OnClickListener(){
        @Override
        public void onClick(View v){
            int id = v.getId();

            if(id == R.id.btnMainLogin);
        }

    };

}