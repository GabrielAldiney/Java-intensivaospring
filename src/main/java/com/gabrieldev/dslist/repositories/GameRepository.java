package com.gabrieldev.dslist.repositories;

import com.gabrieldev.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {


}
