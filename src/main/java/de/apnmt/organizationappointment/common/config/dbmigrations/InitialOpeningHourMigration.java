package de.apnmt.organizationappointment.common.config.dbmigrations;

import com.github.cloudyrock.mongock.ChangeLog;
import com.github.cloudyrock.mongock.ChangeSet;
import com.github.cloudyrock.mongock.driver.mongodb.springdata.v3.decorator.impl.MongockTemplate;
import de.apnmt.common.enumeration.Day;
import de.apnmt.organizationappointment.common.domain.OpeningHour;

import java.time.LocalTime;


/**
 * Creates the initial database setup.
 */
@ChangeLog(order = "002")
public class InitialOpeningHourMigration {

    @ChangeSet(order = "02", author = "initiator", id = "02-addOpeningHour")
    public void addOpeningHour(MongockTemplate mongoTemplate) {
        createOpeningHour(1L, Day.Monday, "18:00:00", mongoTemplate);
        createOpeningHour(2L, Day.Tuesday, "18:00:00", mongoTemplate);
        createOpeningHour(3L, Day.Thursday, "19:00:00", mongoTemplate);
        createOpeningHour(4L, Day.Friday, "19:00:00", mongoTemplate);
        createOpeningHour(5L, Day.Saturday, "16:00:00", mongoTemplate);
        createOpeningHour(6L, Day.Monday, "18:00:00", mongoTemplate);
        createOpeningHour(7L, Day.Tuesday, "20:00:00", mongoTemplate);
        createOpeningHour(8L, Day.Wednesday, "20:00:00", mongoTemplate);
        createOpeningHour(9L, Day.Friday, "19:00:00", mongoTemplate);
        createOpeningHour(10L, Day.Saturday, "14:00:00", mongoTemplate);
        createOpeningHour(11L, Day.Monday, "18:00:00", mongoTemplate);
        createOpeningHour(12L, Day.Tuesday, "20:00:00", mongoTemplate);
        createOpeningHour(13L, Day.Wednesday, "20:00:00", mongoTemplate);
        createOpeningHour(14L, Day.Thursday, "20:00:00", mongoTemplate);
        createOpeningHour(15L, Day.Friday, "19:00:00", mongoTemplate);
        createOpeningHour(16L, Day.Saturday, "14:00:00", mongoTemplate);
        createOpeningHour(17L, Day.Monday, "18:00:00", mongoTemplate);
        createOpeningHour(18L, Day.Tuesday, "20:00:00", mongoTemplate);
        createOpeningHour(19L, Day.Wednesday, "20:00:00", mongoTemplate);
        createOpeningHour(20L, Day.Thursday, "20:00:00", mongoTemplate);
        createOpeningHour(21L, Day.Friday, "19:00:00", mongoTemplate);
        createOpeningHour(22L, Day.Saturday, "14:00:00", mongoTemplate);
        createOpeningHour(23L, Day.Monday, "18:00:00", mongoTemplate);
        createOpeningHour(24L, Day.Tuesday, "20:00:00", mongoTemplate);
        createOpeningHour(25L, Day.Wednesday, "20:00:00", mongoTemplate);
        createOpeningHour(26L, Day.Thursday, "20:00:00", mongoTemplate);
        createOpeningHour(27L, Day.Friday, "19:00:00", mongoTemplate);
        createOpeningHour(28L, Day.Saturday, "14:00:00", mongoTemplate);
        createOpeningHour(29L, Day.Monday, "18:00:00", mongoTemplate);
        createOpeningHour(30L, Day.Tuesday, "20:00:00", mongoTemplate);
        createOpeningHour(31L, Day.Wednesday, "20:00:00", mongoTemplate);
        createOpeningHour(32L, Day.Thursday, "20:00:00", mongoTemplate);
        createOpeningHour(33L, Day.Friday, "19:00:00", mongoTemplate);
        createOpeningHour(34L, Day.Saturday, "14:00:00", mongoTemplate);
        createOpeningHour(35L, Day.Monday, "18:00:00", mongoTemplate);
        createOpeningHour(36L, Day.Tuesday, "20:00:00", mongoTemplate);
        createOpeningHour(37L, Day.Wednesday, "20:00:00", mongoTemplate);
        createOpeningHour(38L, Day.Thursday, "20:00:00", mongoTemplate);
        createOpeningHour(39L, Day.Friday, "19:00:00", mongoTemplate);
        createOpeningHour(40L, Day.Saturday, "14:00:00", mongoTemplate);
        createOpeningHour(41L, Day.Monday, "18:00:00", mongoTemplate);
        createOpeningHour(42L, Day.Tuesday, "20:00:00", mongoTemplate);
        createOpeningHour(43L, Day.Wednesday, "20:00:00", mongoTemplate);
        createOpeningHour(44L, Day.Thursday, "20:00:00", mongoTemplate);
        createOpeningHour(45L, Day.Friday, "19:00:00", mongoTemplate);
        createOpeningHour(46L, Day.Saturday, "14:00:00", mongoTemplate);
        createOpeningHour(47L, Day.Monday, "18:00:00", mongoTemplate);
        createOpeningHour(48L, Day.Tuesday, "20:00:00", mongoTemplate);
        createOpeningHour(49L, Day.Wednesday, "20:00:00", mongoTemplate);
        createOpeningHour(50L, Day.Thursday, "20:00:00", mongoTemplate);
        createOpeningHour(51L, Day.Friday, "19:00:00", mongoTemplate);
        createOpeningHour(52L, Day.Saturday, "14:00:00", mongoTemplate);
        createOpeningHour(53L, Day.Monday, "18:00:00", mongoTemplate);
        createOpeningHour(54L, Day.Tuesday, "20:00:00", mongoTemplate);
        createOpeningHour(55L, Day.Wednesday, "20:00:00", mongoTemplate);
        createOpeningHour(56L, Day.Thursday, "20:00:00", mongoTemplate);
        createOpeningHour(57L, Day.Friday, "19:00:00", mongoTemplate);
        createOpeningHour(58L, Day.Saturday, "14:00:00", mongoTemplate);
        createOpeningHour(59L, Day.Monday, "18:00:00", mongoTemplate);
        createOpeningHour(60L, Day.Tuesday, "20:00:00", mongoTemplate);
        createOpeningHour(61L, Day.Wednesday, "20:00:00", mongoTemplate);
        createOpeningHour(62L, Day.Thursday, "20:00:00", mongoTemplate);
        createOpeningHour(63L, Day.Friday, "19:00:00", mongoTemplate);
        createOpeningHour(64L, Day.Saturday, "14:00:00", mongoTemplate);
    }

    private void createOpeningHour(long id, Day monday, String endTime, MongockTemplate mongoTemplate) {
        OpeningHour openingHour1 = new OpeningHour();
        openingHour1.setId(id);
        openingHour1.setDay(monday);
        openingHour1.setStartTime(LocalTime.parse("08:00:00"));
        openingHour1.setEndTime(LocalTime.parse(endTime));
        openingHour1.setOrganizationId(id);
        mongoTemplate.save(openingHour1);
    }
}
