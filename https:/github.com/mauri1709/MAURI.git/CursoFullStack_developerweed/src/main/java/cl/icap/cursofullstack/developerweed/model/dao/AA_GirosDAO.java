package cl.icap.cursofullstack.developerweed.model.dao;

import java.util.List;

import cl.icap.cursofullstack.developerweed.model.dto.AA_GirosDTO;

public interface AA_GirosDAO {
	public List<AA_GirosDTO> list();
	public AA_GirosDTO get(String id_giro);
	public int insert(AA_GirosDTO aa_girosDTO);
	public int update(AA_GirosDTO aa_girosDTO);
	public int delete(String id_giro);

}
