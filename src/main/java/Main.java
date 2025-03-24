public class Main {
    public static void main(String[] args) {
        Line line1 = new Line(1, 3, 5, 8);
        Line line2 = new Line(10, 11, 15, 19);
        Line line3 = new Line(line1.getEndLine(), line2.getStartLine());

        System.out.println("1.Текстовое представление Линии 3:\n" +
                line3.toString());
        System.out.println("\n\n\n2.Измените координаты точек начала и конца Линии 3 " +
                "таким образом, чтобы изменились все три объекта Линии.\n" +
                "\nИзначальное состояние объектов:\n" +
                line1.toString() + "\n" +
                line2.toString() + "\n" +
                line3.toString());

        line1.setEndLine(new Point(10, 10));
        line2.setStartLine(new Point(10, 10));
        line3.setStartLine(line1.getEndLine());
        line3.setEndLine(line2.getStartLine());

        System.out.println("\nСостояние всех объектов после изменения:\n" +
                line1.toString() + "\n" +
                line2.toString() + "\n" +
                line3.toString());

        System.out.println("\n\n\n3.Выведите текстовое представление Линии 3 " +
                "на экран после изменения её состояния:\n" +
                line3.toString());

        System.out.println("\n\n\n4.Рассчитайте суммарную длину всех трех линий" +
                " и выведите её на экран:\n" +
                (line1.getLenght() + line2.getLenght() + line3.getLenght()));
    }
}