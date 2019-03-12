package main.java.company.service;

import main.java.company.model.Student;
import main.java.company.tools.Tool;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GetTranscripts {
    public void getTranscript(String idStr, List<Student> students){
        Tool tool=new Tool();
        String[] idArr = idStr.split(", ");
        List<String> idList = Arrays.asList(idArr);
        List<Student> studentsOfPrint = students.stream().filter(student -> idList.contains(student.getId())).collect(Collectors.toList());
        if(studentsOfPrint.size()==0){
            System.out.println("请按正确的格式输入要打印的学生的学号（格式： 学号, 学号,...），按回车提交：");
        }else{
            tool.printTranscript(getAllMessage(studentsOfPrint));
            tool.restoreTranscript(getAllMessage(studentsOfPrint));
        }
    }
}