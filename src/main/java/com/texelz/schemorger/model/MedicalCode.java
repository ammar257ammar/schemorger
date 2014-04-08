package com.texelz.schemorger.model;

/**
 *
 * A code for a medical entity.
 * @fullPath Thing > MedicalEntity > MedicalIntangible > MedicalCode
 *
 * @author Texelz (by Onhate)
 *
 */
public class MedicalCode extends MedicalIntangible {

	private String codeValue;
	private String codingSystem;
	/**
	 * The actual code.
	 */
	public String getCodeValue() {
		return this.codeValue;
	}
	public void setCodeValue(String codeValue) {
		this.codeValue = codeValue;
	}
	/**
	 * The coding system, e.g. 'ICD-10'.
	 */
	public String getCodingSystem() {
		return this.codingSystem;
	}
	public void setCodingSystem(String codingSystem) {
		this.codingSystem = codingSystem;
	}
}