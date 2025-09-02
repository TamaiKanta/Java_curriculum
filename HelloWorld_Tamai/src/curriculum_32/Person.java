package curriculum_32;

public class Person {
    private String lastName;
    private String firstName;
    private int age;
    private double height;
    private double weight;

    public Person(String lastName, String firstName, int age, double height, double weight) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    // フルネームを返す
    public String fullName() {
        return this.lastName + this.firstName;
    }

    // Carを買うbuyメソッド
    public void buy(Car car) {
        car.setOwner(this.fullName());
        System.out.println(car.getOwner() + "が購入しました");
    }

    // Bicycleを買うbuyメソッド
    public void buy(Bicycle bicycle) {
        bicycle.setOwner(this.fullName());
        System.out.println(bicycle.getOwner() + "が購入しました");
    }
}
