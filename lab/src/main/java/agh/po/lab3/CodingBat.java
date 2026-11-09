package agh.po.lab3;
import java.util.HashMap;
import java.util.Map;

public class CodingBat {
    public boolean array123(int[] nums) {
        for(int i = 0; i < nums.length - 2; ++i){
            if(nums[i] == 1 && nums[i + 1] == 2 && nums[i + 2] == 3){
                return true;
            }
        }
        return false;
    }

    public int stringMatch(String a, String b) {
        int count = 0;
        int len = a.length() > b.length() ? b.length() : a.length();
        for(int i = 0; i < len - 1; i++){
            if(a.charAt(i) == b.charAt(i) && a.charAt(i + 1) == b.charAt(i + 1)){
                count++;
            }
        }
        return count;
    }

    public int countEvens(int[] nums) {
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] % 2 == 0){
                count++;
            }
        }
        return count;
    }

    public String helloName(String name) {
        return "Hello " + name + "!";
    }

    //zadania lab następny
    public Map<String, String> mapAB4(Map<String, String> map) {
        if (map.containsKey("a") && map.containsKey("b")) { // sprawdzaenie czy są takie klucze( w niektórych testach nie ma)
            int x = map.get("a").length();
            int y = map.get("b").length();

            if (x > y) {
                map.put("c", map.get("a"));
            } else if (y > x) {
                map.put("c", map.get("b"));
            } else {
                map.put("a", "");
                map.put("b", "");
            }
        }
        return map;
    }
    public Map<String, String> pairs(String[] strings) {
        Map<String, String> map = new HashMap<String, String>();

        for (String s : strings) {
            String pierwszy = s.substring(0, 1);
            String ostatni = s.substring(s.length() - 1, s.length());
            map.put(pierwszy, ostatni);
        }

        return map;
    }

    public static void main(String[] args) {
        CodingBat codingBat = new CodingBat();
        System.out.println("array123 wynik: " + codingBat.array123(new int[] {1,2,3,4,5,6}));
        System.out.println("stringMatch wynik: " + codingBat.stringMatch("xxca", "xxba"));
        System.out.println("countEvens wynik: " + codingBat.countEvens(new int[] {2, 1, 2, 3, 4}));
        System.out.println("helloName wynik: " + codingBat.helloName("Bob"));
    }


}
