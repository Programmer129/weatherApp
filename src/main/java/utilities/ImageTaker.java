package utilities;

import javafx.scene.image.Image;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class ImageTaker {

    private Map<String,Image> map = new HashMap<>();
    private String path = "/home/levani/IdeaProjects/weatherappdemo/images/";

    public ImageTaker(){
        this.createDictionary();
    }

    private void createDictionary() {
        this.map.put("გრუბლიანი", new Image(new File(path+"grubliani.png").toURI().toString()));
        this.map.put("კოკისპირული წვიმა",new Image(new File(path+"kokispiruli_wvima.png").toURI().toString()));
        this.map.put("მზე",new Image(new File(path+"mze.png").toURI().toString()));
        this.map.put("მზიანი",new Image(new File(path+"mze.png").toURI().toString()));
        this.map.put("უმეტესად მზიანი",new Image(new File(path+"mze.png").toURI().toString()));
        this.map.put("ნაწილობრივ მზიანი",new Image(new File(path+"mze.png").toURI().toString()));
        this.map.put("სეტყვა",new Image(new File(path+"setyva.png").toURI().toString()));
        this.map.put("უმეტესად ღრუბლიანი",new Image(new File(path+"umetesad_grubliani.png").toURI().toString()));
        this.map.put("ცვალებადი მოღრუბლულობა",new Image(new File(path+"umetesad_grubliani.png").toURI().toString()));
        this.map.put("წვიმა",new Image(new File(path+"wvima.png").toURI().toString()));
        this.map.put("კოკისპირული წვიმა, უმეტესად ღრუბლიანი",new Image(new File(path+"wvima.png").toURI().toString()));
        this.map.put("წვიმა და თოვლი",new Image(new File(path+"wvima_da_tovli.png").toURI().toString()));
        this.map.put("თოვლი",new Image(new File(path+"tovli.png").toURI().toString()));
    }

    public Map<String, Image> getMap() {
        return map;
    }

    public BackgroundImage getBackgroundImage(){
        Image image = new Image(new File(this.path+"sun4.jpg").toURI().toString());
        return new BackgroundImage(image,
                BackgroundRepeat.NO_REPEAT,BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
    }
}
