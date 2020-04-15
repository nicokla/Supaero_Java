package fr.supaero.eowl.tagmanager;

import java.util.Date;
import java.util.HashMap;
import java.io.Serializable;

import fr.supaero.eowl.tagmanager.File;



/**
	*  <b>Classe Tree</b>
	*  <p>
	*  L'arbre <code>Tree</code> reprend l'ensemble des étiquettes (<code>Tag</code>) et des fichiers associés à un serveur particulier.
	*  Ainsi, il existe un arbre pour chaque serveur.
	*  L'arbre est défini par sa racine : la première étiquette, appelée par défaut <b><i>All</i></b>. 
	*  Cette étiquette contient une liste d'étiquettes filles et de fichiers liés.
	*  Par conséquent, toute étiquette est fille de <b><i>All</i></b>, la racine de l'arbre. De plus, tout fichier est défini par l'étiquette <b><i>All</i></b>.
	*  Attention, la liste de fichier lié à <b><i>All</i></b> contient donc les fichiers qui ne sont lié qu'à la seule étiquette <b><i>All</i></b> et aucune autre.
	*    
	*  @author Bocquet Guillaume & Pertat Adrien
	*  @version  1.2 - 14/12/2012
*/

public class Tree implements Serializable, Observer {
	/**
	* Nom du serveur pour lequel l'arbre est défini. 
	*/
	private String serverName;
	
	/**
	* Etiquette racine de l'arbre, nommée <b><i>All</i></b> par convention.
	*/
	private Tag tagRoot;
	
	/**
	* Date de modification de l'arbre
	* <p>
	* Cette date permettra de réaliser des mises à jours de l'arborescence conservée en mémoire pour une utilisation hors ligne.
	*/
	private Date date;
	
	///**
	//* Adresse du répertoire où les fichiers du serveur sont stockés.
	//*/
	//private String adressServerDepository;
	
	/**
	* A la création d'un arbre, on lui associe le nom du serveur correspondant ainsi que la date courante (jour,mois,année).
	* Une étiquette racine nommée <b><i>All</i></b> est créée puis associée à l'arbre.
	*/
	public Tree(String serverName, Date dateCourante) {
	
	}
	
	/** 
	 * <code>getDate</code> renvoie la date de dernière modification de l'arbre.
	 * @return une <code>Date</code> qui correspond à la date de dernière modification de l'arbre (jour, mois, année)
	*/
	public Date getDate() {
		return null;
	
	}
	
	/** 
	 * <code>setName</code> modifie la date de dernière modification de l'arbre
	 * @param newDate 
	 * 		Date, la date de dernière modification de l'arbre
	*/
	public void setDate(Date newDate) {
	
	}
	
	/** 
	 * <code>getFirstTag</code> renvoie l'étiquette <b><i>All</i></b>, racine de l'arbre. Cette étiquette contient toutes les autres étiquettes grâce à sa liste d'étiquettes filles, qui elles-mêmes possèdent des étiquettes filles, etc.
	 * @return l'étiquette <b><i>All</i></b>, étiquette racine de l'arbre, de type <code>Tag</code>
	 * 		
	*/
	public Tag getFirstTag() {
		return null;
	
	}
	
	/** 
	 * <code>setFirstTag</code> fixe l'étiquette racine de l'arbre. Cette étiquette contient toutes les autres étiquettes grâce à sa liste d'étiquettes filles, qui elles-mêmes possèdent des étiquettes filles, etc.
	 * @param firstTag
	 * 		Tag, l'étiquette racine de l'arbre
	*/
	public void setFirstTag(Tag firstTag) {
	
	}
	
	/** 
	 * <code>createTag</code> crée une étiquette et l'associe à l'arbre.
	 * <p>
	 * Cette étiquette sera par défaut une fille de l'étiquette racine <b><i>All</i></b>.
	 * L'utilisateur pourra déplacer cette étiquette, c'est à dire qu'elle sera la fille d'une autre étiquette que de la racine, grâce à la méthode <u>append(Tag tagSon, Tag tagFather)</u>.
	 * <p>
	 * Le fait de créer une étiquette directement à l'intérieur d'un arbre permet d'avoir des étiquettes de mêmes noms mais appartenant à des serveurs (donc des arbres) différents. 
	 * Evidemment, il n'est pas possible de créer plusieurs étiquettes du même nom pour un même arbre. 
	 * @param newTag 
	 * 		Tag, la nouvelle étiquette 
	*/
	public void createTag(String newTag) {
	
	}
	
	/** 
	 * <code>deleteTag</code> supprime une étiquette de l'arbre.
	 * <p>
	 * Cette étiquette peut être situé à tout endroit de l'arbre. 
	 * La suppression de l'étiquette se fait donc grâce à un parcours des listes de filles des étiquettes jusqu'à trouver celle désirée.
	 * <p>
	 * La liste des étiquettes filles de celle qui va être supprimé sera rattachée par défaut à la mère de l'étiquette supprimée.
	 * Par exemple : soient les étiquettes suivantes : <b><i>James</i></b> est l'étiquette fille de <b><i>Action</i></b>, et <b><i>Action</i></b> celle de <b><i>Film</i></b>.
	 * Si on supprime l'étiquette <b><i>Action</i></b>, <b><i>James</i></b> sera rattachée automatiquement à <b><i>Film</i></b>.
	 * @param delTag 
	 * 		Tag, l'étiquette à supprimer
	*/
	public void deleteTag(Tag delTag) {
	
	}
	
