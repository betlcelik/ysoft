package com.example.ysofthr.business.concretes;

import com.example.ysofthr.business.abstracts.PositionService;
import com.example.ysofthr.core.results.DataResult;
import com.example.ysofthr.core.results.SuccessDataResult;
import com.example.ysofthr.dataAccess.abstracts.PositionDao;
import com.example.ysofthr.entities.Employer;
import com.example.ysofthr.entities.Position;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PositionManager implements PositionService {

    private PositionDao positionDao;

    public PositionManager(PositionDao positionDao) {
        this.positionDao = positionDao;
    }


    @Override
    public DataResult<Position> getById(int id) {
        return new SuccessDataResult<Position>(this.positionDao.findById(id));
    }

    @Override
    public DataResult<List<Position>> getAll() {
        return new SuccessDataResult<List<Position>>(this.positionDao.findAll());
    }

    @Override
    public DataResult<Position> add(Position position) {
        this.positionDao.save(position);

        return new SuccessDataResult<Position>(position,"Position added successfully");
    }
}
