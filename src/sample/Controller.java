package sample;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.awt.*;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.Locale;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    public TextField fName;
    public TextField sName;
    public ImageView img;
    public Button btn;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
      Image image = new Image(getClass().getResourceAsStream("/sample/white.png"));
      img.setImage(image);
    }


    public void butt(ActionEvent actionEvent) throws FileNotFoundException {
        String name1 = fName.getText();
        String name2 = sName.getText();
        name1 = name1.toLowerCase(Locale.ROOT).trim();
        name2 = name2.toLowerCase(Locale.ROOT).trim();
        //System.out.println(name1+" "+name2);
        String str = "FLAMES";
        // declaring n which is number of uncommon character in the names
        // countpair returns number of common characters of the given names
        // here i subtract total length of both name with 2 times common character
        int n = (name1.length() + name2.length()) - (2 * Flames.countPair(name1, name2)), x;

        // In this while loop by using  modulo i find out which word from Flames should cut off
        // for the last value the modulo will come 0 but we need its real value that is why i use if(x==0) condition
        while (str.length() != 1) {
            x = n % str.length();
            if (x == 0) {
                x = str.length();
            }
            // deleting the counted character from string
            str = Flames.delete(str, x);
        }
        switch (str){
            case "F":
                setfriend();
                break;
            case "L":
                setLove();
                break;
            case "A":
                setAffair();
                break;
            case "M":
                setMarriage();
                break;
            case "E":
                setEnemy();
                break;
            case "S":
                setsister();
                break;
            default:
                setWhite();

        }

    }
    public void setWhite()
    {
        Image image = new Image(getClass().getResourceAsStream("/sample/white.png"));
        img.setImage(image);
    }
    public void setfriend()
    {
        Image image = new Image(getClass().getResourceAsStream("/sample/Friend.png"));
        img.setImage(image);
    }
    public void setLove()
    {
        Image image = new Image(getClass().getResourceAsStream("/sample/Love.png"));
        img.setImage(image);
    }
    public void setAffair()
    {
        Image image = new Image(getClass().getResourceAsStream("/sample/Affair.png"));
        img.setImage(image);
    }
    public void setMarriage ()
    {
        Image image = new Image(getClass().getResourceAsStream("/sample/Marriage.png"));
        img.setImage(image);
    }
    public void setEnemy()
    {
        Image image = new Image(getClass().getResourceAsStream("/sample/enemy.png"));
        img.setImage(image);
    }
    public void setsister()
    {
        Image image = new Image(getClass().getResourceAsStream("/sample/Sister.png"));
        img.setImage(image);
    }
}
