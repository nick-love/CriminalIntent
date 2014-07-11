package com.bignerdranch.android.criminalintent.criminalintent;

import java.util.Date;
import java.util.UUID;

public class Crime {

	private UUID mId;
	private String mTitle;
	private Date mDate;
	private boolean mSolved;
	
	public Crime() {
		// Generate unique identifier
		mId = UUID.randomUUID();
		mDate = new Date();	//8.2
	}

	
	
	public Date getDate() {
		return mDate;
	}


	public void setDate(Date date) {
		this.mDate = date;
	}


	public boolean isSolved() {
		return mSolved;
	}


	public void setSolved(boolean Solved) {
		this.mSolved = Solved;
	}


	public String getTitle() {
		return mTitle;
	}

	public void setTitle(String Title) {
		this.mTitle = Title;
	}

	public UUID getId() {
		return mId;
	}
}
