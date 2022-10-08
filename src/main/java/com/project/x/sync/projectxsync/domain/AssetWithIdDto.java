package com.project.x.sync.projectxsync.domain;

import java.io.Serializable;

/**
 * A DTO for the {@link Asset} entity
 */
public record AssetWithIdDto(Long id, String name) implements Serializable {
}
