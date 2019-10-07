package Collection;

public class Entry<K, V> {
	private Entry<K, V> next;
	private final K key;
	private V val;

	public Entry(K key, V val) {
		this.key = key;
		this.setVal(val);
	}

	public void setVal(V val) {
		this.val = val;

	}

	public V getVal() {
		return val;
	}

	public K getKey() {
		return key;
	}

	public void setNext(Entry<K, V> next) {
		this.next = next;
	}

	public Entry<K, V> getNext() {
		return this.next;
	}

}
