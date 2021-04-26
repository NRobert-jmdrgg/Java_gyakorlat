package gyak1;

import java.time.LocalDate;

public class Card {
	private String tulajdonosNeve;
	private int egyenleg;
	private LocalDate ervenyesseg;
	private Bank bank;
	
	public enum Bank {OTP, KANDH, ERSTE, CIB}

	public Card(String tulajdonosNeve, int egyenleg, LocalDate ervenyesseg, Bank bank) {
		super();
		this.tulajdonosNeve = tulajdonosNeve;
		this.egyenleg = egyenleg;
		this.ervenyesseg = ervenyesseg;
		this.bank = bank;
	}

	public String getTulajdonosNeve() {
		return tulajdonosNeve;
	}

	public int getEgyenleg() {
		return egyenleg;
	}

	public LocalDate getErvenyesseg() {
		return ervenyesseg;
	}

	public Bank getBank() {
		return bank;
	}
	
	public boolean penzfelvet(int penz) {
		if (ervenyesseg.isBefore(LocalDate.now())) return false;
		
		if (egyenleg - penz >= 0) {
			egyenleg -= penz;
			return true;
		} else {
			return false;
		}
	}

	@Override
	public String toString() {
		return "Card [tulajdonosNeve=" + tulajdonosNeve + ", egyenleg=" + egyenleg + ", ervenyesseg=" + ervenyesseg
				+ ", bank=" + bank + "]";
	}
	
	
}
