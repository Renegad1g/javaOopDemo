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
public class Group extends Entity {
    
    public String name;
    public static int lastId = 0;
    
    public Group(){
    
        this.id = lastId++;
    }

    @Override
    public String toString() {
        //return super.toString();
        return super.toString() + String.format("name = %d", name);
    }
    
    
}
