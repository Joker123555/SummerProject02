package com.itheima.test5;

public class GirlFriendTest {
    public static void main(String[] args) {
        //创建数组
        GirlFriend[] arr=new GirlFriend[4];
        //创建对象
        GirlFriend girl1=new GirlFriend("韩珂欣",20,"女","弹吉他");
        GirlFriend girl2=new GirlFriend("韩珂欣",19,"女","唱歌");
        GirlFriend girl3=new GirlFriend("韩珂欣",18,"女","画画");
        GirlFriend girl4=new GirlFriend("韩珂欣",25,"女","旅游");
        //将对象放入数组中
        arr[0]=girl1;
        arr[1]=girl2;
        arr[2]=girl3;
        arr[3]=girl4;
        //用于计算平均年龄
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum=sum+arr[i].getAge();
        }
        int avg=sum/arr.length;
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            int age = arr[i].getAge();
            if (age < avg) {
                System.out.println(arr[i].getName() + ", " + arr[i].getAge() + ", " + arr[i].getGender() + ", " + arr[i].getHobby());
                count++;
            }
        }
        System.out.println("平均年龄为："+avg);
            System.out.println("比平均年龄低的有"+count+"人");


    }
}
