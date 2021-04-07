/*
d
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yujing.spring2021.term_project;

/**
 *
 * @author yujinggao
 */
public class Driver {
    public static void main(String[] args) {
        Bread bread1 = new ItalianBread();
        bread1.setToastedBehavior(new LightlyToasted());
        String result = bread1.getDescription();
        System.out.println(result);

        Bread bread2 = new HerbsAndCheeseBread();
        bread2.setToastedBehavior(new HeavilyToasted());
        System.out.println(bread2.getDescription());

    }
}
