package desafio_poo.br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp {
	private String name;
	private String description;
	private final LocalDate initialDate = LocalDate.now();
	private final LocalDate finalDate = initialDate.plusDays(45);
	private Set<Dev> registeredDev = new HashSet<>();
	private Set<Content> contents = new LinkedHashSet<>();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDate getInitialDate() {
		return initialDate;
	}

	public LocalDate getFinalDate() {
		return finalDate;
	}

	public Set<Dev> getRegisteredDev() {
		return registeredDev;
	}

	public void setRegisteredDev(Set<Dev> registeredDev) {
		this.registeredDev = registeredDev;
	}

	public Set<Content> getContents() {
		return contents;
	}

	public void setContents(Set<Content> contents) {
		this.contents = contents;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Bootcamp bootcamp = (Bootcamp) o;
		return Objects.equals(name, bootcamp.name) && Objects.equals(description, bootcamp.description)
				&& Objects.equals(initialDate, bootcamp.initialDate) && Objects.equals(finalDate, bootcamp.finalDate)
				&& Objects.equals(registeredDev, bootcamp.registeredDev) && Objects.equals(contents, bootcamp.contents);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, description, initialDate, finalDate, registeredDev, contents);
	}
}
