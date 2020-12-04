import javafx.fxml.FXML;

import javafx.scene.control.Label;



public class ControllerFX {



    @FXML

    private Label lblOutput;



    public void sayHello() {

        lblOutput.setText("Hello FXML!");



    }



}