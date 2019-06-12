import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressions{

    private static final String REGEX = "foo";
    private static final String INPUT = "fooooooooooooooooo";
    private static Pattern pattern;
    private static Matcher matcher;

    public static void main ( String args[] ){
        pattern = Pattern.compile(REGEX);
        matcher = pattern.matcher(INPUT);
        System.out.println("Current REGEX is: "+REGEX);
        System.out.println("Current INPUT is: "+INPUT);
        System.out.println("lookingAt(): "+matcher.lookingAt());
        System.out.println("matches(): "+matcher.matches());


        String REGEX2 = "dog";
        String INPUT2 = "The dog says meow. " + "All dogs say meow.";
        String REPLACE2 = "cat";
        Pattern p = Pattern.compile(REGEX);
        // get a matcher object
        Matcher m = p.matcher(INPUT);
        INPUT = m.replaceAll(REPLACE);
        System.out.println(INPUT);
    }
}
