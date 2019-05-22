package DI_01;

public class HelloApp {
	public static void main(String[] args) {
		MessageBean messagebeen =  new MessageBean();
		messagebeen.sayHello("hong");
	}
}
/*
 요구사항
영문버전(hong) : Hello hong! 
한글버전(hong) : 안녕 hong!
기능 2가지

>MessageBeen_Kr > 함수 > sayHello
>MessageBeen_en > 함수 > sayHello

>> 위 두개의 클래스에 대해서 Interface를 구현 (다형성)

*/
