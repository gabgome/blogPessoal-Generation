package org.generation.blogPessoal.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity 
@Table(name = "postagem") 
public class Postagem {
		
		@Id  
		@GeneratedValue(strategy = GenerationType.IDENTITY) 
		private long id;
		
		@NotNull 
		@Size(min = 5, max = 100) 
		private String titulo;
		
		@NotNull 
		@Size(min = 10, max = 500) 
		private String texto;
		
		@Temporal(TemporalType.TIMESTAMP)
		private Date date = new java.sql.Date(System.currentTimeMillis());
		
		
		public long getId() {
			return id;
		}
		public void setId(long id) {
			this.id = id;
		}
		public String getTitulo() {
			return titulo;
		}
		public void setTitulo(String titulo) {
			this.titulo = titulo;
		}
		public String getTexto() {
			return texto;
		}
		public void setTexto(String texto) {
			this.texto = texto;
		}
		public Date getDate() {
			return date;
		}
		public void setDate(Date date) {
			this.date = date;
		}
		
		
}
/* Model  - é a camada de  modelo. Ela define através de Orientação a Objetos como serão as tabelas geradas no banco de dados. 
 * Uma tabela pra cada classe. Cada atributo da classe define uma coluna no banco de dados. A notação @Entity transforma os atributos da classe em tabelas. 
 * A notação @Id define o id da tabela. @NotNull define que a coluna não pode ter valor nulo. @Size(min = , max =) define o tamanho do valor que pode ser recebido.
*/
