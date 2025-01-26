package com.remitly.remitlyswiftapi.repository;

import com.remitly.remitlyswiftapi.model.Swift;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SwiftRepository extends JpaRepository<Swift, Long> {
    Optional<Swift> findBySwiftCode(String swiftCode);

}
