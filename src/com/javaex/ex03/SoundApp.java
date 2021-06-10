package com.javaex.ex03;

public class SoundApp {

    public static void main(String[] args) {
        printSound( new Cat() ); 
        printSound( new Dog() );
        printSound( new Sparrow() );
        printSound( new Duck() );
    }

    public static void printSound( Soundable soundable ) {//스태틱영역에 생성되서 모든 객체 공유가능.(여러개를 하나로 관리하기 수월) 
        //구현
    	System.out.println(soundable.sound());
    }
    
}


