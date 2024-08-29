package com.itheima.interfnceDemo;

//实现类2，打印所有同学的信息（男女人数），打印平均成绩（去掉最高分和最低分）
public class ClassDateImpl2 implements ClassDate {
    private Student[] students;//记录送下来的学生信息

    //初始化有参构造器
    public ClassDateImpl2(Student[] students) {
        this.students = students;
    }

    @Override
    public void print() {
        //功能1：打印全班同学的信息
        int boyNum = 0;
        int girlNum = 0;
        System.out.println("全班同学的信息如下：");
        for (int i = 0; i < students.length; i++) {
            if (students[i].getSex().equals("男")) {
                boyNum++;
            } else {
                girlNum++;
            }
            System.out.println("姓名为：" + students[i].getName() + "，成绩为：" + students[i].getScore() + "，性别为：" + students[i].getSex());
        }
        System.out.println("男生人数为：" + boyNum + "，女生人数为：" + girlNum);

    }

    @Override
    public void printAvgGrade() {
        int sum = 0;
        int max = students[0].getScore();
        int min = students[0].getScore();
        System.out.println("全班同学的平均成绩为：");
        for (int i = 0; i < students.length; i++) {
            //计算平均成绩（去掉最高分和最低分）
            sum += students[i].getScore();
            if (students[i].getScore() > max) {
                max = students[i].getScore();
            } else if (students[i].getScore() < min) {
                min = students[i].getScore();
            }
        }
        int num = sum - max - min;

        System.out.println(num / (students.length-2));
    }

}
