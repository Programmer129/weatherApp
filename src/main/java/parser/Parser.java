package parser;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;
import java.util.List;

public class Parser {

    private static final String MAIN_URL = "http://amindi.ge/";
    private static final String CITY_URL_ONE = "http://amindi.ge/city/";
    private static final String CITY_URL_TWO = "/%E1%83%97%E1%83%91%E1%83%98%E1%83%9A%E1%83%98%E1%83%A1%E1%83%98";
    private static final String cityClass = "choose_city_button hide_desc left";

    private static String city = "tbilisi";
    private Document document;
    private List<String> cities;
    private Converter converter;

    public Parser(){
        try {
            this.document = Jsoup.connect(CITY_URL_ONE + city + CITY_URL_TWO).get();
            this.cities = Jsoup.connect(MAIN_URL).get().getElementsByClass(cityClass).eachText();
            this.converter = new Converter();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void setCity(String c) throws IOException {
        city = this.converter.toEnglish(c);
        this.document = Jsoup.connect(CITY_URL_ONE + city + CITY_URL_TWO).get();
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


}
