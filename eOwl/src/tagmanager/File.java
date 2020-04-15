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
	* Nom du serveur qui possède le fichier
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
	 *Liste reprenant l'ensemble des étiquettes associées au fichier.  
	 *La clé du Hashmap est le nom de l'étiquette (String), l'élément est l'étiquette (Tag).
	*/
	private HashMap<String, Tag> listTag;
	
	
	/**
	Seul le nom de fichier, le nom du serveur et l'adresse du fichier sont passés en paramètre du constructeur. 
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
	 * <code>setServerName</code> modifie le nom du serveur qui possède le fichier.
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
	 * <code>getServerName</code> renvoie le nom du serveur possédant le fichier.
	 * @return un <code>String</code> qui est le nom du serveur qui possède le fichier.
	*/
	public String getServerName() {
		return null;
	
	}
	
	/** 
	 * <code>getFileAdress</code> renvoie l'adresse du fichier.
	 * @return un <code>String</code> correspondant à l'adresse du fichier.
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
	 * <code>getListTag</code> renvoie la liste des étiquettes associées au fichier.
	 * @return un <code>HashMap<String, Tag></code> qui est la liste des étiquettes associées au fichier.
	 * La clé du Hashmap est le nom de l'étiquette (String), l'élément est l'étiquette (File).
	*/
	public HashMap<String, Tag> getListTag() {
		return null;
	
	}
	
	/** 
	 * <code>addTag</code> ajoute une étiquette à la liste des étiquettes du fichier.
	 * @param newTag
	 * 		Tag, la nouvelle étiquette associée au fichier.
	*/
	public void addTag(Tag newTag) {
	
	}
	
	/** 
	 * <code>removeTag</code> enlève une étiquette de la liste des étiquettes du fichier.
	 * @param delTag
	 * 		Tag, l'étiquette à supprimer de la liste des étiquettes du fichier.
	*/
	public void removeTag(Tag delTag) {
	
	}
	
	/**
	 * <code>update</code> permet de mettre à jour la liste des étiquettes d'un fichier suite à une modification d'étiquette. 
	 * Une modification de nom d'étiquette, l'ajout d'un fichier à une étiquette ou des déplacements d'étiquettes conduisent à mettre à jour cette liste.
	 */ 
	public void update() {
	
	}
	



}
