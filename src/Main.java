import br.com.credito.handler.Validador;
import br.com.credito.model.Cliente;
import br.com.credito.service.FluxoAprovacaoService;

public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente("Garro", 3500, 760, false);

        FluxoAprovacaoService service = new FluxoAprovacaoService();
        Validador fluxo = service.montarFluxo();

        fluxo.validar(cliente);
    }
}