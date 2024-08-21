package com.itheima.test8;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //创建数组，存入6部电影对象
        Movie[] movies = new Movie[6];
        movies[0] = new Movie(1, "哪吒之魔童降世", 8.8, "王力宏");
        movies[1] = new Movie(2, "热辣滚烫", 8.8, "贾玲");
        movies[2] = new Movie(3, "夏洛特烦恼", 8.2, "沈腾");
        movies[3] = new Movie(4, "大话西游", 9.8, "周星驰");
        movies[4] = new Movie(5, "色戒", 9.8, "邓唯");
        movies[5] = new Movie(6, "神偷奶爸", 9.8, "动画");

        //展示电影信息
        System.out.println("=======================================");
        for (int i = 0; i < movies.length; i++) {
            System.out.println(movies[i].getId() + "\t" + movies[i].getName() + "\t" + movies[i].getPrice() + "\t" + movies[i].getAuthor());
        }

        //根据电影编号查询某个电影的详细信息
        System.out.println("=======================================");
        System.out.println("请输入要查询的电影编号：");
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        //创建MovieOperator对象，并且调用操作类中的方法
        MovieOperator mo = new MovieOperator(movies);
        mo.findMovie(id, movies);
    }
}
