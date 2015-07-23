package com.ouyang.rmi;

import java.rmi.registry.LocateRegistry;

import com.ouyang.util.file.PropertiesUtil;
import com.ouyang.util.net.RmiUtil;

public class RmiServer {
	public static void main(String[] args) {
		try {
			PropertiesUtil.loadAll();
			LocateRegistry.createRegistry(RmiUtil.getPort());
			IHello hello = new ImplHello();
			RmiUtil.bind(IHello.class.getSimpleName(), hello);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
