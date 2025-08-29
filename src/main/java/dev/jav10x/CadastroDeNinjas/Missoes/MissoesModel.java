package dev.jav10x.CadastroDeNinjas.Missoes;


import dev.jav10x.CadastroDeNinjas.Ninjas.NinjaModel;
import jakarta.persistence.*;

@Entity
@Table(name = "tb_cadastro_missoes")
public class MissoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nameMissao;
    private difficultyMissao difficultyMissao;

    private NinjaModel ninja;


}
