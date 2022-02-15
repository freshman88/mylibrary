package com.hupo.mylibrary;

public class Counter {
    private static int num = 0;

    public void count() {
        num++;
    }

    public int currentCount() {
        return num;
    }
}
