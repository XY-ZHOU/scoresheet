package main.java.company.model;

import java.util.List;

public class Student {
    private String id;
    private String name;
    private List<Subject> scores;

    public Student(String name, String id, List<Subject> scores) {
        this.name = name;
        this.id = id;
        this.scores = scores;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public List getScores() {
        return scores;
    }

    public int getSum() {
        int sum = 0;
        for (Subject s : scores) {
            sum += s.getScore();
        }
        return sum;
    }

    public double getAverage() {
        return (double) getSum() / scores.size();
    }
}
