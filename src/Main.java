import java.io.*;
import java.util.*;

import org.apache.lucene.queryParser.ParseException;

public class Main{
	public static void main(String args[]) throws IOException, ParseException{
		File file = new File("C:\\User\\ronish\\workspace\\Sentiment-Annalysis-master\\src\\Review_urls.txt");
		Crawler crawler = new Crawler();
		crawler.crawl(file);
		IndexReviews indexReviews = new IndexReviews();
		indexReviews.index();
		Classification classification = new Classification();
		classification.classify();
		GeneratingXML generatingXML = new GeneratingXML();
		generatingXML.xml();
	}
}