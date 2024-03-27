package com.ictak.springsecurityclient.repository;

import com.ictak.springsecurityclient.entity.Guest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GuestRepository extends JpaRepository<Guest,Long> {

}
