package com.river.proxy;

/**
 * @Author River
 * @Date 2022/11/10 17:41
 **/
public class Picture implements Subject {
    private Application application;

    /**
     * 构造方法
     */
public Picture() {
    application = new Application();
}

    @Override
    public void run() {
        application.run();
    }
}
