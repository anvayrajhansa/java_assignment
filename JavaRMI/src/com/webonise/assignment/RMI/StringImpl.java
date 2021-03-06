package com.webonise.assignment.RMI;

import java.rmi.*;
import java.rmi.server.*;

/**
 * @author Anvay this class implements StringIntf() interface and gives the
 *         definition for method check(). 
 */
@SuppressWarnings("serial")
public class StringImpl extends UnicastRemoteObject implements StringIntf {

	protected StringImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	/*
	 * (non-Javadoc)
	 * @see com.webonise.assignment.RMI.StringIntf#check(java.lang.String) this
	 * method accept string given by user and check where the given string is
	 * well parenthesis or not
	 */
	public int check(String myStr) throws RemoteException {

		char myArr[] = myStr.toCharArray();
		int count = 0;

		for (int i = 0; i < myArr.length; i++) {
			if (myArr[i] == '(')
				count++;
			if (myArr[i] == ')')
				count--;
		}

		return count;
	}
}
