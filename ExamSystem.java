
/**
 * ExamSystem creates a window with button options to interaction with exam.
 * The user can navigate through questions and choose options for each question.
 * 
 * @author Safa Al Khaliefah
 * 
 * Last updated : April 2025
 * 
 * */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 * ExamSystem class represents a GUI application for an exam system.
 */
public class ExamSystem extends JFrame implements ActionListener {
    private static final long serialVersionUID = 1L;

    //fields for GUI Components 
    private JPanel panel;
    JButton startButton;
    private JTextArea examTextArea;
    private JPanel optionsPanel;
    private int currentQuestion = 1;
    private Question[] questions;
    
    /**
     * Constructor for ExamSystem
     * Initializes the GUI window and components
     */
    public ExamSystem() {
    	//window title
        setTitle("Exam System");
        //window size
        setSize(1050, 750);
        //allows window to class when exit button is clicked
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //calling builPanel method to window
        buildPanel();
        //adding panelMethod to window
        add(panel);
        
        //show window
        setVisible(true);
        //calling initializQuestion method
        initializeQuestions();
    }
    
    
    /**
     * BuildPanel method arranges GUI components
     */
    private void initializeQuestions() {
        questions = QuestionInitializer.intializeQuestions();
    }

    private void buildPanel() {
    //Creating new jPanel to ass bottomPanel, examTextArea, optionsPenl
        panel = new JPanel(new BorderLayout());
        //changing panel background
        panel.setBackground(Color.LIGHT_GRAY);

        //creating start button
        startButton = new JButton("Start Exam");
        //registering the event handler for start button
        startButton.addActionListener(this);

        //creating and placing optionsPanel(A,B,C,D) in a 4,1 grid layout
        optionsPanel = new JPanel(new GridLayout(4, 1));
        //setting color of options panel
        optionsPanel.setBackground(Color.lightGray);

        //creating JTextArea for questions
        examTextArea = new JTextArea();
        //Allows user to highlight and copy text
        examTextArea.setEditable(false);

        //setting size of the start Button and font
        startButton.setPreferredSize(new Dimension(0, 30));
        startButton.setFont(new Font("Arial", Font.PLAIN, 20));

        //Panel placement 
        panel.add(optionsPanel, BorderLayout.EAST);
        panel.add(examTextArea, BorderLayout.CENTER);
        panel.add(startButton, BorderLayout.SOUTH);

        //displaying options panel
        optionsPanel.setVisible(false);
    }
    /**
     * Displaying first question and the answer options
     */
    private void startExam() {
        currentQuestion = 1;
        displayQuestion();
        showOptions();
    }

    /**
     * Displays current question and its multiple-choice options in text area
     */
    private void displayQuestion() {
        Question q = questions[currentQuestion - 1];
        examTextArea.setFont(new Font("Arial", Font.ITALIC, 25));
        examTextArea.setBackground(Color.lightGray);
        examTextArea.setText(q.getText() + "\n\n" + "A. " + q.getOptions()[0]
                + "\n\nB. " + q.getOptions()[1]
                + "\n\nC. " + q.getOptions()[2]
                + "\n\nD. " + q.getOptions()[3]);
    }
    
    /**
     * checks if selected answer is correct 
     * if its correct, it goes on to the next question or finishes exam
     * if incorrect, prompts user to try again
     */
    private void checkAnswer(ActionEvent e) {
        String selectedOption = ((JButton) e.getSource()).getText();
        String correctOption = questions[currentQuestion - 1].getCorrectOption();

        if (selectedOption.equals(correctOption)) {
            currentQuestion++;
            if (currentQuestion <= questions.length) {
                displayQuestion();
                showOptions();
            } else {
                examTextArea.setText("Exam completed, Congratulations!");
                optionsPanel.setVisible(false);
                validate();
            }
        } else {
            examTextArea.setText("Incorrect answer, Please try again.");
        }
    }
    
    /**
     * Displaying answer choice buttons (A-D) for current question
     */
    private void showOptions() {
        optionsPanel.removeAll();
        String[] optionLetters = {"A", "B", "C", "D"};
        for (String letter : optionLetters) {
            JButton button = new JButton(letter);
            button.addActionListener(this::checkAnswer);
            optionsPanel.add(button);
        }
        optionsPanel.setVisible(true);
        validate();
    }
   
    
    /**
     * Handles button actions. Starts the exam when the start button is clicked
     */

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == startButton) {
            startExam();
        }
    }
    
    /*
     * Launches the ExamSystem GUI
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            try {
                new ExamSystem();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,
                        "An error occurred: " + e.getMessage(), "Error",
                        JOptionPane.ERROR_MESSAGE);
                e.printStackTrace();
            }
        });
    }

    /**
     * Represents a single multiple-choice question with text, answer options
     */
    public static class Question {
        private String text;
        private String[] options;
        private String correctOption;

        public Question(String text, String[] options, String correctOption) {
            this.text = text;
            this.options = options;
            this.correctOption = correctOption;
        }

        public String getText() { return text; }

        public String[] getOptions() { return options; }

        public String getCorrectOption() { return correctOption; }
    }
}
