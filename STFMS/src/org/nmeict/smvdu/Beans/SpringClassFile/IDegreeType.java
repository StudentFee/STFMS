package org.nmeict.smvdu.Beans.SpringClassFile;

import java.util.List;

import org.nmeict.smvdu.Beans.DegreeType;

public interface IDegreeType {

	public void addDegreeType(DegreeType degreeType);
	
	
	public void updateDegreeType(List<DegreeType> degreeType);
	
	
	public List<DegreeType> allDegreeType();
	
	
}
