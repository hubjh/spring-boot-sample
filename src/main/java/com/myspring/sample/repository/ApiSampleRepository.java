package com.myspring.sample.repository;

import com.myspring.sample.entity.Sample;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApiSampleRepository extends JpaRepository<Sample, Long> {
    Page<Sample> findAll(Pageable pageable);
}
