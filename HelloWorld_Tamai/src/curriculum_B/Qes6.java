package curriculum_B;
import java.util.Random;
import java.util.Scanner;

public class Qes6 {
	    public static void main(String[] args) {
	    	Scanner sc1 = new Scanner(System.in);
	    	System.out.print("商品名を「、」区切りで入力してください: ");
	        String[] products = sc1.nextLine().split("、");

	        Random rand = new Random();
	        
	        int TV = -1;
	        for (String product : products) {
	            int remainingStock;

	            switch (product) {
	                case "テレビ":
	                case "ディスプレイ":
	                    TV = TV == -1 ? rand.nextInt(12) : 11 - TV;
	                    System.out.println(product + "の残り台数は" + TV + "台です");
	                    break;
	                case "パソコン":
	                case "冷蔵庫":
	                case "扇風機":
	                case "洗濯機":
	                case "加湿器":
	                    remainingStock = rand.nextInt(12);
	                    System.out.println(product + "の残り台数は" + remainingStock + "台です");
	                    break;
	                default:
	                    System.out.println("'" + product + "'は指定の商品ではありません"); 
	            }
	        }
	    }
	}
