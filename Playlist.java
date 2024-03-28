package model;

import model.Musica;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Playlist {
	
	private List<Musica> listaDeMusicas = new ArrayList<>();
	private String dono;

	public String getDono() {
		return dono;
	}
	public void setDono(String dono) {
		this.dono = dono;
	}

	public void adicionarMusica(Musica musica) {
		listaDeMusicas.add(musica);
	}
	
	public void tocarMusicaAleatoria() {
		if (listaDeMusicas.isEmpty()) {
			System.out.println("Playlist vazia!");
			return;
		}
		
		Random random = new Random();
		int indiceAleatorio = random.nextInt(listaDeMusicas.size());
        Musica musica = listaDeMusicas.get(indiceAleatorio);
        System.out.println("Tocando música: " + musica.getNome());
	}
	
}
