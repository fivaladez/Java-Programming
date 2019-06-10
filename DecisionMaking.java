public class DecisionMaking {
    public static void main(String args[]){
        int x = 20;
        int y = 10;

        if( x == 30 ) {
            if( y == 10 ) {
                System.out.print("X = 30 and Y = 10");
            }else{
                System.out.print("X = 30 and Y = ?");
            }
        }else{
            System.out.print("X = ? and Y = ?");
        }

        System.out.print("\n\n");

        char grade = 'C';
        switch(grade) {
            case 'A' :
                System.out.println("Excellent!");
                break;
            case 'B' :
            case 'C' :
                System.out.println("Well done");
                break;
            case 'D' :
                System.out.println("You passed");
            case 'F' :
                System.out.println("Better try again");
                break;
            default :
                System.out.println("Invalid grade");
            }
        System.out.println("Your grade is " + grade);

        int a = 5, b = 10, c = 0;
        c = (a > b) ? a: b;
        System.out.println("The greater number between " + a + " and " + b + " is: " + c);
    }
}
