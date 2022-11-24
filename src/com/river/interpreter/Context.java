package com.river.interpreter;

import java.security.PublicKey;
import java.util.Stack;

/**
 * @Classname Context
 * @Date 2022/11/24 14:44
 * @Created by river
 *
 * @Description 上下文类
 */
public class Context {
    /** 定义一个字符串，用于存储上下文信息 */
    private String input;
    /** 定义节点对象，用于存储解释后的抽象语法树 */
    private Node node;

    /**
     * 解析方法，用于解析上下文信息，生成抽象语法树，如 1 and 0 or 1 and 1，解析后生成的抽象语法树为: 1
     * @param input 上下文信息
     */
    public void parse(String input) {

        // 创建左、右节点
        Node left = null;
        Node right = null;

        // 创建一个栈对象，用于存储抽象语法树
        Stack<Node> stack = new Stack<>();

        // 将字符串转换为字符数组
        String[] inputArr = input.split(" ");

        // 遍历字符数组　不考虑优先级，即非终结符只有一个
        for (int i = 0; i < inputArr.length; i++) {

            // 如果字符为"and"
            if ("and".equals(inputArr[i])) {
                // 弹出一个节点，作为AndNode的左节点
                left = stack.pop();

                // 获取下一个值，作为AndNode的右节点
                int value = Integer.parseInt(inputArr[++i]);
                right = new ValueNode(value);

                // 创建一个AndNode对象，并将左右节点设置为AndNode的左右节点，再将这个AndNode对象压入栈中
                stack.push(new AndNode(left, right));

            // 如果字符为"or"
            } else if ("or".equals(inputArr[i])) {
                // 弹出一个节点，作为OrNode的左节点
                left = stack.pop();

                // 获取下一个值，作为OrNode的右节点
                int value = Integer.parseInt(inputArr[++i]);
                right = new ValueNode(value);

                // 创建一个OrNode对象，并将左右节点设置为OrNode的左右节点，再将这个OrNode对象压入栈中
                stack.push(new OrNode(left, right));

            } else {
                // 如果字符为"0"或者"1"，则创建一个ValueNode对象，并将这个ValueNode对象压入栈中
                int value = Integer.parseInt(inputArr[i]);
                stack.push(new ValueNode(value));
            }
        }

        // 将栈中的节点赋值给node
        this.node = stack.pop();
    }

    public int interpret() {
        return this.node.interpret();
    }
}
