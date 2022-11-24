package com.river.interpreter;

/**
 * @Classname Node
 * @Date 2022/11/24 14:24
 * @Created by river
 *
 * @Description 抽象节点类
 */
public interface Node {

    /**
     * 解释方法
     * @return 解释结果: 1或0 1代表真 0代表假
     */
    public int interpret();
}
