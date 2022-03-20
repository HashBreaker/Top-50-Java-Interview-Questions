// 8. How to remove Whitespaces from String
// We can use Character.isWhitespace() method to remove
// whitespaces from the string.


public class Q8WhiteSpaces {
    public static void main(String[] args) {
        String string = "Prashant More";
        string.replace(" ","");
        // Method 1 - Using Replace Method In String Class
        System.out.println(string.replace(" ",""));
        // Method 2 - Using isWhiteSpaces Method in Character Class
        System.out.print(removeSpaces(string));
    }
    public static StringBuilder removeSpaces(String input){
        StringBuilder result = new StringBuilder();
        char[] charArr = input.toCharArray();
        for(char i: charArr){
            if (!Character.isWhitespace(i)){
                result.append(i);
            }
        }
        return result;
    }
}
