package net.sf.odinms.net.world.remote;

import java.io.Serializable;

/**
 *
 * @author Matze
 */
public class CheaterData implements Serializable, Comparable<CheaterData> {
	
	private int points;
	private String info;

	public CheaterData(int points, String info) {
		this.points = points;
		this.info = info;
	}

	public String getInfo() {
		return info;
	}

	public int getPoints() {
		return points;
	}

	public int compareTo(CheaterData o) {
		int thisVal = getPoints();
		int anotherVal = o.getPoints();
		return (thisVal<anotherVal ? 1 : (thisVal==anotherVal ? 0 : -1));
	}
}
