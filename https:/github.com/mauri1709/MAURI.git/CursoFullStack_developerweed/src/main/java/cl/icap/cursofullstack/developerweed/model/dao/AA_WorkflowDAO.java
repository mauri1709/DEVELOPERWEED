package cl.icap.cursofullstack.developerweed.model.dao;

import java.util.List;

import cl.icap.cursofullstack.developerweed.model.dto.AA_WorkflowDTO;

public interface AA_WorkflowDAO {
	
	public List<AA_WorkflowDTO> list();
	public AA_WorkflowDTO get(String id_flujo);
	public int insert(AA_WorkflowDTO aa_workflowDTO);
	public int update(AA_WorkflowDTO aa_workflowDTO);
	public int delete(String id_flujo);

}
