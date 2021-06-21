package mail;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class Main {



    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = SpringApplication.run(Main.class);
        MailSender sender = ctx.getBean(MailSender.class);
        List<MailInfo> list = new ArrayList<>();
        list.add(new MailInfo("1", "Victor"));
        list.add(new MailInfo("2", "Den"));
        list.add(new MailInfo("3", "Kate"));
        list.add(new MailInfo("1", "Silver"));
        list.add(new MailInfo("2", "Brown"));

        list.forEach(sender::send);

    }
}
