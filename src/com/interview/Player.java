package com.interview;
abstract class Cricket{
	public Cricket() {
		// TODO Auto-generated constructor stub
	}
}

public class Player extends Cricket {
public Player() {
	// TODO Auto-generated constructor stub
}
public static void main(String[] args) {
	Player player = new Player();
/*	Player p = new Cricket();
	Cricket c1 = new Cricket();*/
	Cricket c2 = new Player();
}
}
