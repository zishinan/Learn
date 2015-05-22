package com.ouyang.rmi;

import java.net.MalformedURLException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import com.ouyang.util.PropertiesUtil;
import com.ouyang.util.RmiUtil;

public class RmiClient {
	public static void main(String[] args) {
		try {
			PropertiesUtil.loadAll();
			IHello hello = (IHello)RmiUtil.lookup(IHello.class.getSimpleName());
			String hw = hello.getHelloWorld();
			System.out.println(hw);
			
		} catch (MalformedURLException | RemoteException | NotBoundException e) {
			e.printStackTrace();
		}
	}
}
