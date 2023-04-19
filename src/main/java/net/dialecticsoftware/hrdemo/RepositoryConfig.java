package net.dialecticsoftware.hrdemo;

import javax.persistence.EntityManager;
import org.hibernate.Session;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author huseyinaydin
 */
@Configuration
public class RepositoryConfig {

  @Bean
  public Session getSession(EntityManager entityManager) {
    return entityManager.unwrap(Session.class);
  }
}
