package DI_Training;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Program {
	public static void main(String[] args) {
		ProtocalHandler handler = new ProtocalHandler();
		List<MyFilter> list = new ArrayList<MyFilter>();
		
		list.add(new EncFilter());
		list.add(new HeaderFilter());
		
		handler.setFilters(list);
		System.out.println(handler.filter_Length());
		
		ApplicationContext context = 
				new GenericXmlApplicationContext("classpath:DI_Training/DI_Training.xml");
		ProtocalHandler hand = context.getBean("protocalHandler", ProtocalHandler.class);
		System.out.println(hand.filter_Length());
	}
}
