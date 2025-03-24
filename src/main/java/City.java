import java.util.HashMap;
import java.util.List;

public class City {
    private String name;
    HashMap<City, Integer> setOfPaths;

    public String getName() {
        return name;
    }

    City(String name){
        this.name = name;
        this.setOfPaths = new HashMap<>();
    }

    City(String name, HashMap<City, Integer> setOfPaths){
        this(name);
        this.setOfPaths = new HashMap<>(setOfPaths);
    }

    public void addPath(City city, int price){
        setOfPaths.put(city, price);
    }

    public void addPath(HashMap<City, Integer> setOfPaths){
        this.setOfPaths.putAll(setOfPaths);
    }

    public City travelBy(int n) {
        City currentCity = this;

        for (int i = 0; i < n; i++) {
            HashMap<City, Integer> setOfPaths = currentCity.setOfPaths;

            if (setOfPaths.isEmpty()) {
                return null;
            }
            currentCity = setOfPaths.keySet().iterator().next();
        }

        return currentCity;
    }

    @Override
    public String toString() {
        String res = getName() + " [";

        for (HashMap.Entry<City, Integer> entry : setOfPaths.entrySet()) {
            res += entry.getKey().getName() + "=" + entry.getValue() + ", ";
        }
        res = res.substring(0, res.length() - 2);
        return res += "]";
    }
}
