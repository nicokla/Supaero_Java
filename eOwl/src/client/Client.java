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
	/** Permet de communiquer avec les serveurs pour t�l�charger des fichiers, envoyer des requetes, etc.*/
	private java.net.Socket socket;
	
	/** permet de connaitre son nom, les serveurs connus, etc. qui sont stock�s dans la classe User.*/
	private User user;
	
	/** L'endroit dans l'ordinateur o� sont stock�s les fichiers t�l�charg�s par le client. */
    private String downloadDirectory; /** */
    
    /** Permet de t�l�charger des fichiers ou bien des objets envoy�s par le serveur.
     * On le relie au socket avec sock.getInputStream().*/
	public java.io.InputStream inputStream;
	
	/** Permet de cr�er des objets � partir des octets qu'on nous envoie via le socket. */
	public ObjectOutputStream objectOutputStream;
	
	/**Permet de cr�er des fichiers � partir des octets qu'on nous envoie via le socket. */
	public FileOutputStream fileOutputStream;
	
	/** D�signe le serveur sur lequel on va se connecter la prochaine fois qu'on appelera la
	 * fonction connectToTargetedServer.*/
	public java.net.InetAddress targetedServer;
	
	/** Permet d'envoyer des requ�tes au serveur.*/
	public java.io.OutputStream outputStream;
	
	/** Fonction haut niveau permettant d'obtenir la r�ponse du serveur � une requete (par exemple une liste d'
	 * objets de type File en r�ponse � une requete par mot cl�) */
	public Results getResultOfRequest(Request req) {
		return null;
	}
	
	/**Permet de modifier le r�pertoire o� seront stock�s les fichiers t�l�charg�s */
	public void changeDownloadDirectory(String newPath) {
	
	}
	
	/** permet de t�l�charger sur le serveur auquel on est connect� les fichiers demand�s*/
	public void downloadListOfFiles(ArrayList<File> list) {
	
	}
	
	/** permet de t�l�charger l'arbre des �tiquettes (le tree des tags en anglais) du serveur auquel on est connect�. */
	public Tree getTreeOfTheServerInTagManager() {
		return null;
	}
	
	/** permet de se connecter au serveur cibl� par l'attribut "targeted server". */
	public void connectToTargetedServer() {
	
	}
	
	/** permet de cibler un serveur. */
	public void setTargetedServer(InetAddress ipAdr) {
	
	}
	
	/** permet de t�l�charger un fichier.  */
	public void downloadSingleFile(File f) {
	
	}
}
