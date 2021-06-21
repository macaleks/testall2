package mail;

import org.springframework.stereotype.Component;

@Component
public class BuyGenerator implements MailGenerator {
    @Override
    public String generate(MailInfo mailInfo) {
        return "Buy buy " + mailInfo.getName();
    }

    @Override
    public String getMyCode() {
        return "2";
    }
}
