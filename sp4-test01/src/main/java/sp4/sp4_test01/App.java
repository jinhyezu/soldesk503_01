package sp4.sp4_test01;

import org.springframework.context.support.GenericXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationContext.xml");

		Greeter gr1 = ctx.getBean("gr", Greeter.class);
		String msg = gr1.greet("진팡쭈");
		System.out.println(msg);
	}
}
