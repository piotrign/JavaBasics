package workshop.java.basics;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class TopWordsCount {

	public static void main(String[] args) throws IOException {

		// downloading the titles and writing to file
		Connection connect = Jsoup.connect("http://www.onet.pl/");
		BufferedWriter writer = null;
		writer = new BufferedWriter(new FileWriter("popular_words.txt"));
		try {
			Document document = connect.get();
			Elements links = document.select("span.title");
			for (Element elem : links) {
				writer.write(elem.ownText());
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
		writer.close();

		// we read what's in the file and save it to list without words from list
		List<String> wordsFromFile = new ArrayList<>();
		File file = new File("popular_words.txt");
		
		StringBuilder reading = new StringBuilder();
		try{
		Scanner scan = new Scanner(file);
//		BufferedReader br = new BufferedReader(new FileReader());

		String line;
		while (scan.hasNextLine()) {
			line = scan.nextLine();
			wordsFromFile.add(line);
		}
		}catch(FileNotFoundException e){
			System.out.println("Brak pliku");
		}
		System.out.println(reading.toString());
		removeConjunctionWords(wordsFromFile);
		
		//creating file and saving words
		BufferedWriter writerTopWords = null;
		writerTopWords = new BufferedWriter(new FileWriter("filtered_popular_words.txt"));

		for (String s : wordsFromFile) {
			System.out.println(s);
			writerTopWords.write(s);
		}
		writerTopWords.close();
	}

	public static List<String> removeConjunctionWords(List<String> originalList) {

		List<String> conjunctionList = new ArrayList<>();
		conjunctionList.add("oraz");
		conjunctionList.add("poniewa¿");
		conjunctionList.add("albowiem");
		conjunctionList.add("wiêc");
		conjunctionList.add("gdy¿");
		conjunctionList.add("¿eby");

		originalList.removeAll(conjunctionList);

		return originalList;
	}
}
