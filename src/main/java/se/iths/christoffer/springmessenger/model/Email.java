package se.iths.christoffer.springmessenger.model;

public class Email extends Message {
    private String subject;

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String getType() {
        return "email";
    }
}
