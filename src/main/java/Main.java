import ru.courses.birds.Cuckoo;
import ru.courses.birds.Parrot;
import ru.courses.birds.Sparrow;

public class Main {
    public static void main(String[] args) {
        Sparrow sparrow = new Sparrow();
        Cuckoo cuckoo = new Cuckoo();
        Parrot parrot = new Parrot("Привет, как дела?");

        sparrow.sing();
        cuckoo.sing();
        parrot.sing();
    }
}