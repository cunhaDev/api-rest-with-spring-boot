package aplication.demo.apirespspringboot.model;


import javax.persistence.*;

@Entity
@Table(name = "pessoa")
public class Pessoa {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cd_pessoa")
    private long id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "sobreNome")
    private String sobreNome;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }
}
