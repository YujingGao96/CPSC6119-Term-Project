package yujing.spring2021.project2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class RGBView implements ActionListener, FocusListener, RGBObserver {
    RGBModelInterface model;
    ControllerInterface controller;
    JFrame viewFrame;
    JPanel viewPanel;
    JPanel leftPanel;
    JPanel rightPanel;
    JPanel inputsPanel;
    JPanel buttonsPanel;
    JLabel redLabel;
    JLabel greenLabel;
    JLabel blueLabel;
    JTextField redInput;
    JTextField greenInput;
    JTextField blueInput;
    JButton incRed;
    JButton decRed;
    JButton incGreen;
    JButton decGreen;
    JButton incBlue;
    JButton decBlue;
    JPanel colorRep;
    JLabel hexRep;

    public RGBView(RGBModelInterface model, ControllerInterface controller) {
        this.model = model;
        this.controller = controller;
        // The RGB is an observer to the model
        model.registerObserver(this);
    }

    /**
     * Handle the button click action event
     *
     * @param e The action event
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source == incRed) controller.increaseRed();
        else if (source == decRed) controller.decreaseRed();
        else if (source == incGreen) controller.increaseGreen();
        else if (source == decGreen) controller.decreaseGreen();
        else if (source == incBlue) controller.increaseBlue();
        else if (source == decBlue) controller.decreaseBlue();
    }

    /**
     * Do nothing when the input filed is in focus
     *
     * @param e The focus event
     */
    @Override
    public void focusGained(FocusEvent e) {
    }

    /**
     * When an input field lost focus, the value of the color will be update to the model
     *
     * @param e The focus event
     */
    @Override
    public void focusLost(FocusEvent e) {
        JTextField source = (JTextField) e.getSource();
        String valueString = source.getText();
        int valueInt = isNumeric(valueString) ? Integer.parseInt(valueString) : 0;

        if (source == redInput) {
            controller.setRed(valueInt);
        } else if (source == greenInput) {
            controller.setGreen(valueInt);
        } else if (source == blueInput) {
            controller.setBlue(valueInt);
        }
    }

    /**
     * This method allows the observable to update the UI components
     */
    @Override
    public void updateColor() {
        int[] rgb = model.getRGB();
        redInput.setText(String.valueOf(rgb[0]));
        greenInput.setText(String.valueOf(rgb[1]));
        blueInput.setText(String.valueOf(rgb[2]));
        colorRep.setBackground(model.getCurrentColor());
        hexRep.setText(model.getCurrentHex());
    }

    /**
     * Check if a string representation is a valid integer
     *
     * @param strNum A string representation
     * @return Whether or not the string is a valid integer
     */
    public static boolean isNumeric(String strNum) {
        if (strNum == null) return false;
        try {
            Integer.parseInt(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

    /**
     * This function is used to create the UI components with corresponding event listeners
     */
    public void createView() {
        // Frame
        viewFrame = new JFrame("ColorEditor");
        viewFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        viewFrame.setSize(new Dimension(500, 500));
        // Grid Panels
        viewPanel = new JPanel(new GridLayout(1, 2));
        leftPanel = new JPanel(new GridLayout(1, 2));
        rightPanel = new JPanel(new GridLayout(2, 1));
        inputsPanel = new JPanel(new GridLayout(6, 1));
        buttonsPanel = new JPanel(new GridLayout(6, 1));

        // Components
        redLabel = new JLabel("Red", SwingConstants.CENTER);
        greenLabel = new JLabel("Green", SwingConstants.CENTER);
        blueLabel = new JLabel("Blue", SwingConstants.CENTER);

        // Three input fields listening to focus event
        redInput = new JTextField();
        redInput.addFocusListener(this);
        greenInput = new JTextField();
        greenInput.addFocusListener(this);
        blueInput = new JTextField();
        blueInput.addFocusListener(this);

        // 6 buttons listening to click action event
        incRed = new JButton("+ 10");
        incRed.addActionListener(this);
        decRed = new JButton("- 10");
        decRed.addActionListener(this);
        incGreen = new JButton("+ 10");
        incGreen.addActionListener(this);
        decGreen = new JButton("- 10");
        decGreen.addActionListener(this);
        incBlue = new JButton("+ 10");
        incBlue.addActionListener(this);
        decBlue = new JButton("- 10");
        decBlue.addActionListener(this);

        colorRep = new JPanel();
        colorRep.setBackground(null);
        hexRep = new JLabel("", SwingConstants.CENTER);

        // Add components to the panels
        viewPanel.add(leftPanel);
        viewPanel.add(rightPanel);
        leftPanel.add(inputsPanel);
        leftPanel.add(buttonsPanel);

        inputsPanel.add(redLabel);
        inputsPanel.add(redInput);
        inputsPanel.add(greenLabel);
        inputsPanel.add(greenInput);
        inputsPanel.add(blueLabel);
        inputsPanel.add(blueInput);

        buttonsPanel.add(incRed);
        buttonsPanel.add(decRed);
        buttonsPanel.add(incGreen);
        buttonsPanel.add(decGreen);
        buttonsPanel.add(incBlue);
        buttonsPanel.add(decBlue);

        rightPanel.add(colorRep);
        rightPanel.add(hexRep);

        viewFrame.getContentPane().add(viewPanel, BorderLayout.CENTER);
        viewFrame.setVisible(true);
    }

}
