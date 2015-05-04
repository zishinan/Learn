package com.ouyang.util;

import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;

public class RmiUtil {
	public static Remote lookup(String simpleName) throws MalformedURLException, RemoteException, NotBoundException{
		return Naming.lookup(getPath()+simpleName);
	}
	
	public static void bind(String simpleName,Remote object) throws MalformedURLException, RemoteException, AlreadyBoundException{
		Naming.bind(RmiUtil.getPath()+simpleName, object);
	}

	private static String getPath() {
		return "rmi://"+PropertiesUtil.getProperty("rmi.ip")+":"+PropertiesUtil.getProperty("rmi.port")+"/";
	}

	public static int getPort() {
		return Integer.parseInt(PropertiesUtil.getProperty("rmi.port"));
	}
	
}
