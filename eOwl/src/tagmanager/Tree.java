package fr.supaero.eowl.tagmanager;

import java.util.Date;
import java.util.HashMap;
import java.io.Serializable;

import fr.supaero.eowl.tagmanager.File;



/**
	*  <b>Classe Tree</b>
	*  <p>
	*  L'arbre <code>Tree</code> reprend l'ensemble des �tiquettes (<code>Tag</code>) et des fichiers associ�s � un serveur particulier.
	*  Ainsi, il existe un arbre pour chaque serveur.
	*  L'arbre est d�fini par sa racine : la premi�re �tiquette, appel�e par d�faut <b><i>All</i></b>. 
	*  Cette �tiquette contient une liste d'�tiquettes filles et de fichiers li�s.
	*  Par cons�quent, toute �tiquette est fille de <b><i>All</i></b>, la racine de l'arbre. De plus, tout fichier est d�fini par l'�tiquette <b><i>All</i></b>.
	*  Attention, la liste de fichier li� � <b><i>All</i></b> contient donc les fichiers qui ne sont li� qu'� la seule �tiquette <b><i>All</i></b> et aucune autre.
	*    
	*  @author Bocquet Guillaume & Pertat Adrien
	*  @version  1.2 - 14/12/2012
*/

public class Tree implements Serializable, Observer {
	/**
	* Nom du serveur pour lequel l'arbre est d�fini. 
	*/
	private String serverName;
	
	/**
	* Etiquette racine de l'arbre, nomm�e <b><i>All</i></b> par convention.
	*/
	private Tag tagRoot;
	
	/**
	* Date de modification de l'arbre
	* <p>
	* Cette date permettra de r�aliser des mises � jours de l'arborescence conserv�e en m�moire pour une utilisation hors ligne.
	*/
	private Date date;
	
	///**
	//* Adresse du r�pertoire o� les fichiers du serveur sont stock�s.
	//*/
	//private String adressServerDepository;
	
	/**
	* A la cr�ation d'un arbre, on lui associe le nom du serveur correspondant ainsi que la date courante (jour,mois,ann�e).
	* Une �tiquette racine nomm�e <b><i>All</i></b> est cr��e puis associ�e � l'arbre.
	*/
	public Tree(String serverName, Date dateCourante) {
	
	}
	
	/** 
	 * <code>getDate</code> renvoie la date de derni�re modification de l'arbre.
	 * @return une <code>Date</code> qui correspond � la date de derni�re modification de l'arbre (jour, mois, ann�e)
	*/
	public Date getDate() {
		return null;
	
	}
	
	/** 
	 * <code>setName</code> modifie la date de derni�re modification de l'arbre
	 * @param newDate 
	 * 		Date, la date de derni�re modification de l'arbre
	*/
	public void setDate(Date newDate) {
	
	}
	
	/** 
	 * <code>getFirstTag</code> renvoie l'�tiquette <b><i>All</i></b>, racine de l'arbre. Cette �tiquette contient toutes les autres �tiquettes gr�ce � sa liste d'�tiquettes filles, qui elles-m�mes poss�dent des �tiquettes filles, etc.
	 * @return l'�tiquette <b><i>All</i></b>, �tiquette racine de l'arbre, de type <code>Tag</code>
	 * 		
	*/
	public Tag getFirstTag() {
		return null;
	
	}
	
	/** 
	 * <code>setFirstTag</code> fixe l'�tiquette racine de l'arbre. Cette �tiquette contient toutes les autres �tiquettes gr�ce � sa liste d'�tiquettes filles, qui elles-m�mes poss�dent des �tiquettes filles, etc.
	 * @param firstTag
	 * 		Tag, l'�tiquette racine de l'arbre
	*/
	public void setFirstTag(Tag firstTag) {
	
	}
	
