package com.jo.project01;

import android.app.FragmentTransaction;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.jo.project01.fragments.GrowinfoFragment;
import com.jo.project01.fragments.MainFragment;
import com.jo.project01.fragments.MenuFragment;

public class MainActivity extends FragmentActivity{

    private android.support.v4.app.FragmentTransaction mFrgTransaction = null;

    private GrowinfoFragment mGrowinfo = null;
    private MainFragment mMain = null;
    private MenuFragment mMenu = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onResume(){
        super.onResume();
        makeView();
        moveFragment(0);
    }

    @Override
    public void onPause(){
        super.onPause();
    }

    private void makeView(){
        mMenu = new MenuFragment();
        //mGrowinfo = new GrowinfoFragment();
    }

    public void moveFragment(int type){
        mFrgTransaction = getSupportFragmentManager().beginTransaction();
        switch(type){
            case Constants.MAIN : mFrgTransaction.add(R.id.container, mMain); break;
            case Constants.GROWINFO : mFrgTransaction.replace(R.id.container, mGrowinfo); break;
            case Constants.MENU :mFrgTransaction.replace(R.id.container, mMenu); break;
            default:
        }
        mFrgTransaction.commit();
    }
}
