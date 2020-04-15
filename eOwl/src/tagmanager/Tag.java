package fr.supaero.eowl.tagmanager;

import java.util.HashMap;
import java.io.Serializable;

import fr.supaero.eowl.tagmanager.File;



/**
	*  <b>Classe Tag</b>
	*  <p>
	*  L'objet de type <code>Tag</code> est une �tiquette qui caract�rise un ou plusieurs fichiers. 
	*  Cette �tiquette peut contenir une liste d'�tiquettes filles, d'�tiquettes parentes et une liste de fichiers associ�s.
	*  Les fichiers ne peuvent �tre trouv�s que gr�ce aux �tiquettes qui les d�finissent. Par cons�quent, chaque fichier poss�dera une liste d'�tiquettes.
	*  Par exemple, le film jamesBond.avi peut etre caract�ris� par les �tiquettes suivantes : <b><i>Film</i></b> / <b><i>Action</i></b> / <b><i>James</i></b>
	*  Les �tiquettes poss�dent un lien de parent� : <b><i>James</i></b> est l'�tiquette fille de <b><i>Action</i></b>, et <b><i>Action</i></b>, celle de <b><i>Film</i></b>
	*  <p>
	*  Chaque fichier est d�fini par l'�tiquette � laquelle il appartient ainsi qu'� toutes les �tiquettes parentes ! 
	*  Par exemple, le fichier <b><u>jamesbond.avi</u></b> appartient � l'�tiquette <b><i>James</i></b>. 
	*  <b><u>jamesbond.avi</u></b> est donc d�fini par <b><i>James</i></b> mais aussi par toutes les �tiquettes parentes, c'est � dire : <b><i>Film</i></b> et <b><i>Action</i></b>.
	*  Il ne faut donc pas que le fichier <b><u>jamesbond.avi</u></b> soit directement li� � <b><i>Film</i></b> ou <b><i>Action</i></b>.
	*  
	*  @author Bocquet Guillaume & Pertat Adrien
	*  @version  1.2 - 14/12/2012
*/

public class Tag implements Serializable, Observer, Observable  {
	/**
	* Nom de l'�tiquette 
	*/
	private String name;
	
	/** 
	 *Nom du serveur
	 *<p>
	 *Chaque �tiquette appartient � un seul serveur. 
	 *Cela permet d'avoir plusieurs �tiquettes, aux noms identiques, mais qui ne sont pas li�es vers les m�mes �tiquettes filles/fichiers 
	 *car elles appartiennent � des serveurs diff�rents.
	*/
	private String serverName;
	
	/**
	 *Liste reprenant l'ensemble des �tiquettes parentes � l'�tiquette. 
	 *La cl� du Hashmap est le nom de l'�tiquette (String), l'�l�ment est l'�tiquette (Tag).
	*/
	private HashMap<String, Tag> listTagsFather;
	
	/**
	 *Liste reprenant l'ensemble des �tiquettes filles de l'�tiquette.  
	 *La cl� du Hashmap est le nom de l'�tiquette (String), l'�l�ment est l'�tiquette (Tag).
	*/
	private HashMap<String, Tag> listTagsSon;
	
	/**
	 *Liste reprensant l'ensemble des fichiers li�s � l'�tiquette.
	 *La cl� du Hashmap est le nom du fichier (String), l'�l�ment est le fichier (File).  
	*/
	private HashMap<String, File> listFiles;
	

	
	/** 
	 *A la cr�ation de l'�tiquette, elle est associ�e � son nom et son serveur parent.
	 *@param tagName 
	 *	String, nom de l'�tiquette.
	 *@param serverName 
	 *	String, adresse du serveur dans lequel est d�fini l'�tiquette.
	*/
	public Tag(String tagName, String serverName) {
	
	}
	
	/** 
	 * <code>getName</code> renvoie le nom de l'�tiquette.
	 * @return un <code>String</code> qui est le nom de l'�tiquette
	*/
	public String getName() {
		return null;
	
	}
	
	/** 
	 * <code>setName</code> modifie le nom de l'�tiquette.
	 * @param newName 
	 * 		String, le nouveau nom de l'�tiquette.
	*/
	public void setName(String newName) {
	
	}
	
	/** 
	 * <code>getServerName</code> renvoie le nom du serveur auquel est associ� l'�tiquette.
	 * @return un <code>String</code> qui est le nom du serveur auquel est associ� l'�tiquette.
	*/
	public String getServerName() {
		return null;
	
	}
	
	/** 
	 * <code>setServerName</code> modifie le nom du serveur auquel est associ� l'�tiquette.
	 * @param newServerName
	 * 		String, le nouveau nom du serveur auquel sera associ� l'�tiquette.
	*/
	public void setServerName(String newServerName) {
	
	}
	
