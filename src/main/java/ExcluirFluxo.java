import java.util.List;
import java.util.stream.Collectors;
public class ExcluirFluxo {
        private int id;


        public int getId() {
            return id;
        }

    public class FluxoController {
        private List<Fluxo> fluxos;

        public <Fluxo> String excluirFluxo(int id) {
            Fluxo fluxo = fluxos.stream()
                    .filter(f -> f.getId() == id)
                    .findFirst()
                    .orElse(null);

            if (fluxo == null) {
                return "Fluxo inexistente.";
            }

            fluxos = fluxos.stream()
                    .filter(f -> f.getId() != id)
                    .collect(Collectors.toList());

            return "Fluxo excluído com sucesso.";
        }
    }
}
