package com.project.x.sync.projectxsync.domain;

import lombok.Data;

import java.io.Serializable;

/**
 * A DTO for the {@link Asset} entity
 */
public record AssetDto(String name) implements Serializable {
}
