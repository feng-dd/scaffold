package com.feng.jvm;

/**
 * @Author tianhui.feng
 * @Version 1.0
 * @Date 2020/12/8 14:10
 * @Desc GC排查
 * @Since 1.0
 */
public class Demo1 {

    public static void main(String[] args) {

        byte[] array2 = new byte[1024 * 1024]; // 1M 的数组对象
        byte[] array1 = null;
        int i = 0;
        while (i<17){
            array1 = new byte[20 * 1024 * 1024]; // 2M 的数组对象
            array1 = null;
            i++;
        }


//        array1 = new byte[1024 * 1024];
//        array1 = null;
//

//
//        byte[] array3 = new byte[20 * 1024 * 1024];
//        array3 = new byte[20 * 1024 * 1024];
//        array3 = new byte[20 * 1024 * 1024];
//        array3 = null;
//
//        byte[] array4 = new byte[1024 * 1024];
//
//        byte[] array5 = new byte[20 * 1024 * 1024];



    }
}
