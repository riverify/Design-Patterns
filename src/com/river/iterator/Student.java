package com.river.iterator;

import java.io.Serializable;
import java.util.Objects;

/**
 * @Classname Student
 * @Date 2022/11/24 15:37
 * @Created by river
 *
 * @Description 学生类 - 实现Comparable接口，用于排序 - 实现Serializable接口，用于序列化
 */
public class Student implements Comparable<Student>, Serializable {

    /** 序列号 */
    private static final long serialVersionUID = 8413098876708097870L;


    /** 学生姓名 */
    private String sName;
    /** 学生年龄 */
    private Integer sAge;
    /** 学生性别 */
    private String sSex;
    /** 学生学号 */
    private String sNo;

    /**
     * 构造方法
     */
    public Student() {
    }

    /**
     * 构造方法
     * @param sName 学生姓名
     * @param sAge 学生年龄
     * @param sSex 学生性别
     * @param sNo 学生学号
     */
    public Student(String sName, Integer sAge, String sSex, String sNo) {
        this.sName = sName;
        this.sAge = sAge;
        this.sSex = sSex;
        this.sNo = sNo;
    }


    // getter and setter
    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public Integer getsAge() {
        return sAge;
    }

    public void setsAge(Integer sAge) {
        this.sAge = sAge;
    }

    public String getsSex() {
        return sSex;
    }

    public void setsSex(String sSex) {
        this.sSex = sSex;
    }

    public String getsNo() {
        return sNo;
    }

    public void setsNo(String sNo) {
        this.sNo = sNo;
    }

    /**
     * 重写 toString 方法
     * @return 学生信息
     */
    @Override
    public String toString() {
        return "Student{" +
                "sName='" + sName + '\'' +
                ", sAge=" + sAge +
                ", sSex='" + sSex + '\'' +
                ", sNo='" + sNo + '\'' +
                '}';
    }

    /**
     * 重写equals方法
     * @param o 对象
     * @return boolean
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(sName, student.sName) && Objects.equals(sAge, student.sAge) && Objects.equals(sSex, student.sSex);
    }

    /**
     * 重写hashCode方法
     * @return int
     */
    @Override
    public int hashCode() {
        return Objects.hash(sName, sAge, sSex);
    }

    /**
     * 重写compareTo方法　按照学号排序
     * @param o 对象
     * @return int
     */
    @Override
    public int compareTo(Student o) {
        // 按照学号排序
        return this.sNo.compareTo(o.sNo);
    }
}
