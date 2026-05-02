import java.util.List;

interface StudentOperations {
    void addStudent(Student student);

    boolean deleteStudent(int rollNo);

    Student searchStudent(int rollNo);

    List<Student> getAllStudents();
}