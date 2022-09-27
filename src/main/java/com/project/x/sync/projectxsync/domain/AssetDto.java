package com.project.x.sync.projectxsync.domain;

import lombok.Data;

import java.io.Serializable;

/**
 * A DTO for the {@link Asset} entity
 */
@Data
public class AssetDto implements Serializable {
    private final Long id;
    private final String name;
}
