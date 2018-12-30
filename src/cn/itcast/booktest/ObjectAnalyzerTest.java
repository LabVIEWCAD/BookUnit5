package cn.itcast.booktest;

import java.util.ArrayList;

import cn.itcast.domain.ObjectAnalyzer;

public class ObjectAnalyzerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> squares = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			squares.add(i*i);
			System.out.println(new ObjectAnalyzer().toString(squares));
		}
	}

}
