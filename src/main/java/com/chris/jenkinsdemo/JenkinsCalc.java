package com.chris.jenkinsdemo;


import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/** Calculator logic */
@Service
public class JenkinsCalc {
	@Cacheable("sum")
	public int sum(int a, int b) {
		return a + b;
	}

}
