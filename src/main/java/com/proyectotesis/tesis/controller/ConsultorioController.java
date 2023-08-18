package com.proyectotesis.tesis.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.proyectotesis.tesis.correo.enviarCorreo;
import com.proyectotesis.tesis.model.entidad.HistorialClinico;
import com.proyectotesis.tesis.model.servicio.IHistorialClinicoService;

import org.springframework.ui.Model;

@Controller
@RequestMapping("/consultorio")
public class ConsultorioController {

    @Autowired
    private IHistorialClinicoService histCliniService;

    @Autowired
    private enviarCorreo emailService;

    @GetMapping("/send-email")
    public String sendEmail() {
        emailService.sendHtmlEmail("se_edu@hotmail.com", "PRUEBA ENVIO DE CORREO", "<html><body>" +
        "<h1>Estimado cliente, buenos días.</h1>" +
        "<p>Se presenta su muestra de datos informáticos.</p>" +
        "<p>En caso de presentar inconvenientes, por favor informar.</p>" +
        "</body></html>");

        return "Consultorio_listaH.C";
    }


    @RequestMapping("/")
    public String inicio(Model model){
        return "Consultorio_index";
    }


    @RequestMapping("/pacientes")
    public String Consultorio_ListaClientes(Model model){
        return "Consultorio_listaClientes.html";
    }

     //METODOS PARA REALIZAR LISTADO DE LOS HISTORIALES MEDICOS------------------------------------
    @RequestMapping("/verhistorial")
    public String Consultorio_VisualizarHistorialClinico(Model model){
        model.addAttribute("listahistClinico", histCliniService.listarHistorialClinicos());
        return "Consultorio_listaH.C";
    }

    //METODOS PARA REALIZAR REGISTRO DE UN HISTORIAL MEDICO---------------------------------------
    @RequestMapping("/reghistorial")
    public String Consultorio_RegistrarHistorialClinico(Model model){
        
        HistorialClinico histClinico = new HistorialClinico();
        model.addAttribute("histClinico", histClinico);
        
        return "Consultorio_registrarH.C";
    }

    @RequestMapping(value = "/historialformulario", method = RequestMethod.POST)
    public String FormularioHistorialClinico(HistorialClinico histClinico){
        histCliniService.guardarHistorialClinico(histClinico);
        return "redirect:/consultorio/reghistorial";
    }

    //PARA VISUALIZAR LOS MODELOS PARA GRAFICOS---------------------------------------------------
    @RequestMapping("/prueba")
    public String prueba(Model model){
        return "tables.html";
    }

    @RequestMapping("/pdf")
    public String generarPDF(Model model){

        try {
            FileOutputStream archivo;
            File file = new File("src/main/resources/static/img/prueba.pdf");
            archivo = new FileOutputStream(file);
            Document doc = new Document();
            PdfWriter.getInstance(doc, archivo);
            doc.open();
            Image img = Image.getInstance("src/main/resources/static/img/perfil.png");

            Paragraph fecha = new Paragraph();
            //Font negrita = new Font(Font.FontFamily.TIMES_ROMAN, 12, Font.BOLD, BaseColor.BLUE);
            fecha.add(Chunk.NEWLINE);
            Date date = new Date();
            fecha.add("Factura: 1\n"+"Fecha: " + new SimpleDateFormat("dd-MM-yyyy").format(date)+"\n\n");

            PdfPTable Encabezado = new PdfPTable(4);
            Encabezado.setWidthPercentage(100);
            Encabezado.getDefaultCell().setBorder(0);
            float[] ColumnaEncabezado = new float[]{20f, 30f, 70f, 40f};
            Encabezado.setWidths(ColumnaEncabezado);
            Encabezado.setHorizontalAlignment(Element.ALIGN_CENTER);

            Encabezado.addCell(img);

            String ruc = "20232332441";
            String nom = "Sebastian Quispe";
            String tel = "969834193";
            String dir = "Lima";
            String ra = "Vida Informatica";

            Encabezado.addCell("");
            Encabezado.addCell("Ruc: "+ruc+"\nNombre: "+nom+"\nTelefono: "+tel+"Direccion: "+dir+"\nRazon:"+ra);
            Encabezado.addCell(fecha);
            doc.add(Encabezado);

            doc.close();
            archivo.close();

            return "tables.html";

        } catch (Exception e) {
            return "Consultorio_registrarH.C.html";
        }

        
    }
}
