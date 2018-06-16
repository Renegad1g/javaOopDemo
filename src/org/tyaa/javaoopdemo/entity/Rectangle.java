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
public class Rectangle  implements IPrintable, IScalable{
    
    public Point startPoint = new Point(0, 0);
    public int width = 0;
    public int height = 0;

    @Override
    public void print() {
        System.out.println(startPoint.x + " " + startPoint.y + " " + width + " " + height);
    }

    @Override
    public void scale(int k) {
        width *= k;
        height *= k;
    }
}
