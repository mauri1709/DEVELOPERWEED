package cl.icap.cursofullstack.developerweed.model.dao;

import java.util.List;

import cl.icap.cursofullstack.developerweed.model.dto.AA_ConsignatarioDTO;

public interface AA_ConsignatarioDAO {
	public List<AA_ConsignatarioDTO> list();
	public AA_ConsignatarioDTO get(String id_consignatario);
	public int insert(AA_ConsignatarioDTO aa_consignatarioDTO);
	public int update(AA_ConsignatarioDTO aa_consignatarioDTO);
	public int delete(String id_consignatario);

}
