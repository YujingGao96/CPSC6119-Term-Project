/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yujing.spring2021.project2;

import java.awt.*;

/**
 *
 * @author yujinggao
 */
public class Driver {
    public static void main(String[] args) {
        RGBModelInterface model = new RGBModel();
        ControllerInterface controller = new RGBController(model);
    }
}
