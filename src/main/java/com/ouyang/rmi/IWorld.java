package com.ouyang.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IWorld extends Remote {
	public String getHelloWorld() throws RemoteException;
}
