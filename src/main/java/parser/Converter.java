package parser;

import java.util.HashMap;
import java.util.Map;

public class Converter {

    private Map<Character, String> dictionary = new HashMap<>();

    private void generateDictionary() {
        dictionary.put('ა',"a");
        dictionary.put('ბ',"b");
        dictionary.put('გ',"c");
        dictionary.put('დ',"d");
        dictionary.put('ე',"e");
        dictionary.put('ვ',"v");
        dictionary.put('ზ',"z");
        dictionary.put('თ',"t");
        dictionary.put('ი',"i");
        dictionary.put('კ',"k");
        dictionary.put('ლ',"l");
        dictionary.put('მ',"m");
        dictionary.put('ნ',"n");
        dictionary.put('ო',"o");
        dictionary.put('პ',"p");
        dictionary.put('ჟ',"j");
        dictionary.put('რ',"r");
        dictionary.put('ს',"s");
        dictionary.put('ტ',"t");
        dictionary.put('უ',"u");
        dictionary.put('ფ',"f");
        dictionary.put('ქ',"q");
        dictionary.put('ღ',"g");
        dictionary.put('ყ',"y");
        dictionary.put('შ',"sh");
        dictionary.put('ჩ',"ch");
        dictionary.put('ც',"c");
        dictionary.put('ძ',"dz");
        dictionary.put('წ',"w");
        dictionary.put('ჭ',"ch");
        dictionary.put('ხ',"x");
        dictionary.put('ჯ',"j");
        dictionary.put('ჰ',"h");
    }

    public Converter(){
        this.generateDictionary();
    }

    public String toEnglish(String word){
        String ans="";
        for(int i=0; i < word.length(); i++){
            ans += this.dictionary.get(word.charAt(i));
        }

        return ans;
    }

    public Map<Character, String> getDictionary() {
        return dictionary;
    }
}
