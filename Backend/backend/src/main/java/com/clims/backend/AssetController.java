package com.clims.backend;

import com.clims.backend.Asset;
import com.clims.backend.AssetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/assets")
public class AssetController {

    @Autowired
    private AssetRepository assetRepository;

    @GetMapping
    public List<Asset> getAllAssets() {
        return assetRepository.findAll();
    }

    @PostMapping
    public Asset addAsset(@RequestBody Asset asset) {
        return assetRepository.save(asset);
    }
}
