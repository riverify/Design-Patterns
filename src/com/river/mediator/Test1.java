package com.river.mediator;

/**
 * FileName: Test1
 * Date: 2022/12/01
 * Time: 15:02
 * Author: river
 * <p>
 * Description: 测试类
 * 使用中介者模式，说明联合国安理会的作用
 */
public class Test1 {
    public static void main(String[] args) {
        // 创建一个联合国机构
        WTO wto = new WTO();

        // 创建一个国家
        USA america = new USA();
        PRC china = new PRC();
        JP japan = new JP();

        // 将国家对象注册到联合国机构中
        america.setMediator(wto);
        china.setMediator(wto);
        japan.setMediator(wto);
        wto.setUSA(america);
        wto.setPCR(china);
        wto.setJP(japan);

        // 美国发出声明
        america.declare("美方不满意中国的做法");
        // 中国发出声明
        china.declare("中方对此表示强烈谴责");
        // 日本发出声明
        japan.declare("中国的做法不合理");


        // 输出结果：
        // 中国获得对方消息：美方不满意中国的做法
        // 美国获得对方消息：中方对此表示强烈谴责
        // 中国获得对方消息：中国的做法不合理


    }
}
