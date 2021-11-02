package com.chris.jenkinsdemo;

public class HelloJenkins {
	
	private final long id;
	private final String content;

	public HelloJenkins(long id, String content) {
		this.id = id;
		this.content = content;
	}

	public long getId() {
		return id;
	}

	public String getContent() {
		return content;
	}
}


