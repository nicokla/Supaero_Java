package fr.supaero.eowl.tagmanager;

import java.util.HashMap;
import java.io.Serializable;



/**
*  <b>Classe File</b>
*  <p>
*  
*    
*  @author Bocquet Guillaume & Pertat Adrien
*  @version  1.2 - 14/12/2012
*/

public class File implements Serializable, Observer {
	/**
	* Nom du fichier
	*/
	private String fileName;
	/**
	* Nom du serveur qui poss�de le fichier
	*/
	private String serverName;
	/**
	* Taille du fichier
	*/
	private Double size;
	/**
	* Adresse du fichier
	*/
	private String fileAdress;
	/**
	 *Liste reprenant l'ensemble des �tiquettes associ�es au fichier.  
	 *La cl� du Hashmap est le nom de l'�tiquette (String), l'�l�ment est l'�tiquette (Tag).
	*/
	private HashMap<String, Tag> listTag;
	
	
	/**
	Seul le nom de fichier, le nom du serveur et l'adresse du fichier sont pass�s en param�tre du constructeur. 
	Connaissant l'adresse du fichier, le constructeur pourra obtenir la taille de celui-ci. 
	*/
	public File(String fileName, String serverName) {
	
	}
	
	
	
	/** 
	 * <code>setFileName</code> modifie le nom du fichier.
	 * @param fName 
	 * 		String, le nouveau nom du fichier.
	*/
	public void setFileName(String fName) {
	
	}
	
	
	/** 
	 * <code>setServerName</code> modifie le nom du serveur qui poss�de le fichier.
	 * @param sName 
	 * 		String, le nouveau nom du serveur.
	*/
	public void setServerName(String sName) {
	
	}
	
	/** 
	 * <code>setServerName</code> modifie l'adresse du fichier.
	 * @param adress 
	 * 		String, la nouvelle adresse du fichier.
	*/
	public void setFileAdress(String adress) {
	
	}
	
	/** 
	 * <code>setSize</code> modifie la taille du fichier.
	 * @param newSize
	 * 		String, la nouvelle taille du fichier.
	*/
	public void setSize(Double newSize) {
	
	}
	
	/** 
	 * <code>getName</code> renvoie le nom fichiere.
	 * @return un <code>String</code> qui est le nom du fichier.
	*/
	public String getName() {
		return null;
	
	}
	
	/** 
	 * <code>getServerName</code> renvoie le nom du serveur poss�dant le fichier.
	 * @return un <code>String</code> qui est le nom du serveur qui poss�de le fichier.
	*/
	public String getServerName() {
		return null;
	
	}
	
	/** 
	 * <code>getFileAdress</code> renvoie l'adresse du fichier.
	 * @return un <code>String</code> correspondant � l'adresse du fichier.
	*/
	public String getFileAdress() {
		return null;
	
	}
	
	/** 
	 * <code>getSize</code> renvoie la taille du fichier.
	 * @return un <code>Double</code> qui est la taille du fichier.
	*/
	public Double getSize() {
		return null;
	
	}
	
	/** 
	 * <code>getListTag</code> renvoie la liste des �tiquettes associ�es au fichier.
	 * @return un <code>HashMap<String, Tag></code> qui est la liste des �tiquettes associ�es au fichier.
	 * La cl� du Hashmap est le nom de l'�tiquette (String), l'�l�ment est l'�tiquette (File).
	*/
	public HashMap<String, Tag> getListTag() {
		return null;
	
	}
	
	/** 
	 * <code>addTag</code> ajoute une �tiquette � la liste des �tiquettes du fichier.
	 * @param newTag
	 * 		Tag, la nouvelle �tiquette associ�e au fichier.
	*/
	public void addTag(Tag newTag) {
	
	}
	
	/** 
	 * <code>removeTag</code> enl�ve une �tiquette de la liste des �tiquettes du fichier.
	 * @param delTag
	 * 		Tag, l'�tiquette � supprimer de la liste des �tiquettes du fichier.
	*/
	public void removeTag(Tag delTag) {
	
	}
	
	/**
	 * <code>update</code> permet de mettre � jour la liste des �tiquettes d'un fichier suite � une modification d'�tiquette. 
	 * Une modification de nom d'�tiquette, l'ajout d'un fichier � une �tiquette ou des d�placements d'�tiquettes conduisent � mettre � jour cette liste.
	 */ 
	public void update() {
	
	}
	



}
