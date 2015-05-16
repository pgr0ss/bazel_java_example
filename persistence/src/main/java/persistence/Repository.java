package persistence;

import java.util.concurrent.ConcurrentHashMap;

public class Repository {

    private final ConcurrentHashMap<String, String> map;

    public Repository() {
        this.map = new ConcurrentHashMap<>();
    }

    public void set(String foo, String bar) {
        map.put(foo, bar);
    }

    public String get(String foo) {
        return map.get(foo);
    }
}
