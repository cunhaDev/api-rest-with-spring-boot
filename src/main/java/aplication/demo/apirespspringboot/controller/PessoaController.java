package aplication.demo.apirespspringboot.controller;

import aplication.demo.apirespspringboot.controller.dto.PessoaRq;
import aplication.demo.apirespspringboot.controller.dto.PessoaRs;
import aplication.demo.apirespspringboot.model.Pessoa;
import aplication.demo.apirespspringboot.repository.PessoaRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/pessoa")
public class PessoaController {

    public PessoaController(PessoaRepository pessoaRepository) {
        this.pessoaRepository = pessoaRepository;
    }

    private final PessoaRepository pessoaRepository;

    @GetMapping("/")
    public List<PessoaRs> findAll(){
        var pessoas = pessoaRepository.findAll();
        return pessoas.stream()
                .map(PessoaRs::converter)
                .collect(Collectors.toList());
    }

    @GetMapping("/{Id}")
    public PessoaRs findById(@PathVariable("id") Long id){
        var pessoa = pessoaRepository.getOne(id);
        return PessoaRs.converter(pessoa);
    }

    @PostMapping("/")
    public  void savePerson(@RequestBody PessoaRq pesssoa){
        var p = new Pessoa();
        p.setNome(pesssoa.getNome());
        p.setSobreNome(pesssoa.getSobrenome());
        pessoaRepository.save(p);
    }


}
