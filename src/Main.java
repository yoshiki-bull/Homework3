import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> toBuy = new ArrayList<>();

        toBuy.add(0, "納豆"); //カンマ入れてみたらindexが出てきたのでそのまま使いました。
        toBuy.add(1, "鶏肉");
        toBuy.add(2, "卵");
        toBuy.add(3, "米");

        System.out.println("今日買うものは" + toBuy.size() + "つ");

        //例外処理。
        int index = 5;
        try {
            if (index < 0 || 4 < index) {
                throw new ArrayIndexOutOfBoundsException();
            }
            System.out.println(toBuy.get(index));
        }catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("予定外の物を買おうとしていますね。");
        }
    }
}
