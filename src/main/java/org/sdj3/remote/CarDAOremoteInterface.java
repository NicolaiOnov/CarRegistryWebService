package org.sdj3.remote;

import org.sdj3.model.Car;

import java.rmi.RemoteException;

public interface CarDAOremoteInterface {
    boolean saveCar(Car car) throws RemoteException;
}
