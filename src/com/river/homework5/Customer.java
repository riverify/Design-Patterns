package com.river.homework5;

import java.io.*;

/**
 * @author River
 */
public class Customer implements Cloneable, Serializable {

    private static final long serialVersionUID = 2399247100484692257L;
    // 存储地址
    private Address address = null;

    public Customer(String address) {
        this.address = new Address(address);
    }

    // 浅克隆方法
    @Override
    public Object clone() {
        Object obj = null;
        try {
            obj = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return obj;
    }

    // 深克隆方法
    public Object deepClone() {
        // 将对象写入流中
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // 将对象从流中取出
        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(bis);
            return ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    public Address getAddress() {
        return address;
    }
}


