package mail;

public class MailInfo {
    private final String code;
    private final String name;

    public MailInfo(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getTemplateCode() {
        return code;
    }

    public String getName() {
        return name;
    }
}
