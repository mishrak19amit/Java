package Collection;

public class AmitHashMap<K,V> {
	
	private int DEFAULT_BUCKET_COUNT=10;
	
	private Entry<K,V>[] buckets;

	public AmitHashMap()
	{
		buckets=new Entry[DEFAULT_BUCKET_COUNT];
	}
	
	public AmitHashMap(int capacity)
	{
		buckets=new Entry[capacity];
	}
	
	public V get(K key)
	{
		
		throghIfNullKey(key);
		
		Entry<K,V> entry= buckets[getBucketForKey(key)];
		
		while(entry!=null&& entry.getKey()!=key) {
			
			entry=entry.getNext();
		}
		return entry!=null?entry.getVal():null;
		
	}

	public void put(K key, V val) {
		throghIfNullKey(key);
		int bucketIndex=getBucketForKey(key);
		Entry<K,V> entry= buckets[bucketIndex];
		
		if(null!=entry) {
			boolean done=false;
			while(!done) {
				if(entry.getNext()==null) {
					
					entry.setNext(new Entry<K,V>(key, val));
					done=true;
				}
				else if(entry.getKey().equals(key)) {
					entry.setVal(val);
					done=true;
				}
				entry=entry.getNext();
			}
		}
		else {
			buckets[bucketIndex]=new Entry<K,V>(key, val);
		}
	}
	
	private int getBucketForKey(K key) {
		return key.hashCode() % buckets.length;
	}

	private void throghIfNullKey(K key) {
		if(null==key)
			throw new IllegalArgumentException("Key may not be null");
		
	}
}
