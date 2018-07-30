package GraphsRevise;

import hashmap.GenericLinkedList;

public class HashMap<K, V> {
	class HMNode {
		K key;
		V val;
	}

	GenericLinkedList<HMNode>[] buckets;
	int size;

	public HashMap() {
		buckets = new GenericLinkedList[4];
		for (int i = 0; i < buckets.length; i++) {
			buckets[i] = new GenericLinkedList();
		}
		size = 0;
	}

	public boolean containsKey(K key) {
		int bucket = hashFunction(key);
		int indexOfData = findInBucket(bucket, key);
		if (indexOfData == -1) {
			return false;
		} else {
			return true;
		}
	}

	private int findInBucket(int bucket, K key) {
		for (int i = 0; i < buckets[bucket].size(); i++) {
			if (buckets[bucket].getAt(i).key.equals(key)) {
				return i;
			}
		}
		return -1;
	}

	private int hashFunction(K key) {
		return key.hashCode() % buckets.length;
	}
}
