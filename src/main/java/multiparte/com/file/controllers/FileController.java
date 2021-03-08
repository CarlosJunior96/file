package multiparte.com.file.controllers;

import multiparte.com.file.model.Disco;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/fotos")
public class FileController {

    @Autowired
    private Disco disco;

    @PostMapping("/")
    public ResponseEntity<String> enviar(@RequestBody MultipartFile foto){
        disco.salvarFoto(foto);
        int somar = 1 + 1;
        return ResponseEntity.ok().body("Salvo com sucesso");
    }

    @GetMapping("/")
    public ResponseEntity mostrarDados(){
        return ResponseEntity.ok().body("Chamando");
    }

}
