package mail;

import org.springframework.beans.factory.annotation.Autowired;

public interface MailGenerator {
    String generate(MailInfo mailInfo);
    String getMyCode();
    @Autowired
    default void register(MailSender mailSender) {
        mailSender.register(getMyCode(), this);
    }
}
