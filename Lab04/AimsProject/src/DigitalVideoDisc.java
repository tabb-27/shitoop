
public class DigitalVideoDisc {
	private String title;
	private String category;
	private String director;
	private int length;
	private float cost;
	private int id;
	
	private static int nbDigitalVideoDiscs;
	
	public DigitalVideoDisc(String title) {
		this(title, null, null, 0, 0.0f);
	}
	
	
	public DigitalVideoDisc(String title, String category, String director, float cost) {
		this(title,category,director,0,cost);
	}

	public DigitalVideoDisc(String title, String category, float cost) {
		this(title,category,null,0,cost);
	}
	
	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		
		nbDigitalVideoDiscs++;
		this.id = nbDigitalVideoDiscs;
		this.title = title;
		this.category = category;
		this.director = director;
		this.length = length;
		this.cost = cost;
	}

	

	public String getTitle() {
		return title;
	}
	public String getCategory() {
		return category;
	}
	public String getDirector() {
		return director;
	}
	public int getLength() {
		return length;
	}
	public float getCost() {
		return cost;
	}
	
	public int getId() {
		return id;
	}
	
	//for test
	public void setTitle(String title) {
		this.title = title;
	}

	
	@Override
	public String toString() {
		return title + " - " + cost;
	}

	
}
