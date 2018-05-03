package org.sdj3.remote;

import org.sdj3.model.PartType;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Collection;

public interface CarPartDAO extends Remote {
    CarPartDTO insertCarPart(double weight, int chassisNo, String model, PartType type) throws RemoteException;
    Collection<CarPartDTO> readAllCarParts() throws RemoteException;
    void updateCarPart(CarPartDTO carPart) throws RemoteException;
    void updateCarPartReferenceToPallet(int partID, int palletNo) throws RemoteException;
    void updateCarPartReferenceToPackage(int partID, int packageNo) throws RemoteException;
    void deleteCarPart(CarPartDTO carPart) throws RemoteException;
    CarPartDTO readCarPart(int id) throws RemoteException;
    CarPartDTO readCarPartByType(PartType type) throws RemoteException;
    CarPartDTO readCarPartByTypeAndModel(PartType type, String model) throws RemoteException;
}