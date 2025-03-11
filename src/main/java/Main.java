import java.util.SortedMap;

public class Main {
    public static void main(String[] args) {
        try {
            //Создаем объект с передачей массива чисел
            int[] arrayGrades = {2, 2, 3, 2};
            Student student1 = new Student("Anton", arrayGrades);
            System.out.println(student1);
            //Добавляем объекту одну оценку, смотрим результат
            student1.addGrades(5);
            System.out.println(student1);

            //Создаем объект с передачей произвольного количества аргументов
            Student student2 = new Student("Vlad", 5, 5, 4, 4, 5);
            System.out.println(student2);
            //Добавляем объекту оценки в виде множественного аргумента, смотрим результат
            student2.addGrades(5, 4, 2, 5, 4);
            System.out.println(student2);


            //Вызываем исключение. Пытаемся добавить некорректные оценки:
            student1.addGrades(1,6);
        } catch (Exception e) {
            System.out.println("Событие с уровне Error: " + e.getMessage());
        }
    }
}