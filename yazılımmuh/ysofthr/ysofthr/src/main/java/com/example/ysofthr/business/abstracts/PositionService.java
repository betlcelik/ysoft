package com.example.ysofthr.business.abstracts;

import com.example.ysofthr.core.results.DataResult;
import com.example.ysofthr.entities.Employer;
import com.example.ysofthr.entities.Position;

import java.util.List;

public interface PositionService {

    public DataResult<Position> getById(int id);
    public DataResult<List<Position>> getAll();
    public DataResult<Position> add(Position position);
}
