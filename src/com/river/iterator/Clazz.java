package com.river.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Classname Clazz
 * @Date 2022/11/24 15:41
 * @Created by river
 *
 * @Description 班级类
 */
public class Clazz {
    /** 班级名单 */
    private List<Student> students = new ArrayList<>();

    /**
     * 添加学生
     * @param student 学生
     */
    public void addStudent(Student student) {
        students.add(student);
    }

    /**
     * 显示班级学生信息－－使用迭代器
     */
    public void showStudents() {
        // 排序 - 按照学号排序 需要先在Student类中实现Comparable接口
        students.sort(null);

        // 获取迭代器 i
        Iterator<Student> i = students.iterator();

        // 遍历迭代器
        // i.hasNext() 判断是否有下一个元素
        while (i.hasNext()) {

            // i.next() 获取该一个元素，并将指针指向下一个元素
            Student student = i.next();

            // 打印学生信息
            System.out.println(student);
        }

        // 关闭迭代器
        i.remove();
    }
}
