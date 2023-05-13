package com.example.ysofthr.api;

import com.example.ysofthr.business.abstracts.PositionService;
import com.example.ysofthr.core.results.DataResult;
import com.example.ysofthr.entities.Employer;
import com.example.ysofthr.entities.Position;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/positions")
public class PositionController {

    PositionService positionService;

    @Autowired
    public PositionController(PositionService positionService) {
        this.positionService = positionService;
    }

    @GetMapping("/getById")
    public DataResult<Position> getById(@RequestParam int id){
        return this.positionService.getById(id);
    }

    @GetMapping("/getAll")
    public DataResult<List<Position>> getAll(){

        return this.positionService.getAll();
    }

    @PostMapping("/add")
    public DataResult<Position> add(@RequestBody Position position){

        return this.positionService.add(position);
    }

}
