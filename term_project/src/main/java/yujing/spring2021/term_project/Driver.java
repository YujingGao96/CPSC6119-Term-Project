/*
d
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yujing.spring2021.term_project;

import java.awt.*;

/**
 *
 * @author yujinggao
 */
public class Driver {
    public static void main(String[] args) {
        MenuItem item = new Chicken(new Tomato(new Cucumber(new ItalianBread(new LightlyToasted()))));
        System.out.println(item.getDescription());

    }
}
