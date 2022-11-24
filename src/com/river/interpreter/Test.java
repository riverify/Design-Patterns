package com.river.interpreter;

/**
 * @Classname Test
 * @Date 2022/11/24 15:23
 * @Created by river
 *
 * @Description 测试类
 * 使用解释器模式实现一个简单的解释器，
 * 用于解释一段字符串，字符串中包含0和1，0代表假，1代表真，字符串中包含与运算和或运算(不考虑优先级)
 */
public class Test {
    public static void main(String[] args) {
        // 给出一个表达式
        String input = "1 and 0 or 1 and 1";

        // 构建解释器
        Context context = new Context();

        // 构建语法树
        context.parse(input);

        // 执行解释操作
        System.out.println(input + " = " + context.interpret());

        // 输入结果：1 and 0 or 1 and 1
        // 输出结果：1 and 0 or 1 and 1 = 1

    }
}
