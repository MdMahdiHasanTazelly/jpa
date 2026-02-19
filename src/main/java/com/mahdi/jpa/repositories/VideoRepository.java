package com.mahdi.jpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mahdi.jpa.models.Video;


public interface VideoRepository extends JpaRepository<Video, Integer>{
    
}
