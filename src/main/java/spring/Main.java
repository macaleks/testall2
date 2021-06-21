package spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
//        for(;;) {
//            Thread.sleep(100);
//            context.getBean(Quoter.class).sayQuote();
//        }
    }
}
