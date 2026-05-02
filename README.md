Project Description

This project is a Student Management System developed using Java and Swing (GUI). The application allows users to manage student records efficiently through a graphical interface. Users can add, delete, search, and view student details. The system ensures proper validation and error handling for reliable data management.

Features
User-friendly Graphical User Interface (GUI)
Add student with roll number, name, and course
Delete student by roll number
Search student details
Display all student records
Input validation for roll number, name, and course
Duplicate roll number prevention
Exception handling using custom exception class
Technologies Used
Java (JDK 8 or above)
Java Swing (GUI Framework)
OOP Concepts (Inheritance, Abstraction, Interfaces)
File Structure
StudentManagementSystem/
│
├── Main.java
├── Person.java
├── Student.java
├── StudentException.java
├── StudentOperations.java
├── StudentManager.java
└── StudentGUI.java
How to Run the Project
Step 1: Compile the Project
javac *.java
Step 2: Run the Application
java Main
Application Controls / Usage
Enter Roll Number, Name, and Course
Click Add → Add a new student
Click Delete → Remove student by roll number
Click Search → Find student details
Click Show All → Display all students
Application Flow
Launch the application
Enter student details (Roll No, Name, Course)
Perform operations using buttons:
Add student
Delete student
Search student
View all students
Output is displayed in the text area
Error messages are shown using dialog boxes
Validation & Exception Handling
Roll number must be greater than 0
Name and course cannot be empty
Only alphabets allowed in name and course
Duplicate roll numbers are not allowed
Custom exception (StudentException) used for handling errors
Testing

The system was tested using manual testing. Functional testing was performed for:

Student addition
Input validation
Duplicate detection
Student deletion
Search functionality
Display all records

All test cases passed successfully.

Future Enhancements
Database integration (MySQL / SQLite)
Update student details feature
Sorting and filtering options
Export data to file (CSV/Excel)
Improved UI design
Login authentication system
