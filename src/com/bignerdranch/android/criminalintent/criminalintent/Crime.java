package com.bignerdranch.android.criminalintent.criminalintent;

import java.util.UUID;

public class Crime {

	private UUID mId;
	private String mTitle;
	
	public Crime() {
		// Generate unique identifier
		mId = UUID.randomUUID();
	}

	public String getmTitle() {
		return mTitle;
	}

	public void setmTitle(String mTitle) {
		this.mTitle = mTitle;
	}

	public UUID getmId() {
		return mId;
	}
}
