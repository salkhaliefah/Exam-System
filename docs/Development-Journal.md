## Week 1: Project Proposal & Initial UI/UX Design

### Project Pitch — Intermediate Java Exam System

The goal of this project was to develop an interactive Java Exam System for students looking to practice intermediate-level Java programming concepts.

I wanted to create an application containing approximately 10 multiple-choice questions, each covering a learning objective from my intermediate Java course (CISC 191). My original vision included student registration, question navigation, exam submission, and a results page to help students evaluate their understanding of Java programming.

### Initial UI/UX Design

Before beginning the coding process, I created hand-drawn sketches to visualize the application's interface and how users would navigate through the exam.

**Figure 1: Initial Java Exam System UI/UX Sketches**

<img width="1072" height="276" alt="Screenshot 2026-10-16 at 12 41 06 PM" src="https://github.com/user-attachments/assets/aee38563-d86d-4373-ae04-b099f70f622d" />

The sketches show my original design, starting with a student information screen, followed by the multiple-choice exam, a submission button, and a learning-outcome evaluation page.

As I progressed through development, I experimented with different Java Swing layouts, buttons, and event listeners. Some of my original design ideas changed as I worked through programming challenges.

Although I completed the interactive exam interface, I did not end up implementing the student registration or final results page. These remained ideas for future improvements.

### Object-Oriented Design: CRC Cards & UML Diagram

Before coding, I created CRC (Class-Responsibility-Collaborator) cards and a UML class diagram to plan the application's structure and how the different classes would interact.

#### CRC Cards

I used CRC cards to outline the responsibilities, attributes, and relationships of four planned classes: **Student, Exam, Questions, and Results**.

**Figure 2: Initial CRC Cards**

<img width="589" height="754" alt="Screenshot 2026-10-16 at 12 49 58 PM" src="https://github.com/user-attachments/assets/de3f95bd-536a-435f-9da7-1c8ed89a75ea" />

#### UML Class Diagram

I created a UML class diagram to visualize the classes, their attributes, methods, and relationships using object-oriented design principles.

**Figure 3: Initial UML Class Diagram**

<img width="670" height="389" alt="Screenshot 2026-10-16 at 12 50 49 PM" src="https://github.com/user-attachments/assets/a4210cd2-d851-4991-acbe-3eb0b9c4f3d7" />

### Project Demonstration Video

https://github.com/user-attachments/assets/ff42c3b0-44d6-4554-a284-4740c8884762

https://github.com/user-attachments/assets/d3b240ff-ab8c-4baa-9d65-24f5125f3a6d

### Initial 8-Week Development Plan

I created an eight-week timeline to organize the development process, starting with object-oriented design and progressing toward GUI implementation, event handling, testing, and debugging.

| Week | Planned Development Goals |
|---|---|
| **1** | Plan the application structure, create CRC cards and a UML diagram. |
| **2** | Begin implementing Java classes and developing test cases. |
| **3** | Research Java Swing, design the GUI, and identify potential errors. |
| **4** | Implement question navigation and connect the exam screens. |
| **5** | Develop the interface, buttons, and question progression logic. |
| **6** | Implement event handling to make the GUI interactive. |
| **7** | Test the application, troubleshoot errors, and refine functionality. |
| **8** | Complete debugging, finalize the project, and record a demonstration video. |

This timeline served as my initial development plan. As I progressed, I adjusted certain goals and features based on the challenges I encountered.

## Development Progress & Challenges

Throughout the eight-week development process, I documented my progress, design changes, and challenges while building the Java Exam System.

### Weeks 2–3: Getting Started
During the first few weeks, I focused on planning how to begin implementing my project. My initial goal was to create a student information window before developing the exam interface.
One of my biggest challenges was figuring out where to start and how to turn my original design into a functional Java application.
Although I had created my initial sketches and object-oriented design diagrams, I was still exploring how to structure the code and organize the GUI components.

### Week 4: Initial GUI Development

I began working on the application's GUI and experimenting with different Java Swing components.
My original idea was to have a separate window for each question, allowing users to move between questions by clicking a button. However, I had trouble connecting the different windows and getting the navigation to work.
I also noticed that the placement of GUI components was starting to differ from my original sketches.

**Figure 4: Early GUI Development**

<img width="1069" height="566" alt="Screenshot 2026-10-16 at 1 06 17 PM" src="https://github.com/user-attachments/assets/66b4289f-4b3a-438f-a1b3-63b2459e7210" />


### Week 5: GUI Layout & Button Functionality

I made several changes to the interface to improve its layout and functionality.

Instead of displaying the full answer choices on individual buttons, I included the answers within the question text and used buttons labeled A, B, C, and D.
One challenge was getting the "Start Exam" button to appear before the questions. At one point, the GUI components stopped displaying entirely, but after troubleshooting, I was able to get them to appear again.

**Figure 5: Updated Exam Interface**

<img width="1167" height="419" alt="Screenshot 2026-10-16 at 1 06 46 PM" src="https://github.com/user-attachments/assets/e335e271-ee0c-4c04-92ce-c0d874033b90" />

### Week 6: Question Navigation & Event Handling

I changed the navigation design by removing the need for a separate "Next" button. Instead, selecting the correct answer would automatically advance the user to the next question.

If the user selected an incorrect answer, the application would display a message and require the exam to be restarted.

I also encountered difficulties displaying longer questions within the window. I experimented with text formatting and used Java's newline character (`\n`) to separate the text into multiple lines.

By this point, the main exam functionality was nearly complete.

**Figure 6: Question Navigation & Answer Feedback**

<img width="1015" height="277" alt="Screenshot 2026-10-16 at 1 07 26 PM" src="https://github.com/user-attachments/assets/ff6a2e88-acb7-49c1-a3b3-31abde43f5da" />

### Week 7: Testing & Debugging

During Week 7, I continued testing the application and troubleshooting issues.
I wanted to implement a login system but had difficulty figuring out how to integrate it into the existing code. I began realizing that this feature might have been easier to develop if I had planned its implementation earlier.
I kept the main exam interface relatively unchanged while focusing on the application's functionality.

**Figure 7: Exam System During Testing**

<img width="567" height="315" alt="Screenshot 2026-10-16 at 1 08 41 PM" src="https://github.com/user-attachments/assets/41662706-21f1-4582-81b1-39d89494a1dd" />

### Week 8: Final Project & Reflection

During the final week, I made minor adjustments to the interface, including increasing the size of the "Start Exam" button.
Although I completed the interactive exam functionality, I wasn't able to implement every feature from my original proposal. The login system and final score calculation remained unfinished.
Looking back, one of my biggest takeaways was understanding the importance of planning the application's structure before implementing additional features.
This project gave me hands-on experience with Java Swing, GUI layouts, event handling, debugging, and connecting different components of an application.

**Figure 8: Final Java Exam System**
<img width="584" height="320" alt="Screenshot 2026-10-16 at 1 11 19 PM" src="https://github.com/user-attachments/assets/952b9e22-e471-49ff-9aa2-56cefcc8b555" />


### Final Project Demonstration

https://github.com/user-attachments/assets/9e72909d-a219-4f5a-b98f-ff80d0698347

### Future Improvements

If I continue developing this project, I would like to:

- Implement a student login system.
- Add a scoreboard that calculates the user's overall exam results.
- Improve the question navigation and retry functionality.
- Continue refining the GUI design and user experience.








