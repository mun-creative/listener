package com.medha.listener;

import java.util.List;

import org.springframework.batch.core.ItemWriteListener;

import com.medha.model.User;

public class WriterListener implements ItemWriteListener<User>{

	

	@Override
	public void afterWrite(List<? extends User> arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beforeWrite(List<? extends User> arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onWriteError(Exception arg0, List<? extends User> arg1) {
		// TODO Auto-generated method stub
		
	}

	
	

}
