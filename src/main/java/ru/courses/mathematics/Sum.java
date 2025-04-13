package ru.courses.mathematics;

public class Sum {
    public static void main(String[] args){
        double res = 0;

        for (int i = 0; i < args.length; i++) {
            try {
                res += Double.parseDouble(args[i]);
            } catch (NumberFormatException ex) {
                System.out.println(ex.getMessage());
            }
        }
        System.out.println(res);
    }
}

