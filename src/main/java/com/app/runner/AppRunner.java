package com.app.runner;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class AppRunner implements CommandLineRunner {

	@Value("${my.appname}")
	private String appName;
	
	@Value("${my.db.driver}")
	private String driver;
	
	@Value("${my.db.url}")
	private String url;
	
	@Value("${my.email.host}")
	private String host;
	
	@Value("${my.email.port}")
	private int port;
	
	public void run(String... args) throws Exception {
		System.out.println(this);
	}

	@Override
	public String toString() {
		return "AppRunner [appName=" + appName + ", driver=" + driver + ", url=" + url + ", host=" + host + ", port="
				+ port + "]";
	}

}
