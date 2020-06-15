package cl.icap.cursofullstack.developerweed.model.dao;

import java.util.List;

import cl.icap.cursofullstack.developerweed.model.dto.AA_PaisDTO;

public interface AA_PaisDAO {
	
	public List<AA_PaisDTO> list();
	public AA_PaisDTO get(String paiscodigo);
	public int insert(AA_PaisDTO aa_paisDTO);
	public int update(AA_PaisDTO aa_paisDTO);
	public int delete(String paiscodigo);

}
