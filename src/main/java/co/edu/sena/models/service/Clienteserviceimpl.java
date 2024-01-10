package co.edu.sena.models.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import co.edu.sena.models.entity.Cliente;
import co.edu.sena.repository.ClienteRepository;

@Service
public class Clienteserviceimpl implements ClienteService{

	@Autowired
	ClienteRepository clienteRepository;

	@Override
	public Optional<Cliente> findById(Integer id) {
		
		return clienteRepository.findById(id);
	}

	@Override
	public List<Cliente> findAll() {
		
		return clienteRepository.findAll();
	}

	@Override
	public Cliente save(Cliente c) {
		// TODO Auto-generated method stub
		return clienteRepository.save(c);
	}

	@Override
	public void deleteById(Integer id) {
		clienteRepository.deleteById(id);
		
		
	}


}

	

