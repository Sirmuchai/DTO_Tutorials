package com.sity.msdtotutorial.repository;

import com.sity.msdtotutorial.model.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface LocationRepository extends JpaRepository<Location, Long> {
}
