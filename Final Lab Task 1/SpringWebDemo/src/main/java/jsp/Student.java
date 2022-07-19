package jsp;

public class Student {
    private String name;
    private String studentId;
    private String department;
    private double cgpa;

    public Student(String name, String studentId, String department, double cgpa) {
        this.name = name;
        this.studentId = studentId;
        this.department = department;
        this.cgpa = cgpa;
    }

    public String getName() {
        return name;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getDepartment() {
        return department;
    }

    public double getCgpa() {
        return cgpa;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }
}
