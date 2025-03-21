package formulario.demo.controller;
import formulario.demo.model.promedioModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class promedioController {
    @GetMapping("/promedio")
    public String promedio(Model model){
        model.addAttribute("promedioModel", new promedioModel());
        model.addAttribute("visualizaralerta", false);
        return "formularioNotas";
    }
    @PostMapping("/calcularpromedio")
    public String calcularpromedio(@ModelAttribute("promedioModel") promedioModel promedio,
                                   Model model){
        Double nnota1 = promedio.getNota1();
        Double nnota2 = promedio.getNota2();
        Double nnota3 = promedio.getNota3();
        Double nnotafinal = promedio.getNota4();
        Double resultado = ((nnota1* 0.04) + (nnota2* 0.12)+(nnota3* 0.24)+(nnotafinal* 0.60));
        String estiloDiagnostico ="alert-danger";
        String mensaje = "";
        if (resultado >= 14){
            mensaje = "Desaprobado";
            estiloDiagnostico ="alert-warner";
        }
        else{
            mensaje = "Aprobado";
            estiloDiagnostico ="alert-danger";


        }
        model.addAttribute("resultado", "Su promedio es" + String.format("%.2f", resultado)+
                " se encuentra"+mensaje);
        model.addAttribute("visualizaralerta", true);
        model.addAttribute("estilodiagnostico", estiloDiagnostico);





        return "formularioNotas";

    }


}