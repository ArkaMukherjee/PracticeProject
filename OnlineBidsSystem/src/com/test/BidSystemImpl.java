package com.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class BidSystemImpl implements BidSystem {

	public Map<String, Integer> itemBidMap = new HashMap<>();

	public Entry<String, Integer> getBestBid() {
		Entry<String, Integer> maxValue = null;
		for (Entry<String, Integer> entry : itemBidMap.entrySet()) {

			if (maxValue == null || entry.getValue().compareTo(maxValue.getValue()) > 0) {
				maxValue = entry;
			}
		}

		return maxValue;
	}

	public void recordBid(String itemName) {

		int count;
		if (itemBidMap.get(itemName) == null) {
			itemBidMap.put(itemName, 1);
		} else {
			count = itemBidMap.get(itemName);
			itemBidMap.put(itemName, count + 1);

		}

	}

	public Integer getBidsForItem(String itemName) {
		return itemBidMap.get(itemName);
	}

	public List<String> getItemWithBid() {
		List<String> ItemListWithBid = new ArrayList<>();
		for (Entry<String, Integer> entry : itemBidMap.entrySet()) {
			if (entry.getValue() != null) {
				ItemListWithBid.add(entry.getKey());
			}
		}
		return ItemListWithBid;
	}

}
