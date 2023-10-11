package com.pluralsight;

public class CellPhone {
    private int serialNumber;
    private String modelPhone;
    private String carrier;
    private String phoneNumber;
    private String owner;

    public CellPhone()
    {
        this.serialNumber = 0;
        this.modelPhone = "";
        this.carrier = "";
        this.phoneNumber = "";
        this.owner = "";
    }
    public int getSerialNumber() {
        return serialNumber;
    }
   public String getModelPhone() {
        return modelPhone;
    }
    public String getCarrier() {
        return carrier;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public String getOwner() {
        return owner;
    }
    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }
    public void setModelPhone(String modelPhone){
        this.modelPhone = modelPhone;
    }
    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public void setOwner(String owner) {
        this.owner = owner;
    }
}
