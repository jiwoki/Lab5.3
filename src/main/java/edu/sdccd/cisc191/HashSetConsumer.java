package edu.sdccd.cisc191;

import java.util.HashSet;
import java.util.Set;

public class HashSetConsumer {

    private final Set<String> set;
    public HashSetConsumer(HashSet<String> set) {
        this.set = set;
    }

    public boolean consume(String s) {
        return set.remove(s);
    }
}
