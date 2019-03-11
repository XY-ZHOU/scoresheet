package main.java.company.model;

public class Subject {
    private String course;
    private int score;

    public Subject(String course, int score) {
        this.course = course;
        this.score = score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getScore() {
        return score;
    }

    public String getCourse() {
        return course;
    }
}
