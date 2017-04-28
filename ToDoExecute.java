/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FinalProject;

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
ArrayList Week;
    @Override // Override the start method in the Application class
    public void start(Stage primaryStage) 
    {            
        
        MasterToDo todoDefault = new MasterToDo(); /*default stage is created in English*/
        todoDefault.stageSetUp(todoDefault.getDaysofWeek());

/*assigning tasks to the ComboBox, if a language is selected then the stage changes the language
*/
        todoDefault.chooseBox.setOnAction(e -> 
        {
            if("Swahili".equalsIgnoreCase(todoDefault.chooseBox.getValue()))
            {
                  /*no-arg constructor that allows to get the days in Swahili*/
                 SwahiliToDo todoSwa = new SwahiliToDo();
                 todoDefault.stageSetUp(todoSwa.getSiku());
                 todoDefault.chooseBox.setValue("Swahili");   
            }
            
           if("English".equalsIgnoreCase(todoDefault.chooseBox.getValue()))
            {
                  /*no-arg constructor that allows to get the days in English*/
                 todoDefault.stageSetUp(todoDefault.getDaysofWeek());
                 todoDefault.chooseBox.setValue("English");   
            }
           
            if("Français".equalsIgnoreCase(todoDefault.chooseBox.getValue()))
            {
                /*no-arg constructor that allows to get the days in French*/
                 FrenchToDo todoFre = new FrenchToDo();
                 todoDefault.stageSetUp(todoFre.getJours());
                 todoDefault.chooseBox.setValue("Français");   
            }
            
            if("Kirundi".equalsIgnoreCase(todoDefault.chooseBox.getValue()))
            {
                 /*no-arg constructor that allows to get the days in Kirundi*/
                 KirundiToDo todoKir = new KirundiToDo();
                 todoDefault.setDaysofWeek(todoKir.getUmunsi());
                 todoDefault.stageSetUp(todoKir.getUmunsi());
                 todoDefault.chooseBox.setValue("Kirundi");   
            }
            
            if("Lingala".equalsIgnoreCase(todoDefault.chooseBox.getValue()))
            {
                 /*no-arg constructor that allows to get the days in Lingala*/
                 LingalaToDo todoLin = new LingalaToDo();
                 todoDefault.stageSetUp(todoLin.getMikolo());
                 todoDefault.chooseBox.setValue("Lingala");   
            }
            
        });
    
       
     
    }

    public static void main(String[] args) 
    {
        launch(args);
    }

}
