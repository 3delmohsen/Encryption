package sample;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
public class Controller {

    @FXML
    private TextArea thetext;
    @FXML
    private TextField thekey;

    @FXML
    private TextArea massege;



    @FXML
    public void decrypt(){
        int index = 0;
        int key = Integer.parseInt (thekey.getText ());
        String text=thetext.getText ();
        char[] arr1=text.toCharArray ();
        for (char c : arr1) {
            c+=key;
            arr1[index]=c;
            index ++;
    }
        StringBuilder textf=new StringBuilder ();
        for (char c : arr1) {
            textf.append (c);
        }
        massege.setText (String.valueOf (textf));
    }
    @FXML
    public void encrypt(){
        int index = 0;
        int key = Integer.parseInt (thekey.getText ());
        String text=thetext.getText ();
        char[] arr1=text.toCharArray ();
        for (char c : arr1) {
            c-=key;
            arr1[index]=c;
            index ++;
        }
        StringBuilder textf=new StringBuilder ();
        for (char c : arr1) {
            textf.append (c);
        }
        massege.setText (String.valueOf (textf));
    }

}
