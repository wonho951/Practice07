package com.javaex.ex02;

public abstract class Bird {
	
	//필드
    private String name;

    //생성자
	public Bird() {
		super();
	}

	public Bird(String name) {
		super();
		this.name = name;
	}
	//메소드 g/s
	protected String getName() { // 상속관계에서 열어둠
		return name;
	}

	protected void setName(String name) {
		this.name = name;
	}


	
	//메소드-일반
	public abstract void showName();
	
	public abstract void sing();
	
	public abstract void fly();
	

}
