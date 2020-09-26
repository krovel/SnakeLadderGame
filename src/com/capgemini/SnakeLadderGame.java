package com.capgemini;

public class SnakeLadderGame {
	public static int noPlay =0,ladder = 1,snake =2;
	public static void main(String[] args) {
		System.out.println("Welcome to the game");
		int pos = 0;
		while(pos < 100) {
		int dice_value = (int) Math.floor(Math.random()*10)%6 +1;
		System.out.println("Number on the dice: "+dice_value);
		int opt = (int) Math.floor(Math.random()*10)%3;
		if(opt == noPlay) {
			System.out.println("Player remains at the same position");
		}
		else if(opt == ladder) {
			if(pos+dice_value <=100)
				pos += dice_value;
		}
		else if(opt == snake) {
			if(pos-dice_value > 0)
			 pos -= dice_value;
			else
				pos = 0;
		}
		}
		System.out.println("Player's final position: "+pos);
	}
}