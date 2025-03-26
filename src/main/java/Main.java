import ru.courses.geometry.*;
import ru.courses.university.ImplementationOfTheContract;
import ru.courses.university.Student;


public class Main {
    public static void main(String[] args) {
       try {
           Student student = new Student("Anton", new ImplementationOfTheContract(), 4, 6, 8, 10, 12, 14);
           //валидно
           System.out.println(student);

           //пытаемся добавить не четную оценку
           student.addGrades(5);
           System.out.println(student);
       } catch (Exception e){
           System.out.println(e.getMessage());
       }
    }
}