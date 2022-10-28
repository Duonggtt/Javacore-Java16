import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DEMO4 {
    public static void main(String[] args) {

        String day1 = "23/12/2000";
        String day2 = "20/10/2000";
        LocalDate d1 = LocalDate.parse(day1, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        LocalDate d2 = LocalDate.parse(day2, DateTimeFormatter.ofPattern("dd/MM/yyyy"));

        System.out.println(d1);
        System.out.println(d2);

        Duration duration = Duration.between(d2.atStartOfDay() , d1.atStartOfDay());
        System.out.println(duration.toDays());
    }
}
