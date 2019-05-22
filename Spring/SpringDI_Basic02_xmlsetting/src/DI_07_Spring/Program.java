package DI_07_Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Program {

	public static void main(String[] args) {
		/*
		ProtocolHandler handler = new ProtocolHandler();
		
		List<MyFilter> list = new ArrayList<MyFilter>();
		list.add(new EncFilter());
		list.add(new HeaderFilter());
		list.add(new ZipFilter());
				
		handler.setFilter(list);
		
		System.out.println(handler.filter_Length());
		*/
		ApplicationContext context = 
				new GenericXmlApplicationContext("classpath:DI_07_Spring/DI_07.xml");
		ProtocolHandler handler = context.getBean("protocolHandler",ProtocolHandler.class);
		System.out.println(handler.filter_Length());
	}

}