package com.itheima.interfnceDemo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Student {
    //提供基本的学生属性
    private String name;
    private String sex;
    private int score;


}
