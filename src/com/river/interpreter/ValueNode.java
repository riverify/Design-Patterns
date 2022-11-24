package com.river.interpreter;

/**
 * @Classname ValueNode
 * @Date 2022/11/24 14:28
 * @Created by river
 *
 * @Description 值节点类
 */
public class ValueNode implements Node {

    /** 0或者1 */
    private int value;

    /**
     * 构造方法
     * @param value 存储0或者1
     */
    public ValueNode(int value) {
        this.value = value;
    }

    /**
     * 解释方法，ValueNode的解释方法就是返回自己存储的值
     * @return 返回之前存储的值
     */
    @Override
    public int interpret() {
        return this.value;
    }
}
