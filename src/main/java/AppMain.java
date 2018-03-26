import parser.Parser;

import java.io.IOException;

public class AppMain {

    public static void main(String[] args) {
        Parser parser = new Parser();
        System.out.println(parser.getCities());
        System.out.println(parser.getTemp());
        try {
            parser.setCity("რაჭა");
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(parser.getTemp());
    }

}
