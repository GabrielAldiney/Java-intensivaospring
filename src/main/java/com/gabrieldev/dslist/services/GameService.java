package com.gabrieldev.dslist.services;

import com.gabrieldev.dslist.dto.GameMinDTO;
import com.gabrieldev.dslist.entities.Game;
import com.gabrieldev.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDTO> findAll(){
        List<Game> result = gameRepository.findAll();
        return result.stream().map(x-> new GameMinDTO(x)).toList();

    }
}
