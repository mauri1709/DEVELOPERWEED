package cl.icap.cursofullstack.developerweed.service;

import java.util.List;

import cl.icap.cursofullstack.developerweed.model.dto.AA_Tipo_De_ProveedorDTO;

public interface AA_Tipo_De_ProveedorService {

	public List<AA_Tipo_De_ProveedorDTO> list();
	public AA_Tipo_De_ProveedorDTO get(String id_tproveedor);
	public int insert(AA_Tipo_De_ProveedorDTO aa_tipo_de_proveedorDTO);
	public int update(AA_Tipo_De_ProveedorDTO aa_tipo_de_proveedorDTO);
	public int delete(String AA_Tipo_De_ProveedorDTO);
}
