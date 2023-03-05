package com.bluecore.coursemanagement;

import com.bluecore.coursemanagement.CourseManagementApp;
import com.bluecore.coursemanagement.config.AsyncSyncConfiguration;
import com.bluecore.coursemanagement.config.EmbeddedMongo;
import com.bluecore.coursemanagement.config.TestSecurityConfiguration;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;

/**
 * Base composite annotation for integration tests.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@SpringBootTest(classes = { CourseManagementApp.class, AsyncSyncConfiguration.class, TestSecurityConfiguration.class })
@EmbeddedMongo
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_CLASS)
public @interface IntegrationTest {
}
