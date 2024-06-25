package main;

import java.util.Scanner;

import stats.Character;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("名前を入力してください:");
        String name = scanner.nextLine();
        
        Character character = new Character(name);
        
        System.out.println("こんにちは 「 " + character.getName() + " 」 さん");
        System.out.println("ステータス");
        System.out.println("HP：" + character.getHp());
        System.out.println("MP：" + character.getMp());
        System.out.println("攻撃力：" + character.getAttack());
        System.out.println("素早さ：" + character.getSpeed());
        System.out.println("防御力：" + character.getDefense());
        System.out.println("さあ冒険に出かけよう！");
    }
}
