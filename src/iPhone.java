public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    private String modelo;
    private String sistemaOperacional;
    private boolean musicaReproduzindo;
    private boolean emChamada;
    private String siteAberto;

    public iPhone(String modelo, String sistemaOperacional) {
        this.modelo = modelo;
        this.sistemaOperacional = sistemaOperacional;
        this.musicaReproduzindo = false;
        this.emChamada = false;
        this.siteAberto = null;
    }

    @Override
    public void reproduzirMusica() {
        if (!musicaReproduzindo) {
            System.out.println("Iniciando a reprodução de música.");
            musicaReproduzindo = true;
        } else {
            System.out.println("A música já está sendo reproduzida.");
        }
    }

    @Override
    public void pausarMusica() {
        if (musicaReproduzindo) {
            System.out.println("Pausando a reprodução de música.");
            musicaReproduzindo = false;
        } else {
            System.out.println("A música não está sendo reproduzida.");
        }
    }

    @Override
    public void fazerChamada(String numero) {
        if (!emChamada) {
            System.out.println("Chamando " + numero + "...");
            emChamada = true;
        } else {
            System.out.println("Já está em uma chamada.");
        }
    }

    @Override
    public void receberChamada() {
        if (!emChamada) {
            System.out.println("Recebendo uma chamada...");
            emChamada = true;
        } else {
            System.out.println("Já está em uma chamada.");
        }
    }

    @Override
    public void abrirSite(String site) {
        if (siteAberto == null) {
            System.out.println("Abrindo o navegador e acessando o site: " + site);
            siteAberto = site;
        } else {
            System.out.println("Já existe um site aberto. Feche o site atual para abrir um novo.");
        }
    }

    @Override
    public void fecharNavegador() {
        if (siteAberto != null) {
            System.out.println("Fechando o navegador.");
            siteAberto = null;
        } else {
            System.out.println("Nenhum site aberto para fechar.");
        }
    }
}

