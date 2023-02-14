package com.river.test.proxy;

/**
 * <p>Project: design-patterns - Movie
 * <p>Powered by river On 2023/02/15 12:13 AM
 *
 * @author Riverify
 * @version 1.0
 * @since JDK17
 */
public class Movie implements IMovie {

    @Override
    public void watch() {
        System.out.println("开始播放《战狼2》");
    }
}
