package com.devdaviaraujo.dslist.repositories;

import com.devdaviaraujo.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {

}
