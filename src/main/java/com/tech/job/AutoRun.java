package com.tech.job;

import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@EnableScheduling
public class AutoRun {

	@Scheduled(fixedRate = 5000)
	public void testProcess() {
		System.out.println("testProcess ::");
	}
}
