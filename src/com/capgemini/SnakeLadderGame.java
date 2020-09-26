package com.capgemini;

public class SnakeLadderGame {
	public static int noPlay =0,ladder = 1,snake =2;
	public static void main(String[] args) {
		System.out.println("Welcome to the game");
		int pos1 = 0,pos2 =0, p1_turns =0,p2_turns = 0;
		boolean is_p1_turn = true,is_p2_turn =false;
		while((pos1 < 100)&&(pos2 <100)) {
			int dice_value = (int) Math.floor(Math.random()*10)%6 +1;
			int opt = (int) Math.floor(Math.random()*10)%3;
			if(is_p1_turn) {
				p1_turns++;
				if(opt == noPlay) {
					System.out.println("Player1 remains at the same position");
					is_p1_turn = false;
					is_p2_turn = true;
				}
				else if(opt == ladder) {
					if(pos1+dice_value <=100)
						pos1 += dice_value;
				}
				else if(opt == snake) {
					if(pos1-dice_value > 0)
					 pos1 -= dice_value;
					else
						pos1 = 0;
					is_p1_turn = false;
					is_p2_turn = true;
				}
				System.out.println("Player1's position: "+pos1);
			}
			else if(is_p2_turn){
				p2_turns++;
				if(opt == noPlay) {
					System.out.println("Player2 remains at the same position");
					is_p1_turn = true;
					is_p2_turn = false;
				}
				else if(opt == ladder) {
					if(pos2+dice_value <=100)
						pos2 += dice_value;
				}
				else if(opt == snake) {
					if(pos2-dice_value > 0)
					 pos2 -= dice_value;
					else
						pos2 = 0;
					is_p1_turn = true;
					is_p2_turn = false;
				}
				System.out.println("Player2's position: "+pos2);
			}
		}
		System.out.println("Player1's final position:"+pos1);
		System.out.println("Player2's final position:"+pos2);
		
		if(pos1 == 100) {
			System.out.println("Player1 won the game and he rolled the dice :"+p1_turns+" times");
		}
		else {
			System.out.println("Player2 won the game and he rolled the dice :"+p2_turns+" times");
		}
		}
}