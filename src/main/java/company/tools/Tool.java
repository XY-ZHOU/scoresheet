package main.java.company.tools;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.List;

public class Tool {
    public  void showMenu(){
        System.out.println("1. 添加学生");
        System.out.println("2. 生成成绩单");
        System.out.println("3. 退出");
        System.out.println("请输入你的选择（1～3）：");
    }
    public void printTranscript(List<String> allMessage){
        System.out.println("成绩单");
        System.out.println("姓名|数学|语文|英语|编程|平均分|总分");
        System.out.println("========================");
        for (int i=0;i<allMessage.size()-2;i++){
            System.out.println(allMessage.get(i));
        }
        System.out.println("========================");
        System.out.println("全班总分平均数："+allMessage.get(allMessage.size()-2));
        System.out.println("全班总分中位数："+allMessage.get(allMessage.size()-1));

    }
    public void restoreTranscript(List<String> allMessage){
        BufferedWriter out = null;
        try{
            File file = new File("transcriptMessage.txt");
            out = new BufferedWriter(new FileWriter(file));

            out.write("成绩单");
            out.newLine();
            out.write("姓名|数学|语文|英语|编程|平均分|总分");
            out.newLine();
            out.write("========================");
            out.newLine();
            for (int i=0;i<allMessage.size()-2;i++){
                out.write(allMessage.get(i));
                out.newLine();
            }
            out.write("========================");
            out.newLine();
            out.write("全班总分平均数："+allMessage.get(allMessage.size()-2));
            out.newLine();
            out.write("全班总分中位数："+allMessage.get(allMessage.size()-1));
            out.newLine();
        }catch(Exception e){
            e.printStackTrace();
        }finally {
            try{
                out.close();
            }catch (Exception e){
                e.printStackTrace();
            }finally {
                out=null;
            }
        }
    }
}
