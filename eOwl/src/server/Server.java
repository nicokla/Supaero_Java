package fr.supaero.eowl.server;
//
//
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : Untitled
//  @ File Name : Server.java
//  @ Date : 15/12/2012
//  @ Author : 
//
//

import java.io.*;
import java.util.*;
import fr.supaero.eowl.request.Request;
import fr.supaero.eowl.results.Results;
import fr.supaero.eowl.tagmanager.File;
import fr.supaero.eowl.user.User;

/**Server g�re le partage des fichiers de eOwl */
public class Server {
	enum State { Offline, OnlineAndFree, OnlineAndOccupied };
	
	/**<code>uploadDirectory</code> est le dossier de partage du serveur. */
	private String uploadDirectory;
	
	/**<code>serverSocket</code> s'utilise permet de se connecter au r�seau () */
	public java.net.ServerSocket serverSocket;
	
	/** <code>socket</code> permet d'envoyer des fichiers au client (socket = serverSocket.accept(); )  */
	public java.net.Socket socket;
	
	/**<code>state</code> dit si le serveur est occup� avec un autre client ou pas*/
	public State state;
	
	/**<code>user</code> permet de connaitre le poss�sseur du serveur (et de voir son nom, d'acc�der � son arbre d'�tiquettes, etc.) */
	public User user;
	
    /**<code>ipAdress</code> est l'adresse IP du serveur necessaire a l'interaction avec les clients.
     */
	public java.net.InetAddress ipAdress;
	
	/**<code>outputStream</code> permet d'�crire des informations dans le socket (envoyer des choses,
	 *  comme des fichiers par exemple).*/
	public java.io.OutputStream outputStream;
	
	/**<code>fileInputStream</code> permet de d'envoyer un fichier au client.*/
	public FileInputStream fileInputStream;
	
	/**<code>objectInputStream</code> permet d'envoyer des objets au client.*/
	public ObjectInputStream objectInputStream;
	
	/**<code>inputStream</code> permet de lire les requetes du client.*/
	public java.io.InputStream inputStream;

	/**<code>changeUploadDirectory</code> permet de changer le r�pertoire de partage */
	public void changeUploadDirectory(String newDirectory) {
	
	}
	
	/**<code>sendResults</code> permet d'envoyer au client les r�sultats de sa Request (la plupart du temps une liste de fichiers) */
	public void sendResults(Results res) {
	
	}
	
	/**<code>processRequest</code> permet par exemple de trouver tous les fichiers correspondants � la requete
	 * mais peut aussi trouver d'autres informations en fonction du type de requ�te*/
	public Results processRequest(Request req) {
		return null;
	}
	
	/**<code>connectToNetwork</code> permet de se connecter au r�seau via l'adresse IP du serveur */
	public void connectToNetwork() {
	
	}
	
	/**<code>sendFile</code> permet d'envoyer un fichier au client connect� */
	public void sendFile(File file) {
	
	}
	
	/**<code>deconnectFromNetwork</code> permet de se d�connecter du r�seau */
	public void deconnectFromNetwork() {
	
	}
	
	/**<code>sendListOfFiles</code> permet d'envoyer une liste de fichiers au client*/
	public void sendListOfFiles( ArrayList<File> list) {
	
	}
	
	/** <code>browseDirectory </code> permet de mettre � jour l'arbre en enlevant les fichiers qui ne sont plus dans le dossier
	 * de partage, ainsi que d'associer � l'�tiquette racine les nouveaux fichiers qui n'�taient pas l� avant */
	public ArrayList<String> browseDirectory() {
	return null;
	}
}