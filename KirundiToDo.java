/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ToDoUpdate;

import java.util.ArrayList;
import javafx.stage.Stage;

/**
 *
 * @author benismunganga
 */
public class KirundiToDo extends MasterToDo
{

    private ArrayList<String> umunsi = new ArrayList();
    public KirundiToDo()
    {
       //umunsi means day in Kirundi
            umunsi.add("Kuwa mbere");    
            umunsi.add("Kuwa kabiri");
            umunsi.add("Kuwa gatatu");
            umunsi.add("Kuwa kane");
            umunsi.add("Kuwa gatanu");
            umunsi.add("Kuwa gatandatu");
            umunsi.add("Ku musi w' Imana");
    }
    
    public ArrayList<String> getUmunsi() 
    {
        return umunsi;
    }
    
}
