package com.river.test.abstract_factory;

/**
 * <p>Project: design-patterns - AbstractFactory
 * <p>Powered by river On 2023/02/11 7:58 PM
 *
 * @author Riverify
 * @version 1.0
 * @since JDK17
 */
public interface AbstractFactory {
    Phone producePhone();

    Pad producePad();
}

interface Phone {
    void show();
}

interface Pad {
    void show();
}

class ApplePhone implements Phone {
    @Override
    public void show() {
        System.out.println("IPhone");
    }
}

class HuaweiPhone implements Phone {
    @Override
    public void show() {
        System.out.println("Huawei Mate");
    }
}

class ApplePad implements Pad {
    @Override
    public void show() {
        System.out.println("IPad");
    }
}

class HuaweiPad implements Pad {
    @Override
    public void show() {
        System.out.println("Huawei Pad");
    }
}

class AppleFactory implements AbstractFactory {

    @Override
    public Phone producePhone() {
        return new ApplePhone();
    }

    @Override
    public Pad producePad() {
        return new ApplePad();
    }
}

class HuaweiFactory implements AbstractFactory {

    @Override
    public Phone producePhone() {
        return new HuaweiPhone();
    }

    @Override
    public Pad producePad() {
        return new HuaweiPad();
    }
}

class Demo {
    public static void main(String[] args) {
        AppleFactory appleFactory = new AppleFactory();
        Phone iphone = appleFactory.producePhone();
        iphone.show();
    }
}
