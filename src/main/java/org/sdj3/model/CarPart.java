package org.sdj3.model;

import shared.PartType;

public class CarPart {
    private int id;
    private double weight;
    private int chassisNo;
    private String model;
    private PartType type;
    private String partType;
    private int palletNo;
    private int packageNo;

    public String getPartType() {
        return partType;
    }

    public int getPalletNo() {
        return palletNo;
    }

    public void setPalletNo(int palletNo) {
        this.palletNo = palletNo;
    }

    public int getPackageNo() {
        return packageNo;
    }

    public void setPackageNo(int packageNo) {
        this.packageNo = packageNo;
    }

    public void setPartType(String partType) {
        this.partType = partType;
    }

    public CarPart(double weight, int chassisNo, String model, PartType type, int palletNo, int packageNo) {
        this.weight = weight;
        this.chassisNo = chassisNo;
        this.model = model;
        this.type = type;
        this.partType = type.toString();
        this.palletNo = palletNo;
        this.packageNo =packageNo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getChassisNo() {
        return chassisNo;
    }

    public void setChassisNo(int chassisNo) {
        this.chassisNo = chassisNo;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public PartType getType() {
        return type;
    }

    public void setType(PartType type) {
        this.type = type;
    }
}