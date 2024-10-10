package com.example.maquina_expendedora;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;

public class HelloController {
    @FXML
    private ImageView FantaImg;
    @FXML
    private HBox MaqID;
    @FXML
    private ImageView CocacolaImg;
    @FXML
    private ImageView PepsiImg;
    @FXML
    private ImageView SpriteImg;
    @FXML
    private GridPane VitrinaId;
    @FXML
    private ImageView Sprite2Img;
    @FXML
    private Label PantallaImporte;
    @FXML
    private Label PantallaID;
    @FXML
    private Button Butt1e;
    @FXML
    private Label Tag7up;
    @FXML
    private Button Butt2;
    @FXML
    private Button Butt1;
    @FXML
    private Button Butt50;
    @FXML
    private Label TagFanta;
    @FXML
    private Button Butt10;
    @FXML
    private Label TagCocacola;
    @FXML
    private Label TagKas;
    @FXML
    private Button ButtY;
    @FXML
    private Button Butt2e;
    @FXML
    private Button ButtN;
    @FXML
    private Button ButtC;
    @FXML
    private Label TagPepsi;
    @FXML
    private Label TagSprite;
    @FXML
    private Button ButtB;
    @FXML
    private Button Butt20;
    @FXML
    private Button ButtA;
    @FXML
    private Button Butt3;
    @FXML
    private Button Butt05;

    private Alert Alerterr = new Alert(Alert.AlertType.ERROR);
    private Alert alert = new Alert(Alert.AlertType.INFORMATION);
    double Importe;
    String [][]Aux = {{"A1","1.35"},{"B1","1.20"},{"A2","1.20"},{"B2","1.10"},{"A3","1.20"},{"B3","1.20"}};
    public void initialize() {
    }

    @FXML
    public void PrsdButt05() {
        Importe = Importe+0.05;
        PantallaImporte.setText(String.format("%.2f",Importe));
    }

    @FXML
    public void PrsdButt10() {
        Importe = Importe+0.10;
        PantallaImporte.setText(String.format("%.2f",Importe));
    }

    @FXML
    public void PrsdButt20() {
        Importe = Importe+0.20;
        PantallaImporte.setText(String.format("%.2f",Importe));
    }

    @FXML
    public void PrsdButt50() {
        Importe = Importe+0.50;
        PantallaImporte.setText(String.format("%.2f",Importe));
    }

    @FXML
    public void PrsdButt1e() {
        Importe = Importe+1;
        PantallaImporte.setText(String.format("%.2f",Importe));
    }

    @FXML
    public void PrsdButt2e() {
        Importe = Importe+2;
        PantallaImporte.setText(String.format("%.2f",Importe));
    }

    @FXML
    public void PrsdButtA() {
        PantallaID.setText("A");
    }

    @FXML
    public void PrsdButtB() {
        PantallaID.setText("B");
    }

    @FXML
    public void PrsdButtC() {
        PantallaID.setText("C");
    }

    @FXML
    public void PrsdButt1() {
        PantallaID.setText(PantallaID.getText()+1);
    }

    @FXML
    public void PrsdButt2() {
        PantallaID.setText(PantallaID.getText()+2);
    }

    @FXML
    public void PrsdButt3() {
        PantallaID.setText(PantallaID.getText()+3);
    }

    @FXML
    public void PrsdButtY() {
        for (int i=0;i<Aux.length;i++){
            if(PantallaID.getText().equals(Aux[i][0])){
                if(Importe>=Double.parseDouble(Aux[i][1])){
                    Importe = Importe-Double.parseDouble(Aux[i][1]);
                    PantallaImporte.setText(String.format("%.2f",Importe));
                    alert.setTitle("Felicidades");
                    alert.setHeaderText("Comprado");

                    alert.showAndWait();
                }else{
                    Alerterr.setTitle("Error");
                    Alerterr.setHeaderText("Saldo insuficiente");

                    // Mostrar la alerta
                    Alerterr.showAndWait();
                }
            }
        }
    }

    @FXML
    public void PrsdButtN() {
        PantallaID.setText("");
        PantallaImporte.setText("Cancelada");
        Importe = 0;

    }

}