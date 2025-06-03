package curriculum_D;

public class Animal {
    private String name;
    private double length;
    private int speed;

    // nameのゲッターとセッター
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }

    // lengthのゲッターとセッター
    public void setLength(double length) {
        this.length = length;
    }
    
    public double getLength() {
        return length;
    }

    // speedのゲッターとセッター
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    
    public int getSpeed() {
        return speed;
    }

    // 指定されたフォーマットで情報を出力するメソッド
    public void printAnimalInfo() {
        System.out.println("動物名：" + this.getName());
        System.out.println("体長：" + this.getLength() + "m");
        System.out.println("速度：" + this.getSpeed() + "km/h");
    }

    public static void main(String[] args) {
        Animal lion = new Animal();
        lion.setName("ライオン");
        lion.setLength(2.1);
        lion.setSpeed(80);
        
        lion.printAnimalInfo();
    }
}
