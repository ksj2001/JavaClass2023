package collection.hashmap;

import java.util.HashMap;

public class HashMapMethod {

	public static void main(String[] args) {
		// HashMap의 메서드 종류
		// HashMap<Key,Value>의 Key,Value는 사용하고 싶은 데이터 타입을 입력한다.
		HashMap<String,String> hashmap = new HashMap<>();
		String[] key = {"a","b","c","d","e"};
		String[] value = {"apple","banana","candy","dog","english"};
		
		for(int i=0;i<key.length;i++) {
			hashmap.put(key[i], value[i]);
		}

		System.out.println(hashmap);
		
		// put(key,value) : 값 추가
		hashmap.put("f", "five");
		
		System.out.println(hashmap);
		
		// keySet(),values() : 각각의 key의 값/value의 값 출력
		System.out.println(hashmap.keySet());
		System.out.println(hashmap.values());
		
		// get(keySet()) : key값에 해당하는 value가 출력된다.
		System.out.println(hashmap.get("c"));
		
		// remove(key) : key값에 해당하는 value가 삭제된다.
		System.out.println(hashmap.remove("e"));
		System.out.println(hashmap);
		
		// containsKey(key),containsValue(key) :
		// key값이 같으면 / value값이 같으면 true 반환
		System.out.println(hashmap.containsKey("g"));
		
		// replace(key,value) : key값에 해당하는 value값을 변경
		System.out.println(hashmap.replace("c","cake"));
		System.out.println(hashmap);
		
		// isEmpty() : HashMap이 비어있으면 true 반환
		System.out.println(hashmap.isEmpty());
		
		// size() : HashMap의 자료 개수 출력
		System.out.println(hashmap.size());
		
		// clear() : HashMap 전체 삭제
		//hashmap.clear();
		//System.out.println(hashmap.isEmpty());
		
		// 확장 for문을 이용한 HashMap 전체출력
		for(String keys : hashmap.keySet()) {
			System.out.println(keys+":"+hashmap.get(keys));
		}
		
		// toArray() : 요소들을 객체 배열로 반환하는 메서드
		//String[] arr =(String[]) hashmap.values().toArray();
		Object[] arr2 = hashmap.values().toArray();
		for(int i=0;i<arr2.length;i++) {
			System.out.println(arr2[i]);
		}
	}

}
