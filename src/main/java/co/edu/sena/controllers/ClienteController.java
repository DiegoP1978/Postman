package co.edu.sena.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import co.edu.sena.models.entity.Cliente;
import co.edu.sena.models.service.ClienteService;

@RestController
@RequestMapping("/api/clientes")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE, RequestMethod.PUT})
public class ClienteController {

	@Autowired
	ClienteService clienteService;
	
	@GetMapping("/id")
	public Optional<Cliente> buscarPorId(@PathVariable Integer id){
		return clienteService.findById(id);
	}

	@GetMapping("/listar")
	public List<Cliente> listartodos(){
		
		return clienteService.findAll();
		
	}
	@PostMapping
	public Cliente guardar(@RequestBody Cliente c) {
		
	return clienteService.save(c);
		
	}
	@DeleteMapping("/{id}")
	public void eliminar(@PathVariable Integer id) {
	
		clienteService.deleteById(id);
		
	}
	
	@PutMapping("/actualizar/{id}")
	public Cliente actualizar(@RequestBody Cliente c, @PathVariable Integer id) {
		
		Cliente cEnBD= clienteService.findById(id).get();
		
		cEnBD.setIdCliente(c.getIdCliente());
		cEnBD.setNombre(c.getNombre());
		cEnBD.setApellido(c.getApellido());
		cEnBD.setIdentificacion(c.getIdentificacion());
		cEnBD.setEdad(c.getEdad());
		cEnBD.setTelefono(c.getTelefono());
		cEnBD.setEmail(c.getEmail());
		
		clienteService.save(cEnBD);
		return c;
		
	}
	
}
