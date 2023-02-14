package com.river.test.chain;

/**
 * <p>Project: design-patterns - RustProblem
 * <p>Powered by river On 2023/02/15 1:45 AM
 *
 * @author Riverify
 * @version 1.0
 * @since JDK17
 */
public class RustProblem extends Problem {

    @Override
    public void solve(String massage) {
        if (massage.equals("rust")) {
            System.out.println("解决java问题");
        } else {
            System.out.println("No way");
        }
    }
}
