package de.apnmt.organizationappointment.common.config.dbmigrations;

import com.github.cloudyrock.mongock.ChangeLog;
import com.github.cloudyrock.mongock.ChangeSet;
import com.github.cloudyrock.mongock.driver.mongodb.springdata.v3.decorator.impl.MongockTemplate;
import de.apnmt.organizationappointment.common.domain.ClosingTime;

import java.time.LocalDateTime;


/**
 * Creates the initial database setup.
 */
@ChangeLog(order = "004")
public class InitialClosingTimeMigration {

    @ChangeSet(order = "04", author = "initiator", id = "04-addClosingTimes")
    public void addClosingTimes(MongockTemplate mongoTemplate) {
        createClosingTime(1L, "2022-06-06T08:00:00", "2022-06-06T11:00:00", 1L, mongoTemplate);
        createClosingTime(2L, "2022-06-07T08:00:01", "2022-06-08T11:00:01", 3L, mongoTemplate);
        createClosingTime(3L, "2022-06-06T08:00:04", "2022-06-06T11:00:04", 5L, mongoTemplate);
        createClosingTime(4L, "2022-06-06T08:00:07", "2022-06-06T11:00:07", 8L, mongoTemplate);
        createClosingTime(5L, "2022-06-06T08:00:08", "2022-06-06T11:00:08", 15L, mongoTemplate);
        createClosingTime(6L, "2022-06-10T11:00:00", "2022-06-10T17:00:00", 19L, mongoTemplate);
    }

    private void createClosingTime(Long id, String startAt, String endAt, Long organizationId, MongockTemplate mongoTemplate) {
        ClosingTime closingTime = new ClosingTime();
        closingTime.setId(id);
        closingTime.setStartAt(LocalDateTime.parse(startAt));
        closingTime.setEndAt(LocalDateTime.parse(endAt));
        closingTime.setOrganizationId(organizationId);
        mongoTemplate.save(closingTime);
    }
}
