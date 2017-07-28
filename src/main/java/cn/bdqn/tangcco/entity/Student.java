package cn.bdqn.tangcco.entity;

public class Student {
    private Integer studentId;

    private String studentNum;

    private Integer userId;

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getStudentNum() {
        return studentNum;
    }

    public void setStudentNum(String studentNum) {
        this.studentNum = studentNum == null ? null : studentNum.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Student() {
    }

    public Student(Integer studentId, String studentNum, Integer userId) {
        this.studentId = studentId;
        this.studentNum = studentNum;
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentNum='" + studentNum + '\'' +
                ", userId=" + userId +
                '}';
    }
}