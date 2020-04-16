package com.example.springlearndemo.jdk;

import java.util.Comparator;

public class Java8Tester {
    static String first = "";
    String first2= "";
    public static void main(String[] args) {
        //这里也可以申明未final类型 ，不申明也没问题，非函数参数的的外部变量，在函数体内不能被修改（赋值）
        int num = 1;
        Converter<Integer,Integer> s = (param) -> {
            System.out.println(String.valueOf(param+num));
        };
        //输出结果为 3
        s.convert(2);
        // 在 Lambda 表达式当中，不允许声明一个与局部变量同名的参数或者局部变量
        //  Comparator<String> comparator = (first,second) -> Integer.compare(first.length(),second.length()); 编译出错
        Comparator<String> comparator = (first2,second) -> Integer.compare(Java8Tester.first.length(),second.length());

    }

    public void testParam(){
        Comparator<String> comparator = (first2,second) -> Integer.compare(Java8Tester.first.length(),second.length());

    }

    public interface Converter<T1,T2> {
        void convert(int i);
    }
}