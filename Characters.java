public class Characters {

    public static void main (String args[]){

    char chr = 'a';
    // Unicode for uppercase Greek omega character
    char uniChar = '\u039A';
    // an array of chars
    char[] charArray ={ 'a', 'b', 'c', 'd', 'e' };

    // Here following primitive char 'a'
    // is boxed into the Character object ch
    Character ch = 'a';

    System.out.println(Character.isLetter('c'));
    System.out.println(Character.isLetter('5'));

    System.out.println(Character.isDigit('c'));
    System.out.println(Character.isDigit('5'));

    System.out.println(Character.isWhitespace('c'));
    System.out.println(Character.isWhitespace(' '));
    System.out.println(Character.isWhitespace('\n'));
    System.out.println(Character.isWhitespace('\t'));

    System.out.println(Character.isUpperCase('c'));
    System.out.println(Character.isUpperCase('C'));
    System.out.println(Character.isUpperCase('\n'));
    System.out.println(Character.isUpperCase('\t'));

    System.out.println(Character.isLowerCase('c'));
    System.out.println(Character.isLowerCase('C'));
    System.out.println(Character.isLowerCase('\n'));
    System.out.println(Character.isLowerCase('\t'));

    System.out.println(Character.toUpperCase('c'));
    System.out.println(Character.toUpperCase('C'));

    System.out.println(Character.toLowerCase('c'));
    System.out.println(Character.toLowerCase('C'));

    System.out.println(Character.toString('c'));
    System.out.println(Character.toString('C'));
    }
}
