package com.mbs.MovieBookingSystem.repository;

import com.mbs.MovieBookingSystem.entity.Movies;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface MoviesRepository extends JpaRepository<Movies,Long> {
}
