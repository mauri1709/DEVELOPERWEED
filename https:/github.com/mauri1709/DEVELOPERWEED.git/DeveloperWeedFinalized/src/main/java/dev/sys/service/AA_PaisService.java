package dev.sys.service;

import java.util.List;

import dev.sys.model.dto.AA_PaisDTO;

public interface AA_PaisService {

	public List<AA_PaisDTO> list();
	public AA_PaisDTO get(String paiscodigo);
	public int insert(AA_PaisDTO aa_paisDTO);
	public int update(AA_PaisDTO aa_paisDTO);
	public int delete(String paiscodigo);
}
