package com.itheima.test2;

public class GoodTest {
    public static void main(String[] args) {
        //创建数组
        Goods[] arr=new Goods[3];
        Goods g1 = new Goods(20,6999.0,"华为平板","001");
        Goods g2 = new Goods(10,3999.0,"小米手机","002");
        Goods g3 = new Goods(50,599.0,"小米拍立得","003");
      arr[0]=g1;
      arr[1]=g2;
      arr[2]=g3;
      for(int i=0;i<arr.length;i++){
          System.out.println(arr[i].getId()+","+arr[i].getName()+","+arr[i].getPrice()+","+arr[i].getNumber());
      }

    }
}
