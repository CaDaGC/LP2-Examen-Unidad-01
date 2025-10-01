package com.example.examen.controller.general;

import com.example.examen.dto.ClienteDTO;
import com.example.examen.service.service.ClienteService;
import org.hibernate.service.spi.ServiceException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/clientes")
public class ClienteController {
    private final ClienteService clienteService;

    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }
    @GetMapping
    public ResponseEntity<List<ClienteDTO>> listAll() throws ServiceException {
        return ResponseEntity.ok(clienteService.findAll());
    }
    @GetMapping("/{id}")
    public ResponseEntity<ClienteDTO> read(@PathVariable Long id) throws ServiceException {
        ClienteDTO clienteDTO = clienteService.findById(id);
        return ResponseEntity.ok(clienteDTO);
    }
    @PostMapping
    public ResponseEntity<ClienteDTO> create(@RequestBody ClienteDTO clienteDTO) throws ServiceException {
        ClienteDTO clienteDTO1 = clienteService.create(clienteDTO);
        return new ResponseEntity<>(clienteDTO1, HttpStatus.CREATED);
    }
    @PutMapping("/{id}")
    public ResponseEntity<ClienteDTO> update(@PathVariable Long id, @RequestBody ClienteDTO clienteDTO) throws ServiceException {
        ClienteDTO clienteDTO1 = clienteService.update(id,clienteDTO);
        return ResponseEntity.ok(clienteDTO1);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) throws ServiceException {
        clienteService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
