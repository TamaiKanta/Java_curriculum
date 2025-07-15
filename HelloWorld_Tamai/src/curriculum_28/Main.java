package curriculum_28;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import curriculum_29.Prefecture;

public class Main {
    public static void main(String[] args) {
        Prefecture[] data = {
            new Prefecture("北海道", "札幌市", 83424),
            new Prefecture("青森県", "青森市", 9646),
            new Prefecture("岩手県", "盛岡市", 15275),
            new Prefecture("宮城県", "仙台市", 7282),
            new Prefecture("秋田県", "秋田市", 11638),
            new Prefecture("山形県", "山形市", 9323),
            new Prefecture("福島県", "福島市", 13784),
            new Prefecture("茨城県", "水戸市", 6097),
            new Prefecture("栃木県", "宇都宮市", 6408),
            new Prefecture("群馬県", "前橋市", 6362),
            new Prefecture("埼玉県", "さいたま市", 3798)
        };

        Scanner scanner = new Scanner(System.in);

        System.out.println("番号をカンマ区切りで入力してください（例：8,5,9）：");
        String[] indices = scanner.nextLine().split(",");

        System.out.println("昇順ならasc、降順ならdescを入力してください：");
        String order = scanner.nextLine().trim();

        List<Prefecture> selected = new ArrayList<>();
        for (String idxStr : indices) {
            try {
                int idx = Integer.parseInt(idxStr.trim());
                if (idx >= 0 && idx < data.length) {
                    selected.add(data[idx]);
                }
            } catch (NumberFormatException e) {
                // 無効な入力はスキップ
            }
        }

        selected.sort((a, b) -> {
            if (order.equalsIgnoreCase("desc")) {
                return Double.compare(b.getArea(), a.getArea());
            } else {
                return Double.compare(a.getArea(), b.getArea());
            }
        });

        for (Prefecture p : selected) {
            System.out.println("都道府県名：" + p.getName());
            System.out.println("県庁所在地：" + p.getCapital());
            System.out.println("面積：" + p.getArea() + "km2");
            System.out.println();
        }
    }
}
