package designpatterns.behavioral.templatemethod;

public class FormalLetterComposer extends LetterComposer {

    @Override
    protected String createHeader(String recipient){
        return "Szanowny" + recipient + ",\n\n";
    }

    @Override
    protected String createFooter(String sender){
        return "\n\nZ poważaniem,\n" + sender;
    }
}
