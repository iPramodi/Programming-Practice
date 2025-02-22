/*
 * Single File Programming Question
Problem Statement:



Emily, the HR representative at "PerformancePro," is tasked with evaluating the health of employees during their annual performance evaluations. PerformancePro has both regular employees and athletes.

For athletes, Emily needs to calculate:

Body Mass Index (BMI), and
The additional calories burned during their exercise routines.
For regular employees, only the BMI needs to be calculated.



Write a program using inheritance with a parent class Person that calculates the BMI and a child class Athlete that extends the Person class and calculates both the BMI and the additional calories burned during exercises.



Formula:

BMI= weight/(height*height)

Input format :
For the Ordinary Person:

The first line of input contains a string representing the name of the ordinary person.

The second line contains an integer representing the age of the ordinary person in years.

The third line contains a floating-point number representing the height of the ordinary person in meters.

The fourth line contains an integer representing the weight of the ordinary person in kilograms.

For the Athlete:

The fifth line of input contains a string representing the name of the athlete.

The sixth line contains an integer representing the age of the athlete in years.

The seventh line contains a floating-point number representing the height of the athlete in meters.

The eighth line contains an integer representing the weight of the athlete in kilograms.

The ninth line contains an integer representing the number of exercises per day the athlete performs.

The tenth line contains an integer representing the calories burned per exercise by the athlete.

Output format :
The output should display the information of the ordinary and the athlete in the following format:

Information for the regular person:

Name: <name>

Age: <int age> years

Height: <float height> meters

Weight: <float weight> kilograms

BMI: <float BMI>



Information for the athlete:

Name: <name>

Age: <int age> years

Height: <float height> meters

Weight: <float weight> kilograms

BMI: <float BMI>

Exercises per day: <int count>

Calories burned per exercise: <float calories> calories

Total Calories Burned: <float calories> calories



Refer to the sample test cases for formatting Specifications.

Code constraints :
The given test cases fall under the following constraints:

1 ≤ name length ≤ 50.

1 ≤ age ≤ 100.

0.5 ≤ height ≤ 2.5

10.0 ≤ weight ≤ 300.0

1 ≤ exercisesPerDay ≤ 20.

10.0 ≤ caloriesBurnedPerExercise ≤ 1000.0 calories.



Sample test cases :
Input 1 :
John Doe
30
1.75
75
Alice Smith
25
1.80
70
5
400
Output 1 :
Information for the regular person:
Name: John Doe
Age: 30 years
Height: 1.75 meters
Weight: 75.00 kilograms
BMI: 24.49

Information for the athlete:
Name: Alice Smith
Age: 25 years
Height: 1.80 meters
Weight: 70.00 kilograms
BMI: 21.60
Exercises per day: 5
Calories burned per exercise: 400.00 calories
Total Calories Burned: 2000.00 calories
Input 2 :
John
25
1.75
70.0
Mike
22
1.80
75.0
5
50.0
Output 2 :
Information for the regular person:
Name: John
Age: 25 years
Height: 1.75 meters
Weight: 70.00 kilograms
BMI: 22.86

Information for the athlete:
Name: Mike
Age: 22 years
Height: 1.80 meters
Weight: 75.00 kilograms
BMI: 23.15
Exercises per day: 5
Calories burned per exercise: 50.00 calories
Total Calories Burned: 250.00 calories
 */


import java.util.Scanner;
class Person{
    String personName;int personAge;double personHeight; double personWeight;
    public Person(String personName,int personAge,double personHeight, double personWeight){
        this.personName= personName;
        this.personAge = personAge;
        this.personHeight = personHeight;
        this.personWeight = personWeight;
    }
    public void displayInfo(){
        System.out.format("Name: %s\nAge: %d years\nHeight: %.2f meters\nWeight: %.2f kilograms\nBMI: %.2f\n",personName,personAge,personHeight,personWeight,(personWeight/(personHeight*personHeight)));
    }

}
class Athlete extends Person {
    private int  exercisesPerDay;
    private double caloriesBurnedPerExercise;
    public Athlete(String personName,int personAge,double personHeight, double personWeight,int  exercisesPerDay, double caloriesBurnedPerExercise){
        super(personName, personAge, personHeight, personWeight);
        this.exercisesPerDay = exercisesPerDay;
        this.caloriesBurnedPerExercise = caloriesBurnedPerExercise;

    }
    @Override public void displayInfo(){
        super.displayInfo(); 
        System.out.format("Exercises per day: %d\nCalories burned per exercise: %.2f calories\nTotal Calories Burned: %.2f calories",exercisesPerDay,caloriesBurnedPerExercise,(caloriesBurnedPerExercise*exercisesPerDay));
    }
}






public class InheritanceUn3Q3 {
    public static void main(String[] args) {
      
            Scanner scanner = new Scanner(System.in); 
            String personName = scanner.nextLine(); 
            int personAge =  scanner.nextInt(); 
            double personHeight = scanner.nextDouble();
            double personWeight = scanner.nextDouble(); 
            Person person = new Person (personName, personAge, personHeight, personWeight); 
            scanner.nextLine(); 
            String athleteName = scanner.nextLine(); 
            int athleteAge = scanner.nextInt(); 
            double athleteHeight = scanner.nextDouble();
            double athleteWeight = scanner.nextDouble();
            int exercisesPerDay = scanner.nextInt();
            double caloriesBurnedPerExercise = scanner.nextDouble();
            Athlete athlete = new Athlete(athleteName, athleteAge, athleteHeight, athleteWeight , exercisesPerDay, caloriesBurnedPerExercise);
            System.out.println("Information for the regular person:");
            person.displayInfo();
            System.out.println("\nInformation for the athlete:");
            athlete.displayInfo();
            scanner.close();
    }
}
