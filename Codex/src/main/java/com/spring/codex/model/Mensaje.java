package com.spring.codex.model;

import javax.persistence.*;

@Entity
@Table(name="MENSAJE")
public class Mensaje {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String texto;
	
	@Column(name="CORREO_EMISOR")
	private String emisor;
	
	@Column(name="CORREO_RECEPTOR")
	private String receptor;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="USUARIO_RECEPTOR_ID")
    private Usuario usuarioReceptor;
    
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="USUARIO_EMISOR_ID")
    private Usuario usuarioEmisor;

	public Mensaje() {
		emisor = new String();
		receptor = new String();
		texto = new String();
	}
	
	public Mensaje(String e, String r, String m) {
		emisor = e;
		receptor = r;
		texto = m;
	}

	public void settexto(String m) {
		texto = m;
	}

	public String gettexto() {
		return texto;
	}

	public void setEmisor(String e) {
		emisor = e;
	}

	public String getEmisor() {
		return emisor;
	}

	public void setReceptor(String r) {
		receptor = r;
	}

	public String getReceptor() {
		return receptor;
	}
	
	public long getId() {
		return id;
	}

	public Usuario getUsuarioReceptor() {
		return usuarioReceptor;
	}

	public void setUsuarioReceptor(Usuario usuarioReceptor) {
		this.usuarioReceptor = usuarioReceptor;
	}

	public Usuario getUsuarioEmisor() {
		return usuarioEmisor;
	}

	public void setUsuarioEmisor(Usuario usuarioEmisor) {
		this.usuarioEmisor = usuarioEmisor;
	}

	@Override
	public int hashCode() {		
		return (int) id;
	}
	
	@Override
	public boolean equals(Object o) {
		boolean res = false;;
		
		if(o instanceof Mensaje) {
			Mensaje m = (Mensaje) o;
			res = m.getId() == id;
		}
		
		return res;
	}

	@Override
	public String toString() {
		return "Emisor: " + emisor + "\nReceptor: " + receptor + "\ntexto " + texto + "\n";
	}
}
