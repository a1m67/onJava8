package org.example.efftive;

import lombok.ToString;

@ToString
public class Mail {
    private final String from;
    private final String to;
    private final String subject;
    private final String content;
    private final boolean html;
    public static Builder builder(String from, String to) {
        return new Builder(from, to);
    }
    public Mail(String from, String s, String subject, String content, boolean html) {
        this.from = from;
        to = s;
        this.subject = subject;
        this.content = content;
        this.html = html;
    }
    public static class Builder {
        private final String from;
        private final String to;
        private String subject;
        private String content;
        private boolean html;

        private Builder(String from, String to) {
            this.from = from;
            this.to = to;
        }

        public Builder subject(String subject) {
            this.subject = subject;
            return this;
        }

        public Builder content(String content) {
            this.content = content;
            return this;
        }

        public Builder html(boolean html) {
            this.html = html;
            return this;
        }
        public Mail build() {
            return new Mail(from, to, subject, content, html);
        }
    }

    public static void main(String[] args) {
        Mail mail = Mail.builder("A", "B")
                .subject("Hi")
                .content("This is a test")
                .html(true)
                .build();
        System.out.println(mail);
    }
}
