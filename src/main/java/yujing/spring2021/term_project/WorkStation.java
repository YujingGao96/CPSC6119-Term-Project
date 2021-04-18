package yujing.spring2021.term_project;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class WorkStation implements OrderingModelInterface {
    private SimpleSandwichFactory simpleSandwichFactory;
    private ArrayList<WorkingMenuItemObserver> observers;
    private String breadType;
    private String toastingBehavior;
    private ArrayList<String> addOns;

    public WorkStation() {
        simpleSandwichFactory = new SimpleSandwichFactory();
        observers = new ArrayList<>();
    }

    @Override
    public void init() {
        breadType = null;
        toastingBehavior = null;
        addOns = new ArrayList<>();
        notifyObserver();
    }

    @Override
    public void setBread(String bread) {
        this.breadType = bread;
        notifyObserver();
    }

    @Override
    public void setToastingBehavior(String toastingBehavior) {
        if (breadType != null)
            this.toastingBehavior = toastingBehavior;
        notifyObserver();
    }

    @Override
    public void addAddOn(String addOn) {
        if (breadType != null)
            this.addOns.add(addOn);
        notifyObserver();
    }

    @Override
    public MenuItem getCurrentMenuItem() {
        return simpleSandwichFactory.createSandwich(breadType, toastingBehavior, addOns);
    }

    @Override
    public void placeOrder() {
        PrintStream out = null;
        try {
            out = new PrintStream(new FileOutputStream("output.txt", true), true);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.setOut(out);
        MenuItem currentItem = getCurrentMenuItem();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        System.out.println("=============  " + dtf.format(now) + "  =============");
        System.out.println(currentItem.getDescription());
        System.out.println(currentItem.getTotalPrice());
        System.out.println("=================================================");
        init();
    }

    @Override
    public void addObserver(WorkingMenuItemObserver o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(WorkingMenuItemObserver o) {
        observers.remove(o);
    }

    @Override
    public void notifyObserver() {
        for (WorkingMenuItemObserver o : observers) {
            o.updateOrder();
        }
    }
}
