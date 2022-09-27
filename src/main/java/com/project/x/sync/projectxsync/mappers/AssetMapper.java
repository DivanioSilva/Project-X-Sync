package com.project.x.sync.projectxsync.mappers;

import com.project.x.sync.projectxsync.domain.Asset;
import com.project.x.sync.projectxsync.domain.AssetDto;
import org.mapstruct.*;
import org.springframework.stereotype.Component;

@Component
@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface AssetMapper {
    Asset assetDtoToAsset(AssetDto assetDto);

    AssetDto assetToAssetDto(Asset asset);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Asset updateAssetFromAssetDto(AssetDto assetDto, @MappingTarget Asset asset);
}
