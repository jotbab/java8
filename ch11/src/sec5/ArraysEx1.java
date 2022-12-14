package sec5;

import java.util.Arrays;

public class ArraysEx1 {

	public static void main(String[] args) {

		char[] arr = {'j','a','v','a',' ','o','b','j','e','c','t'};
		System.out.println(arr);
		char[] arr2	= Arrays.copyOf(arr, arr.length);	//Arrays.copyOf(복사대상, 길이) 문자 배열 전체복사
		System.out.println(arr2);
		char[] arr3 = Arrays.copyOfRange(arr, 0, 4);	//Arrays.copyOfRange(복사대상, 시작, 종료) 일부만 잘라서 복사
		System.out.println(arr3);
		
		System.out.println("*********************");
		
		Arrays.equals(arr, arr2);
		System.out.println(Arrays.equals(arr, arr2));	//값 비교
		System.out.println(arr==arr2); 	//주소비교
		//System.out.println(Arrays.deepEquals(arr, arr2));	//값, 주소 모두 비교 , 같은 기억장소를 의미하는 주소가 다를 경우 서로 비교될 수 없다.
		
		int[] jum = {95,100,85,90,80};
		Arrays.sort(jum);		//배열 오름차순 정렬
		for(int pt : jum){
			System.out.println(pt);
		}
		
		String[] names = {"박정우","한태현","조민재","김연정"};
		for(String name : names){
			System.out.println(name);
		}
		Arrays.sort(names);
		for(String name : names){
			System.out.println(name);
		}
		int idx = Arrays.binarySearch(names, "박정우");
		System.out.println(idx);
	}

}
