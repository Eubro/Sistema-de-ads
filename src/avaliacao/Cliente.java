
package avaliacao;

import java.util.Objects;

public class Cliente {
    private String cnpj;
    private String razaoSocial;
    private String nomeComleto;
    private String telefone;
    private String email;

    public Cliente(String cnpj, String razaoSocial, String nomeComleto, String telefone, String email) {
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
        this.nomeComleto = nomeComleto;
        this.telefone = telefone;
        this.email = email;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getNomeComleto() {
        return nomeComleto;
    }

    public void setNomeComleto(String nomeComleto) {
        this.nomeComleto = nomeComleto;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    

    @Override
    public String toString() {
        return "Cliente{" + "cnpj=" + cnpj + ", razaoSocial=" + razaoSocial + ", nomeComleto=" + nomeComleto + ", telefone=" + telefone + ", email=" + email + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cliente other = (Cliente) obj;
        if (!Objects.equals(this.cnpj, other.cnpj)) {
            return false;
        }
        if (!Objects.equals(this.nomeComleto, other.nomeComleto)) {
            return false;
        }
        return true;
    }

    
    }
    
    
    

    


    
    
    
    
    
    

