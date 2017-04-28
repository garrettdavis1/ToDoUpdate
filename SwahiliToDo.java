/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FinalProject;

import java.util.ArrayList;
import javafx.stage.Stage;

/**
 *
 * @author benismunganga
 */
public class SwahiliToDo extends MasterToDo
{

    final private ArrayList<String> siku = new ArrayList();
    
    public SwahiliToDo()
    {
      //siku means day in Swahili
            siku.add("Jumatatu");    
            siku.add("Jumanne");
            siku.add("Jumatano");
            siku.add("Alhamisi");
            siku.add("Ijumaa");
            siku.add("Jumamosi");
            siku.add("Jumapili");
    }
    
    /*   
    @Override
    public void start(Stage swahiliStage)
    {
            stageSetUp(getSiku());
    }  
   */ 
    public ArrayList<String> getSiku() 
    {
        return siku;
    }
}
