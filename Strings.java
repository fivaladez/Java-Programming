public class Strings{

    public static void main (String args[]){
        char[] helloArray = { 'h', 'e', 'l', 'l', 'o', '.' };
        String helloString = new String(helloArray);
        System.out.println( helloString );
        helloString = "new";
        System.out.println( helloString );
        System.out.println( "String Length is : " + helloString.length() );
        helloString = helloString + " string concatenated";
        System.out.println( helloString );

        /* String Methods! Look for them*/
        String s = "Strings are immutable";
        char result = s.charAt(8);
        System.out.println(result);
        String str1 = "Strings are immutable";
        String str2 = new String("Strings are immutable");
        String str3 = new String("Integers are not immutable");
        int result = str1.compareTo( str2 );
        System.out.println(result);
        result = str2.compareTo( str3 );
        System.out.println(result);
        /* NOTE:
        The String class is immutable, so that once it is created a String object cannot be changed.
        If there is a necessity to make a lot of modifications to Strings of characters,
        then you should use String Buffer & String Builder Classes.

        It is recommended to use StringBuilder whenever possible because it is faster than StringBuffer.
        However, if the thread safety is necessary, the best option is StringBuffer objects.
        */
        StringBuffer sBuffer = new StringBuffer("test");
        sBuffer.append(" String Buffer");
        System.out.println(sBuffer);
        sBuffer.reverse();
        System.out.println(sBuffer);
        sBuffer.reverse();
        sBuffer.insert(3,"123");
        System.out.println(sBuffer);
        sBuffer.replace(2/*start*/,6/*end*/,"uuu");
        System.out.println(sBuffer);
        sBuffer.delete(2/*s*/,6/*e*/);
        System.out.println(sBuffer);

    }
}
