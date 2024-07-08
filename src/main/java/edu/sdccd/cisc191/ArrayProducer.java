package edu.sdccd.cisc191;

public class ArrayProducer {

    private final String[] stringArr;

    public ArrayProducer(String[] stringArr) {
        this.stringArr = stringArr;
    }

    public void produce(int i, String s) {
        if(stringArr[i] != null) {
            for (int j = stringArr.length - 1; j > i; j--) {
                // TODO: handle the array when full, for now if there is a value in the last index, it gets dropped
                stringArr[j] = stringArr[j - 1];
            }
        }
        stringArr[i] = s;
    }
}
