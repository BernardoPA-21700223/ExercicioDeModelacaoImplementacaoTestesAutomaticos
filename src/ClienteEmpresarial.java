public class ClienteEmpresarial extends Cliente{
    String responsavel;
    String contactoResponsavel;

    public ClienteEmpresarial(String nome, int contacto, int nif, String responsavel, String contactoResponsavel) {
        super(nome,contacto,nif);
        this.responsavel = responsavel;
        this.contactoResponsavel = contactoResponsavel;
    }


}
