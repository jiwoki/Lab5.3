package edu.sdccd.cisc191;

import java.util.ArrayList;
import java.util.List;

public class ArrayListProducer {

    private final List<String> list;

    public ArrayListProducer(ArrayList<String> list)
    {
        this.list = list;
    }

    public void produce(int i, String string)
    {
        list.add(i, string);
    }

}