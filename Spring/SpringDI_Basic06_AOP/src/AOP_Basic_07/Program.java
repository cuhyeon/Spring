package AOP_Basic_07;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Program {

	public static void main(String[] args) {
	 ApplicationContext context = new GenericXmlApplicationContext("classpath:AOP_Basic_07/ApplicationContext.xml");
		Calc calc= context.getBean("proxy",Calc.class);
		
		int result = calc.MUL(10, 5); //보조업무가 실행되면 노노
		System.out.println("결과 : " + result);
	}

}
