import java.util.ArrayList;
import java.util.List;

class StudentManager implements StudentOperations {

    private List<Student> students = new ArrayList<Student>();

    public void addStudent(Student student) {

        // Roll number validation
        if (student.getRollNo() <= 0) {
            throw new StudentException("Roll number must be greater than 0.");
        }

        // Empty validation
        if (student.getName().trim().isEmpty() || student.getCourse().trim().isEmpty()) {
            throw new StudentException("Name and course cannot be empty.");
        }

        // Name validation (only alphabets and space allowed)
        if (!student.getName().matches("[a-zA-Z ]+")) {
            throw new StudentException("Name must contain only alphabets.");
        }

        // Course validation (only alphabets and space allowed)
        if (!student.getCourse().matches("[a-zA-Z ]+")) {
            throw new StudentException("Course must contain only alphabets.");
        }

        // Duplicate roll number check
        if (searchStudent(student.getRollNo()) != null) {
            throw new StudentException("Roll number already exists.");
        }

        // Add student
        students.add(student);
    }

    public boolean deleteStudent(int rollNo) {
        Student student = searchStudent(rollNo);

        if (student == null) {
            return false;
        }

        students.remove(student);
        return true;
    }

    public Student searchStudent(int rollNo) {
        for (Student student : students) {
            if (student.getRollNo() == rollNo) {
                return student;
            }
        }
        return null;
    }

    public List<Student> getAllStudents() {
        return students;
    }
}
