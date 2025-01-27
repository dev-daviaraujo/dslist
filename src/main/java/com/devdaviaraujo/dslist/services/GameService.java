package com.devdaviaraujo.dslist.services;

import com.devdaviaraujo.dslist.dto.GameMinDTO;
import com.devdaviaraujo.dslist.entities.Game;
import com.devdaviaraujo.dslist.projections.GameMinProjection;
import com.devdaviaraujo.dslist.repositories.GameRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    @Transactional
    public List<GameMinDTO> findAll(){
        List<Game> result = gameRepository.findAll();
        return result.stream().map(x -> new GameMinDTO(x)).toList();

    }

    @Transactional
    public List<GameMinDTO> findByList(Long listId){
        List<GameMinProjection> result = gameRepository.searchByList(listId);
        return result.stream().map(x -> new GameMinDTO(x)).toList();

    }




}
