package com.itheima.test6;

public class Test2 {

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
        Student stu3= new Student(3,"刘晶晶",22);
        //将学生对象存到数组中
        arr[0] = stu1;
        arr[1] = stu2;
        arr[2] = stu3;

        /*要求3：通过id删除学生信息
         * 如果存在，则删除，不存在，则提示删除失败
        * */
        int index = delStudent(arr, 2);
        if(index>0){
            //如果存在，则删除
            arr[index]=null;
            print(arr);
        }else {
            //删除失败
            System.out.println("id不存在，删除失败");
        }


    }
    /* 要求3：通过id删除学生信息
               如果存在，则删除，不存在，则提示删除失败。 */
    public static int delStudent(Student[] arr, int id){
        for (int i = 0; i < arr.length; i++) {
            Student stu = arr[i];
            if(stu!=null){
                int id1 = stu.getId();
                if(id==id1){
                    return i;
                }
            }
        }
        return -1;
    }
    //要求2：遍历所有的学生信息
    public static void print(Student[] arr){
        for(int i=0;i<arr.length;i++){
            //做一个非空判断
            if(arr[i]!=null){
                System.out.println(arr[i].getId()+", "+arr[i].getName()+", "+arr[i].getAge());
            }

        }

    }

}
