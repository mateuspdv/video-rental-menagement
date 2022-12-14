package br.com.videolocadorapassatempo.controller;

import br.com.videolocadorapassatempo.service.TitleService;
import br.com.videolocadorapassatempo.service.dto.TitleDto;
import br.com.videolocadorapassatempo.service.dto.ViewTitleDto;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/titulo")
@CrossOrigin(origins = "*", maxAge = 3600)
@RequiredArgsConstructor
@Api(tags = "Título")
public class TitleController {

    private final TitleService titleService;

    @GetMapping
    @ApiOperation("Retorna todos os títulos cadastrados no sistema")
    public ResponseEntity<List<ViewTitleDto>> findAll() {
        return ResponseEntity.status(HttpStatus.OK).body(titleService.findAll());
    }

    @GetMapping("/{id}")
    @ApiOperation("Retorna um título cadastrado no sistema pelo id")
    public ResponseEntity<ViewTitleDto> findById(@PathVariable Long id) {
        return ResponseEntity.status(HttpStatus.OK).body(titleService.findById(id));
    }

    @PostMapping
    @ApiOperation("Cadastra um título no sistema")
    public ResponseEntity<TitleDto> create(@Valid @RequestBody TitleDto titleDto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(titleService.create(titleDto));
    }

    @PutMapping
    @ApiOperation("Atualiza um título no sistema")
    public ResponseEntity<TitleDto> update(@Valid @RequestBody TitleDto titleDto) {
        return ResponseEntity.status(HttpStatus.OK).body(titleService.update(titleDto));
    }

    @DeleteMapping("/{id}")
    @ApiOperation("Exclui um título do sistema pelo id")
    public ResponseEntity<Void> deleteById(@PathVariable Long id) {
        titleService.deleteById(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/pesquisar/nome/{name}")
    @ApiOperation("Retorna os títulos cadastrados no sistema pelo nome")
    public ResponseEntity<List<ViewTitleDto>> findByName(@PathVariable String name) {
        return ResponseEntity.status(HttpStatus.OK).body(titleService.findByName(name));
    }

    @GetMapping("/pesquisar/categoria/{category}")
    @ApiOperation("Retorna os títulos cadastrados no sistema pela categoria")
    public ResponseEntity<List<ViewTitleDto>> findByCategory(@PathVariable String category) {
        return ResponseEntity.status(HttpStatus.OK).body(titleService.findByCategory(category));
    }

    @GetMapping("/pesquisar/nomeator/{nameActor}")
    @ApiOperation("Retorna os títulos cadastrados no sistema pelo nome do ator")
    public ResponseEntity<List<ViewTitleDto>> findByNameActor(@PathVariable String nameActor) {
        return ResponseEntity.status(HttpStatus.OK).body(titleService.findByNameActor(nameActor));
    }

}
