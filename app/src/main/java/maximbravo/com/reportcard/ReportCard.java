package maximbravo.com.reportcard;

import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class ReportCard {
    private String subject1;
    private String subject1Grade;
    private String subject2;
    private String subject2Grade;
    private String subject3;
    private String subject3Grade;
    private String subject4;
    private String subject4Grade;
    private String subject5;
    private String subject5Grade;

    public ReportCard(String s1, String s2, String s3, String s4, String s5,
                      String s1_grade, String s2_grade, String s3_grade, String s4_grade, String s5_grade){
        subject1 = s1;
        subject1Grade = s1_grade;
        subject2 = s2;
        subject2Grade = s2_grade;
        subject3 = s3;
        subject3Grade = s3_grade;
        subject4 = s4;
        subject4Grade = s4_grade;
        subject5 = s5;
        subject5Grade = s5_grade;
    }

    public String toString(){
        String result = "";
        ArrayList<String> grades = new ArrayList<String>();
        grades.add(subject1 + ": " + subject1Grade);
        grades.add(subject2 + ": " + subject2Grade);
        grades.add(subject3 + ": " + subject3Grade);
        grades.add(subject4 + ": " + subject4Grade);
        grades.add(subject5 + ": " + subject5Grade);
        for(int i = 0; i < grades.size(); i++){
            result += grades.get(i) + "/n";
        }
        return result;
    }
    public String getSubject1() {
        return subject1;
    }
    public void setSubject1(String subject1) {
        this.subject1 = subject1;
    }
    public String getSubject1Grade() {
        return subject1Grade;
    }
    public void setSubject1Grade(String subject1Grade) {
        this.subject1Grade = subject1Grade;
    }
    public String getSubject2() {
        return subject2;
    }
    public void setSubject2(String subject2) {
        this.subject2 = subject2;
    }
    public String getSubject2Grade() {
        return subject2Grade;
    }
    public void setSubject2Grade(String subject2Grade) {
        this.subject2Grade = subject2Grade;
    }
    public String getSubject3() {
        return subject3;
    }
    public void setSubject3(String subject3) {
        this.subject3 = subject3;
    }
    public String getSubject3Grade() {
        return subject3Grade;
    }
    public void setSubject3Grade(String subject3Grade) {
        this.subject3Grade = subject3Grade;
    }
    public String getSubject4() {
        return subject4;
    }
    public void setSubject4(String subject4) {
        this.subject4 = subject4;
    }
    public String getSubject4Grade() {
        return subject4Grade;
    }
    public void setSubject4Grade(String subject4Grade) {
        this.subject4Grade = subject4Grade;
    }
    public String getSubject5() {
        return subject5;
    }
    public void setSubject5(String subject5) {
        this.subject5 = subject5;
    }
    public String getSubject5Grade() {
        return subject5Grade;
    }
    public void setSubject5Grade(String subject5Grade) {
        this.subject5Grade = subject5Grade;
    }
}