	/** 
	 * <code>appendTag</code> lie une étiquette à une autre étiquette.
	 * <p>
	 * L'étiquette considérée devient une étiquette fille d'une autre étiquette en étant rajoutée dans sa liste des étiquettes filles.
	 * Attention, ce nouveau lien ne supprime pas les précédents liens existants! Il faudra pour cela utiliser la méthode <code><u>unappendTag(Tag tagSon, Tag tagFather)</u></code>.
	 * En particulier, comme toute nouvelle étiquette est liée par défaut à l'étiquette racine, il faudra préférablement supprimer ce lien lors de la création d'un nouveau lien.
	 * @param tagSon 
	 * 		Tag, l'étiquette fille
	 * @param tagFather
	 * 		Tag, l'étiquette à laquelle l'étiquette fille va être liée.
	*/
	public void appendTag(Tag tagSon, Tag tagFather) {
	
	}
	
	/** 
	 * <code>unappendTag</code> supprime le lien entre 2 étiquettes.
	 * <p>
	 * Cette méthode veille à ce qu'aucune étiquette ne se trouve sans étiquette mère (hormis l'étiquette racine de l'arbre).
	 * @param tagSon 
	 * 		Tag, l'étiquette fille
	 * @param tagFather
	 * 		Tag, l'étiquette à laquelle l'étiquette fille va être retirée.
	*/
	public void unappendTag(Tag tagSon, Tag tagFather) {
	
	}
	
	/** 
	 * <code>catchTag</code> renvoie l'étiquette recherchée.
	 * <p>
	 * Pour pouvoir réaliser la recherche d'étiquette dans l'arbre, cette méthode renvoie l'étiquette, si elle existe, caractérisée par le même nom que celui donné en argument de la méthode
	 * @param tagName
	 * 		String, le nom de l'étiquette recherchée
	 * @return un <code>Tag</code> correspondant à l'étiquette recherchée.
	*/
	public Tag catchTag(String tagName) {
		return null;
	
	}
	
	/** 
	 * <code>catchFile</code> renvoie le fichier recherché
	 * <p>
	 * Cette méthode renvoie le fichier cherché, s'il existe, caractérisé par le même nom que celui donné en argument de la méthode
	 * @param fileName
	 * 		String, le nom du fichier recherché
	 * @return un <code>File</code> correspondant au fichier cherché.
	*/
	public File catchFile(String fileName) {
		return null;
	
	}
	
	/** 
	 * <code>getListFile</code> renvoie la liste des fichiers associés à une recherche.
	 * <p>
	 * Le nom passé en argument de la méthode doit correspondre au nom d'une étiquette.
	 * Dans ce cas, la méthode doit renvoyer la liste de tous les fichiers associés à cette étiquette : les fichiers appartenant directement à cette étiquette
	 * mais aussi tous les fichiers appartenant aux étiquettes filles de cette étiquette.
	 * @param word
	 * 		String, le nom de l'étiquette recherchée
	 * @return un <code>HashMap<String, File></code> des fichiers associés à l'étiquette cherchée.
	 * La clé du Hashmap est un nom de fichier (String), l'élément est un fichier (File).
	*/
	public HashMap<String, File> getListFile(String word) {
		return null;
	
	}
	
	/** 
	 * <code>getAllFiles</code> renvoie la liste de tous les fichiers d'un arbre.
	 * <p>
	 * Il n'y a pas de nom passé en argument de la méthode. Celui-ci est implicite, il s'agit de l'étiquette All, racine de l'arbre.
	 * La méthode renvoie la liste de tous les fichiers associés à cette étiquette racine : les fichiers appartenant directement à cette étiquette racine
	 * mais aussi tous les fichiers appartenant aux étiquettes filles de cette étiquette racine.
	 * @return un <code>HashMap<String, File></code> des fichiers appartenant à l'arbre.
	 * La clé du Hashmap est un nom de fichier (String), l'élément est un fichier (File).
	*/
	public HashMap<String, File> getAllFiles() {
		return null;
	
	}
	
	/** 
	 * <code>getAllTags</code> renvoie la liste de toutes les étiquettes d'un arbre.
	 * @return un <code>HashMap<String, Tag></code> des étiquettes appartenant à l'arbre.
	 * La clé du Hashmap est un nom d'étiquette (String), l'élément est une étiquette (File).
	*/
	public HashMap<String, Tag> getAllTags() {
		return null;
	}
	
	/**
	 * <code>isUpToDate</code> renvoie un booléen qui indique si l'arbre est à jour par rapport à une date donnée en paramètre.
	 * @return un booléen, <code>True</code> si la date de dernière modification de l'arbre est la même que celle passée en paramètre, <code>False</code> dans le cas contraire.
	*/
	public Boolean isUpToDate(Date date) {
		return null;
	
	}
	
	/**
	 * <code>isWord</code> renvoie un booléen qui indique si l'arbre possède une étiquette dont le nom correspond au mot cherché.
	 * @return un booléen, <code>True</code> si l'arbre possède une étiquette donr le nom correspond au mot cherché, <code>False</code> dans le cas contraire.
	 */
	public Boolean isWord(String word) {
		return null;
	}
	
	/**
	 * <code>update</code> permet de mettre à jour l'arbre suite à une modification d'étiquette. 
	 * Si une modification de nom, de position entre étiquette ou de lien fichier-étiquette, étiquette-étiquette se répercute sur l'étiquette racine de l'arbre, alors il faut actualiser l'étiquette racine de l'arbre.
	 */ 
		public void update() {
	
		
	}





}
