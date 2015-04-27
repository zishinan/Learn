package com.ouyang.rmi;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

import com.ouyang.util.RmiUtil;

public class RmiServer {
	public static void main(String[] args) {
		try {
			IHello hello = new ImplHello();
			IWorld world = new ImplWorld();
			LocateRegistry.createRegistry(RmiUtil.getPort());
			Naming.bind(RmiUtil.getPath()+IHello.class.getName(), hello);
			Naming.bind(IWorld.RMI_PATH, world);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
