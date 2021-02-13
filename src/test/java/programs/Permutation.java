package programs;

public class Permutation {

    static void printPermutn(String str, String ans) 
    { 
        // If string is empty 
        if (str.length() == 0) { 
            System.out.print(ans + " "); 
            return; 
        } 
        for (int i = 0; i < str.length(); i++) { 
            // ith character of str 
            char ch = str.charAt(i); 
            // Rest of the string after excluding  
            // the ith character 
            String ros = str.substring(0, i) +  
                         str.substring(i + 1); 
            // Recurvise call 
            printPermutn(ros, ans + ch); 
        } 
    } 
  
 
    public static void main(String[] args) 
    { 
    	//String s = "prasa"; 
        //printPermutn(s, ""); 
        String str = "ABCDEF"; 
        int n = str.length(); 
        Permutation permutation = new Permutation(); 
        permutation.permute(str, 0, n - 1); 
    } 
  
    /** 
     * permutation function 
     * @param str string to calculate permutation for 
     * @param l starting index 
     * @param r end index 
     */
    private void permute(String str, int l, int r) 
    { 
        if (l == r) 
            System.out.println(str); 
        else { 
            for (int i = l; i <= r; i++) { 
                str = swap(str, l, i); 
                permute(str, l + 1, r); 
                str = swap(str, l, i); 
            } 
        } 
    } 
  
    /** 
     * Swap Characters at position 
     * @param a string value 
     * @param i position 1 
     * @param j position 2 
     * @return swapped string 
     */
    public String swap(String a, int i, int j) 
    { 
        char temp; 
        char[] charArray = a.toCharArray(); 
        temp = charArray[i]; 
        charArray[i] = charArray[j]; 
        charArray[j] = temp; 
        return String.valueOf(charArray); 
    } 
}
