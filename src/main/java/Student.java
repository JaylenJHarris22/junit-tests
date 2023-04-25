 import java.util.ArrayList;


public class Student {
        long id;
        String name;
        ArrayList<Integer> grades;


        public Student(){
            this.grades = new ArrayList<>();
        };


        public Student(String name){
            this.name = name;
        }
        public Student(long id){
            this.id = id;
        }
        public Student(long id, String name){
            this.id = id;
            this.name = name;
            this.grades = new ArrayList<>();
        }




        public long getId(){
            return id;
        }


        public String getName() {
            return name;
        }
        public void addGrades(int grade){
            this.grades.add(grade);
        }
        public double getGradeAverage(){
            double total = 0;
            for (double g : grades){
                total += g;
            }
            return total;
        }
}
