package edu.cau.cps.cis301;
import edu.cau.cps.cis301.Student;
import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.*;

public class StudentTest {


    /**
     * sample test for features
     */
    @Test
    public void testNewStudent(){
        double gpa = 2.5;
        ArrayList<String> courses = new ArrayList<String>();
        courses.add("history");
        Student s= new Student("John",courses ,gpa, "male");
        s.says();
    }

}