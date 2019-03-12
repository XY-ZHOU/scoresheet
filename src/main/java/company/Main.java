package main.java.company;

import main.java.company.model.Student;
import main.java.company.service.AddStudent;
import main.java.company.service.GetTranscripts;
import main.java.company.tools.Tool;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Tool tool = new Tool();
        List<Student> students = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        tool.showMenu();
        String info = null;
        info = sc.nextLine();
        while (info != null) {
            if (info.equals("1")) {
                System.out.println("请输入学生信息（格式：姓名, 学号, 学科: 成绩, ...），按回车提交：");
                info = sc.nextLine();
                AddStudent addStudent = new AddStudent();
                addStudent.addStudent(info, students);
                tool.showMenu();
                info = sc.nextLine();
            } else if (info.equals("2")) {
                System.out.println("请输入要打印的学生的学号（格式： 学号, 学号,...），按回车提交：");
                info = sc.nextLine();
                GetTranscripts getTranscripts = new GetTranscripts();
                getTranscripts.getTranscript(info, students);
                tool.showMenu();
                info = sc.nextLine();
            } else if (info.equals("3")) {
                System.out.println("退出");
                break;
            }
        }
    }
}
