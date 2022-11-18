package com.river.compositePattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author River
 */
public class Institution extends Unit {

    // 成员属性
    private String name;

    // 临时列表，存储部下的子成员Office
    private List<Unit> units = new ArrayList<>();

    // 构造方法
    public Institution() {}

    public Institution(String name) {
        this.name = name;
    }

    /**
     * 添加子部门的方法
     * @param unit 将某个部门作为参数传入内部的集合中
     */
    public void add(Unit unit) {
        units.add(unit);
    }

    /**
     * 在父类中被动调用的方法
     * 将父类中方法的调用委托的子类中进行处理
     */
    @Override
    public void handleArchives() {
        System.out.println(this.name + " 收到了档案，正在下发档案到各办公室。。。");
        // 迭代子成员office
        for (Unit unit: units) {
            unit.handleArchives();
        }
    }
}
