package parser;

import java.util.HashMap;
import java.util.Map;

public class ServerRequestDictionary {

    private Map<String, String> dictionary;
    private Converter converter = new Converter();

    public ServerRequestDictionary(){
        this.dictionary = new HashMap<>();
        createDictionary();
    }

    public Map<String, String> getDictionary() {
        return dictionary;
    }

    private void createDictionary(){
        this.dictionary.put("აბასთუმანი", "http://amindi.ge/city/"+converter.toEnglish("აბასთუმანი")+"/%E1%83%90%E1%83%91%E1%83%90%E1%83%A1%E1%83%97%E1%83%A3%E1%83%9B%E1%83%90%E1%83%9C%E1%83%98");
        this.dictionary.put("ახალციხე", "http://amindi.ge/city/"+converter.toEnglish("ახალციხე")+"/%E1%83%90%E1%83%AE%E1%83%90%E1%83%9A%E1%83%AA%E1%83%98%E1%83%AE%E1%83%94");
        this.dictionary.put("ბათუმი", "http://amindi.ge/city/"+converter.toEnglish("ბათუმი")+"/%%E1%83%91%E1%83%90%E1%83%97%E1%83%A3%E1%83%9B%E1%83%98");
        this.dictionary.put("ბაკურიანი", "http://amindi.ge/city/"+converter.toEnglish("ბაკურიანი")+"/%E1%83%91%E1%83%90%E1%83%99%E1%83%A3%E1%83%A0%E1%83%98%E1%83%90%E1%83%9C%E1%83%98");
        this.dictionary.put("ბოლნისი", "http://amindi.ge/city/"+converter.toEnglish("ბოლნისი")+"/%E1%83%91%E1%83%9D%E1%83%9A%E1%83%9C%E1%83%98%E1%83%A1%E1%83%98");

        this.dictionary.put("ბორჯომი", "http://amindi.ge/city/"+converter.toEnglish("ბორჯომი")+"%E1%83%90%E1%83%91%E1%83%90%E1%83%A1%E1%83%97%E1%83%A3%E1%83%9B%E1%83%90%E1%83%9C%E1%83%98");
        this.dictionary.put("გონიო", "http://amindi.ge/city/"+converter.toEnglish("გონიო")+"%E1%83%90%E1%83%91%E1%83%90%E1%83%A1%E1%83%97%E1%83%A3%E1%83%9B%E1%83%90%E1%83%9C%E1%83%98");
        this.dictionary.put("გორი", "http://amindi.ge/city/"+converter.toEnglish("გორი")+"%E1%83%90%E1%83%91%E1%83%90%E1%83%A1%E1%83%97%E1%83%A3%E1%83%9B%E1%83%90%E1%83%9C%E1%83%98");
        this.dictionary.put("გუდაური", "http://amindi.ge/city/"+converter.toEnglish("გუდაური")+"%E1%83%90%E1%83%91%E1%83%90%E1%83%A1%E1%83%97%E1%83%A3%E1%83%9B%E1%83%90%E1%83%9C%E1%83%98");
        this.dictionary.put("გურჯაანი", "http://amindi.ge/city/"+converter.toEnglish("გურჯაანი")+"%E1%83%90%E1%83%91%E1%83%90%E1%83%A1%E1%83%97%E1%83%A3%E1%83%9B%E1%83%90%E1%83%9C%E1%83%98");
        this.dictionary.put("დავით-გარეჯი", "http://amindi.ge/city/"+converter.toEnglish("დავით-გარეჯი")+"%E1%83%90%E1%83%91%E1%83%90%E1%83%A1%E1%83%97%E1%83%A3%E1%83%9B%E1%83%90%E1%83%9C%E1%83%98");
        this.dictionary.put("ზესტაფონი", "http://amindi.ge/city/"+converter.toEnglish("ზესტაფონი")+"%E1%83%90%E1%83%91%E1%83%90%E1%83%A1%E1%83%97%E1%83%A3%E1%83%9B%E1%83%90%E1%83%9C%E1%83%98");
        this.dictionary.put("ზუგდიდი", "http://amindi.ge/city/"+converter.toEnglish("ზუგდიდი")+"%E1%83%90%E1%83%91%E1%83%90%E1%83%A1%E1%83%97%E1%83%A3%E1%83%9B%E1%83%90%E1%83%9C%E1%83%98");
        this.dictionary.put("თბილისი", "http://amindi.ge/city/"+converter.toEnglish("თბილისი")+"%E1%83%90%E1%83%91%E1%83%90%E1%83%A1%E1%83%97%E1%83%A3%E1%83%9B%E1%83%90%E1%83%9C%E1%83%98");
        this.dictionary.put("თელავი", "http://amindi.ge/city/"+converter.toEnglish("თელავი")+"%E1%83%90%E1%83%91%E1%83%90%E1%83%A1%E1%83%97%E1%83%A3%E1%83%9B%E1%83%90%E1%83%9C%E1%83%98");
        this.dictionary.put("თიანეთი", "http://amindi.ge/city/"+converter.toEnglish("თიანეთი")+"%E1%83%90%E1%83%91%E1%83%90%E1%83%A1%E1%83%97%E1%83%A3%E1%83%9B%E1%83%90%E1%83%9C%E1%83%98");
        this.dictionary.put("ლაგოდეხი", "http://amindi.ge/city/"+converter.toEnglish("ლაგოდეხი")+"%E1%83%90%E1%83%91%E1%83%90%E1%83%A1%E1%83%97%E1%83%A3%E1%83%9B%E1%83%90%E1%83%9C%E1%83%98");
        this.dictionary.put("ლანჩხუთი", "http://amindi.ge/city/"+converter.toEnglish("ლანჩხუთი")+"%E1%83%90%E1%83%91%E1%83%90%E1%83%A1%E1%83%97%E1%83%A3%E1%83%9B%E1%83%90%E1%83%9C%E1%83%98");
        this.dictionary.put("მანგლისი", "http://amindi.ge/city/"+converter.toEnglish("მანგლისი")+"%E1%83%90%E1%83%91%E1%83%90%E1%83%A1%E1%83%97%E1%83%A3%E1%83%9B%E1%83%90%E1%83%9C%E1%83%98");
        this.dictionary.put("მარნეული", "http://amindi.ge/city/"+converter.toEnglish("მარნეული")+"%E1%83%90%E1%83%91%E1%83%90%E1%83%A1%E1%83%97%E1%83%A3%E1%83%9B%E1%83%90%E1%83%9C%E1%83%98");
        this.dictionary.put("მესტია", "http://amindi.ge/city/"+converter.toEnglish("მესტია")+"%E1%83%90%E1%83%91%E1%83%90%E1%83%A1%E1%83%97%E1%83%A3%E1%83%9B%E1%83%90%E1%83%9C%E1%83%98");
        this.dictionary.put("მცხეთა", "http://amindi.ge/city/"+converter.toEnglish("მცხეთა")+"%E1%83%90%E1%83%91%E1%83%90%E1%83%A1%E1%83%97%E1%83%A3%E1%83%9B%E1%83%90%E1%83%9C%E1%83%98");
        this.dictionary.put("ოზურგეთი", "http://amindi.ge/city/"+converter.toEnglish("ოზურგეთი")+"%E1%83%90%E1%83%91%E1%83%90%E1%83%A1%E1%83%97%E1%83%A3%E1%83%9B%E1%83%90%E1%83%9C%E1%83%98");
        this.dictionary.put("ომალო", "http://amindi.ge/city/"+converter.toEnglish("ომალო")+"%E1%83%90%E1%83%91%E1%83%90%E1%83%A1%E1%83%97%E1%83%A3%E1%83%9B%E1%83%90%E1%83%9C%E1%83%98");
        this.dictionary.put("ონი", "http://amindi.ge/city/"+converter.toEnglish("ონი")+"%E1%83%90%E1%83%91%E1%83%90%E1%83%A1%E1%83%97%E1%83%A3%E1%83%9B%E1%83%90%E1%83%9C%E1%83%98");
        this.dictionary.put("რუსთავი", "http://amindi.ge/city/"+converter.toEnglish("რუსთავი")+"%E1%83%90%E1%83%91%E1%83%90%E1%83%A1%E1%83%97%E1%83%A3%E1%83%9B%E1%83%90%E1%83%9C%E1%83%98");
        this.dictionary.put("საგარეჯო", "http://amindi.ge/city/"+converter.toEnglish("საგარეჯო")+"%E1%83%90%E1%83%91%E1%83%90%E1%83%A1%E1%83%97%E1%83%A3%E1%83%9B%E1%83%90%E1%83%9C%E1%83%98");
        this.dictionary.put("სამტრედია", "http://amindi.ge/city/"+converter.toEnglish("სამტრედია")+"%E1%83%90%E1%83%91%E1%83%90%E1%83%A1%E1%83%97%E1%83%A3%E1%83%9B%E1%83%90%E1%83%9C%E1%83%98");
        this.dictionary.put("საჩხერე", "http://amindi.ge/city/"+converter.toEnglish("საჩხერე")+"%E1%83%90%E1%83%91%E1%83%90%E1%83%A1%E1%83%97%E1%83%A3%E1%83%9B%E1%83%90%E1%83%9C%E1%83%98");
        this.dictionary.put("სენაკი", "http://amindi.ge/city/"+converter.toEnglish("სენაკი")+"%E1%83%90%E1%83%91%E1%83%90%E1%83%A1%E1%83%97%E1%83%A3%E1%83%9B%E1%83%90%E1%83%9C%E1%83%98");
        this.dictionary.put("სიონი", "http://amindi.ge/city/"+converter.toEnglish("სიონი")+"%E1%83%90%E1%83%91%E1%83%90%E1%83%A1%E1%83%97%E1%83%A3%E1%83%9B%E1%83%90%E1%83%9C%E1%83%98");

        this.dictionary.put("სიღნაღი", "http://amindi.ge/city/"+converter.toEnglish("სიღნაღი")+"/%E1%83%A1%E1%83%98%E1%83%A6%E1%83%9C%E1%83%90%E1%83%A6%E1%83%98");

        this.dictionary.put("სოხუმი", "http://amindi.ge/city/"+converter.toEnglish("სოხუმი")+"%E1%83%90%E1%83%91%E1%83%90%E1%83%A1%E1%83%97%E1%83%A3%E1%83%9B%E1%83%90%E1%83%9C%E1%83%98");
        this.dictionary.put("სურამი", "http://amindi.ge/city/"+converter.toEnglish("სურამი")+"%E1%83%90%E1%83%91%E1%83%90%E1%83%A1%E1%83%97%E1%83%A3%E1%83%9B%E1%83%90%E1%83%9C%E1%83%98");
        this.dictionary.put("ურეკი", "http://amindi.ge/city/"+converter.toEnglish("ურეკი")+"%E1%83%90%E1%83%91%E1%83%90%E1%83%A1%E1%83%97%E1%83%A3%E1%83%9B%E1%83%90%E1%83%9C%E1%83%98");
        this.dictionary.put("უშგული", "http://amindi.ge/city/"+converter.toEnglish("უშგული")+"%E1%83%90%E1%83%91%E1%83%90%E1%83%A1%E1%83%97%E1%83%A3%E1%83%9B%E1%83%90%E1%83%9C%E1%83%98");
        this.dictionary.put("ფოთი", "http://amindi.ge/city/"+converter.toEnglish("ფოთი")+"%E1%83%90%E1%83%91%E1%83%90%E1%83%A1%E1%83%97%E1%83%A3%E1%83%9B%E1%83%90%E1%83%9C%E1%83%98");
        this.dictionary.put("ქობულეთი", "http://amindi.ge/city/"+converter.toEnglish("ქობულეთი")+"%E1%83%90%E1%83%91%E1%83%90%E1%83%A1%E1%83%97%E1%83%A3%E1%83%9B%E1%83%90%E1%83%9C%E1%83%98");
        this.dictionary.put("ქუთაუსი", "http://amindi.ge/city/"+converter.toEnglish("ქუთაუსი")+"%E1%83%90%E1%83%91%E1%83%90%E1%83%A1%E1%83%97%E1%83%A3%E1%83%9B%E1%83%90%E1%83%9C%E1%83%98");
        this.dictionary.put("შატილი", "http://amindi.ge/city/"+converter.toEnglish("შატილი")+"%E1%83%90%E1%83%91%E1%83%90%E1%83%A1%E1%83%97%E1%83%A3%E1%83%9B%E1%83%90%E1%83%9C%E1%83%98");
        this.dictionary.put("შეკვეთილი", "http://amindi.ge/city/"+converter.toEnglish("შეკვეთილი")+"%E1%83%90%E1%83%91%E1%83%90%E1%83%A1%E1%83%97%E1%83%A3%E1%83%9B%E1%83%90%E1%83%9C%E1%83%98");
        this.dictionary.put("შოვი", "http://amindi.ge/city/"+converter.toEnglish("შოვი")+"%E1%83%90%E1%83%91%E1%83%90%E1%83%A1%E1%83%97%E1%83%A3%E1%83%9B%E1%83%90%E1%83%9C%E1%83%98");
        this.dictionary.put("ჩოხატაური", "http://amindi.ge/city/"+converter.toEnglish("ჩოხატაური")+"%E1%83%90%E1%83%91%E1%83%90%E1%83%A1%E1%83%97%E1%83%A3%E1%83%9B%E1%83%90%E1%83%9C%E1%83%98");
        this.dictionary.put("ცხინვალი", "http://amindi.ge/city/"+converter.toEnglish("ცხინვალი")+"%E1%83%90%E1%83%91%E1%83%90%E1%83%A1%E1%83%97%E1%83%A3%E1%83%9B%E1%83%90%E1%83%9C%E1%83%98");
        this.dictionary.put("წინანდალი", "http://amindi.ge/city/"+converter.toEnglish("წინანდალი")+"%E1%83%90%E1%83%91%E1%83%90%E1%83%A1%E1%83%97%E1%83%A3%E1%83%9B%E1%83%90%E1%83%9C%E1%83%98");
        this.dictionary.put("წყნეთი", "http://amindi.ge/city/"+converter.toEnglish("წყნეთი")+"%E1%83%90%E1%83%91%E1%83%90%E1%83%A1%E1%83%97%E1%83%A3%E1%83%9B%E1%83%90%E1%83%9C%E1%83%98");
        this.dictionary.put("ჭიათურა", "http://amindi.ge/city/"+converter.toEnglish("ჭიათურა")+"%E1%83%90%E1%83%91%E1%83%90%E1%83%A1%E1%83%97%E1%83%A3%E1%83%9B%E1%83%90%E1%83%9C%E1%83%98");
        this.dictionary.put("ხარაგაული", "http://amindi.ge/city/"+converter.toEnglish("ხარაგაული")+"%E1%83%90%E1%83%91%E1%83%90%E1%83%A1%E1%83%97%E1%83%A3%E1%83%9B%E1%83%90%E1%83%9C%E1%83%98");
        this.dictionary.put("ხაშური", "http://amindi.ge/city/"+converter.toEnglish("ხაშური")+"%E1%83%90%E1%83%91%E1%83%90%E1%83%A1%E1%83%97%E1%83%A3%E1%83%9B%E1%83%90%E1%83%9C%E1%83%98");
        this.dictionary.put("ხობი", "http://amindi.ge/city/"+converter.toEnglish("ხობი")+"%E1%83%90%E1%83%91%E1%83%90%E1%83%A1%E1%83%97%E1%83%A3%E1%83%9B%E1%83%90%E1%83%9C%E1%83%98");
    }

}
