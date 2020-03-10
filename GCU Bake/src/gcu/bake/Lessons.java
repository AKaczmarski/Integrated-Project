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
    private int ChefID; 
    private String LessonDescription;
    //*******************
    
    //Contructor
    public Lessons (String name){
        LessonID+=LCounter;
        LessonName = name;
        
        LCounter++;
    }
    //*******************
    
    //Getters
    public int getLCounter(){
        return this.LCounter;
    }
    public int getLessonID(){
        return this.LessonID;
    }
    public String getLessonName(){
        return this.LessonName;
    }
    public int getChefID(){
        return this.ChefID;
    }
    public String getLessonDescription(){
        return this.LessonDescription;
    }
    //*******************
    
    //Setters
    public void setLessonName(String name){
        this.LessonName = name;
    }
    public void setChefID(int id){
        this.ChefID =id;
    }
    public void setLessonDescription(String desc){
        this.LessonDescription = desc;
    }
    //*******************
    
    //Methods
    /*public changeStatus (int LessonID, int x){
        
    } */
    //*******************
}
