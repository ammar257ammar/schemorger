package com.texelz.schemorger.model;

/**
 *
 * A medical laboratory that offers on-site or off-site diagnostic services.
 * @fullPath Thing > Organization > LocalBusiness > MedicalOrganization > DiagnosticLab
 *
 * @author Texelz (by Onhate)
 *
 */
public class DiagnosticLab extends MedicalOrganization {

	private MedicalTest availableTest;
	/**
	 * A diagnostic test or procedure offered by this lab.
	 */
	public MedicalTest getAvailableTest() {
		return this.availableTest;
	}
	public void setAvailableTest(MedicalTest availableTest) {
		this.availableTest = availableTest;
	}
}