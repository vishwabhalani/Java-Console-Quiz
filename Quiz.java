import java.util.Scanner;
public class Quiz
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int correctCount=0;
		int wrongCount=0;
		char correctAnswer1;
			System.out.println("1.Who invented Java Programming?");
			System.out.println("A.Guido van Rossum");
			System.out.println("B.James Gosling");
			System.out.println("C.Dennis Ritche");
			System.out.println("D.Bjrane Stroustrup");
			System.out.println("Enter Your Answer:");
			char ans1=sc.next().toUpperCase().charAt(0);
			char answer1='B';
			if(ans1==answer1)
			{
				System.out.println("Correct");
				correctCount++;
			}
			else
			{
				System.out.println("Wrong");
				System.out.println("Correct Answer is:"+answer1);
				wrongCount++;
			}
			System.out.println("2.Java was originally called:");
			System.out.println("A.Oak");
			System.out.println("B.Pine");
			System.out.println("C.Cedar");
			System.out.println("D.Maple");
			System.out.println("Enter Your Answer:");
			char ans2=sc.next().toUpperCase().charAt(0);
			char answer2='A';
			if(ans2==answer2)
			{
				System.out.println("Correct");
				correctCount++;
			}
			else
			{
				System.out.println("Wrong");
				System.out.println("Correct Answer is:"+answer2);
				wrongCount++;
			}

			System.out.println("3.Java was first released to the public in:");
			System.out.println("A.1991");
			System.out.println("B.1993");
			System.out.println("C.1995");
			System.out.println("D.1998");
			System.out.println("Enter Your Answer:");
			char ans3=sc.next().toUpperCase().charAt(0);
			char answer3='C';
			if(ans3==answer3)
			{
				System.out.println("Correct");
				correctCount++;
			}

			else
			{
				System.out.println("Wrong");
				System.out.println("Correct Answer is:"+answer3);
				wrongCount++;
			}

			System.out.println("4.Java is a:");
			System.out.println("A.Procedure-oriented language");
			System.out.println("B.Object-oriented language");
			System.out.println("C.Machine language");
			System.out.println("D.Assembly language");
			System.out.println("Enter Your Answer:");
			char ans4=sc.next().toUpperCase().charAt(0);
			char answer4='B';
			if(ans4==answer4)
			{
				System.out.println("Correct");
				correctCount++;
			}
			else
			{
				System.out.println("Wrong");
				System.out.println("Correct Answer is:"+answer4);
				wrongCount++;
			}

			System.out.println("5.Which concept allows one class to acquire properties of another?");
			System.out.println("A.abstraction");
			System.out.println("B.Encapsulation");
			System.out.println("C.Inheritance");
			System.out.println("D.Polymorphism");
			System.out.println("Enter Your Answer:");
			char ans5=sc.next().toUpperCase().charAt(0);
			char answer5='C';
			if(ans5==answer5)
			{
				System.out.println("Correct");
				correctCount++;
			}
			else
			{
				System.out.println("Wrong");
				System.out.println("Correct Answer is:"+answer5);
				wrongCount++;
			}
			System.out.println("----Result----");
			System.out.println("Total Questions:5");
			System.out.println("Correct Answered Questions:"+correctCount);
			System.out.println("Wrong Answered Questions:"+wrongCount);
	}
}