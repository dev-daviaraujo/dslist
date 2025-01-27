package com.devdaviaraujo.dslist.services;

import com.devdaviaraujo.dslist.dto.GameListDTO;
import com.devdaviaraujo.dslist.entities.GameList;
import com.devdaviaraujo.dslist.repositories.GameListRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;


    @Transactional
    public List<GameListDTO> findAll(){
        List<GameList> result = gameListRepository.findAll();
        return result.stream().map(x -> new GameListDTO(x)).toList();



    }



}
