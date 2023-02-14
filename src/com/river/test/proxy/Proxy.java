package com.river.test.proxy;

/**
 * <p>Project: design-patterns - Proxy
 * <p>Powered by river On 2023/02/15 12:17 AM
 *
 * @author Riverify
 * @version 1.0
 * @since JDK17
 */
public class Proxy implements IMovie {

    IMovie movie;

    public Proxy(IMovie movie) {
        this.movie = movie;
    }

    @Override
    public void watch() {
        movie.watch();
        ad();
    }

    public void ad() {
        System.out.println("广告时间：用手机，我只用华为13Pro Max");
    }
}
