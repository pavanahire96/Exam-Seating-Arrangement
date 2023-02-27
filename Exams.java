/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seating_arrangement;

/**
 *
 * @author Tech
 */
public class Exams {
    private String examNo,courseCode,courseTitle,acadYear,semester,examType;
    
    public Exams(String examNo,String courseCode,String courseTitle,String acadYear,String semester,String examType){
    this.examNo=examNo;
    this.courseCode=courseCode;
    this.courseTitle=courseTitle;
    this.acadYear=acadYear;
    this.semester=semester;
    this.examType=examType;
    }
    public String getExamNo(){
    return examNo;
    }
    public String getCourseCode(){
    return courseCode;
    }
    public String getCourseTitle(){
    return courseTitle;
    }
    public String getAcadYear(){
    return acadYear;
    }
    public String getSemester(){
    return semester;
    }
    public String getExamType(){
    return examType;
    }
    public void setExamNo(String examNo){
    this.examNo=examNo;
    }
     public void setCourseCode(String courseCode){
    this.courseCode=courseCode;
    }
      public void setCourseTitle(String courseTitle){
    this.courseTitle=courseTitle;
    }
       public void setAcadYear(String acadYear){
    this.acadYear=acadYear;
    }
        public void setSemester(String semester){
    this.semester=semester;
    }
        
         public void setExamType(String examType){
    this.examType=examType;
    }
    
}
