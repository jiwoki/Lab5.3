package edu.sdccd.cisc191;

import java.util.HashMap;
import java.util.Map;

public class HashMapConsumer {

    private final Map<String, String> map;

    public HashMapConsumer(HashMap<String, String> map) {
        this.map = map;
    }

    public String consume(String key) {
        return map.remove(key);
    }
}
