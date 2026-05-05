package exemplos.exp8;


public class Turma {
    
    private Disciplina disciplina;
    private Professor professor;
    private Matricula matriculas[];
    private int turma;
    private int qtdVagas;
    private int qtdAluno = 0;
    
    public Turma(Disciplina disc, Professor professor,int numeroTurma, int qtdVagas) {
        System.out.println("\t[DEBUG]Instanciando um objeto da classe Turma.\n");
        this.setDisciplina(disc);
        this.setTurma(numeroTurma);
        this.setQtdVagas(qtdVagas);
        this.setProfessor(professor);
        this.setMatriculas(qtdVagas);
        
    }
    public void adicionarMatricula(Matricula m) {
        if (this.qtdAluno >= matriculas.length) {
            System.out.println("Turma cheia!");
            return;
        }
        matriculas[qtdAluno] = m;
        qtdAluno++;
    }
     
    public Matricula getMatricula(int i) {
		return matriculas[i];
	}

	public void setMatriculas( int qtdVagas) {
		this.matriculas = new Matricula[qtdVagas] ;
	}

	public void imprimeInfo() {
        System.out.println("Turma: " + this.getNomeDisciplina() + "(" + this.getCodDisciplina() +" - " + this.turma+") - Professor: "+ this.getProfessor().getNome() +" - Quantidade de alunos:"+this.getQtdAlunos()); 
    }
    
    public void setDisciplina(Disciplina d) {
        this.disciplina = d;
    }
    
    public String getCodDisciplina() {
        return this.disciplina.getCodigo();
    }
    
    public void setMatriculas(Matricula[] matriculas) {
		this.matriculas = matriculas;
	}
	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public Disciplina getDisciplina() {
		return disciplina;
	}

	public String getNomeDisciplina() {
        return this.disciplina.getNome();
    }
    
    public void setTurma(int t) {
        this.turma = t;
    }
    
    public int getQtdAluno() {
		return qtdAluno;
	}
	public void setQtdAluno(int qtdAluno) {
		this.qtdAluno = qtdAluno;
	}
	public int getTurma() {
        return this.turma;
    }
    
    public void setQtdVagas(int qtd) {
        this.qtdVagas = qtd;
    }
    
    public int getQtdVagas() {
        return this.qtdVagas;
    }
    
    public int getQtdAlunos() {
        return this.qtdAluno;
    }
    
}
