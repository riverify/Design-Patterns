package com.river.test.chain;

/**
 * <p>Project: design-patterns - Problem
 * <p>Powered by river On 2023/02/15 1:38 AM
 *
 * @author Riverify
 * @version 1.0
 * @since JDK17
 */
public abstract class Problem {
    Problem next;

    public void setNext(Problem next) {
        this.next = next;
    }

    public abstract void solve(String massage);
}
