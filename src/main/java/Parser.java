public class Parser {
    public static void main(String[] args) {
        ParserFromHTMLToString parserFromHTMLToString = new ParserFromHTMLToString();
        StringCounter stringCounter = new StringCounter();
        System.out.println(stringCounter.stringCount(parserFromHTMLToString.getStringFromURL("https://www.simbirsoft.com/")));
    }
}
