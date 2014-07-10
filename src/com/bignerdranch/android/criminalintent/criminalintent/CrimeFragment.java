package com.bignerdranch.android.criminalintent.criminalintent;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

public class CrimeFragment extends Fragment {
	private Crime mCrime;	//7.7
	private EditText mTitleField;	//7.9
	
	@Override
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		mCrime = new Crime();	
	}

	//7.8 add an implementation of OnCreateView(...) that inflates fragment_crime.xml...
	@Override	
	public View onCreateView(LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState) {
		View v = inflater.inflate(R.layout.fragment_crime, parent, false);	//...7.8
		 
		//7.9 Wiring up the EditText widget
		mTitleField = (EditText)v.findViewById(R.id.crime_title);
		mTitleField.addTextChangedListener(new TextWatcher() {
			public void onTextChanged(
					CharSequence c, int start, int before, int count) {
				mCrime.setmTitle(c.toString());
			}
			
			public void beforeTextChanged(
					CharSequence c, int start, int count, int after) {
				//This space left blank
			}
			
			public void afterTextChanged(Editable c) {
				//Left blank
			}
		});
		
		return v;
	}
}
