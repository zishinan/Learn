package com.ouyang.rmi;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import com.ouyang.util.RmiUtil;

public class RmiClient {
	public static void main(String[] args) {
		try {
			System.out.println(IHello.class.getName());
			IHello hello = (IHello)Naming.lookup(RmiUtil.getPath()+IHello.class.getName());
			String hw = hello.getHelloWorld();
			System.out.println(hw);
			
			IWorld world = (IWorld) Naming.lookup(IWorld.RMI_PATH);
			String wd = world.getHelloWorld();
			System.out.println(wd);
		} catch (MalformedURLException | RemoteException | NotBoundException e) {
			e.printStackTrace();
		}
	}
}
