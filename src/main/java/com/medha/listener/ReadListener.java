package com.medha.listener;

import org.springframework.batch.core.ItemReadListener;

import com.medha.model.User;

public class ReadListener implements ItemReadListener<User>{

	@Override
	public void afterRead(User arg0) {
		// TODO Auto-generated method stub
		
		System.out.println("***After Reading and Item*****"+arg0.toString());
		
	}

	@Override
	public void beforeRead() {
		// TODO Auto-generated method stub
		System.out.println("***Before Reading and Item*****");
	}

	@Override
	public void onReadError(Exception arg0) {
		// TODO Auto-generated method stub
		
		System.out.println("***Error occured while reading and item*****");
		
	}

	

}
