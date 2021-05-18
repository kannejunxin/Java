package com.bit.www;
import java.util.*;
import java.sql.*;
import static java.lang.System.*;
import static java.lang.Math.*;
//很少用到静态导包
/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Moment_Sky
 * Date: 2021-05-18
 * Time: 21:04
 */


public class TestDemo1 {
    int val = 0;//没加访问权限修饰符  则为包访问权限 既不能在包外部的类使用
    public static void main(String[] args) {
        java.util.Date data = new java.util.Date();
        out.println("hahha");
        double x = 30;
        double y = 40;

        double result = sqrt(pow(x,2)+pow(y,2));

    }
}
