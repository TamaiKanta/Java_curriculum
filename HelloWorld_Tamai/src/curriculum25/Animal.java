package curriculum25;

public class Animal {
	    private String name;
	    private double length;
	    private int speed;
	    private String scientificname;

	    // nameのゲッターとセッター
	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    // lengthのゲッターとセッター
	    public double getLength() {
	        return length;
	    }

	    public void setLength(double length) {
	        this.length = length;
	    }
	    
	 // speedのゲッターとセッター
	    public int getSpeed() {
	        return speed;
	    }

	    public void setSpeed(int speed) {
	        this.speed = speed;
	    }

	    // scientific nameのゲッターとセッター
	    public String getScientificname() {
	        return scientificname;
	    }

	    public void setScientificname(String scientificname) {
	        this.scientificname = scientificname;
	    }


	public void printAnimalInfo() {
	        System.out.println("動物名：" + this.getName());
	        System.out.println("体長：" + this.getLength() + "m");
	        System.out.println("速度：" + this.getSpeed() + "km/h");
	        System.out.println("学名：" + this.getScientificname());
	    }

}
