package dev.jav10x.CadastroDeNinjas.Ninjas;

import dev.jav10x.CadastroDeNinjas.Missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.LinkedList;
import java.util.List;


//O ENTITY TRANSFORMA UMA CLASSE EM UMA ENTIDADE PARA BANCO DE DADOS.
@Entity
@Table(name = "tb_cadastro")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;

    @Column(unique = true)
    private String email;
    private int idade;

    @ManyToOne // PODE TER APENAS UM OBJETO
    @JoinColumn(name = "missoes_id")    //FOREING KEY OU CHAVE ESTRANGEIRA
    private MissoesModel missoes;

}
