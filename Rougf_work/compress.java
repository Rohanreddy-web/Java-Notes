public class Solution {
    public static String getCompressedString(String str) {
        String s = "";
        char character_pointer = str.charAt(0);
        int count_pointer = 1;
        
        for (int i = 1; i < str.length(); i++) {  
            if (character_pointer == str.charAt(i)) {
                count_pointer++;
            } 
            else if (character_pointer != str.charAt(i)) 
            { 
                if (count_pointer > 1) {
                    s = s + character_pointer + count_pointer;
                     character_pointer = str.charAt(i);
                      count_pointer = 1;
        
                }
                else 
                {
                    s = s + character_pointer;
                    character_pointer = str.charAt(i);
                    count_pointer = 1;
                 
                }
            }
        }
        if (count_pointer > 1) 
        {
          s = s + character_pointer + count_pointer;
        }
        else
                {
                    s = s + character_pointer;
                }
        return s;  
    }
}
