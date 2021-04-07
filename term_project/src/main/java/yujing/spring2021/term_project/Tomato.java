package yujing.spring2021.term_project;

public class Tomato extends MenuItemDecorator{
    public Tomato(MenuItem menuItem) {
        this.menuItem = menuItem;
        this.description = "Tomato";
    }

    @Override
    public String getDescription() {
        return menuItem.getDescription() + "\n\t- " + this.description;
    }

    @Override
    public double cost() {
        return menuItem.cost() + 0.20;
    }
}
