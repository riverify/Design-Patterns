package com.river.iterator;

/**
 * @Classname Test1
 * @Date 2022/11/24 15:53
 * @Created by river
 *
 * @Description 测试类
 */
public class Test1 {
    public static void main(String[] args) {
        // 创建班级
        Clazz clazz = new Clazz();

        // 添加学生
        clazz.addStudent(new Student("张三", 18, "男", "003"));
        clazz.addStudent(new Student("李四", 19, "男", "002"));
        clazz.addStudent(new Student("王五", 20, "男", "001"));
        clazz.addStudent(new Student("赵六", 21, "男", "005"));
        clazz.addStudent(new Student("田七", 22, "男", "004"));

        // 显示班级学生信息
        clazz.showStudents();

        // 输出结果：
        // Student{sName='王五', sAge=20, sSex='男', sNo='001'}
        // Student{sName='李四', sAge=19, sSex='男', sNo='002'}
        // Student{sName='张三', sAge=18, sSex='男', sNo='003'}
        // Student{sName='田七', sAge=22, sSex='男', sNo='004'}
        // Student{sName='赵六', sAge=21, sSex='男', sNo='005'}
    }
}
