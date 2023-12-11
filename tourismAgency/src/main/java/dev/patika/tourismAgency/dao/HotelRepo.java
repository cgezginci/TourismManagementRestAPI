package dev.patika.tourismAgency.dao;

import dev.patika.tourismAgency.entities.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HotelRepo extends JpaRepository<Hotel,Long> {

    List<Hotel> findByNameIgnoreCase(String name);

}
