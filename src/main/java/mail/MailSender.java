package mail;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class MailSender {

    private Map<String, MailGenerator> map = new HashMap<>();

    public void register(String code, MailGenerator generator) {
        map.put(code, generator);
    }

    public void send(MailInfo mailInfo) {
        String code = mailInfo.getTemplateCode();
        MailGenerator mailGenerator = map.get(code);
        if (mailGenerator == null) {
            throw new UnsupportedOperationException(code + " not supported yet");
        }
        String html = mailGenerator.generate(mailInfo);
        sendMail(html);
    }

    private void sendMail(String html) {
        System.out.println(html + " was sent.");
    }
}
