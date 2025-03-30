package ru.courses.other;

import javax.swing.text.html.MinimalHTMLWriter;

public enum MathOperation {
    SUM {
        public int action(int x, int y) {
            return x + y;
        }
    },
    SUBTRACTION {
        public int action(int x, int y) {
            return x - y;
        }
    },
    MULTIPLICATION {
        public int action(int x, int y) {
            return x * y;
        }
    },
    DIVISION {
        public int action(int x, int y) {
            return x / y;
        }
    };

    public abstract int action(int x, int y);
}