package com.cg.hsm.domain;

import javax.persistence.Embeddable;

import javax.persistence.Id;

/**
 * This class will create insurance policy table in database
 * 
 * @author Diparna
 *
 */
@Embeddable
public class InsurancePolicy {
	/*
	 * This is the id of the policy
	 */
	
	private String policyId;
	/*
	 * this is the policy name
	 */
	private String policyName;

	// Getter Setters

	public String getPolicyId() {
		return policyId;
	}

	public void setPolicyId(String policyId) {
		this.policyId = policyId;
	}

	public String getPolicyName() {
		return policyName;
	}

	public void setPolicyName(String policyName) {
		this.policyName = policyName;
	}

	// Parameterized constructor

	public InsurancePolicy(String policyId, String policyName) {
		super();
		this.policyId = policyId;
		this.policyName = policyName;
	}

	// default constructor

	public InsurancePolicy() {
		super();
		// TODO Auto-generated constructor stub
	}

	// To string method
	@Override
	public String toString() {
		return "InsurancePolicy [policyId=" + policyId + ", policyName=" + policyName + "]";
	}

}