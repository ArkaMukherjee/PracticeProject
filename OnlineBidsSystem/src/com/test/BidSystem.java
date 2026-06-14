package com.test;

import java.util.List;
import java.util.Map.Entry;

public interface BidSystem {

	Entry<String, Integer> getBestBid();

	void recordBid(String itemName);

	Integer getBidsForItem(String itemName);

	List<String> getItemWithBid();

}
