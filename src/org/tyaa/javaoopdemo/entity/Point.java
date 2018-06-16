/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tyaa.javaoopdemo.entity;

import org.tyaa.javaoopdemo.entity.interfaces.IPrintable;

/**
 *
 * @author Yurii
 */
public class Point implements IPrintable{
    
    public int x;
    public int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void print() {
        System.out.println(x + " " + y);
    }
}
