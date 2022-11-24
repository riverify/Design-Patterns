package com.river.interpreter;

/**
 * @Classname OrNode
 * @Date 2022/11/24 14:38
 * @Created by river
 *
 * @Description 或节点类
 */
public class OrNode implements Node {
    /** 左表达式 */
    private Node left;
    /** 右表达式 */
    private Node right;

    /**
     * 构造方法
     * @param left 左表达式
     * @param right 右表达式
     */
    public OrNode(Node left, Node right) {
        this.left = left;
        this.right = right;
    }

    /**
     * 解释方法，对左、右表达式进行解释，然后进行或运算，即如果左表达式和右表达式都为0，则返回0，否则返回1
     * @return 返回或运算的结果
     */
    @Override
    public int interpret() {
        if (left.interpret() == 1 || right.interpret() == 1) {
            return 1;
        } else {
            return 0;
        }
    }
}
