import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CohortTest {
    Student student;
    Cohort cohort;
    @Before
    public void setUp(){
        cohort = new Cohort();
        student = new Student(1, "James");
        student.addGrade(90);
        student.addGrade(93);
        Student student2 = new Student(2, "Sasha");
        student2.addGrade(96);
        student2.addGrade(100);
        cohort.addStudent(student);
        cohort.addStudent(student2);
    }

    @Test
    public void checkToSeeStudentCanAdd(){
        Student student2 = student;
        assertEquals(student2, cohort.getStudents().get(0));
    }
    @Test
    public void checkToSeeStudentsReturned(){
        assertTrue(cohort.getStudents().size() > 0);
    }
    @Test
    public void checkToSeeAvgCohortGrade(){
        assertEquals(94.75, cohort.getCohortAverage(), 0);
    }
}
