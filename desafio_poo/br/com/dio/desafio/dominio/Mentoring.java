package desafio_poo.br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoring extends Content {

	private LocalDate date;

	@Override
	public double calcXP() {
		return XP_PADRAO + 20d;
	}

	public Mentoring() {
	}

	public LocalDate getDate() {
		return date;
	}

	public void setData(LocalDate date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Mentoria{" + "titulo='" + getTitle() + '\'' + ", descricao='" + getDescription() + '\'' + ", data="
				+ date + '}';
	}
}
