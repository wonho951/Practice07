package com.javaex.ex02;

public class BirdApp {

    public static void main(String[] args) {
        Bird bird01 = new Duck();
        bird01.setName("꽥꽥이");    // setName를 꽥꽥이로 설정해줌
        bird01.fly();
        bird01.sing();
        bird01.showName();

        Bird bird02 = new Sparrow();
        bird02.setName("짹짹이");	// setName을 짹짹이로 설정해줌
        bird02.fly();
        bird02.sing();
        bird02.showName();
    }

}
