package com.tech.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.stereotype.Service;

@Service
@EnableAsync
public class AsyncService {

	@Async
	public void process() {
		System.out.println("This method will be excuted in asynchronous manner");
		for(int i=0;i<100000;i++) {
			System.out.println("running"+i);
		}
	}
}
