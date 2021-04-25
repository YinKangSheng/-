package Test;

public class AConV implements AFruitAndVcogctables{


    @Override
    public Fruit CreateFruit() {
        return null;
    }

    @Override
    public Vegetables CreateVegetables() {
        return new tomato();
    }
}
