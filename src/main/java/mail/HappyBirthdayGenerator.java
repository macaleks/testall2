package mail;

import org.springframework.stereotype.Component;

@Component
public class HappyBirthdayGenerator implements MailGenerator {
    @Override
    public String generate(MailInfo mailInfo) {
        return "Happy Birthday " + mailInfo.getName();
    }

    @Override
    public String getMyCode() {
        return "1";
    }
}
