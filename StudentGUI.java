import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class StudentGUI extends JFrame {
    private StudentManager manager = new StudentManager();

    private JTextField rollField = new JTextField();
    private JTextField nameField = new JTextField();
    private JTextField courseField = new JTextField();
    private JTextArea outputArea = new JTextArea();

    StudentGUI() {
        setTitle("Simple Student Management System");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel formPanel = new JPanel(new GridLayout(3, 2, 5, 5));

        formPanel.add(new JLabel("Roll No"));
        formPanel.add(rollField);

        formPanel.add(new JLabel("Name"));
        formPanel.add(nameField);

        formPanel.add(new JLabel("Course"));
        formPanel.add(courseField);

        JPanel buttonPanel = new JPanel();

        JButton addButton = new JButton("Add");
        JButton deleteButton = new JButton("Delete");
        JButton searchButton = new JButton("Search");
        JButton showButton = new JButton("Show All");

        buttonPanel.add(addButton);
        buttonPanel.add(deleteButton);
        buttonPanel.add(searchButton);
        buttonPanel.add(showButton);

        outputArea.setEditable(false);

        add(formPanel, BorderLayout.NORTH);
        add(new JScrollPane(outputArea), BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);

        addButton.addActionListener(e -> addStudent());
        deleteButton.addActionListener(e -> deleteStudent());
        searchButton.addActionListener(e -> searchStudent());
        showButton.addActionListener(e -> showAllStudents());

        setVisible(true);
    }

    private void addStudent() {
        int rollNo = getRollNo();

        if (rollNo == -1 || nameField.getText().isEmpty() || courseField.getText().isEmpty()) {
            showMessage("Please enter valid details.");
            return;
        }

        try {
            Student student = new Student(
                    rollNo,
                    nameField.getText(),
                    courseField.getText()
            );

            manager.addStudent(student);

            showMessage("Student added.");
            clearFields();
            showAllStudents();
        } catch (StudentException e) {
            showMessage(e.getMessage());
        }
    }

    private void deleteStudent() {
        int rollNo = getRollNo();

        if (manager.deleteStudent(rollNo)) {
            showMessage("Student deleted.");
        } else {
            showMessage("Student not found.");
        }

        clearFields();
        showAllStudents();
    }

    private void searchStudent() {
        Student student = manager.searchStudent(getRollNo());

        if (student == null) {
            outputArea.setText("Student not found.");
        } else {
            outputArea.setText(student.getDetails());
        }
    }

    private void showAllStudents() {
        outputArea.setText("");

        for (Student student : manager.getAllStudents()) {
            outputArea.append(student.getDetails() + "\n");
        }
    }

    private int getRollNo() {
        try {
            return Integer.parseInt(rollField.getText());
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    private void clearFields() {
        rollField.setText("");
        nameField.setText("");
        courseField.setText("");
    }

    private void showMessage(String message) {
        JOptionPane.showMessageDialog(this, message);
    }
}