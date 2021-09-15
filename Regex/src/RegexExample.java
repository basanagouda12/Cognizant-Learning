import java.util.*;
import java.util.regex.*;

class ConcatString {
    public static void main (String[] args) {
        
        Scanner s = new Scanner(System.in);
        System.out.println("Inmate's name:");
        String Name=s.nextLine();
        System.out.println("Inmate's father's name:");
        String fatherName=s.nextLine();
        
        boolean trueName = Pattern.matches("[a-zA-Z][a-zA-Z ]*", Name);
        boolean trueFatherName =Pattern.matches("[a-zA-Z][a-zA-Z ]*", fatherName);
        String fullName = Name.toUpperCase() +" "+ fatherName.toUpperCase();
        
        if(trueName && trueFatherName)
        {
            System.out.println(fullName);
        }
        else {
            System.out.println("Invalid name");
        }
    }
}
