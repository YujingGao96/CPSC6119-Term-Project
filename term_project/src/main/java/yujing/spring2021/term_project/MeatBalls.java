package yujing.spring2021.term_project;

public class MeatBalls extends MenuItemDecorator{
    public MeatBalls(MenuItem menuItem) {
        this.menuItem = menuItem;
        this.description = "Meat Balls";
    }

    @Override
    public String getDescription() {
        return menuItem.getDescription() + "\n\t- " + this.description;
    }

    @Override
    public double cost() {
        return menuItem.cost() + 4.55;
    }
}
