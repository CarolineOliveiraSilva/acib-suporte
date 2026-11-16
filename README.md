# ACIB Suporte — Portal de Atendimento e Gestão (MVP)

> Portal de suporte técnico e administrativo desenvolvido para a **Associação Comercial e Industrial de Bambuí (ACIB)**. Este projeto faz parte de um MVP (Minimum Viable Product) focado em oferecer uma interface profissional, fluxo de autenticação, gestão de chamados e base de conhecimento com zero custo de infraestrutura.

---

##  Acesso em Produção (Live Demo)
Pode aceder à aplicação em funcionamento na nuvem (hospedada no Render) através do link abaixo:
* **[Aceder ao ACIB Suporte (Dashboard)](https://acib-suporte.onrender.com)**

---

## Tecnologias Utilizadas

O projeto foi construído utilizando tecnologias modernas do ecossistema Java e Web:
* **Java 17**
* **Spring Boot 3.4.1** (Arquitetura MVC e REST APIs)
* **Thymeleaf** (Motor de templates para renderização dinâmica de views)
* **H2 Database** (Base de dados embutida com persistência em ficheiro para funcionamento gratuito na nuvem)
* **Docker & Maven** (Containerização e empacotamento otimizado)
* **Render** (Plataforma de hospedagem Cloud / PaaS)
* **CSS3 Customizado** (Layout responsivo com barra lateral fixa e Flexbox)

---

##  Principais Funcionalidades

1. **Autenticação Segura:** Ecrã de login integrado com credenciais predefinidas para testes rápidos.
2. **Painel Geral (Dashboard):** Visão geral com cartões de estatísticas (chamados ativos, em andamento e encerrados) e tabela de histórico recente.
3. **Gestão de Chamados:** Listagem de chamados em curso ("Meus Chamados") e formulário para abertura de novos incidentes ("Novo Chamado").
4. **Base de Conhecimento:** Manuais técnicos, guias práticos e resoluções de erros fiscais comuns (como integração com SEFAZ e certificados digitais).
5. **Interface Responsiva e Acessível:** Menu lateral estruturado em topo e rodapé fixo com botão de encerramento de sessão destacado.

---

## Acesso para Testes (Credenciais)

Para testar a aplicação diretamente no ecrã de login, utilize as seguintes credenciais:
* **E-mail:** `suporte@acib.com`
* **Senha:** `123456`

---

##  Rotas e Endpoints da Aplicação

| Rota / Caminho | Descrição |
| :--- | :--- |
| `/login` | Página de autenticação do sistema |
| `/dashboard` | Painel de controle principal (Estatísticas e últimos chamados) |
| `/meus-chamados` | Listagem completa de chamados do associado |
| `/novo-chamado` | Formulário para abertura de novo ticket de suporte |
| `/base-conhecimento` | Manuais, tutoriais e guias técnicos para associados |
| `/configuracoes` | Parâmetros da conta e preferências do sistema |
| `/h2-console` | Consola de administração da base de dados H2 (ambiente de desenvolvimento) |

---

##  Como Executar o Projeto Localmente

### Pré-requisitos
* Java JDK 17 instalado
* Maven instalado (ou utilizar o Maven Wrapper incluído)

### Passos para Executar:
1. Clona o repositório:
   ```bash
   git clone https://github.com/CarolineOliveiraSilva/acib-suporte.git
   ```
2. Entra na pasta do projeto:
   ```bash
   cd acib-suporte
   ```
3. Executa a aplicação com o Maven:
   ```bash
   mvn spring-boot:run
   ```
4. Acede no navegador: `http://localhost:8080`

---

## 🐳 Execução via Docker

Para compilar e executar o projeto utilizando contentores Docker:
```bash
docker build -t acib-suporte .
docker run -p 8080:8080 acib-suporte
```
