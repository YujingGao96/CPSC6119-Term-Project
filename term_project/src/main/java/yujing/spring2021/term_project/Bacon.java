package yujing.spring2021.term_project;

public class Bacon extends MenuItemDecorator{
    public Bacon(MenuItem menuItem) {
        this.menuItem = menuItem;
        this.description = "Bacon";
    }

    @Override
    public String getDescription() {
        return menuItem.getDescription() + "\n\t- " + this.description;
    }

    @Override
    public double cost() {
        return menuItem.cost() + 3.55;
    }
}
