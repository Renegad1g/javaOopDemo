/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tyaa.javaoopdemo.entity;

import org.tyaa.javaoopdemo.entity.interfaces.IPrintable;
import org.tyaa.javaoopdemo.entity.interfaces.IScalable;

/**
 *
 * @author Yurii
 */
public class Circle implements IPrintable, IScalable{
    
    public Point centerPoint = new Point(0, 0);
    public int radius = 0;
    
    @Override
    public void print() {
        System.out.println(centerPoint.x + " " + centerPoint.y + " " + radius);
    }
    
    @Override
    public void scale(int k) {
        radius *= k;
    }
}
