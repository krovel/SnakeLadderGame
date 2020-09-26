package com.capgemini;

public class SnakeLadderGame {
	public static void main(String[] args) {
		System.out.println("Welcome to the game");
		int pos = 0;
		int dice_value = (int) Math.floor(Math.random()*10)%6 +1;
		System.out.println("Number on the dice: "+dice_value);
	}
}