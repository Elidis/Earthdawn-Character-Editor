package de.earthdawn.namegenerator;
/******************************************************************************\
Copyright (C) 2010-2011  Holger von Rhein <lortas@freenet.de>

This program is free software; you can redistribute it and/or
modify it under the terms of the GNU General Public License
as published by the Free Software Foundation; either version 2
of the License, or (at your option) any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with this program; if not, write to the Free Software
Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
\******************************************************************************/

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

import de.earthdawn.data.GenderType;

public class SyllableComplex {
	private String syl;
	private List<SyllableAttributes> attributes = new ArrayList<SyllableAttributes>();
	private List<SyllableComplex> next = new ArrayList<SyllableComplex>();

	public SyllableComplex(String sSyl) {
		this.syl = sSyl;
	}

	public String getSyl() {
		return this.syl;
	}

	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append(syl);
		result.append("$");
		for( SyllableAttributes a : this.attributes ) {
			result.append("(");
			result.append(a.getRace());
			result.append(",");
			result.append(a.getGender().value());
			result.append(",");
			result.append(a.getNamepart());
			result.append(",");
			if( a.isStart() ) result.append("1");
			else result.append("0");
			result.append(")");
		}
		result.append("$");
		return result.toString();
	}

	public boolean containsAttribute(SyllableAttributes attr) {
		return this.attributes.contains(attr);
	}

	public void insertNext(SyllableComplex next, String race, GenderType gender, int namepart, boolean start ) {
		insertNext(next,new SyllableAttributes(race, gender, namepart, start));
	}

	public void insertNext(SyllableComplex next, SyllableAttributes attributes ) {
		// Füge die nächste Silbe nur ein, wenn Sie noch nicht eingefügt sein sollte
		if( ! this.next.contains(next) ) this.next.add(next);
		// Füge die Silbeneigenschaft nur ein, wenn Sie noch nicht vorhanden sein sollte.
		int idx = this.attributes.indexOf(attributes);
		if( idx < 0 ) this.attributes.add(attributes);
		else if( attributes.isStart() ){
			// Stelle sicher, dass die gespeicherte Silbeneigenschaft auch eine Startsilbe ist,
			// wenn es die einzugügende auch ist.
			this.attributes.get(idx).setStart(true);
		}
	}

	public List<SyllableComplex> getNext(String race, GenderType gender, int namepart ) {
		SyllableAttributes attr = new SyllableAttributes(race, gender, namepart, false);
		return getNext(attr);
	}

	public List<SyllableComplex> getNext(SyllableAttributes attr) {
		List<SyllableComplex> result = new ArrayList<SyllableComplex>();
		for( SyllableComplex s : this.next ) {
			if( s.containsAttribute(attr) ) result.add(s);
		}
		return result;
	}

	public boolean equals(Object obj) {
		return (obj instanceof SyllableComplex) && ((SyllableComplex)obj).syl.equals(this.syl);
	}

	public int hashCode() {
		return 97*this.syl.hashCode();
	}
}
