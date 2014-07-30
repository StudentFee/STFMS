package org.nmeict.smvdu.Beans.SpringClassFile;

import java.util.List;

import org.nmeict.smvdu.Beans.DegreeType;

public class DegreeTypeService implements IDegreeType{

	private DegreeTypeDAO degreeTypeDAO = new DegreeTypeDAO();
	
	
	public DegreeTypeDAO getDegreeTypeDAO() {
		return degreeTypeDAO;
	}

	public void setDegreeTypeDAO(DegreeTypeDAO degreeTypeDAO) {
		this.degreeTypeDAO = degreeTypeDAO;
	}

	@Override
	public void addDegreeType(DegreeType degreeType) 
	{
		getDegreeTypeDAO().addDegreeType(degreeType); 
		
	}

	@Override
	public void updateDegreeType(List<DegreeType> degreeType) {
		getDegreeTypeDAO().updateDegreeType(degreeType); 
		
	}

	@Override
	public List<DegreeType> allDegreeType() {
		
		return getDegreeTypeDAO().allDegreeType(); 
	}

}
