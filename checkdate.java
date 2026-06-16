import java.time.LocalDate;
import java.time.Period;

public class DateDifference {
    public static void main(String[] args) {

        LocalDate d1 = LocalDate.of(2011, 6, 6);
        LocalDate d2 = LocalDate.of(2011, 7, 6);

        Period p = Period.between(d1, d2);

        if (p.getMonths() == 1 && p.getDays() == 0) {
            System.out.println("Exactly 1 month apart");
        } else if (p.getMonths() == 0) {
            System.out.println("Less than 1 month apart");
        } else {
            System.out.println("More than 1 month apart");
        }
    }
}
