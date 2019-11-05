package com.example.lib;

import java.util.Scanner;

public class Servitor {
    String num;
    String hoursalary;
    String worktime;
    String monthsalary;
    String name;

    Scanner scanner=new Scanner(System.in);
    public void setServitordata(){
        System.out.println("請輸入員工編號:");
       num= scanner.next();
       System.out.println("請輸入員工姓名:");
       name=scanner.next();
       System.out.println("請輸入時薪:");
       hoursalary=scanner.next();
       System.out.println("請輸入工作時數:");
       worktime=scanner.next();
    }
    public void calc(){
        float hs,wt;
        hs=Float.parseFloat(hoursalary);
        wt=Float.parseFloat(worktime);
        monthsalary=String.valueOf(hs*wt);
        System.out.println("\n員工編號:"+num+"\n員工姓名:"+name+"\n時薪:"+hoursalary+"\n工作時數:"+worktime+"\n月收入:"+monthsalary);

    }
}
