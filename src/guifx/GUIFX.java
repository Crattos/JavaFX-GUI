/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guifx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author miler
 */
public class GUIFX extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Hello World!");
        Scene scene = new Scene(new VBox(),800,480);
        
        MenuBar menuBar = new MenuBar();

        Menu menuFile = new Menu("File");
        Menu menuEdit = new Menu("Edit");
        Menu menuHelp = new Menu("Help");
        Menu menuTools = new Menu("Tools");
        
        MenuItem fileOpen = new MenuItem("Open");
        MenuItem fileSave = new MenuItem("Save");
        MenuItem fileExit = new MenuItem("Exit");
        
        MenuItem editAdd = new MenuItem("Add");
        MenuItem editClear = new MenuItem("Clear");
        MenuItem editFill = new MenuItem("Exit");
        
        MenuItem toolsSum = new MenuItem("Sum");
        MenuItem toolsAverage = new MenuItem("Average");
        MenuItem toolsMinimum = new MenuItem("Minimum");
        MenuItem toolsMaximum = new MenuItem("Maximum");
        
        MenuItem helpAbout = new MenuItem("About me");
        MenuItem helpHelp = new MenuItem("Help");
        
        menuFile.getItems().addAll(fileOpen, fileSave, fileExit);
        menuEdit.getItems().addAll(editAdd, editClear, editFill);
        menuTools.getItems().addAll(toolsSum,toolsAverage,toolsMinimum,toolsMaximum);
        menuHelp.getItems().addAll(helpHelp,helpAbout);
        
  
        menuBar.getMenus().addAll(menuFile,menuEdit,menuTools,menuHelp);
        
        ((VBox) scene.getRoot()).getChildren().add(menuBar);
        
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
