package desafio_poo.br.com.dio.desafio.dominio;

import java.util.*;

public class Dev {
	private String name;
	private Set<Content> contentSubscribers = new LinkedHashSet<>();
	private Set<Content> contentsCompleted = new LinkedHashSet<>();

	public void bootcampRegister(Bootcamp bootcamp) {
		this.contentSubscribers.addAll(bootcamp.getContents());
		bootcamp.getRegisteredDev().add(this);
	}

	public void advance() {
		Optional<Content> content = this.contentSubscribers.stream().findFirst();
		if (content.isPresent()) {
			this.contentsCompleted.add(content.get());
			this.contentSubscribers.remove(content.get());
		} else {
			System.err.println("Você não está matriculado em nenhum conteúdo!");
		}
	}

	public double calcXPTotal() {
		Iterator<Content> iterator = this.contentsCompleted.iterator();
		double soma = 0;
		while (iterator.hasNext()) {
			double next = iterator.next().calcXP();
			soma += next;
		}
		return soma;
	}

	public String getName() {
		return name;
	}

	public void setName(String nome) {
		this.name = nome;
	}

	public Set<Content> getContentsRegistered() {
		return contentSubscribers;
	}

	public void setContentsRegistered(Set<Content> conteudosInscritos) {
		this.contentSubscribers = conteudosInscritos;
	}

	public Set<Content> getCompletedContents() {
		return contentsCompleted;
	}

	public void setCompletedContents(Set<Content> conteudosConcluidos) {
		this.contentsCompleted = conteudosConcluidos;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Dev dev = (Dev) o;
		return Objects.equals(name, dev.name) && Objects.equals(contentSubscribers, dev.contentSubscribers)
				&& Objects.equals(contentsCompleted, dev.contentsCompleted);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, contentSubscribers, contentsCompleted);
	}
}
