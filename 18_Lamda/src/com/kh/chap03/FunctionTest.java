package com.kh.chap03;

import java.util.ArrayList;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.ToIntFunction;

import com.kh.model.vo.Product;

public class FunctionTest {
	/*
	 * Function 인터페이스 특징
	 * 1.타입 변환
	 * ex)컬렉션에서 특정값만 뽑거나 연산할때 사용
	 */

	public static void main(String[] args) {
		Product p = new Product("갤럭시 z플립 4" ,1350000, 1000);
		
		//1) Function<T , R> : T형을 인자로 받아서 U형 값을 리턴
		// Product객체에서 가격에 대한 정보만 쏙 빼기
		Function<Product, Integer> function;
		function = (product) -> {
			return product.getPrice();
		
		};
		
		System.out.println(function.apply(p));
		
		//2)BiFunction<T, U, R> : T, U 두개를 인자로 받고 R을 리턴
		BiFunction<Integer, Integer, Double> biFunction;
		biFunction = (num1, num2) -> {
			return num1 * (double) num2;
		};
		
		System.out.println("z플립 100대의 가격은 = "+biFunction.apply(p.getPrice(), p.getStock()));
		
		//그외
		//3)xxxFunction<T> : XXX를 인자로 받아서 T형 리턴
		//4)XXXtoFunction :xxx를 인자로 받아서 yyy 리턴
		//5)toXXXFunction<T> : T를 받아서 xxx를 리턴
		//6)toXXXBiFucntion<T,U> : T,U를 인자로 받아서 XXX 리턴
		
		//객체배열을 통한 람다식 실습
		//1)핸드폰 객체배열 만들기
		ArrayList<Product> pList = new ArrayList<Product>();
		pList.add(new Product("갤럭시 z플립4",1350000,55));
		pList.add(new Product("갤럭시 z플립3",1000000,20));
		pList.add(new Product("갤럭시 z플립4",2000000,85));
		pList.add(new Product("갤럭시 z플립3",1500000,45));
		pList.add(new Product("아이폰 14",1400000,5));
		pList.add(new Product("아이폰 13",800000,25));
		
		//2)해당상품을 모두 팔게되면 남는 이윤을 계산할수있는 람다식 생성
		//		이윤 계산 => (Product.가격 * Product.재고)
		//		매개변수로 Product를 인자로 받아야함 그리고 결과갑은 int로 반환해야함

		ToIntFunction<Product> toIntFunction;
		toIntFunction = (product) -> {
			return product.getPrice() * product.getStock();
		};
		
		//4)일반메소드 호출
		printProduct(pList, toIntFunction);

	}
	//3)생성한 람다식 함수를 활용한 객체배열 관리용 일반메서드 생성
	public static void printProduct(ArrayList<Product>pList, ToIntFunction<Product>toIntFunction) {
		for(Product p : pList) {
			System.out.printf("%s상품의 현재 가격은 %d원이며, 모두 판매했을때 이윤은 %d입니다. \n",
					p.getpName(), p.getPrice(), toIntFunction.applyAsInt(p));
		}
		
	}

}
