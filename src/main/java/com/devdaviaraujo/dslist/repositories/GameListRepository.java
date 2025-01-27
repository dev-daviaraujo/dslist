package com.devdaviaraujo.dslist.repositories;

import com.devdaviaraujo.dslist.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
