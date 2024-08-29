package com.itheima.interfnceDemo;

//1实现类，打印所有同学的信息，打印平均成绩
public class ClassDateImpl1 implements ClassDate {
    private Student[] students;//记录送下来的学生信息
    //初始化有参构造器
    public ClassDateImpl1(Student[] students){
    this.students=students;
    }

    @Override
    public void print() {
        //功能1：打印全班同学的信息
        System.out.println("全班同学的信息如下：");
        for (int i = 0; i < students.length; i++) {
            System.out.println("姓名为："+students[i].getName()+"，成绩为："+students[i].getScore()+"，性别为："+students[i].getSex());
        }

    }

    @Override
    public void printAvgGrade() {
        int avg=0;
        System.out.println("全班同学的平均成绩为：");
        for (int i = 0; i < students.length; i++) {
            //计算平均成绩
            avg+=students[i].getScore();
        }
        System.out.println(avg/students.length);
    }

}
