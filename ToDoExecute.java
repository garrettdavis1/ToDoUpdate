/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ToDoUpdate;

/**
 *
 * @author benismunganga
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javafx.application.Application;
import javafx.stage.Stage;

public class ToDoExecute extends Application 
{
    @Override // Override the start method in the Application class
    public void start(Stage primaryStage) 
    {            
        
        MasterToDo todoDefault = new MasterToDo();
        Scene defaultScene = new Scene(todoDefault.stageSetUp(todoDefault.getDaysofWeek()));
        primaryStage.setScene(defaultScene);
        
       todoDefault.chooseBox.setOnAction(e -> 
        {
            Scene prompt;
            //choosing the languages
            switch(todoDefault.chooseBox.getValue())
            {
                case "Swahili": 
                 SwahiliToDo todoSwa = new SwahiliToDo();
                 prompt = new Scene(todoSwa.stageSetUp(todoSwa.getSiku()));
                 todoSwa.chooseBox.setValue("Swahili");  
                 primaryStage.setScene(prompt);        
                 break;
                 
                case "English":
                 MasterToDo newTodoDefault = new MasterToDo();
                 prompt = new Scene(newTodoDefault.stageSetUp(newTodoDefault.getDaysofWeek()));
                 newTodoDefault.chooseBox.setValue("English");   
                 primaryStage.setScene(prompt); 
                 break;
                
                case "Français":
                 FrenchToDo todoFre = new FrenchToDo();
                 prompt = new Scene(todoFre.stageSetUp(todoFre.getJours()));
                 todoFre.chooseBox.setValue("Français");  
                 primaryStage.setScene(prompt);
                 break;

                case "Kirundi":
                 KirundiToDo todoKir = new KirundiToDo();
                 prompt = new Scene(todoKir.stageSetUp(todoKir.getUmunsi()));
                 todoKir.chooseBox.setValue("Kirundi"); 
                 primaryStage.setScene(prompt);
                 break;

                case "Lingala":
                 LingalaToDo todoLin = new LingalaToDo();
                 prompt = new Scene(todoLin.stageSetUp(todoLin.getMikolo()));
                 todoLin.chooseBox.setValue("Lingala");   
                 primaryStage.setScene(prompt);
                 break;
            }
        });

       primaryStage.show(); 
    }

    public static void main(String[] args) 
    {
        launch(args);
    }

}
