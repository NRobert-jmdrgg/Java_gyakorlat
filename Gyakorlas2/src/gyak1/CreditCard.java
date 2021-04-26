package gyak1;

import java.time.LocalDate;

public class CreditCard extends Card {
	private int hitelkeret;

	public CreditCard(String tulajdonosNeve, int egyenleg, LocalDate ervenyesseg, Bank bank) {
		this(tulajdonosNeve, egyenleg, ervenyesseg, bank, 100000);
	}
	
	public CreditCard(String tulajdonosNeve, int egyenleg, LocalDate ervenyesseg, Bank bank, int hitelkeret) {
		super(tulajdonosNeve, egyenleg, ervenyesseg, bank);
		this.hitelkeret = hitelkeret;
	}
	
	
	@Override
	public boolean penzfelvet(int penz) {
		if (super.getErvenyesseg().isBefore(LocalDate.now())) return false;
		if (super.penzfelvet(penz) == false) {
			if (hitelkeret - penz >= 0) {
				hitelkeret -= penz;
				return true;
			} else {
				return false;
			}
		}
		return true;
	}

	@Override
	public String toString() {
		return "CreditCard [toString()=" + super.toString() + ", hitelkeret=" + hitelkeret + "]";
	}

	public int getHitelkeret() {
		return hitelkeret;
	}

	public void setHitelkeret(int hitelkeret) {
		this.hitelkeret = hitelkeret;
	}
	
	
	
	
}
