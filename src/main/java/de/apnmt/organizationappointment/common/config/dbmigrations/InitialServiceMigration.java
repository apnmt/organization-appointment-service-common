package de.apnmt.organizationappointment.common.config.dbmigrations;

import com.github.cloudyrock.mongock.ChangeLog;
import com.github.cloudyrock.mongock.ChangeSet;
import com.github.cloudyrock.mongock.driver.mongodb.springdata.v3.decorator.impl.MongockTemplate;
import de.apnmt.organizationappointment.common.domain.Service;


/**
 * Creates the initial database setup.
 */
@ChangeLog(order = "001")
public class InitialServiceMigration {

    @ChangeSet(order = "01", author = "initiator", id = "01-addServices")
    public void addServices(MongockTemplate mongoTemplate) {
        createService(1L, 30, mongoTemplate);
        createService(2L, 15, mongoTemplate);
        createService(3L, 30, mongoTemplate);
        createService(4L, 15, mongoTemplate);
        createService(5L, 30, mongoTemplate);
        createService(6L, 15, mongoTemplate);
        createService(7L, 30, mongoTemplate);
        createService(8L, 15, mongoTemplate);
        createService(9L, 30, mongoTemplate);
        createService(10L, 15, mongoTemplate);
        createService(11L, 30, mongoTemplate);
        createService(12L, 15, mongoTemplate);
        createService(13L, 30, mongoTemplate);
        createService(14L, 15, mongoTemplate);
        createService(15L, 30, mongoTemplate);
        createService(16L, 15, mongoTemplate);
        createService(17L, 30, mongoTemplate);
        createService(18L, 15, mongoTemplate);
        createService(19L, 30, mongoTemplate);
    }

    private void createService(Long id, int duration, MongockTemplate mongoTemplate) {
        Service service = new Service();
        service.setId(id);
        service.setDuration(duration);
        mongoTemplate.save(service);
    }
}
