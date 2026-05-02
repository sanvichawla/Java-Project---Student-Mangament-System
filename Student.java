class Student extends Person {
    private int rollNo;
    private String course;

    Student(int rollNo, String name, String course) {
        super(name);
        this.rollNo = rollNo;
        this.course = course;
    }

    int getRollNo() {
        return rollNo;
    }

    String getCourse() {
        return course;
    }

    @Override
    String getDetails() {
        return rollNo + " - " + getName() + " - " + course;
    }
}