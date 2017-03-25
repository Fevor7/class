package by.htp.library.main;

import by.htp.library.stud.Student;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student st = new Student(310, "Vasya", "Pupkin", "ptf");
		Student stud [] = new Student [5];
		stud[0]= new Student(301, "Vasya", "Pupkin", "fiz");
		stud[1]= new Student(308, "Vasya", "Pupkin", "ptf");
		stud[2]= new Student(120, "Vasya", "Pupkin", "fit");
		stud[3]= new Student(124, "Vasya", "Pupkin", "ptf");
		stud[4]= new Student(184, "Vasya", "Pupkin", "lang");
		print(stud);
	}
 private static void print(Student stud [] )
  {
	  for (int i=0; i<stud.length;i++)
			stud[i].facultel("ptf");
  }
}
