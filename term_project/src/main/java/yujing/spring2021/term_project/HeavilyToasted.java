package yujing.spring2021.term_project;

public class HeavilyToasted implements ToastedBehavior{
    private final String behaviorName;

    public HeavilyToasted() {
        this.behaviorName = "Heavily Toasted";
    }

    @Override
    public String toast() {
        return this.behaviorName;
    }
}
