package com.itsol.sendgmail.dto;

public class EmailModel {

    private String subject;
    private String message;
    private String recipientEmail;

    public EmailModel() {
    }

    public EmailModel(String subject, String message, String recipientEmail) {
        this.subject = subject;
        this.message = message;
        this.recipientEmail = recipientEmail;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getRecipientEmail() {
        return recipientEmail;
    }

    public void setRecipientEmail(String recipientEmail) {
        this.recipientEmail = recipientEmail;
    }
}
