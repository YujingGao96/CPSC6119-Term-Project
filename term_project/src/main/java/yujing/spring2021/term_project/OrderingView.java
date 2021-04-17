package yujing.spring2021.term_project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class OrderingView implements WorkingMenuItemObserver, ActionListener {
    OrderingModelInterface model;
    ControllerInteface controller;

    public OrderingView(OrderingModelInterface model, ControllerInteface controller) {
        this.model = model;
        this.controller = controller;
        model.addObserver(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source == italianBread) controller.setBread("italian bread");
        else if (source == herbsAndCheeseBread) controller.setBread("herbs and cheese bread");
        else if (source == nineGrainWheatBread) controller.setBread("nine grain wheat bread");
        else if (source == notToasted) controller.setToasting("not toasted");
        else if (source == lightlyToasted) controller.setToasting("lightly toasted");
        else if (source == heavilyToasted) controller.setToasting("heavily toasted");
        else if (source == bacon) controller.addAddOns("bacon");
        else if (source == beef) controller.addAddOns("beef");
        else if (source == chicken) controller.addAddOns("chicken");
        else if (source == ham) controller.addAddOns("ham");
        else if (source == meatBalls) controller.addAddOns("meat balls");
        else if (source == pepperoni) controller.addAddOns("pepperoni");
        else if (source == tuna) controller.addAddOns("tuna");
        else if (source == turkey) controller.addAddOns("turkey");
        else if (source == cucumber) controller.addAddOns("cucumber");
        else if (source == greenPepper) controller.addAddOns("green pepper");
        else if (source == onions) controller.addAddOns("onions");
        else if (source == blackOlives) controller.addAddOns("black olives");
        else if (source == lettuce) controller.addAddOns("lettuce");
        else if (source == tomato) controller.addAddOns("tomato");
        else if (source == pickle) controller.addAddOns("pickle");
        else if (source == barbecueSauce) controller.addAddOns("barbecue sauce");
        else if (source == buffaloSauce) controller.addAddOns("buffalo sauce");
        else if (source == saltAndPepper) controller.addAddOns("salt and pepper");
        else if (source == honeyMustardSauce) controller.addAddOns("honey mustard sauce");
        else if (source == houseSandwichSauce) controller.addAddOns("house sandwich sauce");
        else if (source == cancel) controller.startOver();
        else if (source == confirm) {
            try {
                controller.confirmOrder();
                JDialog orderStatus = new JDialog(viewFrame, "Order Status");
                orderStatus.add(new Label("Order has been placed!", SwingConstants.CENTER));
                orderStatus.setSize(200, 200);
                orderStatus.setVisible(true);
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        }
    }

    @Override
    public void updateOrder() {
        MenuItem currentItem = model.getCurrentMenuItem();
        if (currentItem != null) {
            workingItem.setText(formatDescription(currentItem.getDescription()));
            workingItemTotal.setText(currentItem.getTotalPrice());
        } else {
            workingItem.setText("Choose a bread from the left to get started.");
            workingItemTotal.setText("Total price is: $ 0.00");
        }
    }

    private String formatDescription(String description) {
        return "<html>" + description.replace("\n", "<br/>").replace("\t", "&nbsp;&nbsp;&nbsp;&nbsp;") + "</html>";
    }

    // UI View Components
    JFrame viewFrame;
    JPanel viewPanel;
    JPanel leftPanel;
    JPanel rightPanel;
    JPanel lowerRightPanel;
    JPanel buttonsPanel;
    JPanel breadsPanel;
    JPanel toastedPanel;
    JPanel addOnsPanel1;
    JPanel addOnsPanel2;
    JPanel addOnsPanel3;
    JPanel addOnsPanel4;
    JPanel addOnsPanel5;
    JPanel addOnsPanel6;
    JPanel addOnsPanel7;
    JLabel workingItem;
    JLabel workingItemTotal;
    JButton cancel;
    JButton confirm;
    JButton italianBread;
    JButton nineGrainWheatBread;
    JButton herbsAndCheeseBread;
    JButton notToasted;
    JButton lightlyToasted;
    JButton heavilyToasted;
    JButton bacon;
    JButton beef;
    JButton chicken;
    JButton ham;
    JButton meatBalls;
    JButton pepperoni;
    JButton tuna;
    JButton turkey;
    JButton cucumber;
    JButton greenPepper;
    JButton lettuce;
    JButton onions;
    JButton tomato;
    JButton pickle;
    JButton blackOlives;
    JButton barbecueSauce;
    JButton buffaloSauce;
    JButton honeyMustardSauce;
    JButton houseSandwichSauce;
    JButton saltAndPepper;

    public void createView() {
        // Frame
        viewFrame = new JFrame("Ordering System");
        viewFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        viewFrame.setSize(new Dimension(1200, 800));

        // Grid Panels
        viewPanel = new JPanel(new GridLayout(1, 2));
        viewPanel.setBorder(BorderFactory.createMatteBorder(10, 10, 10, 10, Color.gray));
        leftPanel = new JPanel(new GridLayout(12, 1));
        leftPanel.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 5, Color.gray));
        rightPanel = new JPanel(new GridLayout(2, 1));
        rightPanel.setBorder(BorderFactory.createMatteBorder(0, 5, 0, 0, Color.gray));
        lowerRightPanel = new JPanel(new GridLayout(2, 1));
        breadsPanel = new JPanel(new GridLayout(1, 3));
        breadsPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        toastedPanel = new JPanel(new GridLayout(1, 3));
        toastedPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        buttonsPanel = new JPanel(new GridLayout(1, 2));
        buttonsPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        addOnsPanel1 = new JPanel(new GridLayout(1, 3));
        addOnsPanel1.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        addOnsPanel2 = new JPanel(new GridLayout(1, 3));
        addOnsPanel2.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        addOnsPanel3 = new JPanel(new GridLayout(1, 3));
        addOnsPanel3.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        addOnsPanel4 = new JPanel(new GridLayout(1, 3));
        addOnsPanel4.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        addOnsPanel5 = new JPanel(new GridLayout(1, 3));
        addOnsPanel5.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        addOnsPanel6 = new JPanel(new GridLayout(1, 3));
        addOnsPanel6.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        addOnsPanel7 = new JPanel(new GridLayout(1, 3));
        addOnsPanel7.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        // Other Components
        cancel = new JButton("Start Over");
        cancel.addActionListener(this);
        cancel.setBackground(new Color(255, 88, 88));
        cancel.setFont(new Font(cancel.getFont().getName(), Font.BOLD, 30));
        cancel.setOpaque(true);
        cancel.setBorderPainted(false);
        confirm = new JButton("Confirm Order");
        confirm.addActionListener(this);
        confirm.setBackground(new Color(122, 255, 72));
        confirm.setFont(new Font(confirm.getFont().getName(), Font.BOLD, 30));
        confirm.setOpaque(true);
        confirm.setBorderPainted(false);
        italianBread = new JButton("Italian Bread");
        italianBread.addActionListener(this);
        herbsAndCheeseBread = new JButton("Herbs and Cheese Bread");
        herbsAndCheeseBread.addActionListener(this);
        nineGrainWheatBread = new JButton("9-grain Wheat Bread");
        nineGrainWheatBread.addActionListener(this);

        notToasted = new JButton("Not Toasted");
        notToasted.addActionListener(this);
        lightlyToasted = new JButton("Lightly Toasted");
        lightlyToasted.addActionListener(this);
        heavilyToasted = new JButton("Heavily Toasted");
        heavilyToasted.addActionListener(this);

        bacon = new JButton("Bacon");
        bacon.addActionListener(this);
        beef = new JButton("Beef");
        beef.addActionListener(this);
        chicken = new JButton("Chicken");
        chicken.addActionListener(this);
        ham = new JButton("Ham");
        ham.addActionListener(this);
        meatBalls = new JButton("Meat Balls");
        meatBalls.addActionListener(this);
        pepperoni = new JButton("Pepperoni");
        pepperoni.addActionListener(this);
        tuna = new JButton("Tuna");
        tuna.addActionListener(this);
        turkey = new JButton("Turkey");
        turkey.addActionListener(this);
        cucumber = new JButton("Cucumber");
        cucumber.addActionListener(this);
        greenPepper = new JButton("Green Pepper");
        greenPepper.addActionListener(this);
        onions = new JButton("Onions");
        onions.addActionListener(this);
        blackOlives = new JButton("Black Olives");
        blackOlives.addActionListener(this);
        lettuce = new JButton("Lettuce");
        lettuce.addActionListener(this);
        tomato = new JButton("Tomato");
        tomato.addActionListener(this);
        pickle = new JButton("Pickle");
        pickle.addActionListener(this);
        barbecueSauce = new JButton("Barbecue Sauce");
        barbecueSauce.addActionListener(this);
        buffaloSauce = new JButton("Buffalo Sauce");
        buffaloSauce.addActionListener(this);
        saltAndPepper = new JButton("Salt and Pepper");
        saltAndPepper.addActionListener(this);
        honeyMustardSauce = new JButton("Honey Mustard Sauce");
        honeyMustardSauce.addActionListener(this);
        houseSandwichSauce = new JButton("House Sandwich Sauce");
        houseSandwichSauce.addActionListener(this);

        workingItem = new JLabel("", SwingConstants.CENTER);
        workingItemTotal = new JLabel("", SwingConstants.CENTER);
        workingItemTotal.setFont(new Font(workingItemTotal.getFont().getName(), Font.BOLD, 24));

        // Add components to the panels
        viewPanel.add(leftPanel);
        viewPanel.add(rightPanel);

        leftPanel.add(new JLabel("Pick a bread first", SwingConstants.CENTER));
        leftPanel.add(breadsPanel);
        leftPanel.add(new JLabel("Do you want to toast your bread?", SwingConstants.CENTER));
        leftPanel.add(toastedPanel);
        leftPanel.add(new JLabel("Pick anything you want", SwingConstants.CENTER));
        leftPanel.add(addOnsPanel1);
        leftPanel.add(addOnsPanel2);
        leftPanel.add(addOnsPanel3);
        leftPanel.add(addOnsPanel4);
        leftPanel.add(addOnsPanel5);
        leftPanel.add(addOnsPanel6);
        leftPanel.add(addOnsPanel7);
        rightPanel.add(workingItem);
        rightPanel.add(lowerRightPanel);

        lowerRightPanel.add(workingItemTotal);
        lowerRightPanel.add(buttonsPanel);

        breadsPanel.add(italianBread);
        breadsPanel.add(herbsAndCheeseBread);
        breadsPanel.add(nineGrainWheatBread);

        toastedPanel.add(notToasted);
        toastedPanel.add(lightlyToasted);
        toastedPanel.add(heavilyToasted);

        addOnsPanel1.add(bacon);
        addOnsPanel1.add(beef);
        addOnsPanel1.add(chicken);
        addOnsPanel2.add(ham);
        addOnsPanel2.add(meatBalls);
        addOnsPanel2.add(pepperoni);
        addOnsPanel3.add(tuna);
        addOnsPanel3.add(turkey);
        addOnsPanel3.add(cucumber);
        addOnsPanel4.add(greenPepper);
        addOnsPanel4.add(onions);
        addOnsPanel4.add(blackOlives);
        addOnsPanel5.add(lettuce);
        addOnsPanel5.add(tomato);
        addOnsPanel5.add(pickle);
        addOnsPanel6.add(barbecueSauce);
        addOnsPanel6.add(buffaloSauce);
        addOnsPanel6.add(saltAndPepper);
        addOnsPanel7.add(honeyMustardSauce);
        addOnsPanel7.add(houseSandwichSauce);

        buttonsPanel.add(cancel);
        buttonsPanel.add(confirm);
        viewFrame.getContentPane().add(viewPanel, BorderLayout.CENTER);
        viewFrame.setVisible(true);
    }

}
