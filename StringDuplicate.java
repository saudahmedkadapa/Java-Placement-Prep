public class StringDuplicate {
    public static void main(String[] args) {
        String s = "In today's fast-paced digital world, where technology continues to evolve at an unprecedented rate";
        int length = s.length();
        char[] chars = s.toCharArray();  
        System.out.println("Duplicate characters in the string:");

        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                
                if (chars[i] == chars[j] && chars[i] != ' ') {
                    System.out.println(chars[i]);
                    break;  
                }
            }
        }
        
    }
}
