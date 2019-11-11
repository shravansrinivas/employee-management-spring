package com.employee;

import java.util.List;

public interface BatchDAL {
	public Batch createBatch(Batch e);

	public List<Batch> viewBatch();

	public void deleteBatch(String empID);
}