	/** 
	 * <code>createTag</code> cr�e une �tiquette et l'associe � l'arbre.
	 * <p>
	 * Cette �tiquette sera par d�faut une fille de l'�tiquette racine <b><i>All</i></b>.
	 * L'utilisateur pourra d�placer cette �tiquette, c'est � dire qu'elle sera la fille d'une autre �tiquette que de la racine, gr�ce � la m�thode <u>append(Tag tagSon, Tag tagFather)</u>.
	 * <p>
	 * Le fait de cr�er une �tiquette directement � l'int�rieur d'un arbre permet d'avoir des �tiquettes de m�mes noms mais appartenant � des serveurs (donc des arbres) diff�rents. 
	 * Evidemment, il n'est pas possible de cr�er plusieurs �tiquettes du m�me nom pour un m�me arbre. 
	 * @param newTag 
	 * 		Tag, la nouvelle �tiquette 
	*/
	public void createTag(String newTag) {
	
	}
	
	/** 
	 * <code>deleteTag</code> supprime une �tiquette de l'arbre.
	 * <p>
	 * Cette �tiquette peut �tre situ� � tout endroit de l'arbre. 
	 * La suppression de l'�tiquette se fait donc gr�ce � un parcours des listes de filles des �tiquettes jusqu'� trouver celle d�sir�e.
	 * <p>
	 * La liste des �tiquettes filles de celle qui va �tre supprim� sera rattach�e par d�faut � la m�re de l'�tiquette supprim�e.
	 * Par exemple : soient les �tiquettes suivantes : <b><i>James</i></b> est l'�tiquette fille de <b><i>Action</i></b>, et <b><i>Action</i></b> celle de <b><i>Film</i></b>.
	 * Si on supprime l'�tiquette <b><i>Action</i></b>, <b><i>James</i></b> sera rattach�e automatiquement � <b><i>Film</i></b>.
	 * @param delTag 
	 * 		Tag, l'�tiquette � supprimer
	*/
	public void deleteTag(Tag delTag) {
	
	}
	
	/** 
	 * <code>appendTag</code> lie une �tiquette � une autre �tiquette.
	 * <p>
	 * L'�tiquette consid�r�e devient une �tiquette fille d'une autre �tiquette en �tant rajout�e dans sa liste des �tiquettes filles.
	 * Attention, ce nouveau lien ne supprime pas les pr�c�dents liens existants! Il faudra pour cela utiliser la m�thode <code><u>unappendTag(Tag tagSon, Tag tagFather)</u></code>.
	 * En particulier, comme toute nouvelle �tiquette est li�e par d�faut � l'�tiquette racine, il faudra pr�f�rablement supprimer ce lien lors de la cr�ation d'un nouveau lien.
	 * @param tagSon 
	 * 		Tag, l'�tiquette fille
	 * @param tagFather
	 * 		Tag, l'�tiquette � laquelle l'�tiquette fille va �tre li�e.
	*/
	public void appendTag(Tag tagSon, Tag tagFather) {
	
	}
	
	/** 
	 * <code>unappendTag</code> supprime le lien entre 2 �tiquettes.
	 * <p>
	 * Cette m�thode veille � ce qu'aucune �tiquette ne se trouve sans �tiquette m�re (hormis l'�tiquette racine de l'arbre).
	 * @param tagSon 
	 * 		Tag, l'�tiquette fille
	 * @param tagFather
	 * 		Tag, l'�tiquette � laquelle l'�tiquette fille va �tre retir�e.
	*/
	public void unappendTag(Tag tagSon, Tag tagFather) {
	
	}
	
	/** 
	 * <code>catchTag</code> renvoie l'�tiquette recherch�e.
	 * <p>
	 * Pour pouvoir r�aliser la recherche d'�tiquette dans l'arbre, cette m�thode renvoie l'�tiquette, si elle existe, caract�ris�e par le m�me nom que celui donn� en argument de la m�thode
	 * @param tagName
	 * 		String, le nom de l'�tiquette recherch�e
	 * @return un <code>Tag</code> correspondant � l'�tiquette recherch�e.
	*/
	public Tag catchTag(String tagName) {
		return null;
	
	}
	
