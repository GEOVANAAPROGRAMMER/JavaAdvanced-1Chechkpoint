package br.com.fiap.classes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "TDS_TB_PRODUTOCS")
public class Produto {
    @Id
    @Column(name = "ID_PRODUTO")
    private Integer id;

    @Column(name = "NM_PRODUTO")
    private String nome;

    @Column(name = "DS_PRODUTO")
    private String descricao;

    @Column(name = "DT_CADASTRO")
    private Date dataCadastro;

    @Column(name = "DT_VALIDADE")
    private Date validade;

    @Column(name = "DS_PRECO")
    private Float preco;

    @Column(name = "DS_TAMANHO")
    private Float tamanho;

    @Column(name = "VL_PRODUTO")
    private Float valor;

    
    public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Date getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public Date getValidade() {
		return validade;
	}

	public void setValidade(Date validade) {
		this.validade = validade;
	}

	public Float getPreco() {
		return preco;
	}

	public void setPreco(Float preco) {
		this.preco = preco;
	}

	public Float getTamanho() {
		return tamanho;
	}

	public void setTamanho(Float tamanho) {
		this.tamanho = tamanho;
	}

	public Float getValor() {
		return valor;
	}

	public void setValor(Float valor) {
		this.valor = valor;
	}

	@Override
    public String toString() {
        return "Produto{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", dataCadastro=" + dataCadastro +
                ", validade=" + validade +
                ", preco=" + preco +
                ", tamanho=" + tamanho +
                ", valor=" + valor +
                '}';
    }
}
