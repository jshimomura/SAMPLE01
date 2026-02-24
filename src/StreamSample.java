import java.util.List;

public class StreamSample {
    public static void main(String[] args) {
        var strs = List.of("apple","banana","orange","pineapple");
        
        //6文字以上のものを大文字にして表示
        strs.stream()
                .filter(s -> s.length() >= 6)
                .map(s -> s.toUpperCase())
                .forEach(s -> System.out.println(s));

        //6文字以上のものの文字数の合計を表示
        int i = strs.stream()
                    .filter(s -> s.length() >= 6)
                    .mapToInt(s -> s.length())
                    .sum();
        System.out.println("文字数合計:"+i);

        //すべての文字列がaを含んているかどうか判定
        boolean cona = strs.stream().allMatch(s -> s.contains("a"));
        System.out.println(cona);

        //cを含むものが1つでもあるかどうか判定
        boolean conc = strs.stream().anyMatch(s -> s.contains("c"));
        System.out.println(conc);
    }
}
