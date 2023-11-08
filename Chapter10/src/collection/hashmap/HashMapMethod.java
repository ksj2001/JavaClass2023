package collection.hashmap;

import java.util.HashMap;

public class HashMapMethod {

	public static void main(String[] args) {
		// HashMap�� �޼��� ����
		// HashMap<Key,Value>�� Key,Value�� ����ϰ� ���� ������ Ÿ���� �Է��Ѵ�.
		HashMap<String,String> hashmap = new HashMap<>();
		String[] key = {"a","b","c","d","e"};
		String[] value = {"apple","banana","candy","dog","english"};
		
		for(int i=0;i<key.length;i++) {
			hashmap.put(key[i], value[i]);
		}

		System.out.println(hashmap);
		
		// put(key,value) : �� �߰�
		hashmap.put("f", "five");
		
		System.out.println(hashmap);
		
		// keySet(),values() : ������ key�� ��/value�� �� ���
		System.out.println(hashmap.keySet());
		System.out.println(hashmap.values());
		
		// get(keySet()) : key���� �ش��ϴ� value�� ��µȴ�.
		System.out.println(hashmap.get("c"));
		
		// remove(key) : key���� �ش��ϴ� value�� �����ȴ�.
		System.out.println(hashmap.remove("e"));
		System.out.println(hashmap);
		
		// containsKey(key),containsValue(key) :
		// key���� ������ / value���� ������ true ��ȯ
		System.out.println(hashmap.containsKey("g"));
		
		// replace(key,value) : key���� �ش��ϴ� value���� ����
		System.out.println(hashmap.replace("c","cake"));
		System.out.println(hashmap);
		
		// isEmpty() : HashMap�� ��������� true ��ȯ
		System.out.println(hashmap.isEmpty());
		
		// size() : HashMap�� �ڷ� ���� ���
		System.out.println(hashmap.size());
		
		// clear() : HashMap ��ü ����
		//hashmap.clear();
		//System.out.println(hashmap.isEmpty());
		
		// Ȯ�� for���� �̿��� HashMap ��ü���
		for(String keys : hashmap.keySet()) {
			System.out.println(keys+":"+hashmap.get(keys));
		}
		
		// toArray() : ��ҵ��� ��ü �迭�� ��ȯ�ϴ� �޼���
		//String[] arr =(String[]) hashmap.values().toArray();
		Object[] arr2 = hashmap.values().toArray();
		for(int i=0;i<arr2.length;i++) {
			System.out.println(arr2[i]);
		}
	}

}
