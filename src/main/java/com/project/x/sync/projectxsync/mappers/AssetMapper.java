package com.project.x.sync.projectxsync.mappers;

import com.project.x.sync.projectxsync.domain.Asset;
import com.project.x.sync.projectxsync.domain.AssetDto;
import com.project.x.sync.projectxsync.domain.AssetWithIdDto;
import org.mapstruct.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface AssetMapper {

    Asset assetDtoToAsset(AssetDto assetDto);

    List<Asset> assetDTOsToAssets(List<AssetDto> assetDTOS);

    AssetDto assetToAssetDto(Asset asset);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Asset updateAssetFromAssetDto(AssetDto assetDto, @MappingTarget Asset asset);

    Asset assetWithIdDtoToAsset(AssetWithIdDto assetWithIdDto);

    AssetWithIdDto assetToAssetWithIdDto(Asset asset);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Asset updateAssetFromAssetWithIdDto(AssetWithIdDto assetWithIdDto, @MappingTarget Asset asset);
}
