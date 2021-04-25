package Test;

public class BConV implements BFruitAndVcogtables{
    @Override
    public Fruit CreateFruit() {
        return null;
    }

    @Override
    public Vegetables CreateVegetables() {
        return new cabbage();
    }
}
