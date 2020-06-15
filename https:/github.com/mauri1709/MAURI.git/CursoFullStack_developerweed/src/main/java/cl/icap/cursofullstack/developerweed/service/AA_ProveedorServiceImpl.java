package cl.icap.cursofullstack.developerweed.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.icap.cursofullstack.developerweed.model.dao.AA_ProveedorDAO;
import cl.icap.cursofullstack.developerweed.model.dto.AA_ProveedorDTO;

@Service
public class AA_ProveedorServiceImpl implements AA_ProveedorService{

	@Autowired
	AA_ProveedorDAO aa_proveedorDAO;

	@Override
	public List<AA_ProveedorDTO> list() {
		return aa_proveedorDAO.list();
	}

	@Override
	public AA_ProveedorDTO get(String id_proveedor) {
		return aa_proveedorDAO.get(id_proveedor);
	}

	@Override
	public int insert(AA_ProveedorDTO aa_proveedorDTO) {
		return aa_proveedorDAO.insert(aa_proveedorDTO);
	}

	@Override
	public int update(AA_ProveedorDTO aa_proveedorDTO) {
		return aa_proveedorDAO.update(aa_proveedorDTO);
	}

	@Override
	public int delete(String id_proveedor) {
		return aa_proveedorDAO.delete(id_proveedor);
	}
	
}
