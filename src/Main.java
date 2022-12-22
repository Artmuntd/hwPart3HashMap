import java.util.*;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("Ира И.И.", "6(46)813-06-83");
        map.put("Артем М.П.", "2(63)901-52-94");
        map.put("Саща И.И.", "213(496)617-75-84");
        map.put("Варя И.И.", "16(439)299-71-82");
        map.put("Ян А.Н.", "1(468)381-46-80");
        map.put("Ксения И.И.", "33(001)996-98-41");
        map.put("Марина И.И.", "738(85)288-43-53");
        map.put("Вера М.И.", "0(776)807-86-76");
        map.put("Влад Е.И.", "8(712)989-26-86");
        map.put("Инга И.И.", "493(601)702-58-92");
        map.put("Марат Н.И.", "00(7227)074-75-17");
        map.put("Евгений О.И.", "004(0608)235-25-12");
        map.put("Марго М.И.", "00(3704)520-69-07");
        map.put("Петр И.И.", "4(114)873-49-95");
        map.put("Алексей И.И.", "6(259)544-16-47");
        map.put("Давид В.И.", "44(9880)890-23-92");
        map.put("Всеволод И.И.", "185(353)970-61-73");
        map.put("Рита И.И.", "10(086)754-99-32");
        map.put("Иван И.И.", "504(3913)836-00-96");
        map.put("Сергей М.И.", "9(38)754-15-35");
        System.out.println(map);

        System.out.println("Задание 2");


        Map< String, List<Integer>> map1 = new HashMap<>();
        List<Integer> integerslist = new ArrayList<>(List.of(
                (int) (Math.random() * 1000) + 1,
                 (int) (Math.random() * 1000) + 1,
                 (int) (Math.random() * 1000) + 1
        ));
        List<Integer> integerslist2 = new ArrayList<>(List.of(
                (int) (Math.random() * 1000) + 1,
                (int) (Math.random() * 1000) + 1,
                (int) (Math.random() * 1000) + 1
        ));
        List<Integer> integerslist3 = new ArrayList<>(List.of(
                (int) (Math.random() * 1000) + 1,
                (int) (Math.random() * 1000) + 1,
                (int) (Math.random() * 1000) + 1
        ));
        List<Integer> integerslist4 = new ArrayList<>(List.of(
                (int) (Math.random() * 1000) + 1,
                (int) (Math.random() * 1000) + 1,
                (int) (Math.random() * 1000) + 1
        ));
        List<Integer> integerslist5 = new ArrayList<>(List.of(
                (int) (Math.random() * 1000) + 1,
                (int) (Math.random() * 1000) + 1,
                (int) (Math.random() * 1000) + 1
        ));
        map1.put("String1", integerslist);
        map1.put("String2", integerslist2);
        map1.put("String3", integerslist3);
        map1.put("String4", integerslist4);
        map1.put("String5", integerslist5);



        Map<String, List<Integer>> targetMap2 = new HashMap<>();
        for(Map.Entry<String, List<Integer>> target : map1.entrySet()){
            targetMap2.put(target.getKey(), Collections.singletonList(sum(target.getValue())));
        }
        System.out.println(targetMap2);

        System.out.println("Задание 3");
        Map<Integer, String> map3 = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            String t = "String" + i;
            map3.put(i,t);

        }
        System.out.println(map3);
    }

 public static int sum(List<Integer> list){
        int sum = 0;
        for (Integer integer: list){
            sum += integer;
        }
        return sum;
 }
}