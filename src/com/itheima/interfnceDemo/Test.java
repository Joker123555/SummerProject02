package com.itheima.interfnceDemo;

public class Test {
    public static void main(String[] args) {
        //创建学生数组对象
        Student[] students = new Student[5];
        students[0] = new Student("张三", "男", 95);
        students[1] = new Student("李四", "女", 88);
        students[2] = new Student("王五", "男", 77);
        students[3] = new Student("赵六", "女", 66);
        students[4] = new Student("田七", "男", 55);
        //打印所有学生的信息
        //实现类1
        ClassDate cdi = new ClassDateImpl1(students);
        cdi.print();
        cdi.printAvgGrade();
        //实现类2
        ClassDate cdi2 = new ClassDateImpl2(students);
        cdi2.print();
        cdi2.printAvgGrade();

    }
}
