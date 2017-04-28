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
public class FrenchToDo extends MasterToDo
{
    
    final private ArrayList<String> jours = new ArrayList();
    public FrenchToDo()
    {
       //jours means day in French
            jours.add("Lundi");    
            jours.add("Mardi");
            jours.add("Mercredi");
            jours.add("Jeudi");
            jours.add("Vendredi");
            jours.add("Samedi");
            jours.add("Dimanche");
    }
   /*    
    @Override
    public void start(Stage frenchStage)
    {
            stageSetUp(getJours());
    }  
    */
    public ArrayList<String> getJours() 
    {
        return jours;
    }
}
