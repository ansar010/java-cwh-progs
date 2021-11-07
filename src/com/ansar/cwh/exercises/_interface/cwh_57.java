package com.ansar.cwh.exercises._interface;

interface Camera {
    void takeSnap();
    default void log(){
        System.out.println("Camera log");
    }
}

interface myWifi {
    String[] getNetworks();

    void chooseNetwork(String networkName);
    default void log(){
        System.out.println("Camera log");
    }
}

class MyCellPhone {
    void callNumber(int phoneNumber) {
        System.out.println("Calling to : " + phoneNumber);
    }

    void callConnecting() {
        System.out.println("Connecting the call..");
    }
}

class MySmartPhone extends MyCellPhone implements myWifi,Camera {

    @Override
    public void takeSnap() {

    }

    @Override
    public String[] getNetworks() {
        return new String[0];
    }

    @Override
    public void chooseNetwork(String networkName) {

    }

    @Override
    public void log() {

    }
}

public class cwh_57 {

}
