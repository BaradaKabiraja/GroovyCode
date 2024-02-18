package com.app

class Student {
	private int StudentID; 
	private String StudentName; 

    

   Student(int ID, String Name){ 

           this.StudentID=ID 

           this.StudentName=Name 

   } 

         

   void setStudentID(int ID) { 

      this.StudentID = ID; 

   } 

         

   void setStudentName(String Name) { 

      this.StudentName = Name; 

   } 

         

   int getStudentID() { 

      return this.StudentID; 

   } 

         

   String getStudentName() { 

      return this.StudentName; 

   } 

         

   static void main(String[] args) { 

      Student student = new Student(1000,"John Jones"); 

      student.setStudentID(500); 

      student.setStudentName("John"); 

                 

      println(student.getStudentID()); 

      println(student.getStudentName()); 

   }  


	
}
