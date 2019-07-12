package util;

public class StringUtil {
    
    public static String inLineSB(String... params) {
        StringBuilder stringBuilder = new StringBuilder();
        
        for (String param : params)
            stringBuilder.append(param);
        
        return stringBuilder.toString();
    }

}
