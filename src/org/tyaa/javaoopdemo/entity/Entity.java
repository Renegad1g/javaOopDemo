/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tyaa.javaoopdemo.entity;

/**
 *
 * @author Yurii
 */
public class Entity {
    
    //private static int lastId = 0;
    public int id;
    /*static {
        lastId = 0;
    }*/
    
    public Entity(){
    
        //this.id = this.getClass().getClassLoader().lastId++;
        
    }
    
    @Override
    public String toString() {
        //return super.toString();
        return String.format("id = %d, ", id);
    }
}
