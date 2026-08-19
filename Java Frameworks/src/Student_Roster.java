import java.util.ArrayList;

public class Student_Roster {
    public ArrayList<Student> studentRoster = new ArrayList<Student>();

    //methods to add student to a roster
    public void add(String studentID, String firstName, String lastName, String email,
                    int age, int grade1, int grade2, int grade3){
        int[] grades = {grade1, grade2, grade3};


        Student student = new Student(studentID, firstName, lastName, email, age, grades);
        studentRoster.add(student);
    }

    public void remove(String studentID){
        int i = 0;
        boolean IDPresent = false;

        while(i<studentRoster.size()){
            if(studentID.equals(studentRoster.get(i).getStudentID())){
                studentRoster.remove(i);
                IDPresent = true;
            }
            else{
                i++;
            }
        }
        if(!IDPresent){
            System.out.println("A student with this ID was not found.");
        }
    }

    public void print_all(){
        for(int i=0; i<studentRoster.size();i++){
            System.out.print("\t");
            studentRoster.get(i).print();
        }

    }

    public void print_avg_grade(String studentID){
        int i = 0;
        boolean IDPresent = false;
        int[] listOfGrades;
        double total= 0;
        int count = 0;
        double avg_grade;
        String currentStudent;
        while(i<studentRoster.size()){
            if(studentID.equals(studentRoster.get(i).getStudentID())){
                currentStudent = studentRoster.get(i).getFirstName();
                listOfGrades = studentRoster.get(i).getGrades();
                for(int grade: listOfGrades){
                    total += grade;
                    count++;
                }
                avg_grade = total/count;
                avg_grade = Math.round(avg_grade*10.0)/10.0;
                System.out.println("The avg grade for student "+ currentStudent +"  is: " + avg_grade);
                IDPresent = true;
                break;
            }
            else{
                i++;
            }
        }
        if(IDPresent==false){
            System.out.println("A student with this ID was not found.");
        }
    }

    public void print_invalid_emails(){
        for(Student student:studentRoster){
            String email = student.getEmail();
            if(!email.contains("@") || !email.contains(".") || email.contains(" ")){
                System.out.println(email);
            }
        }
    }


}
