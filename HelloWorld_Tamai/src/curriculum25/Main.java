package curriculum25;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("名前を入力してください:");
        String str = scanner.nextLine();
        // 入力された内容を分割する
        String[] animals = str.split(",");
        for (int i = 0; i < animals.length; i++) {
            String[] animals2 = animals[i].split(":");
            
            // 分割された内容をセッターに入れる
            Animal animal = new Animal();
            animal.setName(animals2[0]);
            double length2 = Double.parseDouble(animals2[1]);
            animal.setLength(length2);
            int speed2 = Integer.valueOf(animals2[2]);
            animal.setSpeed(speed2);
            
            // 学名を判定してセッターに入れる
            if (animals2[0].equals("ライオン")) {
                animal.setScientificname("パンテラ レオ");
            } else if (animals2[0].equals("ゾウ")) {
                animal.setScientificname("ロキソドンタ・サイクロティス");
            } else if (animals2[0].equals("パンダ")) {
                animal.setScientificname("アイルロポダ・メラノレウカ");
            } else if (animals2[0].equals("チンパンジー")) {
                animal.setScientificname("パン・トゥログロディテス");
            } else if (animals2[0].equals("シマウマ")) {
                animal.setScientificname("チャップマンシマウマ");
            } else if (animals2[0].equals("インコ")) {
                animal.setScientificname("不明");
            }
            animal.printAnimalInfo();
        }
    }
}
