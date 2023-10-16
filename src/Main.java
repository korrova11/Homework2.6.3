import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 6, 8, 3, 4, 4, 5, 5, 6, 7));
        List<String> words = new ArrayList<>(List.of("пиво", "мясо", "пиво", "мясо", "паб"));
        List<String> strings = new ArrayList<>(List.of("один", "два","два", "три", "три", "три"));
        oddList1(nums);//удаление всех четных элементов
        sortList1(nums);//сортировка четных чисел
        unoWord(words);//удаление одинаковых элементов
        orderWords(strings);//подсчет количества одинаковых элементов

    }

    public static void oddList1(List<Integer> integers) {
        List<Integer> nums1 = new ArrayList<>();

        for (Integer integer : integers) {
            if ((integer % 2 != 0)) {
                nums1.add(integer);
            }
        }
        System.out.println(nums1);
    }

    public static void sortList1(List<Integer> integers) {
        List<Integer> nums1 = new ArrayList<>();
        for (Integer integer : integers) {
            if ((integer % 2 == 0 && (!nums1.contains(integer)))) {
                nums1.add(integer);
            }
        }
        Collections.sort(nums1);
        System.out.println(nums1);
    }

    public static void unoWord(List<String> strings) {
        Set<String> words1 = new HashSet<>();
        for (String string : strings) {
            words1.add(string);
        }
        System.out.println(words1);
    }
    public static void orderWords(List<String> strings1){
        Map<String,Integer> map = new HashMap<>();
        int n=1;
        for(String string:strings1){
            if(! map.containsKey(string)) {
                map.put(string, n);
            }
                else {
                    map.put(string,map.get(string)+1);
            }
        }
        System.out.println(map);

    }
}