import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.*;


public class StudentTest {
        private ArrayList<Integer> grades;


        @Before
        public void setUp(){
            this.grades = new ArrayList<>();
        }


        @Test
        public void studentConstructorMakesStudentObject(){
            Student student = new Student();
            assertNotNull(student);
        }


        @Test
        public void getStudentId(){
            Student student = new Student(45);
            assertEquals(45, student.getId());
        }


        @Test
        public void getStudentName(){
            Student student = new Student("Terry");
            assertEquals("Terry", student.getName());
        }


//    @Test
//    public void getStudentId(){
//        Student student = new Student(45);
//        assertEquals(45, student.getId());
//    }`


        @Test
        public void addGradesToArrayList(){
            ArrayList<Integer> grades = new ArrayList<>();
            grades.add(14);
            assertSame(14, grades.get(0));
        }


        @Test
        public void getTheStudentGradeAverages(){
            Student student = new Student();
            student.grades.add(5);
            assertEquals(5.0, student.getGradeAverage(), 0);
        }
}