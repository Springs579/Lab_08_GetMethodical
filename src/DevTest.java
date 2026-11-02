import java.util.Scanner;
public class DevTest
{
    public static void main(String[] args)
    {
        Scanner pipe = new Scanner(System.in);
        String ssn = SafeInput.getRegExString(
                pipe, "Enter SSN (###-##-####):", "^\\d{3}-\\d{2}-\\d{4}$");
        System.out.println("SSN: " + ssn);
        String mNumber = SafeInput.getRegExString(
                pipe, "Enter M number (M#####):", "^(M|m)\\d{5}$");
        System.out.println("M number: " + mNumber);
        String menu = SafeInput.getRegExString(
                pipe, "Enter menu choice (O, S, V, Q):", "^[OoSsVvQq]$");
        System.out.println("Menu choice: " + menu);
    }
}