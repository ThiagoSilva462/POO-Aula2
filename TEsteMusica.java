package view;

import model.Musica;
import model.Playlist;

public class TEsteMusica {

	public static void main(String[] args) {
		
        Musica musica1 = new Musica();
        Musica musica2 = new Musica();
        Musica musica3 = new Musica();
        
        musica1.setNome("Musica 1");
        musica2.setNome("Musica 2");
        musica3.setNome("Musica 3");
        
        musica1.setAutor("Autor 1");
        musica2.setAutor("Autor 2");
        musica3.setAutor("Autor 3");
        
        musica1.setGravadora("Gravadora 1");
        musica2.setGravadora("Gravadora 2");
        musica3.setGravadora("Gravadora 3");

        Playlist playlist = new Playlist();
        playlist.setDono("Dono");
        playlist.adicionarMusica(musica1);
        playlist.adicionarMusica(musica2);
        playlist.adicionarMusica(musica3);

        playlist.tocarMusicaAleatoria();
	}

}
