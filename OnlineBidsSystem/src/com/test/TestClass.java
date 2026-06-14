package com.test;

public class TestClass {
	public static void main(String arg[]) {
		BidSystem bidSystem = new BidSystemImpl();
		

		bidSystem.recordBid("A");
		bidSystem.recordBid("B");
		bidSystem.recordBid("C");
		bidSystem.recordBid("B");
		bidSystem.recordBid("B");
		bidSystem.recordBid("C");
		bidSystem.recordBid("C");
		bidSystem.recordBid("C");

		System.out.println("-----------Get Bid for Item---------");
		System.out.println(bidSystem.getBidsForItem("D"));

		System.out.println("-----------Print best bid---------");
		System.out.println(bidSystem.getBestBid());
		;

		System.out.println("-----------Item with bid value---------");

		System.out.println(bidSystem.getItemWithBid());

	}

}
