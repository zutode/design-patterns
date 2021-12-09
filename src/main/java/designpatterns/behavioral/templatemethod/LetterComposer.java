package designpatterns.behavioral.templatemethod;

public abstract class LetterComposer {
    public String compose(String recipient, String sender, String content){
        return  createHeader(recipient) + content + createFooter(sender);
    }

    protected abstract String createHeader(String recipient);

    protected abstract String createFooter(String sender);

}
