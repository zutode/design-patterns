package designpatterns.behavioral.templatemethod;

public class InformalLetterComposer extends LetterComposer{

    @Override
    protected String createHeader(String recipient){
        return "Cześć " + recipient + ",\n\n";
    }

    @Override
    protected String createFooter(String sender){
        return "\n\nPozdrowienia,\n" + sender;
    }
}
