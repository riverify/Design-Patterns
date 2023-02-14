package com.river.test.chain;

/**
 * <p>Project: design-patterns - Client
 * <p>Powered by river On 2023/02/15 1:45 AM
 *
 * @author Riverify
 * @version 1.0
 * @since JDK17
 */
public class Client {
    public static void main(String[] args) {
        JavaProblem javaProblem = new JavaProblem();
        RustProblem rustProblem = new RustProblem();
        javaProblem.setNext(rustProblem);

        javaProblem.solve("java");
    }
}
