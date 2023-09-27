/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FantasyFootballSetup;

/**
 *
 * @author felip
 */
public class Forward extends Player {
    
    int numGoalsScored;
    
    public Forward(int numGoalsScored , String fname, String lname, String country, int age, String position) {
       //passes this values to the parent's constructors
        super(fname, lname, country, age, position); 
        
    }
    
     public Forward(String fname, String lname, String country, int age, String position) {
       //passes this values to the parent's constructors
        super(fname, lname, country, age, position); 
        this.numGoalsScored = 0;
    
}}
