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
        System.out.println("�п�J���u�s��:");
       num= scanner.next();
       System.out.println("�п�J���u�m�W:");
       name=scanner.next();
       System.out.println("�п�J���~:");
       hoursalary=scanner.next();
       System.out.println("�п�J�u�@�ɼ�:");
       worktime=scanner.next();
    }
    public void calc(){
        float hs,wt;
        hs=Float.parseFloat(hoursalary);
        wt=Float.parseFloat(worktime);
        monthsalary=String.valueOf(hs*wt);
        System.out.println("\n���u�s��:"+num+"\n���u�m�W:"+name+"\n���~:"+hoursalary+"\n�u�@�ɼ�:"+worktime+"\n�리�J:"+monthsalary);

    }
}
