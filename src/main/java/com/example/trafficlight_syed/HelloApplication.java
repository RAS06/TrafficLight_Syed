package com.example.trafficlight_syed;

import javafx.application.Application;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.geometry.Insets;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.control.Button;
import javafx.geometry.Pos;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.layout.Pane;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.text.Text;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.geometry.Orientation;
import javafx.scene.control.ScrollBar;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Circle;

import java.io.IOException;

public class HelloApplication extends Application {
    public AnchorPane pain = new AnchorPane();
    @Override
    public void start(Stage stage) throws IOException {
        Scene scene = new Scene(pain, 320, 320);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
        buildUI();
    }

    public void buildUI() {
        RadioButton rdRed = new RadioButton("Red");
        rdRed.setLayoutX(130);
        rdRed.setLayoutY(210);

        RadioButton rdYellow = new RadioButton("Yellow");
        rdYellow.setLayoutX(130);
        rdYellow.setLayoutY(230);

        RadioButton rdGreen = new RadioButton("Green");
        rdGreen.setLayoutX(130);
        rdGreen.setLayoutY(250);


        Rectangle r = new Rectangle();
        r.setX(120);
        r.setY(25);
        r.setWidth(80);
        r.setHeight(169);
        r.setFill(Color.WHITE);
        r.setStroke(Color.BLACK);

        Circle cR = new Circle();
        cR.setCenterX(160);
        cR.setCenterY(70);
        cR.setRadius(15.0f);
        cR.setStroke(Color.BLACK);
        cR.setFill(Color.WHITE);

        Circle cY = new Circle();
        cY.setCenterX(160);
        cY.setCenterY(110);
        cY.setRadius(15.0f);
        cY.setStroke(Color.BLACK);
        cY.setFill(Color.WHITE);

        Circle cG = new Circle();
        cG.setCenterX(160);
        cG.setCenterY(150);
        cG.setRadius(15.0f);
        cG.setStroke(Color.BLACK);
        cG.setFill(Color.WHITE);

        ToggleGroup tg = new ToggleGroup();

        rdRed.setToggleGroup(tg);
        rdGreen.setToggleGroup(tg);
        rdYellow.setToggleGroup(tg);

        rdRed.setOnAction(e -> {
            if (rdRed.isSelected()){
                cR.setFill(Color.RED);
                cY.setFill(Color.WHITE);
                cG.setFill(Color.WHITE);
            }
        });

        rdYellow.setOnAction(e -> {
            if (rdYellow.isSelected()){
                cY.setFill(Color.YELLOW);
                cR.setFill(Color.WHITE);
                cG.setFill(Color.WHITE);
            }
        });

        rdGreen.setOnAction(e -> {
            if (rdGreen.isSelected()){
                cG.setFill(Color.GREEN);
                cY.setFill(Color.WHITE);
                cR.setFill(Color.WHITE);
            }
        });

        pain.getChildren().addAll(r, cR, cY, cG, rdRed, rdYellow, rdGreen);


        pain.setStyle("-fx-background-color: white");
    }

    public static void main(String[] args) {
        launch();
    }
}