import java.util.Scanner;
class Task4 {
    public static void main(String[] args) {
    /*                              TASK 4
                         QUIZ APPLICATION WITH TIMER
    
        1. Quiz Questions and Options: Store quiz questions along with multiple-choice options and correct answers.
        2. Timer: Implement a timer for each question to limit the time to answer.
        3. Question Display: Present one question at a time with multiple-choice options. 
        4. Answer Submission: Allow users to select an option and submit their answer within the given time.
        5. Score Calculation: Keep track of the user's score based on correct answers. 
        Result Screen: Display the final score and a summary of correct/incorrect answers */

        int questionIndex = 0;
        int score = 0;
        String[] mcqs = {
        "What is Java?\n\nA) A type of coffee\nB) A programming language\nC) An operating system\nD) A web browser\n",
        "What is the entry point for a Java program?\n\nA) main()\nB) start()\nC) run()\nD) begin()\n",
        "Which keyword is used to declare a variable that won't be changed?\n\nA) static\nB) final\nC) const\nD) immutable\n",
        "Which data type is used to store whole numbers in Java?\n\nA) float\nB) double\nC) int\nD) char\n",
        "What is the purpose of the 'if' statement in Java?\n\nA) To declare a variable\nB) To loop through an array\nC) To define a method\nD) To make decisions in the code\n",
        "In Java, objects are instances of __________.\n\nA) Methods\nB) Classes\nC) Interfaces\nD) Variables\n",
        "What does the term 'inheritance' refer to in Java?\n\nA) Gaining access to private members of a class\nB) Creating new interfaces for a class\nC) Reusing properties and behaviors of an existing class\nD) Changing the behavior of a class at runtime\n",
        "Which loop is suitable when the number of iterations is known?\n\nA) for loop\nB) while loop\nC) do-while loop\nD) All of the above\n",
        "What is the Java Virtual Machine (JVM)?\n\nA) A physical computer\nB) A compiler\nC) An interpreter\nD) A runtime environment for executing Java code\n",
        "Which method is called when an object is created from a class?\n\nA) start()\nB) run()\nC) initialize()\nD) constructor()\n"};
        String[] answersWithExplanations = {
            "Correct Answer:B) A programming language\nExplanation: Java is a widely-used programming language known for its platform independence and versatility.",
            "Correct Answer:A) main()\nExplanation: The main() method is the entry point for any Java program. It's the first method that gets executed when the program is run.",
            "Correct Answer:B) final\nExplanation: The final keyword is used to declare a constant variable in Java, which means its value cannot be changed after it is assigned.",
            "Correct Answer:C) int\nExplanation: The int data type is used to store whole numbers (integers) in Java.",
            "Correct Answer:D) To make decisions in the code\nExplanation: The 'if' statement is used for conditional branching, allowing you to execute certain code blocks based on the evaluation of a condition.",
            "Correct Answer:B) Classes\nExplanation: In Java, objects are created from classes. A class is a blueprint or template for creating objects with similar properties and behaviors.",
            "Correct Answer:C) Reusing properties and behaviors of an existing class\nExplanation: Inheritance in Java allows a class (subclass or derived class) to inherit the properties and methods of another class (superclass or base class).",
            "Correct Answer:A) for loop\nExplanation: The 'for' loop is used when the number of iterations is known in advance. It provides a clear and concise way to control the loop's execution.",
            "Correct Answer:D) A runtime environment for executing Java code\nExplanation: The Java Virtual Machine (JVM) is responsible for executing Java bytecode and providing a platform-independent runtime environment for Java programs.",
            "Correct Answer:D) constructor()\nExplanation: The 'constructor' method is called when an object of a class is created. It initializes the object's properties and performs any necessary setup.\n\n"
            };
        String optionAnswers = "babcdbcadd";
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nThis is small quiz on Java Programming Topic where you'll face 10 mcq's having 30 seconds time limit to submit each answer and you will get the Final score and Explanation at the end of the Quiz.");

        while (questionIndex < 10) {
            System.out.println("\nCurrent Score: "+score+"/10       Time Limit: 30sec\n"+(questionIndex + 1)+"."+mcqs[questionIndex]);
            long startTime = System.currentTimeMillis();
            while(true) {
            System.out.print("Enter here: ");
            String option = scanner.nextLine().toLowerCase();
            long endTime = System.currentTimeMillis();
            if(!option.equals("a") && !option.equals("b") && !option.equals("c") && !option.equals("d")) {
                System.out.println("Wrong input! Enter either A or B or C or D and press Enter..");
            } else {
            if(option.equals(optionAnswers.charAt(questionIndex)+"") && (endTime - startTime) <= 30000) {
                System.out.println("Congrats! You've choosen the right option and scored a point, going forward");
                score++;
                break;
            } else if(option.equals(optionAnswers.charAt(questionIndex)+"") && (endTime - startTime) > 30000){
                System.out.println("Correct answer but Time limit exceeded. You didn't scored this one, going forward");
                break;
            } else if((endTime - startTime) > 30000){
                System.out.println("Wrong answer and Time limit Exceeded. You didn't scored this one, going forward");
                break;
            } else {
                System.out.println("Wrong answer! You didn't scored this one, going forward");
                break;
            }
            }
            }
            questionIndex++;
        }

        System.out.println("\nQuiz completed successfully!");
        System.out.println("You scored: "+score+"/10");
        System.out.println("\n\n\nYou're going to see the explanation for each of these in 6 seconds...\n\n");
        try {
            Thread.sleep(6000);
        } catch (Exception e) {};
        for(int i=0;i<10;i++) {
            System.out.print(mcqs[i]);
            System.out.print(answersWithExplanations[i]);
        }
    }
}