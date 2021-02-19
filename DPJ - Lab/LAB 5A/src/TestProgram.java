// superclass --- Student.java
class Student {
    private String studentName, studentID, faculty;

    public Student (String sName, String sID, String sFac) {
        studentName = sName;
        studentID = sID;
        faculty = sFac;
    }

    public String getStudentName ( ) {
        return studentName;
    }
}

// subclass --- PostGraduate
class PostGraduate extends Student {
    private String thesisTitle, supervisor;
    private boolean isCompleted = false;

    public PostGraduate (String sName, String sID, String sFac, String thTitle, String svName) {
        super(sName,sID,sFac);
        thesisTitle = thTitle;
        supervisor = svName;
    }

    public void setThesisStatus (boolean status) {
        isCompleted = status;
    }

    public String getStatus ( ) {
        String status;
        if(isCompleted)
            status = "Pass";
        else
            status = "Pending";
        return status;
    }
}

// subclass --- UnderGraduate.java
class UnderGraduate extends Student {
    private String course;
    private double cgpa;

    public UnderGraduate (String sName, String sID, String sFac, String course, double cgpa) {
        super(sName,sID,sFac);
        this.course = course;
        this.cgpa = cgpa;
    }

    public String getStatus ( ) {
        String status = cgpa>= 3.50 && cgpa<=4.00 ? "Pass with Distinction" :
                        cgpa>= 3.00 && cgpa<3.50 ? "Pass with Credit" :
                        cgpa>= 2.00 && cgpa<3.00 ? "Pass" :
                        "Fail" ;
        return status;
    }
}

// main class --- TestProgram.java
public class TestProgram {
    public static void main (String [] args) {
        PostGraduate obj1 = new PostGraduate("Amanda","20091123","Business Management", "The Impact of Social Medial in Education", "Dr. Adibah");
        obj1.setThesisStatus(true);
        System.out.println(obj1.getStudentName() + "'s academic status    : " + obj1.getStatus());

        UnderGraduate obj2 = new UnderGraduate("Patrick", "20096544", "Computer Science", "Software Engineering", 3.43);
        System.out.println(obj2.getStudentName() + "'s academic status   : " + obj2.getStatus());
    }
}