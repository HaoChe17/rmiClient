package rmiClient;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import rmi.MonitorInterface;

public class RMITestClient {

	public static void main(String[] args) throws MalformedURLException, RemoteException, NotBoundException {
		// TODO Auto-generated method stub
		MonitorInterface mi=(MonitorInterface)Naming.lookup("rmi://172.16.31.77:12121/mi");
		System.out.println("remote result1:"+mi.getMonitorInfo("/usr/java/jdk1.8.0_65","tomcat_pinpoint_collector","jvm,app,os"));
		System.out.println("remote result2:"+mi.getMonitorInfo("/usr/java/jdk1.7.0_79","tomcat_pinpoint_collector","jvm"));
	}

}
