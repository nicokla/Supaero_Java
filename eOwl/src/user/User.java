package fr.supaero.eowl.user;

import java.net.*;
import java.util.*;

import fr.supaero.eowl.client.Client;
import fr.supaero.eowl.server.Server;
/** La classe User permet d'avoir acc�s � la fois � un serveur et � un client */
public class User {
	public User (String name_){}
	/** Nom de l'utilisateur */
	public String name;
	
	/** Serveur de l'utilisateur (permet de partager des fichiers) */
	public Server server;
	
	/** Client de l'utilisateur (permet de t�l�charger des fichiers)*/
	public Client client;
	
	/** Serveurs connus et leurs noms */
	public HashMap<InetAddress, String> knownServers;
	
	/** Fonctions permettant de rajouter un serveur dans la liste des serveurs connus.
	 * Le nom r�el du serveur sera mis par la suite lors de la connexion.  */
	public void addKnownServer( InetAddress ip, String name) {
	
	}
	
	/** permet d'enlever un serveur de la liste des serveurs connus*/
	public void removeKnownServer(InetAddress ip) {
		
	}
	
	/** Permet d'acc�der � la liste des serveurs connus depuis le client ou le serveur.*/
	public HashMap<String, java.net.InetAddress > getKnownServers() {
		return null;
	}
}
