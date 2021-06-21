package mail;

import org.springframework.stereotype.Component;

@Component
public class HiGenerator implements MailGenerator {
    @Override
    public String generate(MailInfo mailInfo) {
        return "Hi " + mailInfo.getName();
    }

    @Override
    public String getMyCode() {
        return "3";
    }
}
