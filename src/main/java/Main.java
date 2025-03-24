import ru.courses.birds.Bird;
import ru.courses.birds.Cuckoo;
import ru.courses.birds.Parrot;
import ru.courses.birds.Sparrow;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void birdCage(List<Bird> birdList){
        for (Bird birds : birdList){
            birds.sing();
        }
    }
    public static void main(String[] args) {
        Sparrow sparrow1 = new Sparrow();
        Cuckoo cuckoo1 = new Cuckoo();
        Parrot parrot1 = new Parrot("Гоша хоррррошииий");

        Sparrow sparrow2 = new Sparrow();
        Cuckoo cuckoo2 = new Cuckoo();
        Parrot parrot2 = new Parrot("Хочу кушать");

        Sparrow sparrow3 = new Sparrow();
        Cuckoo cuckoo3 = new Cuckoo();
        Parrot parrot3 = new Parrot("Убери нож, я больше ночью петь не буду");

        List<Bird> birdList = new ArrayList<>();

        birdList.add(sparrow1);
        birdList.add(cuckoo1);
        birdList.add(parrot1);

        birdList.add(sparrow2);
        birdList.add(cuckoo2);
        birdList.add(parrot2);

        birdList.add(sparrow3);
        birdList.add(cuckoo3);
        birdList.add(parrot3);

        birdCage(birdList);
    }
}