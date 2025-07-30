package modelo;

public class Usuario{
    private int id_usuario;
    private String nome;
    private int telefone;
    private String email;
    private String tipo_usuario;

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario =id_usuario;
    }
    public String getTipo_usuario() {
        return tipo_usuario;
    }

    public void setTipo_usuario(String tipo_usuario){
        this.tipo_usuario = tipo_usuario;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    
    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone){
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    

    @Override
    public String toString() {
        return "Usuario{" + "id=" + id_usuario + ", nome=" + nome + ", telefone=" + telefone +", email=" + email + ", tipo_usuario=" + tipo_usuario +  '}';
    }
    
    
}