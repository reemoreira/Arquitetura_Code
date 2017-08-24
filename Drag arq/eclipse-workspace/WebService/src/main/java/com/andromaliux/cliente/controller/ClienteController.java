package com.andromaliux.cliente.controller;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import java.util.List;


import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;

import com.andromaliux.cliente.model.Cliente;
import com.andromaliux.cliente.model.ClienteDAO;

@Path("/service")

public class ClienteController {
	private final ClienteDAO clienteDAO = new ClienteDAO();
	
	@POST
	@Consumes("application/json; charset = utf-8")
	@Produces("application/json; charset = utf-8")
	@Path("/cadastrar")
	public String cadastrar(Cliente cliente) {
		try {
			clienteDAO.salvar(cliente);
			return "BADUMTSS XD";
		}catch(Exception e) {
			return "ERROR" + e.getMessage();
		}
	}
	
	@POST
	@Consumes("application/json; charset = utf-8")
	@Produces("application/json; charset = utf-8")
	@Path("/editar")
	public String editar(Cliente cliente) {
		try {
			clienteDAO.editar(cliente);
			return "BADUMTSS XD";
		}catch(Exception e) {
			return "ERROR" + e.getMessage();
		}
	}
	@DELETE
	@Produces("application/json; charset = utf-8")
	@Path("/excluir/{id}")
	public String excluir(@PathParam("id") Integer id) {
		try {
			clienteDAO.excluir(id);
			return "BADUMTSS XD";
		}catch(Exception e) {
			return "ERROR" + e.getMessage();
		}
	}
	
	@GET
	@Produces("application/json; charset = utf-8")
	@Path("/buscarPorId/{id}")
	public Cliente buscarPorId(@PathParam("id") Integer id) {
			Cliente c =  clienteDAO.buscarPorId(id);
			if(c!=null) {
				return c;
			}
			return null;
	}
	
	@GET
	@Produces("application/json; charset = utf-8")
	@Path("/listar")
	public List<Cliente> listar() {
			List<Cliente> clientes = clienteDAO.listar();
			if(clientes!=null) {
				return clientes;
			}
			return null;
	}
}
