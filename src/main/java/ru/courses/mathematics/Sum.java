package ru.courses.mathematics;

public class Sum {
    public static void main(String[] args) throws NumberFormatException {
        double x = 0;
        double y = 0;

        int count = 0;

        for (String string : args) {
            try {
                if (count == 0) {
                    x = Double.parseDouble(string);
                    count++;
                } else if (count == 1) {
                    y = Double.parseDouble(string);
                    break;
                }
            } catch (NumberFormatException ex) {
                System.out.println(ex.getMessage());
            }
        }
        System.out.println(x + y);
    }
}

