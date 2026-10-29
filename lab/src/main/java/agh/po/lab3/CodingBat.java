package agh.po.lab3;

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


    public static void main(String[] args) {
        CodingBat codingBat = new CodingBat();
        System.out.println("array123 wynik: " + codingBat.array123(new int[] {1,2,3,4,5,6}));
        System.out.println("stringMatch wynik: " + codingBat.stringMatch("xxca", "xxba"));
        System.out.println("countEvens wynik: " + codingBat.countEvens(new int[] {2, 1, 2, 3, 4}));
        System.out.println("helloName wynik: " + codingBat.helloName("Bob"));
    }


}
