package net.gzhu.bean;

/**
 * -zzl.
 *
 * @author : zzl
 * @version : 1.0
 * @date : 2019-10-03 23:37
 */
public class Teacher {
    private String teacherId;
    private String teacherName;
    private int gender;
    private  String college;
    private String positionalTitle;
    private String password;

    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public String getPositionalTitle() {
        return positionalTitle;
    }

    public void setPositionalTitle(String positionalTitle) {
        this.positionalTitle = positionalTitle;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Teacher() {
    }

    public Teacher(String teacherId, String teacherName, int gender, String college, String positionalTitle, String password) {
        this.teacherId = teacherId;
        this.teacherName = teacherName;
        this.gender = gender;
        this.college = college;
        this.positionalTitle = positionalTitle;
        this.password = password;
    }

    @Override
    public String toString() {
        return "teacher{" +
                "teacherId=" + teacherId +
                ", teacherName='" + teacherName + '\'' +
                ", gender=" + gender +
                ", college='" + college + '\'' +
                ", positionalTitle='" + positionalTitle + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
