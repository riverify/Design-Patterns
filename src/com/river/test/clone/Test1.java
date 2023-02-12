package com.river.test.clone;

/**
 * <p>Project: design-patterns - Test1
 * <p>Powered by river On 2023/02/12 5:16 PM
 *
 * @author Riverify
 * @version 1.0
 * @since JDK17
 */
public class Test1 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Wife wife = new Wife(new Params(18, 162));
        System.out.println(wife);
        Object clone1 = wife.clone();
        wife.getParams().setAge(24);
        System.out.println(clone1);
    }
}
