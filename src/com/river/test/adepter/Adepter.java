package com.river.test.adepter;

/**
 * <p>Project: design-patterns - adepter
 * <p>Powered by river On 2023/02/15 1:16 AM
 *
 * @author Riverify
 * @version 1.0
 * @since JDK17
 */
public class Adepter extends Adeptee implements Target {
    @Override
    public void request() {
        noRelatedMethod();
        System.out.println("哈哈");
    }
}
