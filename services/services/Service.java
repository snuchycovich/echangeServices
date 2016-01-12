package services;


/**
 * 
 * @author Julien Foucault- Universit&eacute; de Caen Basse-Normandie, France
 * @author Emiliano Castillo - Universit&eacute; de Caen Basse-Normandie, France
 * @since Novembre 2015
 */
public class Service {
	
	/** The Service's id */
	protected int id;
	
	/** The Service's title */ 
	protected String title;
	
	
	/**
	 * Builds a new service.
	 * @param id The service's id
	 * @param title The service's title
	 */
	public Service(String title)
	{
		this.title = title;
	}
	
	/**
	 * Return the service's id
	 * @return the service's id
	 */
	public int getId() {
		return id;
	}
	/**
	 *  Return the service's title
	 * @return The service's title
	 */
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	


	@Override
	public String toString() {
		return "Service [id=" + id + ", title=" + title+"]";
	}

	
	

}
