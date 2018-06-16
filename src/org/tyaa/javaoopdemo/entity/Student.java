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
public class Student extends Entity{
    
    public String firstName;
    public String lastName;
    public int groupId;
    
    public static int lastId = 0;
    
    public Student(){
    
        this.id = lastId++;
    }
    
    @Override
    public String toString() {
        //return super.toString();
        return super.toString() + String.format(
            "firstName = %d, lastName = %d, groupId = %d"
                , firstName, lastName, groupId
        );
    }
}
