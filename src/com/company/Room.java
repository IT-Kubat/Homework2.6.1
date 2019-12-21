package com.company;

public class Room <T,S extends Number> implements Roomable {
    private T inhabitent1;
    private S inhabitent2;

    public Room(T inhabitent1, S inhabitent2) {
        this.inhabitent1 = inhabitent1;
        this.inhabitent2 = inhabitent2;
    }



    public void getInhabitent2() {
    }

    public void setInhabitent2(Object inhabitent2) {
        this.inhabitent2 = (S) inhabitent2;
    }
    public void getInhabitent1() {
    }

    public void setInhabitent1(T inhabitent1) {
        this.inhabitent1 = inhabitent1;
    }

    @Override
    public Number print() {
        System.out.println(inhabitent1+" "+inhabitent2);
        return null;
    }
}