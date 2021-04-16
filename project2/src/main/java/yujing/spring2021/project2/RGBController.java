package yujing.spring2021.project2;

public class RGBController implements ControllerInterface {
    RGBModelInterface model;
    RGBView view;

    public RGBController(RGBModelInterface model) {
        this.model = model;
        view = new RGBView(model, this);
        view.createView();
        model.initialize();
    }

    /**
     * Set the value of red
     * @param rVal Value of red
     */
    @Override
    public void setRed(int rVal) {
        int gVal = model.getRGB()[1];
        int bVal = model.getRGB()[2];
        model.setRGB(rVal, gVal, bVal);
    }

    /**
     * Set the value of green
     * @param gVal Value of green
     */
    @Override
    public void setGreen(int gVal) {
        int rVal = model.getRGB()[0];
        int bVal = model.getRGB()[2];
        model.setRGB(rVal, gVal, bVal);
    }

    /**
     * Set the value of blue
     * @param bVal Value of blue
     */
    @Override
    public void setBlue(int bVal) {
        int rVal = model.getRGB()[0];
        int gVal = model.getRGB()[1];
        model.setRGB(rVal, gVal, bVal);
    }

    /**
     * Increase the value of Red by 10
     */
    @Override
    public void increaseRed() {
        int rVal = model.getRGB()[0];
        setRed(rVal + 10);
    }

    /**
     * Decrease the value of Red by 10
     */
    @Override
    public void decreaseRed() {
        int rVal = model.getRGB()[0];
        setRed(rVal - 10);
    }

    /**
     * Increase the value of Green by 10
     */
    @Override
    public void increaseGreen() {
        int gVal = model.getRGB()[1];
        setGreen(gVal + 10);
    }

    /**
     * Decease the value of Green by 10
     */
    @Override
    public void decreaseGreen() {
        int gVal = model.getRGB()[1];
        setGreen(gVal - 10);
    }

    /**
     * Increase the value of Blue by 10
     */
    @Override
    public void increaseBlue() {
        int bVal = model.getRGB()[2];
        setBlue(bVal + 10);
    }

    /**
     * Decease the value of Blue by 10
     */
    @Override
    public void decreaseBlue() {
        int bVal = model.getRGB()[2];
        setBlue(bVal - 10);
    }
}
