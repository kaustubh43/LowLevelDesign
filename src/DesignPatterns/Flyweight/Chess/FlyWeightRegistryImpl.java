package DesignPatterns.Flyweight.Chess;

import java.util.HashMap;
import java.util.Map;

public class FlyWeightRegistryImpl implements FlyWeightRegistry {
    // Email: UserIntrinsicState
    private Map<String, UserIntrinsicState> registry = new HashMap<>();

    @Override
    public void addFlyweight(UserIntrinsicState flyweight) {
        registry.put(flyweight.getEmail(), flyweight);
    }

    @Override
    public UserIntrinsicState getFlyweight(String email) {
        return registry.get(email);
    }
}