package fema.edu.br.cpfValidacao.main.adapter;
import fema.edu.br.cpfValidacao.main.model.CpfResponse;
import fema.edu.br.cpfValidacao.main.service.CpfService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/api/cpf")
public class CpfController {
    @GetMapping("/{cpf}")
    public ResponseEntity<CpfResponse> validateCpf(@PathVariable String cpf) {
        boolean valid = CpfService.validateCpf(cpf);
        if (valid) {
            CpfResponse response = new CpfResponse(cpf, "Válido", true);
            return ResponseEntity.ok(response);
        } else {
            String digits = cpf.substring(9);
            CpfResponse response = new CpfResponse(cpf, "CPF inválido", false, digits);
            return ResponseEntity.status(HttpStatus.CONFLICT).body(response);
        }
    }
}
