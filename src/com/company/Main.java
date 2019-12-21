package com.company;

public class Main {


    public static  void main(String[] args) {

        Room  <Double, Integer  > room = new Room<>(8.0,8);
        room.print();
        Room<Double, Integer> room1 = new Room<>(9.9, 78);
	    room1.print();

    }
}
