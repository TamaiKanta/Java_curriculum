package curriculum_C;

public class Dog {
	 // Q1：フィールドに動物の名前の変数を定義してください。
    private String name;
    
    // Q2：フィールドに動物の数の変数を定義してください。
    private int numberOfAnimals = 0;
    
    // Q3：Q1で作成した変数に「犬」を代入するコンストラクタを作成してください。
    public Dog() {
        this.name = "犬";
    }
    
    // Q4：Q2で作成した変数に引数を代入するコンストラクタを作成してください。
    public Dog(int numberOfAnimals) {
    	this.numberOfAnimals = numberOfAnimals;
    }
    
    // 名前のゲッター
    public String getName() {
        return name;
    }
    
    // 動物の数のゲッター
    public int getNumberOfAnimals() {
        return numberOfAnimals;
    }
}
