package java_task.company;
import java.util.Scanner;
public class Student_Grade_Calculator {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter The Number Of The Subjects: ");
		int subjects = sc.nextInt();
		
		int totalMarks = 0;
		for(int i = 1; i <= subjects; i++) {
			System.out.println("Enter marks obtained in subject " + i + ":");
			int marks = sc.nextInt();
			totalMarks += marks;
		}
		
		double averagePercentage = (double) totalMarks/subjects;
		
		String grade;
		if(averagePercentage >= 90) {
			grade = "0";
		}
		else if(averagePercentage >= 80) {
			grade ="A";
		}
		else if(averagePercentage >= 70) {
			grade ="B";
		}
		else if(averagePercentage >= 60) {
			grade ="c";
		}
		else if(averagePercentage >= 50) {
			grade ="D";
		}
		else {
			grade = "f";
		}
		
		System.out.println("Total Marks:" + totalMarks);
		System.out.println("Average Percentage:" + averagePercentage);
		System.out.println("Grade:" + grade);
		
		
		sc.close();
	}
}



