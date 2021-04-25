package Test;

public class BConF implements BFruitAndVcogtables{
    @Override
    public Fruit CreateFruit() {
        return new Banana();
    }

    @Override
    public Vegetables CreateVegetables() {
        return null;
    }
}
