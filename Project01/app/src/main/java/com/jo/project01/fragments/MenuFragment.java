package com.jo.project01.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.jo.project01.Constants;
import com.jo.project01.MainActivity;
import com.jo.project01.R;

/**
 * Created by jo on 2016-01-25.
 */
public class MenuFragment extends Fragment {

    private View wholeView = null;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle date){
        wholeView = inflater.inflate(R.layout.fragment_main, null);
        return wholeView;
    }

    @Override
    public void onResume(){
        super.onResume();
        makeView();
    }

    @Override
    public void onPause(){
        super.onPause();
    }
    //뷰관리
    private void makeView(){
        ((Button)wholeView.findViewById(R.id.btnEstimate)).setOnClickListener(click);
        ((Button)wholeView.findViewById(R.id.btnGrowthInfo)).setOnClickListener(click);
    }

    //뷰에서 일어난 이벤트

    View.OnClickListener click = new View.OnClickListener(){
        @Override
        public void onClick(View v){
            int id = v.getId();

            //2번 버튼 안보이다가 1번버튼 누르면 2번 보이게 하는
            if(id == R.id.btnEstimate);
                //1번 버튼 클릭됨
                //뷰 가져오는 방법
               // ((Button)wholeView.findViewById(R.id.btnFragmentMain02)).setVisibility(View.VISIBLE);
                //View에는 INVISIBLE, VISIBLE, GONE : 영역까지 사라지게

            else if(id == R.id.btnGrowthInfo){
                //2번 버튼
                ((MainActivity)getActivity()).moveFragment(Constants.GROWINFO);
            }
        }
    };
}