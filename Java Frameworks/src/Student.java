public class Student {

    // class variables
    private String studentID;
    private String firstName;
    private String lastName;
    private String email;
    private int age;
    private int[] grades;

    // constructor
    Student(String studentID, String firstName, String lastName, String email, int age, int[] grades){
        setStudentID(studentID);
        setFirstName(firstName);
        setLastName(lastName);
        setEmail(email);
        setAge(age);
        setGrades(grades);
    }

    // getters and setters
    public String getStudentID() {
        return this.studentID;
    }
    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getFirstName() {
        return this.firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return this.email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return this.age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public int[] getGrades() {
        return this.grades;
    }
    public void setGrades(int[] grades) {
        this.grades = grades;
    }

    public void print(){
        System.out.println(getStudentID()+ " "+ getFirstName()+ " "+ getLastName()+" "+getEmail()
        +" "+ getAge()+" "+ getGrades()[0] +" " +getGrades()[1]+ " "+ getGrades()[2]);
    }
}
