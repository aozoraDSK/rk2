package com.example.rk2;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PhotoRepository extends JpaRepository<PhotoModel, Long> {

    public List<PhotoModel> findByTitleContainingIgnoreCase(String title);

}
