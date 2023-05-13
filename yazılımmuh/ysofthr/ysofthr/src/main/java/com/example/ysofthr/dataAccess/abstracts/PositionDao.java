package com.example.ysofthr.dataAccess.abstracts;

import com.example.ysofthr.entities.Position;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PositionDao extends JpaRepository<Position, Integer> {

    public Position findById(int id);
}
