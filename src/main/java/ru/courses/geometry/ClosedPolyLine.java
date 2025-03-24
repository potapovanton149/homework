package ru.courses.geometry;

import java.util.Arrays;

/**
 * Здесь упоролся в собственную же реализацию класса ru.courses.geometry.PolyLine. Так как ранее мы сделали возможность передавать
 * в конструктор лист точек и лист линий, а на этапе компиляции java ожидает список идентичных объектов,
 * то реализовал конструкторы через статический контекст. Думал как можно не изменяя класс ru.courses.geometry.PolyLine корректно
 * наследоваться, но видимо никак :)
 * <p>
 * Пришлось в классе Polyline отказаться от статики, а конструктор без параметров и полю присвоил идентификатор
 * доступности protected, дабы класс наследник имел доступ к полям и конструктору бати.
 * <p>
 * На будущее наверное буду делать так:
 * 1) Если код чисто что-то заскриптовать, то и статикой можно обойтись
 * 2) Если код будет иметь явно прирастающий инкремент, то конструкторы реализовать через неопределенно
 * количество параметров (ru.courses.geometry.Point... listPoint) дабы была возможность нормально наследоваться без правок в классе родителя
 * <p>
 * Метод getLength() мне переопределять не пришлось, так как там расширенный for, а toString работает и с такой реализацией. (см. Mani)
 */


public class ClosedPolyLine extends PolyLine {
    ClosedPolyLine(Line... listLine) {
        super();
        lineList.addAll(Arrays.asList(listLine));

        //замыкаем последнюю точку последней линии и первую точку первой линии
        lineList.add(
                new Line(
                        lineList.get(lineList.size() - 1).getEndLine(),
                        lineList.get(0).getStartLine()));
    }

    ClosedPolyLine(Point... listPoint) {
        super();
        for (int i = 0; i < listPoint.length - 1; i++) {
            lineList.add(new Line(listPoint[i], listPoint[i + 1]));
        }

        //замыкаем последнюю точку последней линии и первую точку первой линии
        lineList.add(
                new Line(
                        lineList.get(lineList.size() - 1).getEndLine(),
                        lineList.get(0).getStartLine()));
    }
}
