package com.example.maquina_expendedora;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @javafx.fxml.FXML
    private ImageView FantaImg;
    @javafx.fxml.FXML
    private HBox MaqID;
    @javafx.fxml.FXML
    private ImageView CocacolaImg;
    @javafx.fxml.FXML
    private ImageView PepsiImg;
    @javafx.fxml.FXML
    private ImageView SpriteImg;
    @javafx.fxml.FXML
    private GridPane VitrinaId;
    @javafx.fxml.FXML
    private ImageView Sprite2Img;
    @javafx.fxml.FXML
    private Button Butt2;
    @javafx.fxml.FXML
    private Button Butt1;
    @javafx.fxml.FXML
    private Label Pantalla;
    @javafx.fxml.FXML
    private Button ButtC;
    @javafx.fxml.FXML
    private Button ButtB;
    @javafx.fxml.FXML
    private Button ButtA;
    @javafx.fxml.FXML
    private Button Butt3;

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 775, 891);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.resizableProperty().setValue(Boolean.FALSE);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}