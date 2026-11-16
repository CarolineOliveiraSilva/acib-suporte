package com.acib.suporte.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class DashboardController {

    private static final List<ChamadoDto> listaChamados = new ArrayList<>();

    static {
        listaChamados.add(new ChamadoDto("#018", "Erro de acesso ao sistema fiscal", "Sistema / Software", "12/11/2026", "Ativo"));
        listaChamados.add(new ChamadoDto("#017", "Dúvida sobre emissão de certificado", "Certificação Digital", "10/11/2026", "Em Andamento"));
        listaChamados.add(new ChamadoDto("#015", "Atualização de cadastro da empresa", "Cadastral", "05/11/2026", "Encerrado"));
        listaChamados.add(new ChamadoDto("#012", "Suporte à rede de internet comercial", "Infraestrutura", "01/11/2026", "Encerrado"));
    }

    @GetMapping("/dashboard")
    public String dashboard(Model model) {
        model.addAttribute("chamados", listaChamados);
        return "dashboard";
    }

    @GetMapping("/meus-chamados")
    public String meusChamados(Model model) {
        model.addAttribute("chamados", listaChamados);
        return "meus-chamados";
    }

    @GetMapping("/novo-chamado")
    public String novoChamado() {
        return "novo-chamado";
    }

    @GetMapping("/base-conhecimento")
    public String baseConhecimento() {
        return "base-conhecimento";
    }

    @GetMapping("/configuracoes")
    public String configuracoes() {
        return "configuracoes";
    }

    @PostMapping("/salvar-chamado")
    public String salvarChamado(@RequestParam String assunto, @RequestParam String categoria, @RequestParam String descricao) {
        String novoId = "#0" + (19 + listaChamados.size());
        // Novo chamado nasce com status "Em Andamento" conforme pedido
        listaChamados.add(0, new ChamadoDto(novoId, assunto, categoria, "16/11/2026", "Em Andamento"));
        return "redirect:/dashboard";
    }

    @PostMapping("/atualizar-status")
    public String atualizarStatus(@RequestParam String id, @RequestParam String status) {
        for (ChamadoDto c : listaChamados) {
            if (c.getId().equals(id)) {
                c.setStatus(status);
                break;
            }
        }
        return "redirect:/meus-chamados";
    }

    public static class ChamadoDto {
        private String id;
        private String assunto;
        private String categoria;
        private String data;
        private String status;

        public ChamadoDto(String id, String assunto, String categoria, String data, String status) {
            this.id = id;
            this.assunto = assunto;
            this.categoria = categoria;
            this.data = data;
            this.status = status;
        }

        public String getId() { return id; }
        public String getAssunto() { return assunto; }
        public String getCategoria() { return categoria; }
        public String getData() { return data; }
        public String getStatus() { return status; }
        public void setStatus(String status) { this.status = status; }
    }
}