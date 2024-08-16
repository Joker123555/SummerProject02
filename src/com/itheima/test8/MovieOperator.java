package com.itheima.test8;

//电影操作类
public class MovieOperator {
    //将电影数组传入方法类
    private Movie[] movies;//记住一个电影对象的数组

    public MovieOperator(Movie[] movies) {
        this.movies = movies;
    }

    public void printAllMovies(Movie[] movies) {
        for (int i = 0; i < movies.length; i++) {
            System.out.println(movies[i].getId()+"\t"+movies[i].getName()+"\t"+movies[i].getPrice()+"\t"+movies[i].getAuthor());
        }
    }

    public void findMovie(int id, Movie[] movies) {
        for (int i = 0; i < movies.length; i++) {
            if (movies[i].getId() == id) {
                System.out.println(movies[i].getId()+"\t"+movies[i].getName()+"\t"+movies[i].getPrice()+"\t"+movies[i].getAuthor());
                return;
            }
        }
        System.out.println("没有找到对应的电影");
    }
}
