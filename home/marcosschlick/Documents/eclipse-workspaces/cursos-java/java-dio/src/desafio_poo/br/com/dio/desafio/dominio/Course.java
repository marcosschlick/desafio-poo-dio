package desafio_poo.br.com.dio.desafio.dominio;

public class Course extends Content {

	private int workload;

	@Override
	public double calcXP() {
		return XP_PADRAO * workload;
	}

	public Course() {
	}

	public int getWorkload() {
		return workload;
	}

	public void setWorkload(int workload) {
		this.workload = workload;
	}

	@Override
	public String toString() {
		return "Curso{" + "titulo='" + getTitle() + '\'' + ", descricao='" + getDescription() + '\'' + ", cargaHoraria="
				+ workload + '}';
	}
}
