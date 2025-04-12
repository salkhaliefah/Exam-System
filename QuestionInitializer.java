
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuestionInitializer {
	
	
	public static ExamSystem.Question[] intializeQuestions(){
		
	// Create a List to hold Question Objects
	List<ExamSystem.Question> questionList = new ArrayList<>(Arrays.asList(
			// Create instance of question class and add them to the list
			// Question 1
			new ExamSystem.Question(
					"LO 1: Which of the following variable names use the correct style?",
					new String[] { "TotalAmount", "totalAmount",
							"total_Amount", "totalamount" },
					"B"),

			// Question2
			new ExamSystem.Question(
					"LO 2: Given: int[] a = {1, 2, 3}; What will be after; a[1] = 5?",
					new String[] { "{1, 5, 2, 3}", "{5, 2, 3} ",
							"{1, 5, 3}", "{5, 1, 2, 3} " },
					"C"),

			// Question 3
			new ExamSystem.Question("LO3: Which of the following is correct?\n"
					+ "public class Student\n" + "{ \n" + "String name;\n"
					+ " Address homeAddress;\n" + "}\n"
					+ "public class Address\n" + "{\n" + "  int number;\n"
					+ "  String streetName;\n" + "  String cityName;\n"
					+ "  String stateName;\n" + "  int zipCode;\n" + "}",
					new String[] { "Student HAS-A Address",
							"Student IS-A Address", "Address HAS-A Student",
							"Address IS-A Student" },
					"A"),

			// Question 4
			new ExamSystem.Question("LO 4:What is a base class in inheritance?",
					new String[] { "Child class", "Parents class\n" + " ",
							"Derived class \n" + "", "Subclass\n" + " " },
					"B"),

			// Question 5
			new ExamSystem.Question("LO 5: What is polymorphism in java? \n",
					new String[] { "Multiple inheritance",
							"Code duplication ", "Code flexibility",
							"Data hiding " },
					"C"),

			// Question 6
			new ExamSystem.Question(
					"LO6: What is the primary purpose of a stack data structure?",
					new String[] { "To store date in sorted order ",
							"To provide quick access to the middle element ",
							"To manage data in a last-in, frist-out(LIFO)manner.",
							"To facilitate random access to elements " },
					"C"),
			// Question 7
			new ExamSystem.Question(
					"LO7: What does the term “polymorphism” mean in object-oriented design?",
					new String[] {
							"The ability of a classroom inherit from multiple classes ",
							"The ability to create objects of different types  ",
							"The ability to write methods with the same name but different implementations.",
							"The ability to hide the details of an object’s implementation " },
					"C"),
			// Question 8
			new ExamSystem.Question("LO8: What does GUI stand for?", new String[] {
					"A visual component on the screen ",
					" An action or occurrence detected by the program  ",
					" A graphical user interface ",
					"A type of layout manager\n" }, "C"),
			// Question 9
			new ExamSystem.Question("LO9: What is an exception in Java?",
					new String[] { "A regular program output ",
							"An error that occurs during program execution  ",
							" A common programming data type",
							"A standard data type" },
					"B"),
			// Question 10
			new ExamSystem.Question(
					"LO10: Which class in java is used for writing to a file?",
					new String[] { "FileWriter", "FileReader ",
							"BufferedReader", "PrintWriter" },
					"A"),
			//Question 11
			new ExamSystem.Question(
					"LO11: What is the purpose of the base case in recursion?",
					new String[] { "It’s just a placeholder\n" + "",
							" It helps with iteration ",
							"Its optional in recursion",
							"it stops recursion \n" + " " },
					"D")

	));

	// Convert the List to an array and assign it to the 'question' filed
	return questionList.toArray(new ExamSystem.Question[0]);

}
}
