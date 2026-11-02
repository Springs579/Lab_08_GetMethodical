import java.util.Scanner;
public class BirthDateTime
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int year = SafeInput.getRangedInt(in, "Enter birth year", 1950, 2015);
        int month = SafeInput.getRangedInt(in, "Enter birth month", 1, 12);
        int daysInMonth = 31;
        switch(month)
        {
            case 2:
                daysInMonth = 29;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                daysInMonth = 30;
                break;
            default:
                daysInMonth = 31;
                break;
        }
        int day = SafeInput.getRangedInt(in, "Enter birth day", 1, daysInMonth);
        int hour = SafeInput.getRangedInt(in, "Enter birth hour", 1, 24);
        int minute = SafeInput.getRangedInt(in, "Enter birth minute", 1, 59);
        System.out.println("\nYour birth date and time:");
        System.out.printf("%02d/%02d/%04d at %02d:%02d%n",
                month, day, year, hour, minute);
    }
}
