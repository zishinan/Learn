package com.ouyang.rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ImplWorld extends UnicastRemoteObject implements IWorld {

	private static final long serialVersionUID = 5638534684282024442L;

	protected ImplWorld() throws RemoteException {
		super();
	}

	@Override
	public String getHelloWorld() {
		return "World !!!";
	}

}
