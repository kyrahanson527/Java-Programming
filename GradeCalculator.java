import java.util.Scanner

public class GradeCalculator {
    public static void main (String[] args)
    }

Scanner input = new Scanner (System.in);

//Declare variables, using double for decimal points and string for text
double assignmentScore, testScore, quizScore, weightedScore
String letterGrade;

//Prompt user to input assignment score
System.out.print("Enter in your assignment score: ");
double assignmentScore = input.nextDouble();

//Prompt user to input test score
System.out.print("Enter in your test score: "); 
double testScore = input.nextDouble(); 

//Prompt user to input quiz score
System.out.print("Enter in your quiz score: ");
double testScore = input.nextDouble();

//Calculate weighted score
double weightedTotal = (assignmentScore * 0.40) + (testScore * 0.40) + (quizScore * 0.20); 

//Calculate letter grade based on weighted score
String letterGrade; 
{
if (weightedScore >= 90) 
    letterGrade = "A"; 
else if (weightedScore >= 80)
    letterGrade = "B"; 
else if (weightedScore>= 70)
    letterGrade = "C";
else if (weightedScore = >= 60)
    letterGrade= "D";
else
    letterGrade = "F";
}

//Display weighted score on screen
System.out.print("Weighted Score: " + weightedScore + %);

//Display letter grade on screen
System.out.print("Final Grade: " + letterGrade); 

//Display message for passing and failing grades
if (weightedScore >= 70) 
    System.out.print("Congratulations! You are passing the class!"); 
else
    System.out.print("I'm sorry, you're failing the class. Discuss options with teacher.");
    
