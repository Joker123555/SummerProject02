package com.itheima.demo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class JD implements Switch {
    //家具父类
    private String name;
    //代表家电的状态
    private boolean status;

    //实现开关功能
    @Override
    public void press() {
        status = !status;
    }


}
