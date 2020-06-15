package cl.icap.cursofullstack.developerweed.model.dao;

import java.util.List;

import cl.icap.cursofullstack.developerweed.model.dto.AA_DocumentosDTO;

public interface AA_DocumentosDAO {

	public List<AA_DocumentosDTO> list();
	public AA_DocumentosDTO get(String id_doc);
	public int insert(AA_DocumentosDTO aa_documentosDTO);
	public int update(AA_DocumentosDTO aa_documentosDTO);
	public int delete(String id_doc);
}
