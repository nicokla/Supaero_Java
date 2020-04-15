package fr.supaero.eowl.tagmanager;

import java.util.HashMap;
import java.io.Serializable;

import fr.supaero.eowl.tagmanager.File;



/**
	*  <b>Classe Tag</b>
	*  <p>
	*  L'objet de type <code>Tag</code> est une étiquette qui caractérise un ou plusieurs fichiers. 
	*  Cette étiquette peut contenir une liste d'étiquettes filles, d'étiquettes parentes et une liste de fichiers associés.
	*  Les fichiers ne peuvent être trouvés que grâce aux étiquettes qui les définissent. Par conséquent, chaque fichier possèdera une liste d'étiquettes.
	*  Par exemple, le film jamesBond.avi peut etre caractérisé par les étiquettes suivantes : <b><i>Film</i></b> / <b><i>Action</i></b> / <b><i>James</i></b>
	*  Les étiquettes possèdent un lien de parenté : <b><i>James</i></b> est l'étiquette fille de <b><i>Action</i></b>, et <b><i>Action</i></b>, celle de <b><i>Film</i></b>
	*  <p>
	*  Chaque fichier est défini par l'étiquette à laquelle il appartient ainsi qu'à toutes les étiquettes parentes ! 
	*  Par exemple, le fichier <b><u>jamesbond.avi</u></b> appartient à l'étiquette <b><i>James</i></b>. 
	*  <b><u>jamesbond.avi</u></b> est donc défini par <b><i>James</i></b> mais aussi par toutes les étiquettes parentes, c'est à dire : <b><i>Film</i></b> et <b><i>Action</i></b>.
	*  Il ne faut donc pas que le fichier <b><u>jamesbond.avi</u></b> soit directement lié à <b><i>Film</i></b> ou <b><i>Action</i></b>.
	*  
	*  @author Bocquet Guillaume & Pertat Adrien
	*  @version  1.2 - 14/12/2012
*/

public class Tag implements Serializable, Observer, Observable  {
	/**
	* Nom de l'étiquette 
	*/
	private String name;
	
	/** 
	 *Nom du serveur
	 *<p>
	 *Chaque étiquette appartient à un seul serveur. 
	 *Cela permet d'avoir plusieurs étiquettes, aux noms identiques, mais qui ne sont pas liées vers les mêmes étiquettes filles/fichiers 
	 *car elles appartiennent à des serveurs différents.
	*/
	private String serverName;
	
	/**
	 *Liste reprenant l'ensemble des étiquettes parentes à l'étiquette. 
	 *La clé du Hashmap est le nom de l'étiquette (String), l'élément est l'étiquette (Tag).
	*/
	private HashMap<String, Tag> listTagsFather;
	
	/**
	 *Liste reprenant l'ensemble des étiquettes filles de l'étiquette.  
	 *La clé du Hashmap est le nom de l'étiquette (String), l'élément est l'étiquette (Tag).
	*/
	private HashMap<String, Tag> listTagsSon;
	
	/**
	 *Liste reprensant l'ensemble des fichiers liés à l'étiquette.
	 *La clé du Hashmap est le nom du fichier (String), l'élément est le fichier (File).  
	*/
	private HashMap<String, File> listFiles;
	

	
	/** 
	 *A la création de l'étiquette, elle est associée à son nom et son serveur parent.
	 *@param tagName 
	 *	String, nom de l'étiquette.
	 *@param serverName 
	 *	String, adresse du serveur dans lequel est défini l'étiquette.
	*/
	public Tag(String tagName, String serverName) {
	
	}
	
	/** 
	 * <code>getName</code> renvoie le nom de l'étiquette.
	 * @return un <code>String</code> qui est le nom de l'étiquette
	*/
	public String getName() {
		return null;
	
	}
	
	/** 
	 * <code>setName</code> modifie le nom de l'étiquette.
	 * @param newName 
	 * 		String, le nouveau nom de l'étiquette.
	*/
	public void setName(String newName) {
	
	}
	
	/** 
	 * <code>getServerName</code> renvoie le nom du serveur auquel est associé l'étiquette.
	 * @return un <code>String</code> qui est le nom du serveur auquel est associé l'étiquette.
	*/
	public String getServerName() {
		return null;
	
	}
	
	/** 
	 * <code>setServerName</code> modifie le nom du serveur auquel est associé l'étiquette.
	 * @param newServerName
	 * 		String, le nouveau nom du serveur auquel sera associé l'étiquette.
	*/
	public void setServerName(String newServerName) {
	
	}
	
