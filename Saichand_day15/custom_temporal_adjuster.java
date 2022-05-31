package Saichand_day15;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class custom_temporal_adjuster {
   public final static TemporalAdjuster 
              WEEKDAYS_WITH_NO_FRIDAY_13 = TemporalAdjusters
         .ofDateAdjuster(custom_temporal_adjuster::getWeekDayNoFriday13);

   private static LocalDate getWeekDayNoFriday13(LocalDate date) {
      LocalDate newDate = date;//    ww    w.    d  em  o    2 s  .   c o   m

      DayOfWeek day = date.getDayOfWeek();
      if (day == DayOfWeek.SATURDAY || day == DayOfWeek.SUNDAY
            || (day == DayOfWeek.FRIDAY && date.getDayOfMonth() == 13)) {
         // Return next Monday
         newDate = date.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
      }
      return newDate;
   }

   public static void main(String[] args) {
      LocalDate ld1 = LocalDate.of(2020, Month.DECEMBER, 12);
      LocalDate ld2 = LocalDate.of(2018, Month.DECEMBER, 13);
      LocalDate ld3 = LocalDate.of(2013, Month.DECEMBER, 14);

      LocalDate ld1Adjusted = ld1.with(WEEKDAYS_WITH_NO_FRIDAY_13);
      System.out.println(ld1 + " adjusted to " + ld1Adjusted);

      LocalDate ld2Adjusted = ld2.with(WEEKDAYS_WITH_NO_FRIDAY_13);
      System.out.println(ld2 + " adjusted to " + ld2Adjusted);

      LocalDate ld3Adjusted = ld3.with(WEEKDAYS_WITH_NO_FRIDAY_13);
      System.out.println(ld3 + " adjusted to " + ld3Adjusted);

      // Use it to adjust a ZonedDateTime
      ZonedDateTime zdt = ZonedDateTime.of(ld2, LocalTime.of(8, 45),
                                          ZoneId.of("America/Chicago"));
      ZonedDateTime zdtAdjusted = zdt.with(WEEKDAYS_WITH_NO_FRIDAY_13);
      System.out.println(zdt + " adjusted to " + zdtAdjusted);
   }
}
/* output:
2020-12-12 adjusted to 2020-12-14
2018-12-13 adjusted to 2018-12-13
2013-12-14 adjusted to 2013-12-16
2018-12-13T08:45-06:00[America/Chicago] adjusted to 2018-12-13T08:45-06:00[America/Chicago]
*/