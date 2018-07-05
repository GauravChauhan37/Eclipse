package hashmap;

import java.util.ArrayList;

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

	public int size() {
		return this.size;
	}

	public void display() {
		System.out.println("***************************");
		for (int bidx = 0; bidx < buckets.length; bidx++) {
			System.out.print(bidx + " -> ");
			for (int didx = 0; didx < buckets[bidx].size(); didx++) {
				HMNode n = buckets[bidx].getAt(didx);
				System.out.print(n.key + "-->" + n.val+"  ");
			}
			System.out.println();
		}
		System.out.println("*************************");
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public boolean containsKey(K Key) {
		int bidx = hashfn(Key);
		int didx = findInBucket(bidx, Key);
		if (didx == -1) {
			return false;
		} else {
			return true;
		}
	}

	public V get(K Key) {
		int bidx = hashfn(Key);
		int didx = findInBucket(bidx, Key);
		if (didx == -1) {
			return null;
		} else {
			return buckets[bidx].getAt(didx).val;
		}
	}

	public V remove(K Key) {
		int bidx = hashfn(Key);
		int didx = findInBucket(bidx, Key);
		if (didx == -1) {
			return null;
		} else {
			HMNode n = buckets[bidx].removeAt(didx);
			this.size--;
			return n.val;
		}
	}

	public void put(K Key, V Value) {
		int bidx = hashfn(Key);
		int didx = findInBucket(bidx, Key);
		if (didx == -1) {
			HMNode n = new HMNode();
			n.key = Key;
			n.val = Value;
			buckets[bidx].addLast(n);
			this.size++;
		} else {
			HMNode n = buckets[bidx].getAt(didx);
			n.val = Value;
		}
		double lambda = (this.size * 1.0) / buckets.length;
		 if (lambda > 2.0) {
		 rehash();
		 }
	}

	public ArrayList<K> keyset() {
		ArrayList<K> Keys = new ArrayList<>();
		for (int bidx = 0; bidx < buckets.length; bidx++) {
			for (int didx = 0; didx < buckets[bidx].size(); didx++) {
				HMNode n = buckets[bidx].getAt(didx);
				Keys.add(n.key);
			}
		}
		return Keys;
	}

	private int hashfn(K key) {
		return (Math.abs(key.hashCode()) % buckets.length);
	}

	private int findInBucket(int bidx, K key) {
		for (int i = 0; i < buckets[bidx].size(); i++) {
			if (buckets[bidx].getAt(i).key.equals(key)) {
				return i;
			}
		}
		return -1;
	}

	private void rehash() {
		GenericLinkedList<HMNode>[] obuckets = buckets;
		buckets = new GenericLinkedList[obuckets.length * 2];
		for (int i = 0; i < buckets.length; i++) {
			buckets[i] = new GenericLinkedList();
		}
		size = 0;
		for (int bidx = 0; bidx < obuckets.length; bidx++) {
			for (int didx = 0; didx < obuckets[bidx].size(); didx++) {
				HMNode n = obuckets[bidx].getAt(didx);
				put(n.key, n.val);
			}
		}
	}
}