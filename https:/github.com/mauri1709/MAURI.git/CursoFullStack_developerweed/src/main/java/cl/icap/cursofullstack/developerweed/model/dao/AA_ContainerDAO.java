package cl.icap.cursofullstack.developerweed.model.dao;
import java.util.List;

import cl.icap.cursofullstack.developerweed.model.dto.AA_ContainerDTO;
public interface AA_ContainerDAO {

	public List<AA_ContainerDTO> list();
	public AA_ContainerDTO get(String n_container);
	public int insert(AA_ContainerDTO aa_containerDTO);
	public int update(AA_ContainerDTO aa_containerDTO);
	public int delete(String n_container);
}