	/** 
	 * <code>addFile</code> ajoute un fichier à la liste des fichiers liés à l'étiquette.
	 * @param newFile
	 * 		File, le nouveau fichier à rajouter.
	*/
	public void addFile(File newFile) {
	
	}
	
	/** 
	 * <code>removeFile</code> enlève un fichier de la liste des fichiers liés à l'étiquette.
	 * @param delFile
	 * 		File, le fichier à retirer de la liste des fichiers associés.
	*/
	public void removeFile(File delFile) {
	
	}
	
	/** 
	 * <code>addTagFather</code> ajoute une étiquette à la liste des étiquettes <b><i>parentes</i></b> de l'étiquette.
	 * @param newTagFather
	 * 		Tag, la nouvelle étiquette parente de l'étiquette.
	*/
	public void addTagFather(Tag newTagFather) {
	
	}
	
	/** 
	 * <code>removeTagFather</code> enlève une étiquette de la liste des étiquettes <b><i>parentes</i></b> de l'étiquette.
	 * @param delTagFather
	 * 		Tag, l'étiquette à supprimer de la liste des étiquettes parentes.
	*/
	public void removeTagFather(Tag delTagFather) {
	
	}
	
	/** 
	 * <code>addTagSon</code> ajoute une étiquette à la liste des étiquettes <b><i>filles</i></b> de l'étiquette.
	 * @param newTagSon
	 * 		Tag, la nouvelle étiquette fille de l'étiquette.
	*/
	public void addTagSon(Tag newTagSon) {
	
	}
	
	/** 
	 * <code>removeTagSon</code> enlève une étiquette de la liste des étiquettes <b><i>filles</i></b> de l'étiquette.
	 * @param delTagSon
	 * 		Tag, l'étiquette à supprimer de la liste des étiquettes filles.
	*/
	public void removeTagSon(Tag delTagSon) {
	
	}
	
	/** 
	 * <code>getFileList</code> renvoie la liste des fichiers (de type <code>File</code>) qui sont liés à cette étiquette.
	 * Ce sont uniquement les fichiers de cette étiquette (niveau 0) et non les fichiers des étiquettes filles (niveau -1, -2, etc).
	 * @return un <code>HashMap<String, File></code> qui est la liste des fichiers dont une des étiquettes les caractérisant est l'étiquette considérée.
	 * La clé du Hashmap est le nom du fichier (String), l'élément est le fichier (File).
	*/
	public HashMap<String, File> getFileList() {
		return null;
	
	}
	
	/** 
	 * <code>getSonList</code> renvoie la liste des étiquettes filles de l'étiquette considérée.
	 * @return un <code>HashMap<String, Tag></code> qui est la liste des étiquettes filles.
	 * La clé du Hashmap est le nom de l'étiquette (String), l'élément est l'étiquette (File).
	*/
	public HashMap<String, Tag> getSonList() {
		return null;
	
	}
	
	/** 
	 * <code>getFatherList</code> renvoie la liste des étiquettes parentes de l'étiquette considérée.
	 * @return un <code>HashMap<String, Tag></code> qui est la liste des étiquettes parentes.
	 * La clé du Hashmap est le nom de l'étiquette (String), l'élément est l'étiquette (File).
	*/
	public HashMap<String, Tag> getFatherList() {
		return null;
	
	}
	
	/** 
	 * <code>isEmpty</code> indique si l'étiquette est associée à des fichiers.
	 * @return un booléen, <code>True</code> si au moins un fichier est associé à l'étiquette, <code>False</code> dans le cas contraire.
	*/
	public Boolean isEmpty() {
		return null;
	
	}
	
	/** 
	 * <code>update</code> permet d'actualiser des étiquettes suite à des modifications sur une étiquette.
	 * 
	*/
	public void update(){
		
	}

	
	/** <code>warn</code> permet d'avertir les <code>File</code>,<code>Tag</code> et <code>Tree</code> lors de modifications d'étiquettes.
	 * Exemple: changement de nom d'une étiquette. Il faut avertir les étiquettes parentes et les étiquettes filles et changer les clés de l'étiquette modifiée dans les HashMap.
	 * Il faut avertir les fichiers relatifs à cette étiquette.
	 * Lorsque l'étiquette all est actualisée, il faut en avertir l'arbre.
	*/
	public void warn() {
	
	}

	

}


