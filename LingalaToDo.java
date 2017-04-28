/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ToDoUpdate;

import java.util.ArrayList;

/**
 *
 * @author benismunganga
 */
public class LingalaToDo extends MasterToDo
{

    final private ArrayList<String> mikolo = new ArrayList();
    public LingalaToDo()
    {
       //mokolo means day in Lingala
            mikolo.add("Mokolo ya liboso");    
            mikolo.add("Mokolo ya mibale");
            mikolo.add("Mokolo ya misatu");
            mikolo.add("Mokolo ya minei");
            mikolo.add("Mokolo ya mitanu");
            mikolo.add("Mokolo ya mposo");
            mikolo.add("Lomingo");
    }
    
    /*   
    @Override
    public void start(Stage kirundiStage)
    {
            stageSetUp(getUmunsi());
    }  
   */ 
    public ArrayList<String> getMikolo() 
    {
        return mikolo;
    }
    
}

