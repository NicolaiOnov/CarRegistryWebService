package org.sdj3.remote;

import org.sdj3.model.Car;
import org.sdj3.remote.CarDAOremoteInterface;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.ArrayList;

public class ServerCommunication {
    private static CarDAOremoteInterface server;

    private static final ArrayList<Car> dummyDB = new ArrayList<Car>();

    public static boolean saveCarToDummyDB(Car car){
        dummyDB.add(car);
        System.out.println("Car saved" + car);
        return true;
    }

//    static{
//        CarDAOremoteInterface server1;
//        try {
//            server1 = (CarDAOremoteInterface) Naming.lookup("rmi://localhost:1099/registryServer");
//        } catch (NotBoundException e) {
//            server1 = null;
//            e.printStackTrace();
//        } catch (MalformedURLException e) {
//            e.printStackTrace();
//            server1 = null;
//        } catch (RemoteException e) {
//            e.printStackTrace();
//            server1 = null;
//        }
//        server = null;
//    }
}
