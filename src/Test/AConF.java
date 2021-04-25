package Test;

public class AConF implements AFruitAndVcogctables{

    @Override
    public Fruit CreateFruit() {
        return new Apple();
    }

    @Override
    public Vegetables CreateVegetables() {

        return null;
    }
}
