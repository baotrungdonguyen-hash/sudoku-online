package com.sudoku.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.sudoku.entity.Leaderboard;
import com.sudoku.repository.LeaderboardRepository;

@RestController
@RequestMapping("/api/leaderboard")
@CrossOrigin("*")
public class LeaderboardController {

    @Autowired
    private LeaderboardRepository repo;

    @PostMapping
    public Leaderboard save(
        @RequestBody Leaderboard leaderboard
    ) {
        return repo.save(leaderboard);
    }

    @GetMapping("/{difficulty}")
    public List<Leaderboard> get(
        @PathVariable String difficulty
    ) {

        return repo
        .findTop10ByDifficultyOrderByTimeSecondsAsc(
            difficulty
        );
    }
}