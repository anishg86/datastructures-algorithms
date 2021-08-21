package com.dsalgo.hashtable;

import java.util.ArrayList;

public class MyHashTable {

	private ArrayList<KeyValue>[] data;
	private int tableSize;

	public MyHashTable(int size) {
		data = new ArrayList[size];
		tableSize = 0;
	}

	private int getHash(String input) {
		int hashCode = 0;
		for (int i = 0; i < input.length(); i++) {
			hashCode = (hashCode + Character.codePointAt(input, i) * i) % data.length;
		}
		return hashCode;
	}

	public void set(String key, Integer value) {
		int address = this.getHash(key);
		if (null == this.data[address]) {
			this.data[address] = new ArrayList<KeyValue>();
		}
		this.data[address].add(new KeyValue(key, value));
		tableSize++;
	}

	public Integer get(String key) {
		int address = this.getHash(key);
		ArrayList<KeyValue> kvList = this.data[address];
		if (null != kvList) {
			for (KeyValue kv : kvList) {
				if (kv.getKey().equalsIgnoreCase(key)) {
					return kv.getValue();
				}
			}
		}
		return null;
	}

	public String[] getKeys() {
		ArrayList<KeyValue>[] kvList = data;
		String[] keyList = new String[tableSize];
		int count = 0;
		if (null != kvList) {
			for (ArrayList<KeyValue> kv : kvList)
				if (kv != null) {
					for (KeyValue kvInner : kv) {
						keyList[count] = kvInner.getKey();
						count++;
					}
				}
		}
		return keyList;
	}
}
