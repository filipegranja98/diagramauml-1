import java.util.ArrayList;

public class UsuarioColaborador extends Usuario{
    private String cpf;
   

    public UsuarioColaborador(String cpf,String nome, String email,String endereco,String numeroContato) {
        super(nome,email,endereco,numeroContato);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void adicionarEbook(Ebook ebook) {
        ebooksEscritos.add(ebook);
    }

    public void excluirEbook(Ebook ebook) {
        ebooksEscritos.remove(ebook);
    }


}

