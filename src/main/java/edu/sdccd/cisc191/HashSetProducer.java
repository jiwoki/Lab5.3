package edu.sdccd.cisc191;

import java.util.HashSet;
import java.util.Set;

public class HashSetProducer {

    private final Set<String> set;

    public HashSetProducer(HashSet<String> set) {
        this.set = set;
    }

    public boolean produce(String s) {
        return set.add(s);
    }
}
