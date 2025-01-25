package ducks;

import java.util.HashMap;
import java.util.Map;

public class DuckRepository {

    private final Map<String, Duck> duckMap;

    public DuckRepository() {
        duckMap = new HashMap<>();

        duckMap.put("RubberDuck", new RubberDuck());
        duckMap.put("WoodenDuck", new WoodenDuck());
    }

    public Duck getDuck(String duckType) {
        return duckMap.get(duckType);
    }
    
}
