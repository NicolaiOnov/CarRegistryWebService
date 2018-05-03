package org.sdj3.remote;

import org.sdj3.model.Car;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Collection;

public class ServerCommunication {
    private static CarPartDAO server;
    private static final String PORT = "1099";
    private static final String STUB_NAME = "dbserver";

    static{
        CarPartDAO server1;
        try {
            server1 = (CarPartDAO) Naming.lookup("rmi://localhost:"
                                                                        + PORT + "/" +
                                                                                STUB_NAME);
        } catch (NotBoundException e) {
            server1 = null;
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
            server1 = null;
        } catch (RemoteException e) {
            e.printStackTrace();
            server1 = null;
        }
        server = null;
    }

    public static Collection<CarPartDTO> getCarParts(int chassisNo){
        Collection<CarPartDTO> partsList;
        try {
            partsList =  server.readAllCarParts();
        } catch (RemoteException e) {
            System.out.println("Could not get Car Part records from DB");
            e.printStackTrace();
            return null;
        }
        return partsList;
    }

    private static final ArrayList<Car> dummyDB = new ArrayList<Car>();

    public static boolean saveCarToDummyDB(Car car){
        dummyDB.add(car);
        System.out.println("Car saved" + car);
        return true;
    }
}
