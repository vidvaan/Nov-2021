package com.createiq.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.createiq.model.Asset;
import com.createiq.repository.AssetRepository;

@RestController
@RequestMapping("/asset")
public class AssetController {
	
	@Autowired
	private AssetRepository assetRepository;
	
	
	@PostMapping
	public Asset save(@RequestBody Asset asset) {
		return assetRepository.save(asset);
	}

}
