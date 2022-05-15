package com.company;

import java.util.Arrays;

public class Class {

    private int number;
    private String word;
    private int[] arr = new int[6];

    public Class(int number, String word, int[] arr) {
        this.number = number;
        this.word = word;
        this.arr = arr;
    }


    public Class() {
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public int[] getArr() {
        return arr;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }

    @Override
    public String toString() {
        return "Class{" +
                "number=" + number +
                ", word='" + word + '\'' +
                ", arr=" + Arrays.toString(arr) +
                '}';
    }
}

