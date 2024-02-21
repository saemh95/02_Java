package com.hw4.toyFactory.model.dto;

import java.util.*;

public class ToyMaterial extends Toy {
	
	private int materialId;
	private String materialName;
	
	public ToyMaterial () {		
		super();
	}

	public ToyMaterial(String name, int age, int price, String color, int manuDate, int materialId, String materialName) {
		super(name, age, price, color, manuDate);
		this.materialId = materialId;
		this.materialName = materialName;
	}

	@Override
	public String toString() {
		return super.toString() + materialName;
	}

	public int getMaterialId() {
		return materialId;
	}

	public void setMaterialId(int materialId) {
		this.materialId = materialId;
	}

	public String getMaterialName() {
		return materialName;
	}

	public void setMaterialName(String materialName) {
		this.materialName = materialName;
	}

	
	
}
