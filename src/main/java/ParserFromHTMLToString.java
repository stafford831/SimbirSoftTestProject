import org.apache.log4j.Logger;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

public class ParserFromHTMLToString {
    private Document doc;
    private String title;

    private static final Logger log = Logger.getLogger(ParserFromHTMLToString.class);

    public Document getDoc() {
        return doc;
    }

    public void setDoc(Document doc) {
        this.doc = doc;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStringFromURL(String url) {
        try {
            doc = Jsoup.connect(url).get();
            title = doc.text().toUpperCase();
        } catch (IOException e) {
            log.info(e);
        }
        return title;
    }
}
