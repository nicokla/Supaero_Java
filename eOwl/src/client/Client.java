package fr.supaero.eowl.client;

import java.net.*;
import java.io.*;
import java.util.*;
import fr.supaero.eowl.request.Request;
import fr.supaero.eowl.results.Results;
import fr.supaero.eowl.tagmanager.File;
import fr.supaero.eowl.tagmanager.Tree;
import fr.supaero.eowl.user.User;


/** */
public class Client {
	/** Permet de communiquer avec les serveurs pour télécharger des fichiers, envoyer des requetes, etc.*/
	private java.net.Socket socket;
	
	/** permet de connaitre son nom, les serveurs connus, etc. qui sont stockés dans la classe User.*/
	private User user;
	
	/** L'endroit dans l'ordinateur où sont stockés les fichiers téléchargés par le client. */
    private String downloadDirectory; /** */
    
    /** Permet de télécharger des fichiers ou bien des objets envoyés par le serveur.
     * On le relie au socket avec sock.getInputStream().*/
	public java.io.InputStream inputStream;
	
	/** Permet de créer des objets à partir des octets qu'on nous envoie via le socket. */
	public ObjectOutputStream objectOutputStream;
	
	/**Permet de créer des fichiers à partir des octets qu'on nous envoie via le socket. */
	public FileOutputStream fileOutputStream;
	
	/** Désigne le serveur sur lequel on va se connecter la prochaine fois qu'on appelera la
	 * fonction connectToTargetedServer.*/
	public java.net.InetAddress targetedServer;
	
	/** Permet d'envoyer des requêtes au serveur.*/
	public java.io.OutputStream outputStream;
	
	/** Fonction haut niveau permettant d'obtenir la réponse du serveur à une requete (par exemple une liste d'
	 * objets de type File en réponse à une requete par mot clé) */
	public Results getResultOfRequest(Request req) {
		return null;
	}
	
	/**Permet de modifier le répertoire où seront stockés les fichiers téléchargés */
	public void changeDownloadDirectory(String newPath) {
	
	}
	
	/** permet de télécharger sur le serveur auquel on est connecté les fichiers demandés*/
	public void downloadListOfFiles(ArrayList<File> list) {
	
	}
	
	/** permet de télécharger l'arbre des étiquettes (le tree des tags en anglais) du serveur auquel on est connecté. */
	public Tree getTreeOfTheServerInTagManager() {
		return null;
	}
	
	/** permet de se connecter au serveur ciblé par l'attribut "targeted server". */
	public void connectToTargetedServer() {
	
	}
	
	/** permet de cibler un serveur. */
	public void setTargetedServer(InetAddress ipAdr) {
	
	}
	
	/** permet de télécharger un fichier.  */
	public void downloadSingleFile(File f) {
	
	}
}
