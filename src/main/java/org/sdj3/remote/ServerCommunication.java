package org.sdj3.remote;

import org.sdj3.model.Car;
import shared.CarPartDAO;
import shared.CarPartDTO;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.ArrayList;
import java.util.Collection;

public class ServerCommunication {
    private static CarPartDAO server;
    private static final int PORT = 5000;
    private static final String STUB_NAME = "dbServer";

    static{
        CarPartDAO server1;
        try {
            Registry registry = LocateRegistry.getRegistry("localhost", PORT);
            server1 = (CarPartDAO) registry.lookup(STUB_NAME);
        }  catch (NotBoundException e) {
            server1 = null;
            e.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
            server1 = null;
        }
        server = server1;
    }

    public static Collection<CarPartDTO> getCarParts(int chassisNo){
        Collection<CarPartDTO> partsList;
        try {
            partsList =  server.trackCarParts(chassisNo);
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
