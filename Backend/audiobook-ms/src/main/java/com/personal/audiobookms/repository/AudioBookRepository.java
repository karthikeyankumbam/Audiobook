package com.personal.audiobookms.repository;

import com.personal.audiobookms.entity.Audiobook;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AudioBookRepository  extends JpaRepository<Audiobook,Integer>{
}
