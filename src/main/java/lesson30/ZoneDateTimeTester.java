package lesson30;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZoneDateTimeTester {
    public static void main(String[] args) {
        ZonedDateTime zoneDateTime = ZonedDateTime.now();

        System.out.println(zoneDateTime);


        System.out.println(
                zoneDateTime.toInstant().atZone(ZoneId.of("Pacific/Midway"))
        );

        System.out.println(
                ZoneId.getAvailableZoneIds()
        );

    }
}
