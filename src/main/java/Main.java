public class Main {
    public static void main(String[] args) {
        Point point1 = new Point(1, 3);
        Point point2 = new Point(1, 3);
        Point point3 = new Point(5, 8);

        System.out.println("Проверка инициализации объектов: \n" +
                point1 + "\n" +
                point2 + "\n" +
                point3 + "\n"
        );
        System.out.printf("Результат сранения по ссылке:" +
                        "\n 1 и 2 точка = %b" +
                        "\n 2 и 3 точка = %b",
                point1 == point2, point2 == point3);

        System.out.printf("\n\nРезультат сранения объектов:" +
                        "\n 1 и 2 точка = %b" +
                        "\n 2 и 3 точка = %b",
                point1.equals(point2), point2.equals(point3));
    }
}