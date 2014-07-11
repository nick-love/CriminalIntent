package com.bignerdranch.android.criminalintent.criminalintent;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;


public class CrimeActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crime);
        
        FragmentManager fm = getSupportFragmentManager(); //7.10
        Fragment fragment = fm.findFragmentById(R.id.fragmentContainer); //7.11
        
        if (fragment == null){
        	fragment = new CrimeFragment();
        	fm.beginTransaction()
        		.add(R.id.fragmentContainer, fragment)
        		.commit();
        }
    }
}