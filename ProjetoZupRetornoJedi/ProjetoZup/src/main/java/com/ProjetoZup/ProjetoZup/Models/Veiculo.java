package com.ProjetoZup.ProjetoZup.Models;


import javax.persistence.*;

import javax.validation.constraints.NotEmpty;

import javax.validation.constraints.Size;

@Entity
@Table(name="veiculo")
public class Veiculo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotEmpty(message= "favor preencher a marca.")
    private String marca;

    @Column
    @NotEmpty(message= "favor preencher o modelo.")
    private String modelo;

    @Column
    @NotEmpty(message = "favor preencher o ano.")
    @Size(min=4, max=4, message="O ano deve possuir 4 digitos")
    private String ano;

    private String valor;

    @ManyToOne(cascade = CascadeType.REMOVE)
	private Usuario usuario;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}
}
