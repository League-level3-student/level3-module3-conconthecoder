package _01_StringBuilder;


public class _03_StringBuilder {
    
    public static String append(String str, char[] characters) {
        char[] firstString = str.toCharArray();
        char[] finalString = new char[firstString.length+characters.length];
        for (int i = 0; i < finalString.length; i++) {
        	if (i < firstString.length) {
        		finalString[i] = firstString[i];
        		continue;
        	}
        	finalString[i] = characters[i-firstString.length];
        }
        return String.valueOf(finalString);
    }
    
    public static String reverse(String str) {
    	char[] firstString = str.toCharArray();
    	char[] doggie = new char[firstString.length];
        for (int i = 0; i < firstString.length; i++) {
        	doggie[i] = firstString[firstString.length-1-i];
        	}
        
        return String.valueOf(doggie);
    }
    
    public static String insert(String str, int index, char newChar) {
    	char[] doggie = str.toCharArray();
    	char[] runny = new char[doggie.length + 1];
    	int g = 0;
    	for (int i = 0; i < runny.length; i++) {
    		if (i > index) g = 1;
    		if (i == index) runny[i] = newChar;
    		runny[i] = doggie[i-1];
    	}
        return String.copyValueOf(runny);
    }
    
    public static String delete(String str, int startIndex, int endIndex) {
        return null;
    }
}