	/** 
	 * <code>addFile</code> ajoute un fichier � la liste des fichiers li�s � l'�tiquette.
	 * @param newFile
	 * 		File, le nouveau fichier � rajouter.
	*/
	public void addFile(File newFile) {
	
	}
	
	/** 
	 * <code>removeFile</code> enl�ve un fichier de la liste des fichiers li�s � l'�tiquette.
	 * @param delFile
	 * 		File, le fichier � retirer de la liste des fichiers associ�s.
	*/
	public void removeFile(File delFile) {
	
	}
	
	/** 
	 * <code>addTagFather</code> ajoute une �tiquette � la liste des �tiquettes <b><i>parentes</i></b> de l'�tiquette.
	 * @param newTagFather
	 * 		Tag, la nouvelle �tiquette parente de l'�tiquette.
	*/
	public void addTagFather(Tag newTagFather) {
	
	}
	
	/** 
	 * <code>removeTagFather</code> enl�ve une �tiquette de la liste des �tiquettes <b><i>parentes</i></b> de l'�tiquette.
	 * @param delTagFather
	 * 		Tag, l'�tiquette � supprimer de la liste des �tiquettes parentes.
	*/
	public void removeTagFather(Tag delTagFather) {
	
	}
	
	/** 
	 * <code>addTagSon</code> ajoute une �tiquette � la liste des �tiquettes <b><i>filles</i></b> de l'�tiquette.
	 * @param newTagSon
	 * 		Tag, la nouvelle �tiquette fille de l'�tiquette.
	*/
	public void addTagSon(Tag newTagSon) {
	
	}
	
	/** 
	 * <code>removeTagSon</code> enl�ve une �tiquette de la liste des �tiquettes <b><i>filles</i></b> de l'�tiquette.
	 * @param delTagSon
	 * 		Tag, l'�tiquette � supprimer de la liste des �tiquettes filles.
	*/
	public void removeTagSon(Tag delTagSon) {
	
	}
	
	/** 
	 * <code>getFileList</code> renvoie la liste des fichiers (de type <code>File</code>) qui sont li�s � cette �tiquette.
	 * Ce sont uniquement les fichiers de cette �tiquette (niveau 0) et non les fichiers des �tiquettes filles (niveau -1, -2, etc).
	 * @return un <code>HashMap<String, File></code> qui est la liste des fichiers dont une des �tiquettes les caract�risant est l'�tiquette consid�r�e.
	 * La cl� du Hashmap est le nom du fichier (String), l'�l�ment est le fichier (File).
	*/
	public HashMap<String, File> getFileList() {
		return null;
	
	}
	
	/** 
	 * <code>getSonList</code> renvoie la liste des �tiquettes filles de l'�tiquette consid�r�e.
	 * @return un <code>HashMap<String, Tag></code> qui est la liste des �tiquettes filles.
	 * La cl� du Hashmap est le nom de l'�tiquette (String), l'�l�ment est l'�tiquette (File).
	*/
	public HashMap<String, Tag> getSonList() {
		return null;
	
	}
	
	/** 
	 * <code>getFatherList</code> renvoie la liste des �tiquettes parentes de l'�tiquette consid�r�e.
	 * @return un <code>HashMap<String, Tag></code> qui est la liste des �tiquettes parentes.
	 * La cl� du Hashmap est le nom de l'�tiquette (String), l'�l�ment est l'�tiquette (File).
	*/
	public HashMap<String, Tag> getFatherList() {
		return null;
	
	}
	
	/** 
	 * <code>isEmpty</code> indique si l'�tiquette est associ�e � des fichiers.
	 * @return un bool�en, <code>True</code> si au moins un fichier est associ� � l'�tiquette, <code>False</code> dans le cas contraire.
	*/
	public Boolean isEmpty() {
		return null;
	
	}
	
	/** 
	 * <code>update</code> permet d'actualiser des �tiquettes suite � des modifications sur une �tiquette.
	 * 
	*/
	public void update(){
		
	}

	
	/** <code>warn</code> permet d'avertir les <code>File</code>,<code>Tag</code> et <code>Tree</code> lors de modifications d'�tiquettes.
	 * Exemple: changement de nom d'une �tiquette. Il faut avertir les �tiquettes parentes et les �tiquettes filles et changer les cl�s de l'�tiquette modifi�e dans les HashMap.
	 * Il faut avertir les fichiers relatifs � cette �tiquette.
	 * Lorsque l'�tiquette all est actualis�e, il faut en avertir l'arbre.
	*/
	public void warn() {
	
	}

	

}


