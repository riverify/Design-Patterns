package com.river.test.chain;

/**
 * <p>Project: design-patterns - JavaProblem
 * <p>Powered by river On 2023/02/15 1:40 AM
 *
 * @author Riverify
 * @version 1.0
 * @since JDK17
 */
public class JavaProblem extends Problem {

    @Override
    public void solve(String massage) {
        if (massage.equals("java")) {
            System.out.println("解决java问题");
        } else {
            next.solve(massage);
        }
    }
}
