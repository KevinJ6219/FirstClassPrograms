public class CatRunner {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Ben", 12, 23.5);
        cat1.introduce();
        cat1.printCatInfo();

        Cat cat2 = new Cat("Mat", 5, 12.3);
        cat2.introduce();
        cat2.printCatInfo();
    }
}
