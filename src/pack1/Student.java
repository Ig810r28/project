package pack1;

public class Student {
    private String name;
    private int course;
    private int grade;

    public void setName(String name) {
        if (name.length() >= 3) {
            this.name = name;
        } else {
            System.out.println("Error");
        }
    }

    public void setCourse(int course) {
        if (course >= 1 && course <= 4) {
            this.course = course;
        } else {
            System.out.println("Error");
        }
    }

    public void setGrade(int grade) {
        if (grade >= 1 && grade <= 10) {
            this.grade = grade;
        } else {
            System.out.println("Error");
        }

    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public int getCourse() {
        return course;
    }

    void showInfo() {
        System.out.println("Student name: " + getName());
        System.out.println("course: " + getCourse());
        System.out.println("grade: " + getGrade());
    }

    public Student(String name, int course, int grade) {
        this.name = name;
        this.course = course;
        this.grade = grade;
    }
}
