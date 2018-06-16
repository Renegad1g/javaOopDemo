/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tyaa.javaoopdemo;

import java.util.ArrayList;
import java.util.List;
import org.tyaa.javaoopdemo.entity.*;
import org.tyaa.javaoopdemo.entity.interfaces.IPrintable;
import org.tyaa.javaoopdemo.entity.interfaces.IScalable;

/**
 *
 * @author Yurii
 */
public class JavaOopDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*Group gr1 = new Group();
        //System.out.println(gr1.id);
        //System.out.println(gr1.toString());
        
        Group gr2 = new Group();
        //System.out.println(gr2.id);
        //System.out.println(gr2.toString());
        
        Group gr3 = new Group();
        //System.out.println(gr3.id);
        //System.out.println(gr3.toString());
        
        Student st1 = new Student();
        st1.groupId = 2;
        //System.out.println(st1.toString());
        //System.out.println(st1.id);
        //System.out.println(st1.groupId);
        
        List list = new ArrayList();
        list.add(st1);
        list.add(gr1);
        list.add(gr2);
        list.add(gr3);
        
        for (Object object : list) {
            
            System.out.println(object.toString());
        }*/
        
        Point p1 = new Point(10, 20);
        Rectangle rect1 = new Rectangle();
        rect1.startPoint = p1;
        rect1.height = 50;
        rect1.width = 120;
        Circle c1 = new Circle();
        c1.centerPoint = p1;
        c1.radius = 87;
        
        List<IPrintable> primitives = new ArrayList<>();
        //primitives.add(st1);
        primitives.add(c1);
        primitives.add(rect1);
        primitives.add(p1);
        
        for (IPrintable primitive : primitives) {
            System.out.println("start");
            primitive.print();
            if (primitive instanceof IScalable) {
                ((IScalable)primitive).scale(2);
                primitive.print();
            }
            System.out.println("end");
            //System.out.println("***");
        }
    }
    
}
