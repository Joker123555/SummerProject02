package com.itheima.test6;

public class Test {
    public static void main(String[] args) {
        /*定义一个长度为三的数组，数组存储1-3名学生对象作为初始数据，学生对象的学号，姓名各不相同
        * 学生的属性：学号，姓名，年龄
        * 要求1：再次添加一个学生对象，并在添加的时候进行学号的唯一性判断
        * 要求2：添加完毕后，遍历所有学生的信息
        * 要求3：通过id删除学生信息
        * 如果存在，则删除，不存在，则提示删除失败。
        * 要求4：删除完毕后遍历所有学生的信息
        * 要求5：查询数组id为"003"的学生，如果存在，则将他的年龄+1
        * */
        //创建一个数组用来存储学生对象
        Student[] arr = new Student[3];
        //创建学生对象
        Student stu1= new Student(1,"李锦",20);
        Student stu2= new Student(2,"韩珂欣",20);
//        Student stu3= new Student(3,"刘晶晶",22);
        //将学生对象存到数组中
        arr[0] = stu1;
        arr[1] = stu2;
//        arr[2] = stu3;

        //要求1：再添加一个学生对象，并且在添加的时候判断学生学号的唯一性
        Student stu4=new Student(4,"蔺亚楠",21);
        //分析
        boolean con = contains(arr, stu4.getId());
        //添加学生对象
        if(con){
            //学号已存在--不添加
            System.out.println("添加的数据id与已有的学生对象重复");
        }else {
            //学号未存在--添加
            //判断数组是否存满

            int count = getCount(arr);
            if(count>=arr.length){
                //新创建一个方法实现下面的步骤
              /*  //数组已满--重新创建一个新数组，新数组=数组+1
                Student[] newArr = new Student[arr.length+1];
                //将老数组复制到新数组中
                for (int i = 0; i < arr.length; i++) {
                    newArr[i]=arr[i];
                }*/
                Student[] newArr = createNewArr(arr);

                //添加新数据
                newArr[count]=stu4;
                //变成一个方法
                /*//要求2：遍历所有的学生信息
                for (int i = 0; i < newArr.length; i++) {
                    System.out.println(newArr[i].getId()+", "+newArr[i].getName()+", "+newArr[i].getAge());
                }*/
                print(newArr);

            }else{
                //数组未满--直接添加
                // count是记录的数组中元素的个数
                //同时也是下一个要添加的元素的索引数
                arr[count]=stu4;
               /* for (int i = 0; i < arr.length; i++) {
                    System.out.println(arr[i].getId()+", "+arr[i].getName()+", "+arr[i].getAge());
                }*/
                print(arr);
            }
        }
    }
    //要求2：遍历所有的学生信息
    public static void print(Student[] arr){
        for(int i=0;i<arr.length;i++){
            //做一个非空判断
            if(arr[i]!=null){
                System.out.println(arr[i].getId()+", "+arr[i].getName()+", "+arr[i].getAge());
            }else {
                System.out.println("未录入学生信息");
            }

        }

    }


    //数组已满--重新创建一个新数组，新数组=数组+1
    public static Student[] createNewArr(Student[] arr) {
        Student[] newArr = new Student[arr.length + 1];
        //将老数组复制到新数组中
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        return newArr;
    }
    //定义一个方法判断数组中有几个元素
    public static int getCount(Student[] arr){
        //定义一个计数器
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != null){
                count++;
            }
        }
        //当循环结束后，我就知道数组中有几个元素
        return count;
    }


    //唯一性判断
    //学号已存在--不添加
    //学号未存在--添加
    public static boolean contains(Student[] arr,int id){
        for (int i = 0; i < arr.length; i++) {
            //需要做非空判断
            Student stu = arr[i];
            if(stu!=null){
                int oldId=stu.getId();
                if(oldId == id){
                    return true;
                }
            }
        }
        //当循环结束后，还没有找到一样的数字，那么表示要查找的id是不存在的
        return false;
    }
}
