/*******************************************************************************
 *  Copyright (C) FlexiCore, Inc - All Rights Reserved
 *  Unauthorized copying of this file, via any medium is strictly prohibited
 *  Proprietary and confidential
 *  Written by Avishay Ben Natan And Asaf Ben Natan, October 2015
 ******************************************************************************/
package com.flexicore.ui.component.model;


import com.flexicore.model.Baseclass;
import com.flexicore.security.SecurityContextBase;

import javax.persistence.Entity;

@Entity
public class UIComponent extends Baseclass {


	public UIComponent() {
	}

	public UIComponent(String name, SecurityContextBase securityContext) {
		super(name, securityContext);
	}

	private String externalId;


	public String getExternalId() {
		return externalId;
	}

	public void setExternalId(String externalId) {
		this.externalId = externalId;
	}
}
