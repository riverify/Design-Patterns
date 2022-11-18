package com.river.homework5;

import java.io.Serializable;

public class Address implements Serializable {

    private static final long serialVersionUID = 2399247200484692257L;


    private String addressInfo;

    public Address(String addressInfo){
        this.addressInfo = addressInfo;
    }

    public String getAddressInfo(){
        return addressInfo;
    }

    public void setAddressInfo(String addressInfo){
        this.addressInfo = addressInfo;
    }
}
