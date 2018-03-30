package parser;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class Parser {

    private static final String MAIN_URL = "http://amindi.ge/";
    private static final String cityClass = "choose_city_button hide_desc left";

    private static String city = "აბასთუმანი";
    private Document document;
    private List<String> cities;
    private ServerRequestDictionary serverRequestDictionary;

    public Parser(){
        this.serverRequestDictionary = new ServerRequestDictionary();
        try {
            StringTokenizer stringTokenizer =
                    new StringTokenizer(Jsoup.connect(MAIN_URL).get().getElementsByClass(cityClass).eachText().toString()," ");
            this.cities = new ArrayList<>();
            while(stringTokenizer.hasMoreTokens()){
                this.cities.add(stringTokenizer.nextToken());
            }
            this.cities = this.cities.stream().filter(city -> !city.equals(cities.get(0)))
                    .filter(city -> !city.equals(cities.get(1))).limit(50).collect(Collectors.toList());
            this.document = Jsoup.connect(this.serverRequestDictionary.getDictionary().get(city)).get();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void setCity(String c) throws IOException {
        city = c;
        this.document = Jsoup.connect(this.serverRequestDictionary.getDictionary().get(city)).get();
    }

    public List<String> getCities() {
        return cities;
    }

    public List<String> getDays() throws IOException {
        return this.document.getElementsByClass("t25").eachText();
    }

    public List<String> getDate(){
        return this.document.getElementsByClass("t252").eachText();
    }

    public List<String> getTemp(){
        return this.document.getElementsByClass("tmp25").eachText();
    }

    public List<String> getPhase(){
        Elements elements = this.document.select("img[title]");
        int size = elements.eachAttr("title").size();
        return elements.eachAttr("title").stream().skip(size - 6).limit(5).collect(Collectors.toList());
    }



}
