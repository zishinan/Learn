package com.test.ouyang;

import org.junit.Before;
import org.junit.Test;

import com.ouyang.util.file.PropertiesUtil;


public class RmiPropertyTest {

	@Before
	public void beforeTest() {
		PropertiesUtil.loadAll();
	}
	
	@Test
	public void testProperty() throws Exception {
		System.out.println();
		String ip = PropertiesUtil.getProperty("rmi.ip");
		System.out.println(ip);
		String port = PropertiesUtil.getProperty("rmi.port");
		System.out.println(port);
	}
	
}
