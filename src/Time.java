import java.time.LocalTime;
import java.time.ZoneId;


public class Time {
    public static void main(String[] args){
        LocalTime localTime = LocalTime.now();

        System.out.println("Local time: " + localTime);

        LocalTime usTime = LocalTime.now(ZoneId.of("UTC"));

        System.out.println("Global UTC time: " + usTime);
    }

}
