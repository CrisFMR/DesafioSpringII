package cl.praxis.HospitalPostPandemia.controller;

import cl.praxis.HospitalPostPandemia.HospitalPostPandemiaApplication;
import cl.praxis.HospitalPostPandemia.model.dto.Paciente;
import cl.praxis.HospitalPostPandemia.model.service.PacienteService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/pacientes")
public class PacienteController {
    public static final Logger logger = LoggerFactory.getLogger(HospitalPostPandemiaApplication.class);

    PacienteService service;

    public PacienteController(PacienteService service) {
        this.service = service;
    }

    @GetMapping()
    public String findAll(Model model){
        logger.warn("Construyendo listado de Pacientes...");
        model.addAttribute("pacientes", service.findAll());
        logger.warn("Pacientes han sido listados satisfactoriamente");
        return "PacientesList";

    }

    @GetMapping("/{id}")
    public String findOne(@PathVariable("id") int id, Model model){
        logger.warn("Realizando busqueda de paciente por Id...");
        model.addAttribute("paciente", service.findOne(id));
    return "pacientesEdit";
    }

    @PostMapping
    public String update(@ModelAttribute Paciente paciente){
        boolean result = service.update(paciente);

        if (result){
            logger.info("Datos del paciente actualizados correctamente");
        } else {
            logger.error("Error al actualizar datos del pacien");
        }

        return "redirect:/pacientes";
    }

    @GetMapping("/del/{id}")
    public String delete(@PathVariable("id") int id){
        boolean result = service.delete(id);

        if (result){
            logger.info("Datos del paciente eliminados correctamente");
        } else {
            logger.error("Error al eliminar datos del paciente");
        }
        return "redirect:/pacientes";
    }

    @GetMapping("/new")
    public ModelAndView create(){
        return new ModelAndView("pacientesNew");
    }

    @PostMapping("/new")
    public String save(@ModelAttribute Paciente paciente){
        boolean result = service.create(paciente);

        if (result){
            logger.info("Registro paciente creado correctamente");
        } else {
            logger.error("Error al crear registro del paciente");
        }
        return "redirect:/pacientes";
    }
}
