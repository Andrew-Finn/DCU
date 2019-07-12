public class Test
{
    // This method returns a String and receives a String
    public static String firstShallBeLast(String word)
    {
        return word.charAt(word.length() - 1) + word.substring(1, word.length() - 1) + word.charAt(0);
    }
}