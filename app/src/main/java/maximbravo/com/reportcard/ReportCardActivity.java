package maximbravo.com.reportcard;

import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class ReportCardActivity {

    private String subject_1;
    private String subject_1_grade;
    private String subject_2;
    private String subject_2_grade;
    private String subject_3;
    private String subject_3_grade;
    private String subject_4;
    private String subject_4_grade;
    private String subject_5;
    private String subject_5_grade;

    public ReportCardActivity(String s1, String s2, String s3, String s4, String s5,
                              String s1_grade, String s2_grade, String s3_grade, String s4_grade, String s5_grade){
        subject_1 = s1;
        subject_1_grade = s1_grade;
        subject_2 = s2;
        subject_2_grade = s2_grade;
        subject_3 = s3;
        subject_3_grade = s3_grade;
        subject_4 = s4;
        subject_4_grade = s4_grade;
        subject_5 = s5;
        subject_5_grade = s5_grade;
    }

    public String getSubject_1() {
        return subject_1;
    }
    public void setSubject_1(String subject_1) {
        this.subject_1 = subject_1;
    }
    public String getSubject_1_grade() {
        return subject_1_grade;
    }
    public void setSubject_1_grade(String subject_1_grade) {
        this.subject_1_grade = subject_1_grade;
    }
    public String getSubject_2() {
        return subject_2;
    }
    public void setSubject_2(String subject_2) {
        this.subject_2 = subject_2;
    }
    public String getSubject_2_grade() {
        return subject_2_grade;
    }
    public void setSubject_2_grade(String subject_2_grade) {
        this.subject_2_grade = subject_2_grade;
    }
    public String getSubject_3() {
        return subject_3;
    }
    public void setSubject_3(String subject_3) {
        this.subject_3 = subject_3;
    }
    public String getSubject_3_grade() {
        return subject_3_grade;
    }
    public void setSubject_3_grade(String subject_3_grade) {
        this.subject_3_grade = subject_3_grade;
    }
    public String getSubject_4() {
        return subject_4;
    }
    public void setSubject_4(String subject_4) {
        this.subject_4 = subject_4;
    }
    public String getSubject_4_grade() {
        return subject_4_grade;
    }
    public void setSubject_4_grade(String subject_4_grade) {
        this.subject_4_grade = subject_4_grade;
    }
    public String getSubject_5() {
        return subject_5;
    }
    public void setSubject_5(String subject_5) {
        this.subject_5 = subject_5;
    }
    public String getSubject_5_grade() {
        return subject_5_grade;
    }
    public void setSubject_5_grade(String subject_5_grade) {
        this.subject_5_grade = subject_5_grade;
    }

    public String toString(){
        String result = "";
        ArrayList<String> grades = new ArrayList<String>();
        grades.add(subject_1 + ": " + subject_1_grade);
        grades.add(subject_2 + ": " + subject_2_grade);
        grades.add(subject_3 + ": " + subject_3_grade);
        grades.add(subject_4 + ": " + subject_4_grade);
        grades.add(subject_5 + ": " + subject_5_grade);

        for(int i = 0; i < grades.size(); i++){
            result += grades.get(i) + "/n";
        }
        return result;
    }
}
