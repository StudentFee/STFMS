package org.nmeict.smvdu.Beans.SpringClassFile;

import java.util.List;

import org.nmeict.smvdu.Beans.BranchMaster;

public interface IOrgBranchService {

	public void addOrgBranch(BranchMaster branchMaster);
	public void update(List<BranchMaster> branchMasterList);
	public List<BranchMaster> loadAllBranchList();
	
}
