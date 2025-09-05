package entity;

public class Produit {
	private int reference;
	private String libellé;
	private float prix;

	public int getReference() {
		return reference;
	}

	public void setReference(int reference) {
		this.reference = reference;
	}

	public String getLibellé() {
		return libellé;
	}

	public void setLibellé(String libellé) {
		this.libellé = libellé;
	}

	public float getPrix() {
		return prix;
	}

	public void setPrix(float prix) {
		this.prix = prix;
	}

}
