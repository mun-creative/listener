package com.medha.listener;

import org.springframework.batch.core.ItemReadListener;

import com.medha.model.User;

public class ReadListener implements ItemReadListener<User>{

	@Override
	public void afterRead(User arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beforeRead() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onReadError(Exception arg0) {
		// TODO Auto-generated method stub
		
	}

	

}
