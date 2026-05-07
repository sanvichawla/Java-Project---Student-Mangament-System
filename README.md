# Student Management System

A simple and user-friendly desktop application developed using **Java** and **Swing GUI** to manage student records efficiently.

---

## Project Description

The **Student Management System** allows users to manage student data through an interactive graphical interface. Users can:

- Add new student records
- Delete existing students
- Search student details
- Display all student records

The system also includes proper validation and exception handling to ensure reliable data management.

---

##  Features

- User-friendly Graphical User Interface (GUI)
- Add student with:
  - Roll Number
  - Name
  - Course
- Delete student by roll number
- Search student details
- Display all student records
- Input validation for all fields
- Duplicate roll number prevention
- Custom exception handling using `StudentException`

---

##  Technologies Used

- Java (JDK 8 or Above)
- Java Swing (GUI Framework)
- Object-Oriented Programming Concepts:
  - Inheritance
  - Abstraction
  - Interfaces

---

##  Project Structure

```text
StudentManagementSystem/
│
├── Main.java
├── Person.java
├── Student.java
├── StudentException.java
├── StudentOperations.java
├── StudentManager.java
└── StudentGUI.java
```

---

## ▶ How to Run the Project

### Step 1: Compile the Project

```bash
javac *.java
```

### Step 2: Run the Application

```bash
java Main
```

---

## Application Controls

### Input Fields
- Roll Number
- Student Name
- Course

### Buttons
- **Add** → Add a new student
- **Delete** → Remove student by roll number
- **Search** → Find student details
- **Show All** → Display all student records

---

##  Application Flow

```text
Start Application
      ↓
Enter Student Details
      ↓
Choose Operation
(Add / Delete / Search / Show All)
      ↓
Display Result
      ↓
Show Error Message (if any)
```

---

## Validation & Exception Handling

### Validation Rules
- Roll number must be greater than 0
- Name cannot be empty
- Course cannot be empty
- Only alphabets allowed in name and course
- Duplicate roll numbers are not allowed

### Exception Handling
- Custom exception class: `StudentException`
- Handles invalid input and duplicate entries

---

## Testing

The system was tested using **manual testing**.

### Functional Testing Performed
- Student addition
- Input validation
- Duplicate detection
- Student deletion
- Search functionality
- Display all records

### Result
All test cases passed successfully.

---

## Future Enhancements

- Database integration (MySQL / SQLite)
- Update student details feature
- Sorting and filtering options
- Export data to CSV/Excel
- Improved UI design
- Login authentication system

---

## Learning Outcomes

- Java Swing GUI Development
- Object-Oriented Programming
- Exception Handling
- Interfaces and Abstraction
- Data Validation
- Event Handling in Java

---

## Author

Developed as a Java Mini Project for learning and academic purposes.
