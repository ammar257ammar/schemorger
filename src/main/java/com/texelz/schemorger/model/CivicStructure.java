package com.texelz.schemorger.model;

/**
 *
 * A public structure, such as a town hall or concert hall.
 * @fullPath Thing > Place > CivicStructure
 *
 * @author Texelz (by Onhate)
 *
 */
public class CivicStructure extends Place {

	private Duration openingHours;
	/**
	 * The opening hours for a business. Opening hours can be specified as a weekly time range, starting with days, then times per day. Multiple days can be listed with commas ',' separating each day. Day or time ranges are specified using a hyphen '-'.<br />- Days are specified using the following two-letter combinations: <code>Mo</code>, <code>Tu</code>, <code>We</code>, <code>Th</code>, <code>Fr</code>, <code>Sa</code>, <code>Su</code>.<br />- Times are specified using 24:00 time. For example, 3pm is specified as <code>15:00</code>. <br />- Here is an example: <code>&lt;time itemprop=&quot;openingHours&quot; datetime=&quot;Tu,Th 16:00-20:00&quot;&gt;Tuesdays and Thursdays 4-8pm&lt;/time&gt;</code>. <br />- If a business is open 7 days a week, then it can be specified as <code>&lt;time itemprop=&quot;openingHours&quot; datetime=&quot;Mo-Su&quot;&gt;Monday through Sunday, all day&lt;/time&gt;</code>.
	 */
	public Duration getOpeningHours() {
		return this.openingHours;
	}
	public void setOpeningHours(Duration openingHours) {
		this.openingHours = openingHours;
	}
}