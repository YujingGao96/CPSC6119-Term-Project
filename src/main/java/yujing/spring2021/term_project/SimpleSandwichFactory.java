package yujing.spring2021.term_project;

import java.util.ArrayList;

public class SimpleSandwichFactory {
    public MenuItem createSandwich(String breadType, String toastedBehavior, ArrayList<String> addOns) {
        Bread bread = createBread(breadType);
        ToastedBehavior toasted = createToastingBehavior(toastedBehavior);
        if (bread != null) {
            bread.setToastedBehavior(toasted);
            return addAddOns(bread, addOns);
        }
        return null;
    }

    private Bread createBread(String breadType) {
        if (breadType == null)
            return null;
        return switch (breadType) {
            case "herbs and cheese bread" -> new HerbsAndCheeseBread();
            case "italian bread" -> new ItalianBread();
            case "nine grain wheat bread" -> new NineGrainWheatBread();
            default -> null;
        };
    }

    private ToastedBehavior createToastingBehavior(String toastingBehavior) {
        if (toastingBehavior == null)
            return null;
        return switch (toastingBehavior) {
            case "not toasted" -> new NotToasted();
            case "lightly toasted" -> new LightlyToasted();
            case "heavily toasted" -> new HeavilyToasted();
            default -> null;
        };
    }

    private MenuItem addAddOns(Bread bread, ArrayList<String> addOns) {
        MenuItem finalProduct = bread;
        for (String addOn : addOns) {
            switch (addOn) {
                case "bacon" -> finalProduct = new Bacon(finalProduct);
                case "beef" -> finalProduct = new Beef(finalProduct);
                case "barbecue sauce" -> finalProduct = new BarbecueSauce(finalProduct);
                case "black olives" -> finalProduct = new BlackOlives(finalProduct);
                case "buffalo sauce" -> finalProduct = new BuffaloSauce(finalProduct);
                case "chicken" -> finalProduct = new Chicken(finalProduct);
                case "cucumber" -> finalProduct = new Cucumber(finalProduct);
                case "green pepper" -> finalProduct = new GreenPepper(finalProduct);
                case "ham" -> finalProduct = new Ham(finalProduct);
                case "honey mustard sauce" -> finalProduct = new HoneyMustardSauce(finalProduct);
                case "house sandwich sauce" -> finalProduct = new HouseSandwichSauce(finalProduct);
                case "lettuce" -> finalProduct = new Lettuce(finalProduct);
                case "meat balls" -> finalProduct = new MeatBalls(finalProduct);
                case "onions" -> finalProduct = new Onions(finalProduct);
                case "pepperoni" -> finalProduct = new Pepperoni(finalProduct);
                case "pickle" -> finalProduct = new Pickle(finalProduct);
                case "salt and pepper" -> finalProduct = new SaltAndPepper(finalProduct);
                case "tomato" -> finalProduct = new Tomato(finalProduct);
                case "tuna" -> finalProduct = new Tuna(finalProduct);
                case "turkey" -> finalProduct = new Turkey(finalProduct);
                default -> throw new IllegalStateException("Unexpected value: " + addOn);
            }
        }
        return finalProduct;
    }
}
