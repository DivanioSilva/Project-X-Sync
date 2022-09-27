package com.project.x.sync.projectxsync.repository;

import com.project.x.sync.projectxsync.domain.Asset;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssetRepository extends JpaRepository<Asset, Long> {
}
