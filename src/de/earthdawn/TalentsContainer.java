package de.earthdawn;

import java.util.ArrayList;
import java.util.List;

import de.earthdawn.data.DISCIPLINEType;
import de.earthdawn.data.TALENTType;

public class TalentsContainer {
	private List<TALENTType> disciplinetalents=null;
	private List<TALENTType> optionaltalents=null;

	public TalentsContainer() {}

	public TalentsContainer(DISCIPLINEType discipline) {
		setDisciplinetalents(discipline.getDISZIPLINETALENT());
		setOptionaltalents(discipline.getOPTIONALTALENT());
	}

	public void setDisciplinetalents(List<TALENTType> disciplinetalents) {
		for( TALENTType talent : disciplinetalents ) {
			List<String> limitations = talent.getLIMITATION();
			String limitation=CharacterContainer.join( limitations );
			limitations.clear();
			if( !limitation.isEmpty() ) limitations.add(limitation);
		}
		this.disciplinetalents = disciplinetalents;
	}
	public List<TALENTType> getDisciplinetalents() {
		return disciplinetalents;
	}
	public void setOptionaltalents(List<TALENTType> optionaltalents) {
		for( TALENTType talent : optionaltalents ) {
			List<String> limitations = talent.getLIMITATION();
			String limitation=CharacterContainer.join( limitations );
			limitations.clear();
			if( !limitation.isEmpty() ) limitations.add(limitation);
		}
		this.optionaltalents = optionaltalents;
	}
	public List<TALENTType> getOptionaltalents() {
		return optionaltalents;
	}
	public List<TALENTType> getDisciplineAndOptionaltalents() {
		List<TALENTType> result = new ArrayList<TALENTType>();
		if( disciplinetalents != null ) result.addAll(disciplinetalents);
		if( optionaltalents != null ) result.addAll(optionaltalents);
		return result;
	}
}
