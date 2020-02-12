/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gcu.bake;

/**
 *
 * @author akaczm200
 */
public class Lessons {
    
    //Variables
    private static int LCounter=0;
    private int LessonID=100000;
    private String LessonName;
    private int[] Chefs; //Array contains all the chefs that can teach the lesson
    //either it's an array with many IDs or many objets but with different chefID.
    //*******************
    
    //Contructor
    public Lessons (String name){
        LessonID+=LCounter;
        LessonName = name;
        
        LCounter++;
    }
    //*******************
    
    //Getters
    
    //*******************
    
    //Setters
    
    //*******************
    
    //Methods
    
    //*******************
}
