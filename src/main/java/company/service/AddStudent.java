package main.java.company.service;

import main.java.company.model.Student;
import main.java.company.model.Subject;

import java.util.ArrayList;
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
    public boolean isStudentCorrent(String[] infoArr){
        return infoArr.length==6&&infoArr[2].contains("数学")&&infoArr[3].contains("语文")&&infoArr[4].contains("英语")&&infoArr[5].contains("编程");
    }
    public Student addStudentMessage(String[] infoArr){
        List<Subject> subjectList=new ArrayList<>();
        for(int i=2;i<infoArr.length;i++){
            String course= infoArr[i].substring(0, infoArr[i].indexOf(":"));
            int score=Integer.parseInt(infoArr[i].substring(infoArr[i].indexOf(":")+2));
            Subject subject=new Subject(course,score);
            subjectList.add(subject);
        }
        Student student=new Student(infoArr[0],infoArr[1],subjectList);
        return student;
    }
}
