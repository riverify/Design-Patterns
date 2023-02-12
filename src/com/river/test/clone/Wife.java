package com.river.test.clone;

import com.river.test.builder.Meals;

import java.io.*;

/**
 * <p>Project: design-patterns - Wife
 * <p>Powered by river On 2023/02/12 5:10 PM
 *
 * @author Riverify
 * @version 1.0
 * @since JDK17
 */
public class Wife implements Cloneable, Serializable {
    private static final long serialVersionUID = -1749390608626934689L;
    private Params params;


    public Wife(Params params) {
        this.params = params;
    }

    public Params getParams() {
        return params;
    }

    public void setParams(Params params) {
        this.params = params;
    }

    @Override
    public String toString() {
        return "Wife{" +
                "params=" + params +
                '}';
    }

    @Override
    protected Wife clone() throws CloneNotSupportedException {
        Wife clone = (Wife) super.clone();

        try {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(baos);
            objectOutputStream.writeObject(clone);

            ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
            ObjectInputStream objectInputStream = new ObjectInputStream(bais);
            Wife wife = (Wife) objectInputStream.readObject();

            return wife;

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
