package cl.icap.cursofullstack.developerweed.service;

import java.util.List;

import cl.icap.cursofullstack.developerweed.model.dto.AA_BlDTO;

public interface AA_BlService {
	public List<AA_BlDTO> list();
	public AA_BlDTO get(String id_bl);
	public int insert(AA_BlDTO aa_blDTO);
	public int update(AA_BlDTO aa_blDTO);
	public int delete(String id_bl);

}
