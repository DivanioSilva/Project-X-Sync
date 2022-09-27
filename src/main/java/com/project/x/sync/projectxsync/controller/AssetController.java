package com.project.x.sync.projectxsync.controller;

import com.project.x.sync.projectxsync.domain.Asset;
import com.project.x.sync.projectxsync.domain.AssetDto;
import com.project.x.sync.projectxsync.domain.AssetWithIdDto;
import com.project.x.sync.projectxsync.mappers.AssetMapper;
import com.project.x.sync.projectxsync.repository.AssetRepository;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "asset/")
public class AssetController {
    private final AssetMapper assetMapper;
    private final AssetRepository assetRepository;

    public AssetController(AssetMapper assetMapper, AssetRepository assetRepository) {
        this.assetMapper = assetMapper;
        this.assetRepository = assetRepository;
    }

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public AssetWithIdDto save(@RequestBody AssetDto assetDto){
        Asset asset = this.assetMapper.assetDtoToAsset(assetDto);
        Asset save = this.assetRepository.save(asset);
        return this.assetMapper.assetToAssetWithIdDto(save);
    }
}
