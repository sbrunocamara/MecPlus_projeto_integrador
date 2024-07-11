/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mecPlus.Classes;

/**
 *
 * @author bsbru
 */
public class VeiculoClasse {

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMarcaId() {
        return marcaId;
    }

    public void setMarcaId(Integer marcaId) {
        this.marcaId = marcaId;
    }

    public Integer getModeloId() {
        return modeloId;
    }

    public void setModeloId(Integer modeloId) {
        this.modeloId = modeloId;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public Integer getClienteId() {
        return clienteId;
    }

    public void setClienteId(Integer clienteId) {
        this.clienteId = clienteId;
    }

    public String getMarcaDescricao() {
        return marcaDescricao;
    }

    public void setMarcaDescricao(String marcaDescricao) {
        this.marcaDescricao = marcaDescricao;
    }

    public String getModeloDescricao() {
        return modeloDescricao;
    }

    public void setModeloDescricao(String modeloDescricao) {
        this.modeloDescricao = modeloDescricao;
    }

    public String getClienteNome() {
        return clienteNome;
    }

    public void setClienteNome(String clienteNome) {
        this.clienteNome = clienteNome;
    }
    
    private Integer id;
    private Integer marcaId;
    private Integer modeloId;
    private String placa;
    private String ano;
    private Integer clienteId;
    private String marcaDescricao;
    private String modeloDescricao;
    private String clienteNome;
    
    
}
