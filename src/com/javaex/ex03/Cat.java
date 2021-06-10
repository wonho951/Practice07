package com.javaex.ex03;

public class Cat implements Soundable {

	public String sound() { // 부모인 인터페이스 안에는 제목만 쓸수 있으므로 그거 가져옴.
		String soundable = "야옹";		
		return soundable;
		
		//return "야옹";
	}

}
