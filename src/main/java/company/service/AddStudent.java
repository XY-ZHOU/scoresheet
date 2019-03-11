package main.java.company.service;

import java.util.List;
import java.util.Scanner;

public class AddStudent {
    public void addStudent(String info, List students){
        Scanner sc = new Scanner(System.in);
        String[] infoArr = info.split(", ");
        if(isStudentCorrent(infoArr)){
            students.add(addStudentMessage(infoArr));
            System.out.println("学生"+infoArr[0]+"的成绩被添加");
        }else{
            System.out.println("请按正确的格式输入（格式：姓名, 学号, 学科: 成绩, ...）：");
            String newInfo = sc.nextLine();
            addStudent(newInfo,students);
        }
    }
}
