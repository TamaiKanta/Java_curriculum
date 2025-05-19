package curriculum_B;

import java.util.Random;
import java.util.Scanner;

public class Qes1_31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // ユーザー名の入力受付とバリデーション
        String username;
        while (true) {
            System.out.print("ユーザー名を入力してください: ");
            username = scanner.nextLine();

            if (username == null || username.length() == 0) {
                System.out.println("名前を入力してください");
            } else if (username.length() > 10) {
                System.out.println("名前を10文字以内にしてください");
            } else if (!username.matches("^[A-Za-z0-9]+$")) {
                System.out.println("半角英数字のみで名前を入力してください");
            } else {
                System.out.println("ユーザー名「" + username + "」を登録しました");
                break; // バリデーションOKならループを抜ける
            }
        }

        // じゃんけん処理
        String[] hands = {"グー", "チョキ", "パー"};
        Random rand = new Random();
        int count = 0;

        while (true) {
            System.out.print("0:グー, 1:チョキ, 2:パー から選択してください: ");
            int userHand;
            try {
                userHand = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("数字で入力してください。");
                continue;
            }
            if (userHand < 0 || userHand > 2) {
                System.out.println("0～2の数字で選択してください。");
                continue;
            }
            int cpuHand = rand.nextInt(3);
            count++;
            System.out.println(username + "の手は「" + hands[userHand] + "」");
            System.out.println("相手の手は「" + hands[cpuHand] + "」");

            int result = (userHand - cpuHand + 3) % 3;
            if (result == 2) {
                // 勝ち
                System.out.println("やるやん。");
                System.out.println("次は俺にリベンジさせて");
                break;
            } else if (result == 1) {
                // 負け
                System.out.println("俺の勝ち！");
                switch (userHand) {
                    case 0: // グーで負け
                        System.out.println("負けは次につながるチャンスです！");
                        System.out.println("ネバーギブアップ！");
                        break;
                    case 1: // チョキで負け
                        System.out.println("たかがじゃんけん、そう思ってないですか？");
                        System.out.println("それやったら次も、俺が勝ちますよ");
                        break;
                    case 2: // パーで負け
                        System.out.println("なんで負けたか、明日まで考えといてください。");
                        System.out.println("そしたら何かが見えてくるはずです");
                        break;
                }
            } else {
                // あいこ
                System.out.println("DRAW あいこ もう一回しましょう！");
            }
        }
        System.out.println("勝つまでにかかった合計回数は" + count + "回です");
        scanner.close();
    }
}
