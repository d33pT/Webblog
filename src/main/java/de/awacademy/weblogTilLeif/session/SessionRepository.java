package de.awacademy.weblogTilLeif.session;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepository extends JpaRepository<Session,String> {
}
