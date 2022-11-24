package com.river.interpreter;

/**
 * @Classname AndNode
 * @Date 2022/11/24 14:32
 * @Created by river
 *
 * @Description 与节点类
 */
public class AndNode implements Node {
    /** 左表达式 */
    private Node left;
    /** 右表达式 */
    private Node right;

    /**
     * 构造方法
     * @param left 左表达式
     * @param right 右表达式
     */
    public AndNode(Node left, Node right) {
        this.left = left;
        this.right = right;
    }


    /**
     * 解释方法，对左、右表达式进行解释，然后进行与运算，即如果左表达式和右表达式都为1，则返回1，否则返回0
     * @return 返回与运算的结果
     */
    @Override
    public int interpret() {
        if (left.interpret() == 1 && right.interpret() == 1) {
            return 1;
        } else {
            return 0;
        }
    }
}
