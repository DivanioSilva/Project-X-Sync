package com.project.x.sync.projectxsync.mappers;

import com.project.x.sync.projectxsync.domain.Asset;
import com.project.x.sync.projectxsync.domain.AssetDto;
import com.project.x.sync.projectxsync.domain.AssetWithIdDto;
import org.mapstruct.*;
import org.springframework.stereotype.Component;

@Component
@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface AssetMapper {

    Asset assetDtoToAsset(AssetDto assetDto);

    AssetDto assetToAssetDto(Asset asset);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Asset updateAssetFromAssetDto(AssetDto assetDto, @MappingTarget Asset asset);

    Asset assetWithIdDtoToAsset(AssetWithIdDto assetWithIdDto);

    AssetWithIdDto assetToAssetWithIdDto(Asset asset);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Asset updateAssetFromAssetWithIdDto(AssetWithIdDto assetWithIdDto, @MappingTarget Asset asset);
}
