package com.discoveryLog.core.service.impl;

import org.apache.thrift.TException;

import com.discoveryLog.core.service.Log;
public class LogServiceImpl implements Log.Iface { 
@Override
public int log(String category, String message) throws TException {
	System.out.println(category +" message is:" +message); 
	return 100;
} 
} 
