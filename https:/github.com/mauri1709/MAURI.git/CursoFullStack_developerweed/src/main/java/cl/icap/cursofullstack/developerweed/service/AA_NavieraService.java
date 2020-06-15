package cl.icap.cursofullstack.developerweed.service;

import java.util.List;

import cl.icap.cursofullstack.developerweed.model.dto.AA_NavieraDTO;

public interface AA_NavieraService {

	public List<AA_NavieraDTO> list();
	public AA_NavieraDTO get(String id_naviera);
	public int insert(AA_NavieraDTO aa_navieraDTO);
	public int update(AA_NavieraDTO aa_navieraDTO);
	public int delete(String id_naviera);
}
