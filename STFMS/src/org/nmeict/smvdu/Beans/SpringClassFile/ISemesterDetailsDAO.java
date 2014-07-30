package org.nmeict.smvdu.Beans.SpringClassFile;

import java.util.List;

import org.nmeict.smvdu.Beans.SemesterMaster;

public interface ISemesterDetailsDAO {

	public void addAllSemester(SemesterMaster semesterMaster);
	public void update(List<SemesterMaster> semesterDetails);
	public List<SemesterMaster> loadAllSemesterDetails();
}
