package com.sudoku.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sudoku.entity.Leaderboard;

public interface LeaderboardRepository
extends JpaRepository<Leaderboard, Long> {

    List<Leaderboard>
    findTop10ByDifficultyOrderByTimeSecondsAsc(
        String difficulty
    );
}