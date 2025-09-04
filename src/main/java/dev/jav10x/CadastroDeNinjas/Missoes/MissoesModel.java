package dev.jav10x.CadastroDeNinjas.Missoes;


import dev.jav10x.CadastroDeNinjas.Ninjas.NinjaModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "tb_cadastro_missoes")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class MissoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nameMissao;
    private difficultyMissao difficultyMissao;

    @OneToMany(mappedBy = "missoes") // UMA MISSAO PODE TER MAIS DE UM NINJA
    private List<NinjaModel> ninjas;


}
