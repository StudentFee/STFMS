package org.nmeict.smvdu.Beans.SpringClassFile;

import java.util.List;

import org.nmeict.smvdu.Beans.OrgDepartmentType;

public interface IOrgDepartmentTypeDAO {

	
	
	public void addOrgDepartmentType(OrgDepartmentType orgDepartmentType);
	public void update(List<OrgDepartmentType> orgDepartmentType);
	public List<OrgDepartmentType> loadAllOrgDepartmentType();
}
