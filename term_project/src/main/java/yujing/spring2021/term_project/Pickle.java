package yujing.spring2021.term_project;

public class Pickle extends MenuItemDecorator {
    public Pickle(MenuItem menuItem) {
        this.menuItem = menuItem;
        this.description = "Pickle";
    }


    @Override
    public double cost() {
        return menuItem.cost() + 0.20;
    }
}
