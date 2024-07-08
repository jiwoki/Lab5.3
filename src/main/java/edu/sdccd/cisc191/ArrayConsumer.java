package edu.sdccd.cisc191;

public class ArrayConsumer {

    private final String[] stringArr;

    public ArrayConsumer(String[] stringArr) {
        this.stringArr = stringArr;
    }

    public String consume() {
        String value = stringArr[0];

        for(int i = 1; i < stringArr.length; i++) {
            stringArr[i-1] = stringArr[i];
        }
        return value;
    }
}