	/** 
	 * <code>catchFile</code> renvoie le fichier recherch�
	 * <p>
	 * Cette m�thode renvoie le fichier cherch�, s'il existe, caract�ris� par le m�me nom que celui donn� en argument de la m�thode
	 * @param fileName
	 * 		String, le nom du fichier recherch�
	 * @return un <code>File</code> correspondant au fichier cherch�.
	*/
	public File catchFile(String fileName) {
		return null;
	
	}
	
	/** 
	 * <code>getListFile</code> renvoie la liste des fichiers associ�s � une recherche.
	 * <p>
	 * Le nom pass� en argument de la m�thode doit correspondre au nom d'une �tiquette.
	 * Dans ce cas, la m�thode doit renvoyer la liste de tous les fichiers associ�s � cette �tiquette : les fichiers appartenant directement � cette �tiquette
	 * mais aussi tous les fichiers appartenant aux �tiquettes filles de cette �tiquette.
	 * @param word
	 * 		String, le nom de l'�tiquette recherch�e
	 * @return un <code>HashMap<String, File></code> des fichiers associ�s � l'�tiquette cherch�e.
	 * La cl� du Hashmap est un nom de fichier (String), l'�l�ment est un fichier (File).
	*/
	public HashMap<String, File> getListFile(String word) {
		return null;
	
	}
	
	/** 
	 * <code>getAllFiles</code> renvoie la liste de tous les fichiers d'un arbre.
	 * <p>
	 * Il n'y a pas de nom pass� en argument de la m�thode. Celui-ci est implicite, il s'agit de l'�tiquette All, racine de l'arbre.
	 * La m�thode renvoie la liste de tous les fichiers associ�s � cette �tiquette racine : les fichiers appartenant directement � cette �tiquette racine
	 * mais aussi tous les fichiers appartenant aux �tiquettes filles de cette �tiquette racine.
	 * @return un <code>HashMap<String, File></code> des fichiers appartenant � l'arbre.
	 * La cl� du Hashmap est un nom de fichier (String), l'�l�ment est un fichier (File).
	*/
	public HashMap<String, File> getAllFiles() {
		return null;
	
	}
	
	/** 
	 * <code>getAllTags</code> renvoie la liste de toutes les �tiquettes d'un arbre.
	 * @return un <code>HashMap<String, Tag></code> des �tiquettes appartenant � l'arbre.
	 * La cl� du Hashmap est un nom d'�tiquette (String), l'�l�ment est une �tiquette (File).
	*/
	public HashMap<String, Tag> getAllTags() {
		return null;
	}
	
	/**
	 * <code>isUpToDate</code> renvoie un bool�en qui indique si l'arbre est � jour par rapport � une date donn�e en param�tre.
	 * @return un bool�en, <code>True</code> si la date de derni�re modification de l'arbre est la m�me que celle pass�e en param�tre, <code>False</code> dans le cas contraire.
	*/
	public Boolean isUpToDate(Date date) {
		return null;
	
	}
	
	/**
	 * <code>isWord</code> renvoie un bool�en qui indique si l'arbre poss�de une �tiquette dont le nom correspond au mot cherch�.
	 * @return un bool�en, <code>True</code> si l'arbre poss�de une �tiquette donr le nom correspond au mot cherch�, <code>False</code> dans le cas contraire.
	 */
	public Boolean isWord(String word) {
		return null;
	}
	
	/**
	 * <code>update</code> permet de mettre � jour l'arbre suite � une modification d'�tiquette. 
	 * Si une modification de nom, de position entre �tiquette ou de lien fichier-�tiquette, �tiquette-�tiquette se r�percute sur l'�tiquette racine de l'arbre, alors il faut actualiser l'�tiquette racine de l'arbre.
	 */ 
		public void update() {
	
		
	}





}
