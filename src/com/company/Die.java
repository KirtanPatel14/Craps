package com.company;



public class Die {
    private int die1;

    public void roll() {
        die1 = (int)(1+Math.random()*6);
    }
    public int getNumDots(){
        return die1;
    }
        public static void main(String[] args) {
// TODO Auto-generated method stub
            Die die = new Die();
            die.roll();
            System.out.println(die.getNumDots());
    }
}